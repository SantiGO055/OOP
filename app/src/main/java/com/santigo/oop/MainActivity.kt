package com.santigo.oop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() { // hereda de AppCompatActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) //Ejecuta onCreate del padre AppCompatActivity
        setContentView(R.layout.activity_main)

/*
        //Usa un bucle do-while para mostrar por pantalla una cuenta regresiva
        // del 9 al 0 igual que cuando hay un lanzamiento
        // de un cohete por parte de la NASA.
        var countDown: Int = 10
        println(4%2)
        do{
            countDown--
            println("\n" + countDown)
        }while (countDown > 0)


        // Usa un bucle while para recorrer todos los números del 1 al 10
        // y mostrar únicamente los pares
        var counterPares: Int = 0
        while (counterPares <= 10){
            if(counterPares % 2 == 0)
                println("\n" + counterPares)

            counterPares++
        }
        //Usa un bucle for para recorrer un array en el que estén
        // almacenados los diferentes platos que ofrece un restaurante
        // y mostrarlos por pantalla
        var platos: Array<String> = arrayOf("Pastas", "Papas Fritas", "Hamburguesa")
        for (i in platos){
            println(i)
        }
        //Crea el mismo ejercicio de antes pero ahora con
        // un array de conjuntos de datos
        //Cada elemento del array debe contener el nombre del plato y su precio

        var platosYPrecio: Map<String, Float> = mapOf(
            platos[0] to 100.50f,
            platos[1] to 70.7f,
            platos[2] to 110.9f

        )
        for (i in platosYPrecio){
            println(i)
        }

        var ingredientesPapasFritas = listOf("papas","aceite hirviendo","queso cheddar")
        var papasFritas = listOf("Papas fritas",100.50f,ingredientesPapasFritas)
        var ingredientesPastas = listOf("Huevo","Harina","Salsa de tomate","Carne picada")
        var pastas = listOf("Pastas",70.7f,ingredientesPastas)
        var ingredientesHamburguesa = listOf("Pan de papa","Carne picada","Lechuga","Tomate")
        var hamburguesa = listOf("Hamburguesa",110.9f,ingredientesHamburguesa)
        var matrizPlatos = arrayOf(
            papasFritas,
            pastas,
            hamburguesa
        )
        for (i in matrizPlatos){
            println(i)
        }
*/

    /*
//        var santi: Person = Person("Santiago","123asd45as")
//        var anonimo: Person = Person()
//
//        anonimo.Person()
//        println(anonimo.alive)
//        println(anonimo.name)
//        println(anonimo.passport)
//
//        println(santi.name)
//        println(santi.passport)
//        santi.die()
*/


        var bicho: Pokemon = Pokemon()
        println(bicho.getName())
        println(bicho.getAttackPower())
        bicho.setLife(30f)
        println(bicho.getLife())
        bicho.cure()

        var firePok: FirePokemon = FirePokemon()
        firePok.attack()
        firePok.sayBye()



            /*
            var atleta: Athlete = Athlete("Maradona","C12348","Fubtol")
            println(atleta.name)
            println(atleta.sport)
            */


    }
}