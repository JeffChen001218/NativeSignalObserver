package com.example.signal

import android.app.Application
import com.jeffchen.lib_signal.SignalConst
import com.jeffchen.lib_signal.SignalController

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        SignalController.initSignal(intArrayOf(
            SignalConst.SIGQUIT,
            SignalConst.SIGABRT,
            SignalConst.SIGSEGV),this,MyHandler())
    }
}