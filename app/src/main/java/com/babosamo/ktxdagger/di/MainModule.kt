package com.babosamo.ktxdagger.di

import androidx.lifecycle.ViewModelProvider
import com.babosamo.ktxdagger.MainActivity
import dagger.Module
import dagger.Provides

@Module
class MainModule {

    @Provides
    @ActivityScope
    fun provideViewModelProvider(activity: MainActivity, viewModelFactory: InjectingSavedStateViewModelFactory): ViewModelProvider {
        return ViewModelProvider(activity, viewModelFactory.create(activity))
    }

}