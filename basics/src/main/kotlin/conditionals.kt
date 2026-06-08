
fun conditional() {

    // Se puede asignar una variables con la clausula if
    val age = 17;
    val isAllowed = if ( age >= 18 ) "yes" else "forbidden";
    println(isAllowed)

    // Incluso hace uso de un bloque
    var typeUser = if ( age >= 18 ) {
        "Adulto";
    }else {
        "Joven"
    };
    println(typeUser);

    // Hace uso del when, es como un switch-case pero mejorado
    val STATUS = 413;
    val typeStatus = when( STATUS ) {
        200 -> "OK"
        in 400..499 -> "Bad Request"
        500, 502, 503 -> "Internal Server Error"
        else -> "Unknown"
    };
    println("Status code: $typeStatus");

    // Inclusive puede hacerlo sin argumentos y tomar como referencia una variable exyner
    val messagePerson = when {
        age < 18 -> "Joven"
        age >= 18 -> "Adulto"
        age >= 18 && age <= 50 -> "Adulto joven"
        else -> "Anciano"
    };
    println(messagePerson);
    println(describir(0.12));

}

// Para verificación de tipos se puede usar tambien el when
fun describir( x: Any ): String {
    return when {
        x is String -> "String: $x"
        x is Int -> "Int: $x"
        x is Double -> "Double: $x"
        x is List<*> -> "List: $x"
        else -> "Unknown"
    }
}