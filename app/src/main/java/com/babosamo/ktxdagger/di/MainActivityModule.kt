package com.babosamo.ktxdagger.di

import androidx.lifecycle.ViewModelProvider
import com.babosamo.ktxdagger.MainActivity
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {


    @Provides
    @ActivityScope
    fun provideActivityName(): String {
        return MainActivity::class.java.simpleName
    }

    @Provides
    @ActivityScope
    fun provideViewModelProvider(activity: MainActivity, viewModelFactory: InjectingSavedStateViewModelFactory): ViewModelProvider {
        return ViewModelProvider(activity, viewModelFactory.create(activity))
    }

//    @Provides
//    @ActivityScope
//    fun provideLoginViewModel(mainActivity: MainActivity): LoginViewModel {
//        return ViewModelProviders.of(loginActivity, LoginViewModelFactory()).get(LoginViewModel::class.java)
//    }


}