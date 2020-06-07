package com.mncebiz.naeem.myfavstock.usecase

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import kotlinx.coroutines.delay

private const val GET_USER_INFORMATION_DELAY = 1_000L
private const val USER_NAME = "Naeem Quraishi"
private const val ACCOUNT_NUMBER = "5595365398053493"
private const val PHONE_NUMBER = "9892 989298"

class GetUserInformationUseCase {
    fun get(): LiveData<UserInformation> = liveData {
        delay(GET_USER_INFORMATION_DELAY)
        emit(UserInformation(USER_NAME, ACCOUNT_NUMBER, PHONE_NUMBER))
    }
}

data class UserInformation(val name: String, val accountNumber: String, val phoneNumber: String)