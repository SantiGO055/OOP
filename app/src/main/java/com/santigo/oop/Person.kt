package com.santigo.oop

// por defecto se declara final, para que pueda heredar pongo open class
// con parentesis se declara como constructor
open class Person(var name: String = "Anonimo",
                  var passport: String? = null, var height: Float = 1.6f) {
    var alive: Boolean = true

    fun Person(){
        name = "Santi"
        passport = "1234"
    }
    fun die(){
        alive = false
    }
    fun checkPolicia(fn: (Float)->Boolean): Boolean{
        return fn(height)
    }
}

class Athlete(name: String,passport: String?,
              var sport: String): Person(name, passport)

