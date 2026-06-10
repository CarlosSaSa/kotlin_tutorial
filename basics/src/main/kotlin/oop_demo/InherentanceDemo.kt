package oop_demo

// Por defecto las clases en kotlin son final y no se pueden heredar
// para hacerlo hay que marcarlo con open para que puedan ser heredadas

// Ya puede heredar la clase
// Para que las propiedades puedan sobreescribirse hay que marcarlas igual con open
open class Empleado( val nombre: String, protected open val salarioBase: Double ) {

    // Metodo sobreescribible, se tiene que sobreescribir de manera forzoza
    open fun salarioMensual(): Double = this.salarioBase;

    // Metodo de presentación
    fun presentarse() = "Soy $nombre con salario $salarioBase";
}

// Las propiedades privadas tambien se pueden definir en el constructor primario
class Gerente( nombre: String, salarioBase: Double, private val bono: Double ): Empleado(nombre, salarioBase)  {

    // El override es obligatorio en Kotli
    override fun salarioMensual(): Double = salarioBase + bono;

}

// La clase tambien puede llamar a metodos de la clase padre, para no redefinr las variables dentro de la clase base
// estas se usan como propiedades, si quisiera usarse con val o var se tendria que poner un open en las variable padre
class Vendedor( nombre: String, salarioBase: Double, private  val comision: Double): Empleado(nombre, salarioBase) {

    // Para llamar a un metodo de la clase padre se tiene que usar el metodo de super
    override fun salarioMensual(): Double = super.salarioMensual() + this.comision;
}

// Polimorfismo: Mismos metodos pueden hacer diferentes cosas

// Declaración de la abstracción
abstract class Figura {
    // Metodo abstracto
    abstract  fun area(): Double;
    abstract  fun nombre(): String;

}
// Clase que realiza la implementación de los metodos abstractos
class Circulo( val radio: Double ): Figura() {

    // Para sobreescribir el metodo abstracto
    override fun nombre(): String = "Circulo;"
    override fun area(): Double = Math.PI * radio * radio;
}

// Otra clase que hace las implementaciones
class Rectangulo( val ancho: Double, val altura: Double ): Figura() {

    override fun nombre(): String = "Rectangulo;"
    override fun area(): Double = ancho * altura;

}

// Podemos hacer una función que determine cuando se trata de cierto tipo
// si es que se implementan una interface o clase abstracta
fun describirFigure( f: Figura ): String = when( f ) {
    is Circulo -> "Circulo"
    is Rectangulo -> "Rectangulo"
    else -> "Figura no conocida"
};




















