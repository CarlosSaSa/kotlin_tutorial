// Definición de funciones

// Función con cuerpo
fun sumar( a: Int, b: Int ): Int {
    return  a+b;
}

// Función de una simple expresión
fun multiplicar( a: Int, b: Int ): Int = a * b;

// El equivalente a void es Unit
fun Log( msg: String ): Unit = println(msg);

// Funciones con parametros por defecto
fun saludar( nombre: String, saludo: String = "Hello World!" ) = "Greetings: $nombre: $saludo";

// Funciones con numero variables de parametros
fun sumAllNumbers( vararg numbers: Int ) = numbers.sum();

// Extensión de funciones: Permite agregar metodos adicionales a ciertos tipo
// Agregar la función: isPalyndrom a la clase String
fun String.isPalyndrom(): Boolean = this == this.reversed();
fun String.isEmail(): Boolean = this.contains("@") && this.contains(".");
fun String.repeatNtimes( n: Int ) = repeat(n);

// Se pueden hacer extensiones sobre nullables
fun String?.isEmptyOrNull(): Boolean = this == null || this.isEmpty();

// Extensiones de propiedades: Las properties Extensions permiten hacer uso de las propiedades
val String.lastLetter: Char get() = last();


fun executeFunctions() {
    // Se pueden llamar a las funciones con nombre ṕara mayor claridad y mayor orden
    val greetings =  saludar( nombre = "Juan Carlos", saludo = "Hola" );
    println(greetings);

    val sumNumbers = sumAllNumbers(1,2,3,4,5);
    println(sumNumbers);

    // Uso de extensión de metodos
    val testPalyndrom = "anitalavalatina";
    println( testPalyndrom.isPalyndrom() );

    // Uso de extensión con parametros
    val repeatStrings = "hello".repeatNtimes(5);
    println(repeatStrings);

    // Llamado sobre nulls
    val nameNull: String? = null;
    println(nameNull.isEmptyOrNull());

    // Uso de extension property
    val lastLetter = testPalyndrom.last();
    println( lastLetter );


}