package oop_demo

import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid


// Es esencial para procesos que transportan datos, el compilador
// genera lo siguiente: equals(), hashCode(), toString(), copy(), y componentN()
@OptIn(ExperimentalUuidApi::class)
data class DataclassDemoUser(
    val id: String = Uuid.generateV7().toString(),
    val name: String,
    val email: String
);


