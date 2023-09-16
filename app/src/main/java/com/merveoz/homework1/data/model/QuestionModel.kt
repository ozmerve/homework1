package com.merveoz.homework1.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class QuestionModel(
    val name: String,
    val email:String,
    val phone: String,
    val questionOne: String,
    val questionTwo: String,
    val questionThree: String
): Parcelable
