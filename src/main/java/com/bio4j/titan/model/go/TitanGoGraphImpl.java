//package com.bio4j.titan.model.go;
//
//import com.bio4j.model.go.GoGraph;
//
//public final class TitanGoGraph extends GoGraph {
//
//	public TitanGoGraph(TitanGraph graph) {
//		super(graph);
//		initTypes();
//		initIndices();
//	}
//
//	private void initTypes() {
//
//
//		// Term keys
//		goTermTkey = titanKeyForNodeType(goTermT.id);
//		goTermIdKey = goTermTkey;
//		goTermNameKey = titanKeyForNodeProperty(goTermT.name);
//		goTermDefinitionKey = titanKeyForNodeProperty(goTermT.definition);
//		goTermObsoleteKey = titanKeyForNodeProperty(goTermT.obsolete);
//		goTermCommentKey = titanKeyForNodeProperty(goTermT.comment);
//
//		// Subontologies keys
//		subOntologiesTKey = titanKeyForNodeType(subOntologiesT.name);
//		subOntologiesNameKey = subOntologiesTKey;
//
//		// partOf stuff
//		partOfLabel = titanLabelForRelationshipType(partOfT);
//		// hasPartOF stuff
//		hasPartOfLabel = titanLabelForRelationshipType(hasPartOfT);
//		// isA stuff
//		isALabel = titanLabelForRelationshipType(isAT);
//		// regulates stuff
//		regulatesLabel = titanLabelForRelationshipType(regulatesT);
//		// positivelyRegulates stuff
//		positivelyRegulatesLabel = titanLabelForRelationshipType(positivelyRegulatesT);
//		// negativelyRegulates stuff
//		negativelyRegulatesLabel = titanLabelForRelationshipType(negativelyRegulatesT);
//		// subOntology stuff
//		subOntologyLabel = titanLabelForRelationshipType(subOntologyT);
//
//	}
//
//	private void initIndices(){
//		goTermIdIndex = new TitanNodeIndex.DefaultUnique(this, goTermT.id);
//		subOntologiesNameIndex = new TitanNodeIndex.DefaultUnique(this, subOntologiesT.name);
//	}
//}