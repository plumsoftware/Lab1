package ru.plumsoftware.lab1.utilities

import android.widget.Toast
import ru.plumsoftware.lab1.App

fun showToast(message: String) {
    Toast.makeText(App.INSTANCE.applicationContext, message, Toast.LENGTH_SHORT).show()
}