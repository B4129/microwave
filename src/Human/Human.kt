package Human

import Components.Door

class Human {
    companion object {
        private const val OPENDTEXT ="既に扉は開いています"
    }
    fun openDoor(door: Door) {
        if (door.status.isOpen) println(OPENDTEXT) else door.status.isOpen = true
    }

}
