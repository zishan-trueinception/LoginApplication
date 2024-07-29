package com.example.androidprac.di

import com.example.androidprac.core.data.repositories.CarouselRepo
import com.example.androidprac.core.data.repositories.CarouselRepoImpl
import com.example.androidprac.core.data.repositories.HelloRepo
import com.example.androidprac.core.data.repositories.HelloRepoImpl
import com.example.androidprac.core.data.repositories.SignUpRepository
import com.example.androidprac.core.data.repositories.SignUpRepositoryImpl
import com.example.androidprac.core.data.repositories.topCategories.TopCategoriesRepo
import com.example.androidprac.core.data.repositories.topCategories.TopCategoriesRepoImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideHelloRepository(): HelloRepo {
        return HelloRepoImpl()
    }

    @Singleton
    @Provides
    fun provideSignUpRepository(): SignUpRepository {
        return SignUpRepositoryImpl()
    }

    @Singleton
    @Provides
    fun ProvideCarouselRepo(): CarouselRepo {
        return CarouselRepoImpl()
    }

    @Singleton
    @Provides
    fun provideTopCategories(): TopCategoriesRepo {
        return TopCategoriesRepoImpl()
    }
}