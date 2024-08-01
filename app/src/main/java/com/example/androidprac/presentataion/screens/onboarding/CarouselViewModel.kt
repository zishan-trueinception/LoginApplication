package com.example.androidprac.presentataion.screens.onboarding

import androidx.lifecycle.ViewModel
import com.example.androidprac.core.data.repositories.CarouselRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CarouselViewModel @Inject constructor(
    private val carouselRepo: CarouselRepo
) : ViewModel() {
    fun getCarouselList() : List<Int> {
        return carouselRepo.getCarouselList()
    }
}