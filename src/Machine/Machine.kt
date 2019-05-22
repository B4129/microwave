package Machine

import Components.Components
import ValueObject.Name
import ValueObject.OperationStatus
import kotlin.random.Random

class Machine {
    val name = Name("タカシ")
    val components = Components()
    val operationStatus = OperationStatus(false)
}