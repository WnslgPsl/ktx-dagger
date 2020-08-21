package com.babosamo.ktxdagger.di

import com.babosamo.ktxdagger.TestRepository
import com.babosamo.ktxdagger.TestRepositoryImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
internal interface RepositoryModule {

    @Singleton
    @Binds
    fun bindTestRepository(testRepositoryImpl: TestRepositoryImpl): TestRepository



}