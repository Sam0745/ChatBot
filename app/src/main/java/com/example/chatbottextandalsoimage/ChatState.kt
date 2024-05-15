package com.example.chatbottextandalsoimage

import android.graphics.Bitmap
import com.example.chatbottextandalsoimage.data.Chat

data class ChatState(
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)