package com.ustadmobile.exampledb

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class ExampleEntity {

    @PrimaryKey(autoGenerate = true)
    var uid: Long = 0

    var name: String? = null

    var age: Int = 0

}