package Components

import ValueObject.DoorStatus


class Door {
    val status = DoorStatus(false)

    companion object {
        private const val OPENINGTEXT = "ウィーン"
        private const val CLOSINGTEXT = "パタン"
    }

    fun open() {
        val soundText = if (status.isOpen) Door.OPENINGTEXT else Door.CLOSINGTEXT
        println(soundText)

    }
}
