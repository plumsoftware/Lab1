package ru.plumsoftware.lab1.models

data class ReviewModel(
    val reviewIconId: Int = 0,
    val reviewer: String = "",
    val reviewDate: Long = 0L,
    val reviewText: String = ""
)
