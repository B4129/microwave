package Components

import ValueObject.Toggle

class LightButton {
    val toggle = Toggle(false)

    fun onClick(light:Light){
        light.duration.value = 50
        println("ライトボタンをクリックしました")
        println("光量:${light.duration.value}")
    }

}
