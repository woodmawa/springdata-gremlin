package com.softwood.gremlin

import com.microsoft.spring.data.gremlin.common.GremlinFactory
import com.softwood.gremlin.graph.Network
import com.softwood.gremlin.model.Person
import com.softwood.gremlin.model.Relation
import com.softwood.gremlin.repository.NetworkRepository
import com.softwood.gremlin.repository.PersonRepository
import com.softwood.gremlin.repository.RelationRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

import javax.annotation.PostConstruct

@SpringBootApplication
//@ComponentScan ("com.softwood.gremlin")
class GremlinApplication implements CommandLineRunner {

    @Autowired
    PersonRepository personRepo

    @Autowired
    private RelationRepository relationRepo

    @Autowired
    private NetworkRepository networkRepo

    @Autowired
    private GremlinFactory factory

    private final Network network = new Network(id:"1")

    static void main(String[] args) {
        SpringApplication.run(GremlinApplication, args)
    }

    void run (String... var1) throws Exception {
        //personRepo.deleteAll()

        assert networkRepo
        networkRepo.deleteAll()


        println "prop_type is " + com.microsoft.spring.data.gremlin.common.Constants.PROPERTY_TYPE
        println "created will and maz "
        Person p1 = new Person (id:"2", age:"57", name:"William" )
        Person p2 = new Person (id:"3", age:"56", name:"Maz" )

        Relation r = new Relation (id: "4", name:"married", personFrom:p1, personTo:p2)
        //Person sp = personRepo.save(p)

        println "add people to network vertexes array, add relationship "
        network.vertexes << p1
        network.vertexes << p2
        network.edges << r

        println "save network"
        networkRepo.save(network)

        println "exit()"
    }

    @PostConstruct
    public void setup() {
        println "PostConstruct delete entries in network graph"
        //this.networkRepo.deleteAll();

        /*this.network.getEdges().add(this.relation);
        this.network.getVertexes().add(this.person);
        this.network.getVertexes().add(this.person0);
        this.network.getVertexes().add(this.person1);

        this.networkRepo.save(this.network);*/
    }
}
