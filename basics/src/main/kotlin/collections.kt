// Colecciones

fun executeCollections() {
    val listValues = listOf(1,2,3); // Lista inmutable
    val listValuesMutable = mutableListOf(1,2,3);  // Lista mutable

    // Sets
    val setValues = setOf(1,2,3);  // set inmutables
    println("Sets => $setValues");

    // Maps -> Key to value
    val mapValues = mapOf( "name" to "Carlos", "age" to 30 ); // Inmutable map
    println("Map => $mapValues");

    // Mutable map
    val mutableMap = mutableMapOf<String, Any>();
    mutableMap["name"] = "Carlos";
    mutableMap["age"] = 30;
    println("Mutable map => $mutableMap");

    // Algunas operaciones sobre coleciones que no mutan la estructura original
    val nums = listOf(1,2,3,4,5);
    println( nums.map { it * 2 } );
    println( nums.filter { it % 2 == 0 } ); // NUmeros pares
    println( nums.filterNot { it > 3 } ); // Aquellos que no cumplen con la condición -> [1,2,3]
    println( nums.find { it > 20 } ); // Si no se cumple es null
    println( nums.count { it % 2 == 0 } ); // CUantos elementos cumplen con la condición
    /*
    * ALgunos otors metodos
    *   nums.maxOrNull()                     // 6
        nums.sortedDescending()              // [6,5,4,3,2,1]
        nums.take(2)                         // [1,2]
        nums.drop(2)                         // [3,4,5,6]
        nums.chunked(2)                      // [[1,2],[3,4],[5,6]]
        nums.zip(listOf("a","b"))            // [(1,a),(2,b)]
    * */

    // Acumuladores
    println( "Acumulator = ${ nums.reduce { acc, i -> acc + i } }" ); // SIn valor inicial , con 0
    println("Acumulator with initial value => ${ nums.fold( 100 ){acc, i -> acc + i } }"); // 121

    // Secuencias: Evaluación perezosa para cadaenas largas o datos grandes
    val resultado = ( 1..1_000_000 ).asSequence()
        .map { it * 2 }
        .filter { it % 3 == 0 }
        .take(5)
        .toList();
    println( resultado );

}