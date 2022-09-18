package com.santigo.oop

import android.annotation.SuppressLint

open class Pokemon(
    protected var name: String = "Pok",
    protected var attackPower: Float = 30f,
    protected var life: Float = 100f,
):Thanks() {
    // protected

    @SuppressLint("NotConstructor")
    fun Pokemon(n: String, aP: Float){
        this.name = n
        this.attackPower = aP
        this.life = 100f
    }

    internal fun getName(): String { return this.name } // como uso atributo protected la funcion va a ser internal
    internal fun getAttackPower(): Float { return this.attackPower }
    internal fun getLife(): Float { return this.life }

    internal fun setLife(l: Float){ this.life =  l}
    open fun attack(){
        println("ataqueeee!")}

    fun cure(){
        this.setLife(100f)
        this.thanksCure()
    }


}
// private no se hereda
// protected se deja heredar
class Waterpokemon(name: String = "Pok",
                   attackPower: Float = 30f,
                   life: Float = 100f):Pokemon(name,attackPower,life){
    private var maxResistance: Int = 500
    private var submergedTime: Int = 0

    fun sayHi(){ println("hola")}

    @SuppressLint("NotConstructor")
    fun Waterpokemon(name: String, attackPower: Float, mr:Int){
        this.name = name
        this.attackPower = attackPower
        this.life = life
        this.maxResistance = mr
        this.sayHi()
    }
    override fun attack(){
        println("ataqueeee!")}


}

class FirePokemon(name: String = "Pok",
                  attackPower: Float = 30f,
                  life: Float = 100f): Pokemon(name,attackPower,life), sayBye {
      private var ballTemperature: Int = 90

    lateinit var ball : ballFire
    var numBall: Int = 0


    //dato viene de sayBye
    override var dato: Int
        get() = TODO("Not yet implemented")
        set(value) {}


    @SuppressLint("NotConstructor")
        fun FirePokemon(bt: Int){
            this.ballTemperature = bt

        }
    override fun attack(){
        super.attack() // super es por la funcion superior del padre
        println("ataqueeee!")
        println("Bola Nro ${++numBall}")
        ball = ballFire(ballTemperature)
        ball.throwBall()
    }
}
class ballFire(var t: Int = 100){
    fun throwBall(){
        println("Tirando bola con temperatura de $t")
    }
}

// abstract class solo se puede heredar de ella y no crear objetos
abstract class Thanks(){
    fun thanksCure(){
        println("Gracias por curarme")
    }
}

// puedo hacer multiple herencia con las interfaces
interface sayBye{
    var dato: Int // no posee constructor y debe ser inicializado en la herencia
    fun sayBye(){
        println("Byeee")
    }
}