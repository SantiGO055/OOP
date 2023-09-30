package com.santigo.oop

import android.annotation.SuppressLint


/*
* Tipos de modificadores:
* Private no va a poder heredar nadie
* Protected puede ser heredado
*
* */
open class Deportista(protected var nombre: String = "",
                      protected var estatura : Float = 0f,
                      protected var peso : Float = 0f,
                      protected var edad : Int = 0,

) {

    fun descansar(){
        println("Descansando...")
    }
    open fun competir(){
        println("Voy a competirrr")
    }
    fun getName(): String {return this.getName()}
}

class Runner(nombre:String = "",
             estatura: Float = 0f,
             peso:Float = 0f,
             edad:Int = 0,
             var velocidad: Int = 0,
): Deportista(nombre,estatura,peso,edad)
{
        private var estilo: String = ""

    fun Runner(nombre: String,
               estatura: Float,
               peso: Float,
               edad: Int,
               estilo: String,
               velocidad:Int

    ){
        this.nombre = nombre
        this.estatura = estatura
        this.peso = peso
        this.edad = edad
        setEstilo(estilo)
        this.velocidad = velocidad
    }
    fun getEstilo():String{
        return this.estilo
    }
    fun setEstilo(e: String){this.estilo = e}

    fun correr(){
        println("Correr ${estilo} a una velocidad de ${velocidad}")
    }

    override fun competir() {
        println("Voy a correr!!!")
    }
//    fun setEstatura(est: Float) {this.estatura = est}
//    fun setPeso(p: Float) {this.peso = p}
//    fun setEdad(e: Int) {this.edad = e}



}

class Ciclista(nombre:String = "asd",
             estatura: Float = 0f,
             peso:Float = 0f,
             edad:Int = 1,
           var tipoDeBici: String = "",
               var velocidad: Int = 1
): Deportista(nombre,estatura,peso,edad)
{

    fun Ciclista(nombre:String = "asd",
                 estatura: Float = 0f,
                 peso:Float = 0f,
                 edad:Int = 1,
                 velocidad: Int = 1)
    {
        this.nombre = nombre
        this.estatura = estatura
        this.peso = peso
        this.edad = edad
        this.tipoDeBici = tipoDeBici
        this.velocidad = velocidad
    }

    fun pedalear(){
        println("Pedalear en tipo de bici ${tipoDeBici} a una velocidad de ${velocidad}")
    }
    override fun competir() {
        println("Voy a pedalear!!!")
    }



}
class Nadador(nombre:String = "asd",
               estatura: Float = 0f,
               peso:Float = 0f,
               edad:Int = 1,
              var estilo: String = "",
              var velocidadNadar: Int = 1
): Deportista(nombre,estatura,peso,edad)
{


    @SuppressLint("NotConstructor")
    fun Nadador(nombre: String,
                estatura: Float,
                peso: Float, edad: Int,
                estilo: String,
                velocidad: Int){
        this.nombre = nombre
        this.estatura = estatura
        this.peso = peso
        this.edad = edad
        this.estilo = estilo
        this.velocidadNadar = velocidad
    }
    fun nadar(){
        println("Nadar en estilo ${estilo} a una velocidad de ${velocidadNadar}")
    }
    override fun competir() {
        println("Voy a nadar!!!")
    }

}

interface i_runner{
    var estilo: String
    var velocidadCorrer: Int
    fun correrTri() {
        println("Triatleta corriendo en $estilo a una velocidad de $velocidadCorrer")
    }
}
interface i_ciclista{
    var tipoDeBici: String
    var velocidadPedalear: Int
    fun pedalearTri() {
        println("Triatleta corriendo en $tipoDeBici a una velocidad de $velocidadPedalear")
    }
}
interface i_nadador{
    var estilo: String
    var velocidadNadar: Int
    fun nadarTri() {
        println("Triatleta corriendo en $estilo a una velocidad de $velocidadNadar")
    }
}
class Triatleta(nombre:String = "asd",
                estatura: Float = 0f,
                peso:Float = 0f,
                edad:Int = 1,
                override var estilo: String = "",
                override var tipoDeBici: String = "",
                override var velocidadCorrer: Int = 1,
                override var velocidadPedalear: Int = 1,
                override var velocidadNadar: Int = 1
):Deportista(nombre,estatura,peso,edad),i_runner,i_ciclista,i_nadador{

    // Tódo este codigo de abajo se simplifica poniendo override var en constructor
/*
    override var estilo: String
        get() = this.estilo
        set(value) {this.estilo = value}
    override var velocidadCorrer: Int
        get() = this.velocidadCorrer
        set(value) {this.velocidadCorrer = value}
    override var velocidadPedalear: Int
        get() = this.velocidadPedalear
        set(value) {this.velocidadPedalear = value}
    override var velocidadNadar: Int
        get() = this.velocidadNadar
        set(value) {this.velocidadNadar = value}
    override var tipoDeBici: String
        get() = this.tipoDeBici
        set(value) {this.tipoDeBici = value}
    */
}