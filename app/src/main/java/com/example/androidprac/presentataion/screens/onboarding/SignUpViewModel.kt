package com.example.androidprac.presentataion.screens.onboarding

import androidx.lifecycle.ViewModel
import com.example.androidprac.core.data.repositories.SignUpRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(
    private val signUpRepository: SignUpRepository
) : ViewModel() {
    fun getSignUpString(): String {
        return signUpRepository.signUp()
    }
}