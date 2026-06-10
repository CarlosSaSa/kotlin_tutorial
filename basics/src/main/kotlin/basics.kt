import oop_demo.Circulo
import oop_demo.DataclassDemoUser
import oop_demo.Figura
import oop_demo.Gerente
import oop_demo.Persona
import oop_demo.Rectangulo
import oop_demo.Temperatura
import oop_demo.describirFigure

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

    // OOP
    println("***** OOP ******");
    val persona = Persona(name = "Carlos", age = 23);
    println(persona)

    // Si damos una propiedad invalida para age
    // var persona2 = Persona(name = "Carlos", age = 10);
    // println(persona2);

    val temperatura = Temperatura();
    // temperatura.celsius = -275.0; // Lanza excepción de validación
    temperatura.celsius = -200.15; // Valido
    // Se imprime la propiedad
    println( temperatura.fahnrenhei );
    println( temperatura.fanrenheitStr );

    // Demo de herencia
    val gerente = Gerente( nombre = "Carlos", salarioBase = 100.12, bono = 10.12 );
    println(gerente.presentarse());
    println( gerente.salarioMensual() )

    /* Polimorfismo */
    // Lista de implementaciones de clase abstracta
    val listFigures: List<Figura> = listOf( Circulo( radio = 5.1 ), Rectangulo( altura = 1.2, ancho = 1.5 )  );
    for (figura in listFigures) {
        println("Figure name => ${figura.nombre()} con area: ${ figura.area() } y es de tipo: ${describirFigure(figura)} " )
    }

    /* Data class */
    val user1 = DataclassDemoUser( name = "Carlos", email = "carlossasa96@gmail.com" );
    val user2 = DataclassDemoUser( id = "1", name = "Carlos SaSa", email = "juan.salazar@imssbienstar.gob.mx" );
    val user3 = DataclassDemoUser( id = "1", name = "Carlos SaSa", email = "juan.salazar@imssbienstar.gob.mx" );
    println(user1);
    println(user2);
    println("User2 is same user3 = ${user2 == user3}");

    // Se puede hacer un clon inmutable con el metodo copy especificando propiedades puntuales
    val userCopy = user1.copy( name = "New name" );
    println(userCopy);

    // Se puede hacer el destructuring gracias al metodo de componentN
    val ( idUser3, nameUser3, _ ) = user1;
    println("Data from user3 => $idUser3 - $nameUser3");


}

