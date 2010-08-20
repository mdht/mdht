/*******************************************************************************
 * Copyright (c) 2010 Sean Muir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Sean Muir (JKM Software) - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.builder.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.teneo.mapping.strategy.impl.QualifyingEntityNameStrategy;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.openhealthtools.mdht.builder.ccd.DocumentBuilder.ProblemSectionBuilder;
import org.openhealthtools.mdht.builder.cda.ArrayBuilder;
import org.openhealthtools.mdht.builder.hitsp.DocumentBuilder;
import org.openhealthtools.mdht.builder.hitsp.DocumentBuilder.AllergiesReactionSectionBuilder;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.AssignedCustodian;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.Component1;
import org.openhealthtools.mdht.uml.cda.Consumable;
import org.openhealthtools.mdht.uml.cda.Custodian;
import org.openhealthtools.mdht.uml.cda.CustodianOrganization;
import org.openhealthtools.mdht.uml.cda.EncompassingEncounter;
import org.openhealthtools.mdht.uml.cda.Informant12;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.ManufacturedProduct;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument;
import org.openhealthtools.mdht.uml.cda.ccd.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemHealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity;
import org.openhealthtools.mdht.uml.cda.ccd.PurposeSection;
import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.rim.RIMPackage;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassClinicalDocument;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActClassDocumentEntryAct;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

public class BuildAllergiesSectionExample {
	

	
	public static class AllergiesReactionSectionHibernateBuilder extends AllergiesReactionSectionBuilder
	{

		@Override
		public ArrayBuilder<Act> getActBuilder() {
			return new ArrayBuilder<Act>()
			{

				@Override
				public ArrayList<Act> construct() {					
					return super.construct();
				}
				
			};
		}
		
	}
	
	

	

	public static void main(String[] args) {
		
		
		
		SessionFactory sessionFactory = CDASessionFactory.getSessionFactory("mydatabase", new EPackage[] { CCDPackage.eINSTANCE, CDAPackage.eINSTANCE,RIMPackage.eINSTANCE,DatatypesPackage.eINSTANCE} );
		
		final Session session = sessionFactory.openSession();

		Transaction tx = session.getTransaction();
		
		tx.begin();
		
		Act act = CDAFactory.eINSTANCE.createAct();

		act.setCode(DatatypesFactory.eINSTANCE.createCD("code", "codeSystem", "codeSystemName", "displayName"));

		session.save(act);
		
		tx.commit();

		DocumentBuilder exampleClinicalDocumentBuilder = new DocumentBuilder() {

			@Override
			public AllergiesReactionSectionBuilder getAllergiesReactionSectionBuilder() {
				return new AllergiesReactionSectionHibernateBuilder()
				{
					@Override
					public ArrayBuilder<Act> getActBuilder() {
						return new ArrayBuilder<Act>()
						{

							@Override
							public ArrayList<Act> construct() {
								
								ArrayList<Act> acts = new ArrayList<Act>();
								
								Query qry = session.createQuery("from cda.Act  ");

								acts.addAll(qry.list());
								
								return acts;
							}
							
						};
					}	
				};
			}

	

		};

		try {
			CDAUtil.save(exampleClinicalDocumentBuilder.buildDocument(), System.out);
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	
		
		session.close();
	}
}
