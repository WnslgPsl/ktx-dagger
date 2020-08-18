package com.babosamo.ktxdagger

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.babosamo.ktxdagger.di.AssistedSavedStateViewModelFactory
import com.squareup.inject.assisted.Assisted
import com.squareup.inject.assisted.AssistedInject

class MainViewModel @AssistedInject constructor(@Assisted private val handle: SavedStateHandle) : ViewModel() {

    private var id = handle["id"] ?: 0
        set(value) {
            handle["id"] = value
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