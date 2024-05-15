package io.github.dionisioc.service

import io.github.dionisioc.Kind
import io.github.dionisioc.ThoughtResponse
import jakarta.enterprise.context.ApplicationScoped
import java.util.*

@ApplicationScoped
class Service {

    fun getThought(): ThoughtResponse {
        return ThoughtResponse(UUID.randomUUID().toString(), "content", Kind.POSITIVE)

    }

}