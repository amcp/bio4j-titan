//package com.bio4j.titan.model.go.relationships;
//
//import com.ohnosequences.typedGraphs.Relationship;
//import com.ohnosequences.typedGraphs.RelationshipType;
//
//import com.bio4j.model.go.nodes.Term;
//import com.bio4j.titan.model.go.nodes.TitanTerm;
//
//import com.bio4j.model.go.relationships.NegativelyRegulates;
//
//import com.thinkaurelius.titan.core.*;
//
//import com.bio4j.titan.model.go.TitanGoGraph;
//
///**
// *
// * @author <a href="mailto:ppareja@era7.com">Pablo Pareja Tobes</a>
// * @author <a href="mailto:eparejatobes@ohnosequences.com">Eduardo
// *         Pareja-Tobes</a>
// */
//public final class TitanNegativelyRegulates
//		extends
//		TitanGoGraph.GoRel<Term, Term.Type, TitanTerm, TitanGoGraph.TitanTermType, NegativelyRegulates, NegativelyRegulates.Type, TitanNegativelyRegulates, TitanGoGraph.TitanNegativelyRegulatesType, Term, Term.Type, TitanTerm, TitanGoGraph.TitanTermType>
//		implements NegativelyRegulates {
//
//	public TitanNegativelyRegulates(TitanEdge edge, TitanGoGraph graph) {
//		super(edge, graph);
//	}
//
//	@Override
//	public TitanGoGraph.TitanNegativelyRegulatesType titanType() {
//		return graph().titanNegativelyRegulatesType();
//	}
//
//}
