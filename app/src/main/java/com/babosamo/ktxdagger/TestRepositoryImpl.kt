package com.babosamo.ktxdagger

import android.util.Log
import javax.inject.Inject

class TestRepositoryImpl @Inject constructor(): TestRepository {
    override fun test() {
        Log.i("TestRepositoryImpl", "TestRepositoryImpl")
    }
}