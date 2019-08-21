package com.softwood.gremlin.repository

import com.microsoft.spring.data.gremlin.repository.GremlinRepository
import com.softwood.gremlin.graph.Network
import org.springframework.stereotype.Repository

@Repository
public interface NetworkRepository extends GremlinRepository<Network, String> {
}