package Human

import Components.LightButton
import Components.Door
import Machine.Machine
import ValueObject.Name

class Human(string: Name) {
    val name = string
    companion object {
        private const val OPENDTEXT ="既に扉は開いています"
        private const val CLOSEDTEXT ="既に扉は閉じています"
        private const val WASBROKENTEXT="既に電子レンジは壊れています"
        private const val NOTBROKENTEXT="電子レンジは壊れていません"


    }
    fun openDoor(door: Door) {
        println("${name.string}はドアを開いた")
        if (door.status.isOpen) println(OPENDTEXT) else door.status.isOpen = true
    }
    fun closeDoor(door:Door){
        println("${name.string}はドアを閉じた")
        if (!door.status.isOpen) println(CLOSEDTEXT) else door.status.isOpen = false
    }

    fun brokenMachine(machine: Machine) {
        println("${name.string}は${machine.name.string}を蹴り飛ばした")
        val status = machine.operationStatus
        if (status.isBroken) println(WASBROKENTEXT) else status.isBroken = true
    }
    fun repairMachine(machine: Machine) {
        println("${name.string}は${machine.name.string}にドライバーを当てた")
        val status = machine.operationStatus
        if (!status.isBroken) println(NOTBROKENTEXT) else status.isBroken = false
    }
    fun onClickButtonOfMachine(machine: Machine){
        println("ポチっ")
        val components = machine.components
        components.lightButton.onClick(components.light)
    }


}
