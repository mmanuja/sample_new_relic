package com.example.samplerelic

import android.app.Application
import com.newrelic.agent.android.NewRelic

class Application: Application() {
    override fun onCreate() {
        super.onCreate()
        NewRelic.withApplicationToken("AA7c54e5b1969fc588305f66cabea594a0c6b5067b-NRMA").start(this.applicationContext)
    }
}