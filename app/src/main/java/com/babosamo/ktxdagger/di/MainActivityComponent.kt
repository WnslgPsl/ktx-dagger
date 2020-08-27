package com.babosamo.ktxdagger.di

import com.babosamo.ktxdagger.MainActivity
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent(modules = [MainActivityModule::class])
@ActivityScope
interface MainActivityComponent {

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder {
        fun setModule(module: MainActivityModule): Builder

        @BindsInstance
        fun setActivity(mainActivity: MainActivity): Builder
        fun build(): MainActivityComponent
    }


//    @Component.Factory
//    interface Factory {
//        fun create(@BindsInstance mainActivity: MainActivity, mainModule: MainModule, viewModelModule: ViewModelModule): MainActivityComponent
//    }
}