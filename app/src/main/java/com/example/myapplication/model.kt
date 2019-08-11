package com.example.myapplication

data class Hobby(var title: String)

object Supplier {
    var hobbies = listOf(
        Hobby("walk"),
        Hobby("run"),
        Hobby("play game"),
        Hobby("hiking"),
        Hobby("walk"),
        Hobby("run"),
        Hobby("play game"),
        Hobby("hiking"),
        Hobby("walk"),
        Hobby("run"),
        Hobby("play game"),
        Hobby("hiking"),
        Hobby("walk"),
        Hobby("run"),
        Hobby("play game"),
        Hobby("hiking")
    )
}

object Constants {
    var USER_MSG_KEY = "user_message_key"
}