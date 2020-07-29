package com.babosamo.ktxdagger

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.util.Log

class App: Application() {

    override fun onCreate() {
        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
            override fun onActivityPaused(activity: Activity) {
                Log.i("App", "onActivityPaused: $activity")
            }

            override fun onActivityStarted(activity: Activity) {
                Log.i("App", "onActivityStarted: $activity")
            }

            override fun onActivityDestroyed(activity: Activity) {
                Log.i("App", "onActivityDestroyed: $activity")
            }

            override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
                Log.i("App", "onActivitySaveInstanceState: $activity")
            }

            override fun onActivityStopped(activity: Activity) {
                Log.i("App", "onActivityStopped: $activity")
            }

            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                Log.i("App", "onActivityCreated: $activity")
            }

            override fun onActivityResumed(activity: Activity) {
                Log.i("App", "onActivityResumed: $activity")
            }
        })

        super.onCreate()
    }
}