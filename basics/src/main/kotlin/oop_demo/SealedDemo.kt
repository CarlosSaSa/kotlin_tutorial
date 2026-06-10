package oop_demo

/**
 * Las sealed interfaces definen un conjunto de clases que oueden implementarlas
 */

sealed interface ResponseHttp;

// El compilador sabe que clases implementan la interface sealed
data class Exits( val message : String ): ResponseHttp;
data class Redirection( val url: String ): ResponseHttp;
data class ErrrorClient( val code: String): ResponseHttp;

// Por lo cual en una clausula when se puede hacer una verificación exhaustiva
fun handleResponse( response: ResponseHttp ): String = when (response) {
    is Exits -> response.message
    is ErrrorClient -> response.code
    is Redirection -> response.url
}



