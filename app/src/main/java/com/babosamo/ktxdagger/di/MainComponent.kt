package com.babosamo.ktxdagger.di

import androidx.appcompat.app.AppCompatActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(modules = [ViewModelModule::class, RepositoryModule::class])
@Singleton
interface MainComponent {


    @ActivityScope
    fun mainActivityComponentBuilder() : MainActivityComponent.Builder

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance activity: AppCompatActivity): MainComponent
    }

}