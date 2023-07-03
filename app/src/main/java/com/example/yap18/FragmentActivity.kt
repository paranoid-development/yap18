package com.example.yap18

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.replace

open class FragmentActivity : LogActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContentView(R.layout.activity_fragment)

//    if (savedInstanceState == null) {
//      supportFragmentManager.commit {
//        setReorderingAllowed(true)
//        replace<Fragment2>(R.id.fragmentContainerView)
//      }
//    }
  }
}