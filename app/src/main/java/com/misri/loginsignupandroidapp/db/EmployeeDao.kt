package com.misri.loginpage.db
import androidx.room.Query

interface EmployeeDao {

    @Query("SELECT * FROM Employee")
    fun getAll(): List<Employee>

    fun insertAll(vararg Employee: Employee)
}
