package com.santigo.oop

import android.annotation.SuppressLint

open class Pokemon(
    protected var name: String = "Pok",
    protected var attackPower: Float = 30f,
    protected var life: Float = 100f,
) {
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


}
// private no se hereda
// protected se deja heredar
class Waterpokemon(name: String = "Pok",attackPower: Float = 30f,life: Float = 100f):Pokemon(name,attackPower,life){
    private var maxResistance: Int = 500
    private var submergedTime: Int = 0

    fun sayHi(){ println("hola")}

    fun Waterpokemon(name: String,attackPower: Float,mr:Int){
        this.name = name
        this.attackPower = attackPower
        this.life = life
        this.maxResistance = mr
        this.sayHi()
    }


}