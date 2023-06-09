package com.dani.final2.appData

import android.icu.text.DateFormat.HourCycle
import androidx.compose.runtime.MutableState
import androidx.compose.ui.unit.dp
import com.google.type.Date
import com.google.type.DateTime
import java.sql.Time

class Nota {
    var id :String = ""
    var text :String = ""
    var ubi :String = "No existe"
    var x :String="0.000000"
    var y :String="0.000000"
    var z :String="0.000000"
    var user:String= userName.value
    var time:String ="00:00:00"

    constructor(text: String, ubi: String) {
        this.text = text
        this.ubi = ubi
    }

    constructor(id: String, text: String, ubi: String, x: String, y: String, z: String) {
        this.id = id
        this.text = text
        this.ubi = ubi
        this.x = x
        this.y = y
        this.z = z
    }

    constructor(
        id: String,
        text: String,
        ubi: String,
        x: String,
        y: String,
        z: String,
        user: String
    ) {
        this.id = id
        this.text = text
        this.ubi = ubi
        this.x = x
        this.y = y
        this.z = z
        this.user = user
    }

    constructor(
        id: String,
        text: String,
        ubi: String,
        x: String,
        y: String,
        z: String,
        user: String,
        time: String
    ) {
        this.id = id
        this.text = text
        this.ubi = ubi
        this.x = x
        this.y = y
        this.z = z
        this.user = user
        this.time = time
    }

    fun setUbication(ubi:String){
        this.ubi = ubi
        this.x = x
        this.y = y
        this.z = z
    }
}
