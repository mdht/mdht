/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.cts2.cache.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.openhealthtools.mdht.cts2.association.Association;
import org.openhealthtools.mdht.cts2.association.AssociationDirectoryEntry;
import org.openhealthtools.mdht.cts2.association.GraphNode;
import org.openhealthtools.mdht.cts2.core.AnonymousStatement;
import org.openhealthtools.mdht.cts2.core.AssociationDirection;
import org.openhealthtools.mdht.cts2.core.CoreFactory;
import org.openhealthtools.mdht.cts2.core.StatementTarget;
import org.openhealthtools.mdht.cts2.core.URIAndEntityName;

public class AssociationHelper {
	public static class Triple {
		private EObject subject = null;

		private URIAndEntityName predicate = null;

		private EObject target = null;

		public Triple(EObject subject, URIAndEntityName predicate, EObject object) {
			this.subject = subject;
			this.predicate = predicate;
			this.target = object;
		}

		public EObject getSubject() {
			return subject;
		}

		public URIAndEntityName getPredicate() {
			return predicate;
		}

		public EObject getTarget() {
			return target;
		}

		@Override
		public boolean equals(Object arg) {
			if (arg instanceof Triple) {
				Triple argTriple = (Triple) arg;
				return subject != null && subject.equals(argTriple.getSubject()) && predicate != null &&
						subject.equals(argTriple.getPredicate()) && target != null &&
						subject.equals(argTriple.getTarget());
			}
			return false;
		}

	}

	public static List<Triple> getAssociationTriples(GraphNode graphNode) {
		List<Triple> triples = new ArrayList<Triple>();

		if (graphNode.getDirection() == AssociationDirection.SOURCETOTARGET) {
//			triples.add(new Triple(graphNode.getSubject(), graphNode.getPredicate(), graphNode.getNodeEntity()));
			triples.add(new Triple(graphNode.getSubject(), graphNode.getPredicate(), graphNode.getTarget().getEntity()));
		} else if (graphNode.getDirection() == AssociationDirection.TARGETTOSOURCE) {
			triples.add(new Triple(graphNode.getTarget().getEntity(), graphNode.getPredicate(), graphNode.getSubject()));
		}

		return triples;
	}

	public static List<Triple> getAssociationTriples(AssociationDirectoryEntry association) {
		List<Triple> triples = new ArrayList<Triple>();

		triples.addAll(createTriples(association.getSubject(), association.getPredicate(), association.getTarget()));

		return triples;
	}

	public static List<Triple> getAssociationTriples(Association association) {
		List<Triple> triples = new ArrayList<Triple>();

		for (StatementTarget statementTarget : association.getTarget()) {
			triples.addAll(createTriples(association.getSubject(), association.getPredicate(), statementTarget));
		}

		return triples;
	}

	private static List<Triple> createTriples(URIAndEntityName subject, URIAndEntityName predicate,
			StatementTarget statementTarget) {
		List<Triple> triples = new ArrayList<Triple>();

		if (statementTarget.getEntity() != null) {
			URIAndEntityName target = statementTarget.getEntity();
			triples.add(new Triple(subject, predicate, target));
		} else {
			for (AnonymousStatement bnode : statementTarget.getBnode()) {
				triples.addAll(createTriples(subject, predicate, bnode));
			}
		}

		return triples;
	}

	private static List<Triple> createTriples(URIAndEntityName subject, URIAndEntityName predicate,
			AnonymousStatement bnode) {
		List<Triple> triples = new ArrayList<Triple>();

		if ("http://snomed.info/field/roleGroup".equals(bnode.getPredicate().getUri())) {
			URIAndEntityName bnodeEntity = CoreFactory.eINSTANCE.createURIAndEntityName();
			bnodeEntity.setUri(EcoreUtil.getURI(bnode).toString());
			bnodeEntity.setName("&nbsp;");

			triples.add(new Triple(subject, bnode.getPredicate(), bnodeEntity));
			subject = bnodeEntity;
		} else if (!"http://www.w3.org/2002/07/owl#someValuesFrom".equals(bnode.getPredicate().getUri())) {
			predicate = bnode.getPredicate();
		}
		// else, use the parent bnode predicate name

		for (StatementTarget statementTarget : bnode.getTarget()) {
			triples.addAll(createTriples(subject, predicate, statementTarget));
		}

		return triples;
	}
}
