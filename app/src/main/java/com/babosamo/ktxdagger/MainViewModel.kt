package com.babosamo.ktxdagger

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.babosamo.ktxdagger.di.AssistedSavedStateViewModelFactory
import com.squareup.inject.assisted.Assisted
import com.squareup.inject.assisted.AssistedInject

class MainViewModel @AssistedInject constructor(@Assisted private val savedStateHandle: SavedStateHandle, private val testRepo: TestRepository) : ViewModel() {

    init {
        testRepo.test()
    }

    private var id = savedStateHandle["id"] ?: 0
        set(value) {
            savedStateHandle["id"] = value
            field = value
        }


    init {
        Log.i("MainViewModel", "id: $id")
    }

    fun plus() {
        Log.i("MainViewModel", "plus id: $id")
        id += 1
    }

    @AssistedInject.Factory
    interface Factory : AssistedSavedStateViewModelFactory<MainViewModel>

}