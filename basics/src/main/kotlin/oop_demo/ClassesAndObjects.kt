package oop_demo// Archivo de clases, Constructor primario dentro de la definición de la clase
// val -> Propiedad read-only o final
// var -> Propiedad mutable
// El constructor primario no tiene cuerpo, la logica de inicialización se hace en el init

class Persona( val name: String, var age: Int, var salary: Double = 120.00 ) {

    // Propiedad con valor pro defecto
    val isActive: Boolean = false;

    // Bloque init, se ejecuta al momento de construir el objeti
    init {
        println("On int method");
        // Se pueden poner excepciones de validaciones
        require( age >= 18 ) {
            "Edad inválida";
        }
        // Se hacen mas validaciones que devuelvan una condiciín booleana
        require( salary > 0 ) { "Salary must be positive" }; // Lanza una excepción de tipo IlegarArgumentException
    }

    // Constructor secundario
    constructor( name: String ): this( name, 18 );

    // Metodo de instancoia
    fun cumpleanios ()  = this.age++;

    // Propiedad calculada
    val isMayor: Boolean get() = age > 18;

    override fun toString(): String {
        return "Name: $name, Age: $age"
    }

}