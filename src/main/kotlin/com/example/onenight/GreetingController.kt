package com.example.onenight

import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.stereotype.Controller
import org.springframework.web.util.HtmlUtils
import org.springframework.messaging.handler.annotation.MessageMapping
import kotlin.Exception


@Controller
class GreetingController {
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    @Throws(Exception::class)
    public fun greeting(message: HelloMessage): Greeting {
        Thread.sleep(1000) // simulated delay
        return Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!")
    }
}