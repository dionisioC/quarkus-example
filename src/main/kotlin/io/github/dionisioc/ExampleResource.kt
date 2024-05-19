package io.github.dionisioc

import io.github.dionisioc.service.Service
import io.micrometer.core.instrument.MeterRegistry
import io.micrometer.core.instrument.Tags
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response
import java.util.*


@Path("/hello")
class ExampleResource(private val registry: MeterRegistry, private val service: Service) {

    init {
        registry.gaugeCollectionSize("example.list.size", Tags.empty(), LinkedList<Any>())
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun hello(): Response {
        registry.counter("example.prime.number", "type", "not-natural").increment()
        return Response.ok(service.getThought()).build()
    }
}