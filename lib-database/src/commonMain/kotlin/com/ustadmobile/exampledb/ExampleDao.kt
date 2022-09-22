package com.ustadmobile.exampledb

import androidx.room.Insert
import androidx.room.Query
import com.ustadmobile.door.annotation.DoorDao
import kotlinx.coroutines.flow.Flow

@DoorDao
expect abstract class ExampleDao {

    @Insert
    abstract suspend fun insert(entity: ExampleEntity): Long

    @Query("SELECT * FROM ExampleEntity")
    abstract suspend fun getAllEntities(): List<ExampleEntity>

    @Query("SELECT * FROM ExampleEntity")
    abstract fun getAllAsFlow(): Flow<List<ExampleEntity>>

    @Query("SELECT * FROM ExampleEntity WHERE age > :age")
    abstract fun findOlderThan(age: Int): List<ExampleEntity>

}