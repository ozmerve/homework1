package com.merveoz.homework1.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PersonalInformationModel(
    val name: String,
    val email:String,
    val phone: String
) : Parcelable
