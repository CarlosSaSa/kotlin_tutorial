// Lambdas y funciones de orden superior

// Una lambda no es mas que una función anonima
fun sumaNormal( a: Int, b: Int ): Int = a + b; // Equivalente
val suma = { a: Int, b: Int -> a + b; }; // Suma

// Función de orden superior, recibe o devuelve funciones
// Función que recibe una función llamada operation que recibe dos argumentos y devueelve un int
fun operar( a: Int, b: Int, operation: ( Int, Int ) -> Int ): Int {
  return  operation(a, b);
};

// Versión simplificada
fun operationDos( a: Int, b: Int, operation: (Int, Int)-> Int ): Int = operation(a, b);

fun executeLambdas() {
    println("*".repeat(10) + "Lambdas" + "*".repeat(10));
    val sumNums = suma(1,2 );
    println( sumNums );

    // Llamar a la funcion que recibe una función, se puede llamar a la lambda por fuera de la función
    // esto se llama el trailing lambda
    val resultFunction = operationDos( 10, 20) { a, b ->  a * b };
    println(resultFunction);

    // Cuando se tiene una lambda con un unico parametro, este se ṕuede referenciar como it
    val cuadrados = listOf( 1,2,3,4,5 ).map { it * 3 };
    println(cuadrados);

    // Tambien al igual que en java se puede hacer la referenciad de metodos de clases
    var longitudes = listOf("Uno", "Dos", "Tres", "Cuatro").map { it.length };
    var longitudesDos = listOf("Uno", "Dos", "Tres", "Cuatro").map(String::length);
    println(longitudes);
    println(longitudesDos);




}
