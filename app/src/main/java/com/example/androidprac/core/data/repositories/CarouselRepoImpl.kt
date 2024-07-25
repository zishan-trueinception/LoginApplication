package com.example.androidprac.core.data.repositories

import com.example.androidprac.R

class CarouselRepoImpl : CarouselRepo{
    override fun getCarouselList(): List<Int> {
        return listOf(
            R.drawable.newbannerone,
            R.drawable.newbannertwo,
            R.drawable.newbannerreplace,
            R.drawable.newbannerfourth,
            R.drawable.newbannerfifth
        )
    }
}