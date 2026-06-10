package oop_demo

/*
*   Interfaz: Contrato de capacidades, puede tener metodos por defecto ( concretos) y
*   propiedades (sin estado)
* */

interface Reproducible {
    val duracionSegundos: Int; // Propiedad abstracta - Sin backing field
    fun reproducir(): Unit; // Metodo abstracto
    fun detener(): Unit = println("Detenido"); // Metodo concreto
}

// Inteface con un solo metodo abstracto
interface Descargable {
    fun descargar(): String;
}

// Una clase que puede implementar varias interfaces
class Podcast(override val duracionSegundos: Int, val titulo: String ): Reproducible, Descargable {

    // Primer metodo obligatorio para sobreescribir
    override fun reproducir() {
        println("Reproducir");
    }
    // Segundo metodo obligatorio de sobreescribir
    override fun descargar(): String {
        println("Descargar");
        return "Descargar";
    }
}

// Clase abstracta: La diferencia con las interfaces es que las clases abstractas pueden tener propiedades con estado
// proporciona una base parcial con estado comportadido
abstract class Dispositivo( val marca: String ) { // Acepta un parametro en el constructor primario
    // Propiedad con estado
    var encendido: Boolean = false; // Las interfaces no pueden tenerlo

    // Metodo concrecto
    fun encender(): Unit {
        this.encendido = true; // Es obligatorio que sean de bloque
    };

    abstract fun funcionPrincipal(); // Metodo abstracto, obligatorio de implementar
}

class Telefono( marca: String): Dispositivo(marca) {

    // Se comparte el estado de la variable de encencido
    init {
        this.encendido = false;
    }

    // Hay que implementar el metodo abstracto de forma obligatoria
    override fun funcionPrincipal() {
        println("Telefono");
    }
}

// Problema del diamante: Cuando dos interfaces implementan el mismo metodo kotlin obliga a resolver este conflfico
interface A { fun saludo(): String = "From A" };
interface B { fun saludo(): String = "From B" };

class C: A, B {

    override fun saludo(): String {
        // Se puede hacer uso de super para poder hacer referencia a los metodos concretos
        val concreteMethods = "${super<A>.saludo()} + ${super<B>.saludo()}"
        return "A";
    }

}