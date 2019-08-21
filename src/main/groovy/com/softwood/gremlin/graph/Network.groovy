package com.softwood.gremlin.graph

import com.microsoft.spring.data.gremlin.annotation.EdgeSet
import com.microsoft.spring.data.gremlin.annotation.Graph
import com.microsoft.spring.data.gremlin.annotation.VertexSet
import org.springframework.data.annotation.Id

@Graph
public class Network {

    @Id
    private String id

    public Network() {
        this.edges = new ArrayList<Object>()
        this.vertexes = new ArrayList<Object>()
    }

    @EdgeSet
    private List<Object> edges

    @VertexSet
    private List<Object> vertexes

}