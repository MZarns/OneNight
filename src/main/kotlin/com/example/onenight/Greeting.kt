package com.example.onenight

class Greeting {
    private  var  content: String
    constructor(content: String?) {
        if (content.isNullOrEmpty()) {
            this.content = "Stranger"
        } else {
            this.content = content
        }
    }
    fun getContent(): String{
        return this.content
    }
}
