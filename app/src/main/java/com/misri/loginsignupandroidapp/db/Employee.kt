package com.misri.loginpage.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "employee")
data class Employee(
    @PrimaryKey val id: Int = 0,
    val name: String,
    val address: String,
    val contactNumber: String

)
