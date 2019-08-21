package com.softwood.gremlin.model

import com.microsoft.spring.data.gremlin.annotation.Edge
import com.microsoft.spring.data.gremlin.annotation.EdgeFrom
import com.microsoft.spring.data.gremlin.annotation.EdgeTo
import org.springframework.data.annotation.Id

@Edge
public class Relation {

    @Id
    private String id
    private String name

    @EdgeFrom
    private Person personFrom

    @EdgeTo
    private Person personTo

}