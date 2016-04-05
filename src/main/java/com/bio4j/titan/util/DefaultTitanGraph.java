package com.bio4j.titan.util;

import com.bio4j.angulillos.titan.TitanUntypedGraph;
import com.thinkaurelius.titan.core.*;

public final class DefaultTitanGraph implements TitanUntypedGraph {

    private TitanGraph titanGraph;
    public DefaultTitanGraph(TitanGraph titanGraph) {

        this.titanGraph = titanGraph;
    }

    @Override public TitanGraph titanGraph() { return titanGraph; }
}
