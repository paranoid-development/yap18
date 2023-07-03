package com.example.yap18

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity

open class MainActivity : LogActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContentView(R.layout.activity_main)

    onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
      override fun handleOnBackPressed() {
        Log.d(tag, "$name ${Thread.currentThread().stackTrace[2].methodName}")
      }
    })

    findViewById<TextView>(R.id.textView).text = name

    findViewById<Button>(R.id.buttonA).setOnClickListener {
      Log.d(tag, "")
      startActivity(Intent(this, ActivityA::class.java))
    }
    findViewById<Button>(R.id.buttonB).setOnClickListener {
      Log.d(tag, "")
      startActivity(Intent(this, ActivityB::class.java))
    }
    findViewById<Button>(R.id.buttonC).setOnClickListener {
      Log.d(tag, "")
      startActivity(Intent(this, ActivityC::class.java))
    }
    findViewById<Button>(R.id.buttonF).setOnClickListener {
      Log.d(tag, "")
      startActivity(Intent(this, FragmentActivity::class.java))
    }
    findViewById<Button>(R.id.buttonT).setOnClickListener {
      Log.d(tag, "")
      startActivity(Intent(this, TabActivity::class.java))
    }
  }
}

class ActivityA : MainActivity()
class ActivityB : MainActivity()
class ActivityC : MainActivity()