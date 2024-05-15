package io.github.dionisioc

import io.github.dionisioc.service.Service
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

@Path("/hello")
class ExampleResource(private val service: Service) {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun hello() = service.getThought()
}