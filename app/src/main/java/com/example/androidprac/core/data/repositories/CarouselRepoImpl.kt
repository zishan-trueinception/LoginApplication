package com.example.androidprac.core.data.repositories

import com.example.androidprac.R

class CarouselRepoImpl : CarouselRepo{
    override fun getCarouselList(): List<Int> {
        return listOf(
            R.drawable.image_banner_raspberry,
            R.drawable.image_banner_balsawood,
            R.drawable.image_banner_atomstack,
            R.drawable.image_banner_printing,
            R.drawable.image_banner_order
        )
    }
}