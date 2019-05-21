package Human

import Components.LightButton
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
        val status = machine.operationStatus
        if (status.isBroken) println(WASBROKENTEXT) else status.isBroken = true
    }
    fun repairMachine(machine: Machine) {
        val status = machine.operationStatus
        if (!status.isBroken) println(NOTBROKENTEXT) else status.isBroken = false
    }
    fun onClickButtonOfMachine(machine: Machine){
        println("ポチっ")
        val components = machine.components
        components.lightButton.onClick(components.light)
    }


}
