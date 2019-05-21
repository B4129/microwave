package Components

import ValueObject.Duration
import ValueObject.OperationStatus

class Light {
    val operationStatus = OperationStatus(false)
    val duration = Duration(0)
    fun onLight(){
        duration.value = 50
    }
}
