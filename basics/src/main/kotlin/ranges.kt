fun ranges() {

    // Para definir un rango se hace uso del operador ..
    val rangeNumbers = 1..5;
    for (number in rangeNumbers) {
        println("Number => $number");
    };

    // Rango con exclusión de un numero con el operador de <
    for (number in 1..<10) {
        println("Number with exclusión => $number");
    }

    // Recorrer rango a la inversa con la palabra clave de downto,
    // <start> downto <ends>
    for (number in 5 downTo 1) { // 5,4,3,2,1
        println("Number $number");
    }

    // Para recorrer por pasos con step
    // <range> step <step_number>
    for (number in 0..20 step 2) {
        println("Number with step $number");
    }



}