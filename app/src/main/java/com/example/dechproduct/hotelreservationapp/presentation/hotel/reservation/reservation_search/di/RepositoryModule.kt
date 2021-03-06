package com.example.dechproduct.hotelreservationapp.presentation.hotel.reservation.reservation_search.di

import com.example.dechproduct.hotelreservationapp.data.repository.NewsRepositoryImpl
import com.example.dechproduct.hotelreservationapp.data.repository.dataSource.NewsRemoteDataSource
import com.example.dechproduct.hotelreservationapp.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideNewsRepository(
        newsRemoteDataSource: NewsRemoteDataSource
    ):NewsRepository{
        return NewsRepositoryImpl(newsRemoteDataSource)
    }
}