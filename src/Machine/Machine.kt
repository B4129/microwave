package Machine

import Components.Components
import ValueObject.OperationStatus

class Machine {
    val components = Components()
    val operationStatus = OperationStatus(false)
}