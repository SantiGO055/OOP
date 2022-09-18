package com.santigo.oop

class SubClasses {
    private var name  = "Padre"
    fun presentar(): String{
        return name
    }

    class Anidada{
        private val nameAnidada = "Anidada"

        fun presentar(): String{
            return nameAnidada
        }
    }

    //inner es clase interna
    inner class Interna{
        private val nameInternal = "Internal"
        fun presentar(): String{
            return "Hola, soy ${this.nameInternal}, hija de ${name}"
        }
    }
}