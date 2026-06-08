fun main(args: Array<String>) {
    println("Hello World!");

    // Variables inmutables
    val name = "Carloss SaSa";
    println(name);

    // No se puede cambiar
    // name = "new name"; // Prohibido

    /*
    * Algunos tipos basicos
    * Enteros: Byte (8 bits) - Short(16) - Int(32) y Long(64)
    * Decimales: FLoat(32) - Double (64)
    * Otros: Boolean, Char, String,
    * */
    val bigNumber = 1_00_000_000L;
    val decimalNumber = 3.135131;
    val numberAsString = "100.112";
    println(bigNumber);
    println(decimalNumber);

    // Las conversiones son siempre de manera explicitas
    val bigNumberToString = bigNumber.toString();
    val decimalFromString = numberAsString.toBigDecimal(); // Si falla lanza una excepción
    println(bigNumber);
    println(decimalFromString);
    println("*".repeat(100));

    // Handle of nulls
    var userName: String? = "Carlossasa"; // Se tiene que especificar el tipo de dato
    userName = null; // puede ser null la variable
    println(userName);

    // Se pueden encadenar operaciones para la seguridad
    val lengthString = userName?.length;
    println("Length of name: $lengthString");

    // Pero se puede usar el operador elvis si el resultado es null
    var lengthStringWithDefault = userName?.length ?: 10;
    println("Length of default : $lengthStringWithDefault");

    // Casteo seguro
    val numberExample: Int? = null;
    val numberAsInt = numberExample as? Int; // Null si no se puede realizar la conversión
    println("Number of example is $numberAsInt");

    // Manejo de strings
    val edad = 30;
    println("Age double: ${ edad * 2 }");

    // String multilinea o raw string, se pueden interpolar
    val jsonExample = """
        {
            "nombre": "Carlos",
            "edad": $edad 
        }
    """.trimIndent();
    println(jsonExample);

    // Algunos ejemplos con
    val divideList = "a,b,c,d,e,f,g,h,i".split(","); // Dividir una cadena
    println(divideList);

    // Convertir una lista a una cadena
    val stringFromList = listOf<String>("a", "b", "c", "d", "e", "f", "g").joinToString("|");
    println(stringFromList);

    // Condicionales
    conditional();

    // Ranges
    ranges();

    // Functions
    executeFunctions();

    // Lambdas
    executeLambdas();

    // COllections
    executeCollections();

}

