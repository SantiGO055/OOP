package com.santigo.oop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() { // hereda de AppCompatActivity

    object santiago{
        var apodo = "Santi"
        fun saludo(){
            println("Hola, me llaman ${apodo}")
        }
    }

    private fun String.noSpaces(): String{
        return this.replace(" ","")
    }
    private fun IntArray.show(){
        println("[")
        for (i in this) print("$i")
        println("]")
    }

    private fun calculadora(n1 :Int, n2: Int, fn: (Int,Int)->Int) : Int{ //el famoso callback
        return fn(n1,n2)
    }

    private fun suma(x: Int, y: Int): Int { return x+y }
    private fun resta(x: Int, y: Int): Int { return x-y }
    private fun multiplica(x: Int, y: Int) = x*y // como cuando declaro variable no hace falta indicar el tipo de dato
    private fun divide(x: Int, y: Int) = x/y


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

/*
        var bicho: Pokemon = Pokemon()
        println(bicho.getName())
        println(bicho.getAttackPower())
        bicho.setLife(30f)
        println(bicho.getLife())
        bicho.cure()

        var firePok: FirePokemon = FirePokemon()
        firePok.attack()
        firePok.sayBye()

        var sc = SubClasses()
        println(sc.presentar())
        //objeto de clase anidada
        var ani = SubClasses.Anidada()
        println(ani.presentar())

        // objeto de tipo clase interna
        var inn = SubClasses().Interna()
        println(inn.presentar())


        santiago.saludo()
        santiago.apodo = "SantiGO"
        santiago.saludo()


        var sol: Star = Star("Sol",696340f,"Via Lactea")
        println(sol)

        var betelgeuse:Star = Star("Betelgeuse", 617100000f,"Orión")
        betelgeuse.alive = false
        println(betelgeuse.alive)

        var nueva: Star = Star()
        println(nueva)



        var hoy: Dias = Dias.DOMINGO
        var semana = Dias.values()
        for (i in semana) println(i)

        println(Dias.valueOf("MIERCOLES"))
        println(hoy.name)
        println(hoy.ordinal)

        println(hoy.saludo())
        println(hoy.jornada)
        println(hoy.laboral)

        var depor1: Deportista = Deportista("Depor1",1.70f,75.0f,25)
        var runner1: Runner = Runner()
        var ciclista1: Ciclista = Ciclista()
        var nadador1: Nadador = Nadador("Nadador",1.70f,75.0f,25)
        var triatleta: Triatleta = Triatleta("Triatleta",90f,80f,30,"Sincronizado","mountain bike",50,80,30)

        depor1.competir()
        depor1.descansar()
        runner1.Runner("Runner",1.70f,75.0f,25,"trote",60)
        runner1.correr()
        runner1.competir()
        runner1.descansar()
        ciclista1.Ciclista("Ciclista",1.70f,75.0f,25,90)
        ciclista1.pedalear()
        ciclista1.competir()
        ciclista1.descansar()
        nadador1.Nadador("Nadador",1.70f,75.0f,25,"sincronizado",80)
        nadador1.nadar()
        nadador1.competir()
        nadador1.descansar()

        triatleta.correrTri()
        triatleta.nadarTri()
        triatleta.pedalearTri()
        triatleta.competir()
        triatleta.descansar()
*/


/*
        var usuario = "      soy  yo        "
        println("${usuario} (${usuario.length}) - ${usuario.noSpaces()} (${usuario.noSpaces().length})")

        var arra1: Array<Int> = arrayOf(5,4,3,2,1)
        var array2 = IntArray(3)
        array2[0] = 10
        array2[1] = 20
        array2[2] = 30
        println("array2: "); array2.show()
        var array3: IntArray = intArrayOf(1,2,3,4,5)
        println("array3: "); array3.show()

        */



            /*
            var atleta: Athlete = Athlete("Maradona","C12348","Fubtol")
            println(atleta.name)
            println(atleta.sport)
            */

        // callbacks
        println("La suma de 80 y 20 es ${calculadora(80,20,::suma)}")
        println("La resta de 50 y 10 es ${calculadora(50,10,::resta)}")
        println("La multiplicacion de 7 y 7 es ${calculadora(7,7,::multiplica)}")
        println("La division de 12 y 3 es ${calculadora(12,3,::divide)}")
    }
}