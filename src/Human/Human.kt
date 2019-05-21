package Human

import Components.Door
import Machine.Machine

class Human {
    companion object {
        private const val OPENDTEXT ="既に扉は開いています"
        private const val CLOSEDTEXT ="既に扉は閉じています"
        private const val WASBROKENTEXT="既に電子レンジは壊れています"
        private const val NOTBROKENTEXT="電子レンジは壊れていません"


    }
    fun openDoor(door: Door) {
        if (door.status.isOpen) println(OPENDTEXT) else door.status.isOpen = true
    }
    fun closeDoor(door:Door){
        if (!door.status.isOpen) println(CLOSEDTEXT) else door.status.isOpen = false
    }

    fun brokenMachine(machine: Machine) {
        if (machine.operationStatus.isBroken) println(WASBROKENTEXT) else machine.operationStatus.isBroken = true
    }
    fun repairMachine(machine: Machine) {
        if (!machine.operationStatus.isBroken) println(NOTBROKENTEXT) else machine.operationStatus.isBroken = false
    }


}
