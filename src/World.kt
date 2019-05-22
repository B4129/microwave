import Human.Human
import Machine.Machine
import ValueObject.Name


fun main() {
    val machine = Machine()
    val human = Human(Name("かずき"))
    val isEndProgram = false
    val door = machine.components.door
    while (!isEndProgram) {
        println("ChoiceAction")
        val actionNumber = (readLine() ?: "0").toInt()
        when (actionNumber) {
            1 -> human.openDoor(door)
            2 -> human.closeDoor(door)
            3 -> human.brokenMachine(machine)
            4 -> human.repairMachine(machine)
            5 -> human.onClickButtonOfMachine(machine)
        }
    }
}
