package com.softwood.gremlin.model

import com.microsoft.spring.data.gremlin.annotation.Vertex
import org.springframework.data.annotation.Id

@Vertex
public class Person {

    @Id
    private String id
    private String name
    private String age

}