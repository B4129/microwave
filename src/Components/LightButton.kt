package Components

import ValueObject.Toggle

class LightButton {
    private val toggle = Toggle(false)

    fun onClick(light:Light){
        toggle.status = !toggle.status
        val duration = if (toggle.status) 50 else 0
        light.duration.value = duration
        println("ライトボタンをクリックしました")
        println("光量:${light.duration.value}")
    }

}
