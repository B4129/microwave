import Human.Human
import Machine.Machine


fun main() {
    val machine = Machine()
    val human = Human()
    val isEndProgram = false
    while (!isEndProgram) {
        println("ChoiceAction")
        val actionNumber = (readLine() ?: "0").toInt()
        when (actionNumber) {
            1 -> human.openDoor(machine.components.door)
            2 -> human.closeDoor(machine.components.door)
            3 -> human.brokenMachine(machine)
            4 -> human.repairMachine(machine)
        }
    }
}
