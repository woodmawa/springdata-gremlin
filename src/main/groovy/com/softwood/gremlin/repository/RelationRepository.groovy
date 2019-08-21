package com.softwood.gremlin.repository

import com.microsoft.spring.data.gremlin.repository.GremlinRepository
import com.softwood.gremlin.model.Relation
import org.springframework.stereotype.Repository

@Repository
public interface RelationRepository extends GremlinRepository<Relation, String> {
}
