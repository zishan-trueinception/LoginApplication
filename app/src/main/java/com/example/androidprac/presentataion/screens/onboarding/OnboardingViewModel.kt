package com.example.androidprac.presentataion.screens.onboarding

import androidx.lifecycle.ViewModel
import com.example.androidprac.core.data.repositories.HelloRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class OnboardingViewModel @Inject constructor(val helloRepo: HelloRepo) :ViewModel() {

    fun getHelloString():String{
        return helloRepo.sayHello()
    }
}