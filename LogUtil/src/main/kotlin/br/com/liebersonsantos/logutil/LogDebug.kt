package br.com.liebersonsantos.logutil

import android.util.Log

open class LogDebug {

    companion object{
        private const val TAG = "LOG_UTIL_DEBUG"
    }

    fun debug(message: String){
        Log.d(TAG, message)
    }
}