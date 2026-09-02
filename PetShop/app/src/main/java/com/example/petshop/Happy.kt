package com.example.petshop

class Happy(date: String): Mood(date) {
    override fun moodRep(): String {
        return ":)"
    }
}