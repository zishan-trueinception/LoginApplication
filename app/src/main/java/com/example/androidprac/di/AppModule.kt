package com.example.androidprac.di

import com.example.androidprac.core.data.repositories.HelloRepo
import com.example.androidprac.core.data.repositories.HelloRepoImpl
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
    fun provideHelloRepo(): HelloRepo {
        return HelloRepoImpl()
    }
}