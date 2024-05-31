package com.misri.loginpage.db

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Employee::class], version = 1)
abstract class EmployeeDatabase : RoomDatabase() {
    abstract val contactNumber: String


    fun main(context:Context) {
        val db = Room.databaseBuilder(
            context.applicationContext,
            AppDatabase::class.java, "database-name"
        ).build()
        val EmployeeDao = db.EmployeeDao()
        val employee= arrayOf(Employee(1, "John", 25, 98), Employee(2, "Jane", 30,98))
        EmployeeDao.insertAll(*employee)
        val employeeList = EmployeeDao.getAll()
        employeeList.forEach {
            println("Employee: ${it.name}, contactNumber: ${it.contactNumber}")
        }
    }
}