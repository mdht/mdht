/**
 * Copyright: NEHTA 2014-2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd 
 */

using System;
using System.Collections.Generic;
using System.Text;
using Nehta.HL7.CDA;
using System.Reflection;

namespace facade
{

    /// <summary>
    /// This helper class is mainly used by facades to evaluate the .NET equivalents of the MDHT OCL expressions
    /// </summary>
    abstract public class FacadeBase
    {

        /// <summary>
        /// Enumeration for the data element level (that a constraint operates on)
        /// </summary>
        public enum DataElementLevel
        {

            /// "1A"
            DEL_CDA_HEADER,

            /// "2"
            DEL_CDA_BODY_LEVEL_2,

            /// "3A"
            DEL_CDA_BODY_LEVEL_3,

            /// unknown
            NA
        };

        /// Stores for every CDA element the container element
        public Dictionary<Object, Object> eContainer = new Dictionary<Object, Object>();

        /// returns the CDA element
        abstract public Object getModelElement();

        /// Returns for the given CDA element the container element
        public Object getContainer(Object child)
        {
            if (eContainer.Count == 0)
            {
                getAllContents(getModelElement(), null);
            }
            if (eContainer.ContainsKey(child))
            {
                return eContainer[child];
            }
            return null;
        }

        /// For a singleton set, returns the one and only element
        static public T One<T>(T item)
        {
            return item;
        }

        /// For a singleton set, returns the one and only element
        static public T One<T>(List<T> list)
        {
            if (list.Count == 0)
                return default(T);
            if (list.Count == 1)
                return list[0];
            throw new Exception("Expected not more than 1 element in list");
        }

        /// Makes an element or elements available as set
        static public List<T> Set<T>(T item)
        {
            var result = new List<T>();
            if (item != null)
                result.Add(item);
            return result;
        }

        /// Makes an element or elements available as set
        static public List<byte[]> Set(byte[] item)
        {
            var result = new List<byte[]>();
            if (item != null)
                result.Add(item);
            return result;
        }
        
        /// Makes an element or elements available as set
        static public List<T> Set<T>(List<T> list)
        {
            return list;
        }

        /// Makes an element or elements available as set
        static public List<T> Set<T>(T[] list)
        {
            if (list == null)
                return new List<T>();
            return Flatten(new List<T>(list));
        }

        /// Flattens nested set structures
        static public List<T> Flatten<T>(List<T[]> list)
        {
            var result = new List<T>();
            list.ForEach(i => { if (i != null) result.AddRange(i); });
            return result;
        }

        /// Flattens nested set structures
        public List<T> Flatten<T>(List<List<T>> list)
        {
            var result = new List<T>();
            list.ForEach(i => { result.AddRange(i); });
            return result;
        }

        /// Flattens nested set structures
        static public List<T> Flatten<T>(List<T> list)
        {
            while (list.Remove(default(T))) ;
            return list;
        }


        /// MDHT operation: returns the clinical document
        public POCD_MT000040ClinicalDocument getClinicalDocument(Object o)
        {
            while (o != null && !(o is POCD_MT000040ClinicalDocument))
            {
                o = getContainer(o);
            }
            return (POCD_MT000040ClinicalDocument)o;
        }

        /// MDHT operation: returns the containing section
        public POCD_MT000040Section getSection(Object o)
        {
            while (o != null && !(o is POCD_MT000040Section))
            {
                o = getContainer(o);
            }
            return (POCD_MT000040Section)o;
        }

        /// MDHT operation: returns all sections
        public List<POCD_MT000040Section> getAllSections(POCD_MT000040ClinicalDocument clinicalDocument)
        {
            List<POCD_MT000040Section> allSections = new List<POCD_MT000040Section>();
            POCD_MT000040Component2 component2 = clinicalDocument.component;
            if (component2 != null)
            {
                POCD_MT000040StructuredBody structuredBody = component2.structuredBody;
                if (structuredBody != null)
                {
                    foreach (POCD_MT000040Component3 component3 in structuredBody.component)
                    {
                        POCD_MT000040Section section = component3.section;
                        if (section != null)
                        {
                            allSections.AddRange(getSections(section));
                        }
                    }
                }
            }
            return allSections;
        }

        /// MDHT operation: returns sub-sections
        private List<POCD_MT000040Section> getSections(POCD_MT000040Section section)
        {
            List<POCD_MT000040Section> sections = new List<POCD_MT000040Section>();
            sections.Add(section);

            if (section.component != null)
                foreach (POCD_MT000040Component5 component in section.component)
                { // process successors
                    POCD_MT000040Section child = component.section;
                    if (child != null)
                    {
                        sections.AddRange(getSections(child));
                    }
                }

            return sections;
        }

        /// MDHT operation: TBD
        public bool validateTargetOfEntryRelationship(POCD_MT000040Observation statusObservation)
        {
            if (getContainer(statusObservation) is POCD_MT000040EntryRelationship)
            {
                POCD_MT000040EntryRelationship entryRelationship = (POCD_MT000040EntryRelationship)getContainer(statusObservation);
                return x_ActRelationshipEntryRelationship.REFR == entryRelationship.typeCode;
            }
            return false;
        }

        /// MDHT operation: asks whether the content has actual content (except for the nullFlavor attribute)
        public bool hasContent(ANY o)
        {
            foreach (PropertyInfo field in o.GetType().GetProperties())
            {
                Object value = field.GetValue(o, null);
                if (value != null && field.Name != "nullFlavor")
                    return true;
            }
            return false;
        }

        /// MDHT operation: asks whether the object is defined on the given feature
        /// <param name="o">The CDA element</param>
        /// <param name="featureName">The field name</param>
        public bool isDefined(Object o, String featureName)
        {
        	return IsSpecified(o, featureName);
            try
            {
                PropertyInfo field = o.GetType().GetProperty(featureName);
                if (field == null)
                    return false;
                object x = field.GetValue(o, null);
                object d = GetDefaultValue(field.PropertyType);
                if (x != null)
                {
                    return true;
                }
                else
                {
                    return x != d;
                }
            }
            catch (Exception)
            {
                return false;
            }
        }

        /// MDHT operation: asks whether the string-valued feature of the given object matches the given regular expression
        public bool matches(ANY o, String featureName, String regularExpression)
        {
            try
            {
                PropertyInfo field = o.GetType().GetProperty(featureName);
                if (field == null)
                    return false;
                object x = field.GetValue(o, null);
                if (x is String)
                {
                    String s = (String)x;
                    bool result = System.Text.RegularExpressions.Regex.IsMatch(s, "^" + regularExpression + "$");
                    return result;
                }
                return false;
            }
            catch (Exception)
            {
                return false;
            }
        }

        /// MDHT operation: returns the contained item dependent on the given choice
        public T getTime<T>(IVL_TS time, ItemsChoiceType3 t) where T : QTY
        {
            for (int i = 0; i < time.Items.Length; i++)
                if (time.ItemsElementName[i] == t)
                    return (T)time.Items[i];
            return default(T);
        }

        /// MDHT operation: returns the clinical statement of the given entryRelationship
        public Object getClinicalStatement(POCD_MT000040EntryRelationship entryRelationship)
        {
            if (entryRelationship.act != null)
            {
                return entryRelationship.act;
            }
            if (entryRelationship.encounter != null)
            {
                return entryRelationship.encounter;
            }
            if (entryRelationship.observation != null)
            {
                return entryRelationship.observation;
            }
            if (entryRelationship.observationMedia != null)
            {
                return entryRelationship.observationMedia;
            }
            if (entryRelationship.organizer != null)
            {
                return entryRelationship.organizer;
            }
            if (entryRelationship.procedure != null)
            {
                return entryRelationship.procedure;
            }
            if (entryRelationship.regionOfInterest != null)
            {
                return entryRelationship.regionOfInterest;
            }
            if (entryRelationship.substanceAdministration != null)
            {
                return entryRelationship.substanceAdministration;
            }
            if (entryRelationship.supply != null)
            {
                return entryRelationship.supply;
            }
            return null;
        }

        /// MDHT operation: returns the clinical statement of the given entry
        public Object getClinicalStatement(POCD_MT000040Entry entry)
        {
            if (entry.act != null)
            {
                return entry.act;
            }
            if (entry.encounter != null)
            {
                return entry.encounter;
            }
            if (entry.observation != null)
            {
                return entry.observation;
            }
            if (entry.observationMedia != null)
            {
                return entry.observationMedia;
            }
            if (entry.organizer != null)
            {
                return entry.organizer;
            }
            if (entry.procedure != null)
            {
                return entry.procedure;
            }
            if (entry.regionOfInterest != null)
            {
                return entry.regionOfInterest;
            }
            if (entry.substanceAdministration != null)
            {
                return entry.substanceAdministration;
            }
            if (entry.supply != null)
            {
                return entry.supply;
            }
            return null;
        }

        /// MDHT operation: returns the substance administrations of the given section
        protected List<POCD_MT000040SubstanceAdministration> getSubstanceAdministrations(POCD_MT000040Section section)
        {
            return Flatten(Set(section.entry).ConvertAll(i => i.substanceAdministration));
        }

        /// MDHT operation: returns the supplies of the given section
        protected List<POCD_MT000040Supply> getSupplies(POCD_MT000040Section section)
        {
            return Flatten(Set(section.entry).ConvertAll(i => i.supply));
        }

        /// MDHT operation: returns the text of the given ST instance
        public string getText(ST st)
        {
            return string.Join("", st.Text);
        }

        /// populates the eContainer mapping
        private void getAllContents(Object o, Object parent)
        {
            if (o == null || o.GetType().Namespace != "Nehta.HL7.CDA" || o.GetType().IsEnum || eContainer.ContainsKey(o))
            {
                return;
            }
            eContainer.Add(o, parent);
            foreach (PropertyInfo field in o.GetType().GetProperties())
            {
                Object value = field.GetValue(o, null);
                if (value is Array)
                {
                    foreach (Object val in (Array)value)
                    {
                        getAllContents(val, o);
                    }
                }
                else
                {
                    getAllContents(value, o);
                }

            }
        }

        /// returns the default value for the given type
        private static object GetDefaultValue(Type t)
        {
            if (!t.IsValueType || Nullable.GetUnderlyingType(t) != null)
                return null;

            return Activator.CreateInstance(t);
        }

        /// Adds the element to the array
        public T[] SetOrAdd<T>(T[] array, T element)
        {
            var list = array != null ? new List<T>(array) : new List<T>();
            list.Add(element);
            return list.ToArray();
        }

        /// For non-array fields, just return the element
        public T SetOrAdd<T>(T array, T element)
        {
            return element;
        }

        /// <summary>
        /// Mark properties for serialization by e.g. setting "contextControlCodeSpecified" to true for the "contextControlCode" property
        /// </summary>
        /// <param name="o">The CDA element</param>
        /// <param name="featureName">The field name</param>
        public void MarkSpecified(Object o, String featureName)
        {
            try
            {
                PropertyInfo field = o.GetType().GetProperty(featureName + "Specified");
                if (field == null)
                    return;
                field.SetValue(o, true, null);
            }
            catch (Exception)
            {
            }
        }

        /// <summary>
        /// Asks if a property is specified, e.g. for the "contextControlCode" property, returns the value for "contextControlCodeSpecified"
        /// </summary>
        /// <param name="o">The CDA element</param>
        /// <param name="featureName">The field name</param>
        /// <returns>The value of the Specified field, or "false" if that does not exist for the field</returns>
        public bool IsSpecified(Object o, String featureName)
        {
            try
            {
                PropertyInfo field = o.GetType().GetProperty(featureName + "Specified");
                if (field == null)
                    return false;
                object x = field.GetValue(o, null);
                return x is bool ? (bool)x : false;
            }
            catch (Exception)
            {
                return false;
            }
        }

    }

}
