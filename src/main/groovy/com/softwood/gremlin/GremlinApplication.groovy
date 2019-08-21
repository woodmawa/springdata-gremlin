package com.softwood.gremlin

import com.softwood.gremlin.model.Person
import com.softwood.gremlin.repository.PersonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
//@ComponentScan ("com.softwood.gremlin")
class GremlinApplication implements CommandLineRunner {

    @Autowired
    PersonRepository personRepository

    static void main(String[] args) {
        SpringApplication.run(GremlinApplication, args)
    }

    void run (String... var1) throws Exception {
        personRepository.deleteAll()

        Person p = new Person ( age:"57", "William" )

        Person sp = personRepository.save(p)

        println "save person " + sp.dump()
    }
}
