package com.example.onenight

class HelloMessage {
    private var name: String
    constructor(){
        this.name = "Stranger"
    }
    constructor(name: String){
        this.name = name
    }
    public fun getName(): String{
        return name
    }
    fun setName(name: String){
        this.name = name
    }
}
