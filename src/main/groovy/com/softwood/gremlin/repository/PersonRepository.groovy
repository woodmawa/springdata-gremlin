package com.softwood.gremlin.repository


import com.microsoft.spring.data.gremlin.repository.GremlinRepository
import com.softwood.gremlin.model.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends GremlinRepository<Person, String> {
    List<Person> findByName(String name)
}
