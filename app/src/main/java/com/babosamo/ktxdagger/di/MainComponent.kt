package com.babosamo.ktxdagger.di

import androidx.appcompat.app.AppCompatActivity
import com.babosamo.ktxdagger.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component
interface MainComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance activity: AppCompatActivity): MainComponent
    }


}