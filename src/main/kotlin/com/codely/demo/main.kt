package com.codely.demo

import com.codely.demo.cat.*
import com.codely.demo.shared.Clock
import com.codely.demo.shared.Reader
import com.codely.demo.shared.Writer

fun main() {
    try {
        CatCreator(Reader(), Writer(), Clock(), MapCatRepository()).create()
    } catch (e: CatCreationException){
        when (e) {
            is InvalidBirthDate -> println("Upss looks like the birth date was invalid, please remember to use the correct format")
            is InvalidColor -> println("Upss looks like the color was invalid, the available colors are: BLACK, RED, CINNAMON, BLUE, CREAM, LILAC, FAWN, WHITE")
            is InvalidId -> println("Upss looks like the id was invalid, please remember to use a uuid next time")
            is InvalidName -> println("Upss looks like the name was invalid, please remember that blanks or empty names are not valid")
            is InvalidOrigin -> println("Upss looks like the name was invalid, please remember that blanks or empty origins are not valid")
            is InvalidVaccinated -> println("Upss looks like the name was invalid, please remember the valid options: yes, no")
        }
    }
}
