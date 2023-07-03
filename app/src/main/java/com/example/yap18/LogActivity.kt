package com.example.yap18

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

open class LogActivity : AppCompatActivity() {
  protected val name by lazy { this.localClassName }
  protected val tag = "XXX"

  override fun onCreate(savedInstanceState: Bundle?) {
    Log.d(tag, "$name ${Thread.currentThread().stackTrace[2].methodName}")
    super.onCreate(savedInstanceState)
  }

  override fun onDestroy() {
    Log.d(tag, "$name ${Thread.currentThread().stackTrace[2].methodName}")
    super.onDestroy()
  }

  override fun onStart() {
    Log.d(tag, "$name ${Thread.currentThread().stackTrace[2].methodName}")
    super.onStart()
  }

  override fun onStop() {
    Log.d(tag, "$name ${Thread.currentThread().stackTrace[2].methodName}")
    super.onStop()
  }

  override fun onResume() {
    Log.d(tag, "$name ${Thread.currentThread().stackTrace[2].methodName}")
    super.onResume()
  }

  override fun onPause() {
    Log.d(tag, "$name ${Thread.currentThread().stackTrace[2].methodName}")
    super.onPause()
  }

  override fun onNewIntent(intent: Intent?) {
    Log.d(tag, "$name ${Thread.currentThread().stackTrace[2].methodName}")
    super.onNewIntent(intent)
  }
}