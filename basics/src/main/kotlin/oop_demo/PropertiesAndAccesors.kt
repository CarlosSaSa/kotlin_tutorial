package oop_demo
import java.math.RoundingMode
import java.text.DecimalFormat

class Temperatura {

    // No se escriben getters y setters manuales ya que cada propiedad los tiene de forma implicita
    var celsius: Double = 0.0
        set(value) {
            require( value >= -273.15 ) { "celsius must be >= -273.15" } // Inicializaciín
            // Si pasa las validaciones entonces se puede asignar
            field = value; // La variable field es donde se almacena realmente el valor
        }
    val fahnrenhei: Double get() = this.celsius * 9 / 5 + 32.0;
    val fanrenheitStr: String  get() = "%.2f".format(fahnrenhei);

    // Encapsulamiento
    private val items = mutableListOf<String>(); // Empty list

    // Propiedad de solo lectura
    val contentList: List<String> get() = this.items.toList();

    // Punto de entrada controlado
    fun agregar( item: String ) {
        this.items.add(item);
    }

    // Función de una sola linea
    fun totalList() = this.items.size;


}