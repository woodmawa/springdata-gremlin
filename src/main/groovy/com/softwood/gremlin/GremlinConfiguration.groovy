package com.softwood.gremlin

import com.microsoft.spring.data.gremlin.common.GremlinConfig
import com.microsoft.spring.data.gremlin.config.AbstractGremlinConfiguration
import com.microsoft.spring.data.gremlin.repository.config.EnableGremlinRepositories
import org.apache.tinkerpop.gremlin.driver.ser.Serializers
import org.springframework.context.annotation.Configuration


@Configuration
@EnableGremlinRepositories(basePackages = ["com.softwood.gremlin" ])
class GremlinConfiguration extends AbstractGremlinConfiguration {

    @Override
    GremlinConfig getGremlinConfig() {

        String remoteConnectionEndpoint = "localhost"
        int port = 8182
        String uname = ""
        String pwd = ""
        boolean sslEnabled = false
        boolean telemetryAllowed = true
        //String serialiser = org.apache.tinkerpop.gremlin.driver.ser.Serializers.GRYO_V1D0.value

        def config = new GremlinConfig.GremlinConfigBuilder()
                .endpoint (remoteConnectionEndpoint)
                .port (port)
                .username(uname).password(pwd)
                .sslEnabled(false)
                .telemetryAllowed(true)
                .serializer(Serializers.GRAPHSON.toString())
                .build()

//org.apache.tinkerpop.gremlin.driver.ser.Serializers.GRYO_V1D0
        println "getGremlinConfig() called, returned ${config.dump()}"
        return config

    }
}
