package Human

import Components.Door

class Human {
    companion object {
        private const val OPENDTEXT ="既に扉は開いています"
        private const val CLOSEDTEXT ="既に扉は閉じています"
    }
    fun openDoor(door: Door) {
        if (door.status.isOpen) println(OPENDTEXT) else door.status.isOpen = true
    }
    fun closeDoor(door:Door){
        if (!door.status.isOpen) println(CLOSEDTEXT) else door.status.isOpen = false
    }

}
