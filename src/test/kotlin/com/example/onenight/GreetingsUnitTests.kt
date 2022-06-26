package com.example.onenight

import org.springframework.boot.test.context.SpringBootTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

@SpringBootTest
class GreetingsUnitTests {

    @Test
    fun `constructor -- null input -- greet stranger1`() {
        val subject = Greeting(null).getContent()
        assertEquals("Stranger", subject)
    }

}