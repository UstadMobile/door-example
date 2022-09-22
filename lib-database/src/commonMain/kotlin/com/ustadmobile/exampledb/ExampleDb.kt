package com.ustadmobile.exampledb

import com.ustadmobile.door.annotation.DoorDatabase
import com.ustadmobile.door.room.RoomDatabase

@DoorDatabase(version = 1, entities = [ExampleEntity::class])
expect abstract class ExampleDb : RoomDatabase {

    abstract val exampleDao: ExampleDao
}