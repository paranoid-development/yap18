package com.example.yap18

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.yap18.databinding.ActivityTabBinding
import com.google.android.material.tabs.TabLayout

const val TAB_1 = "Tab1"
const val TAB_2 = "Tab2"

class TabActivity : AppCompatActivity() {

  private lateinit var binding: ActivityTabBinding

  private val onTabSelectedListener = object : TabLayout.OnTabSelectedListener {
    override fun onTabSelected(tab: TabLayout.Tab?) {
      when (tab?.text) {
        TAB_1 -> {
          supportFragmentManager.saveBackStack(TAB_2)

          // Добавляем фрагмент на случай, если backstack нашей вкладки пустой
          supportFragmentManager.commit {
            setReorderingAllowed(true)
            replace(R.id.container, PlaceholderFragment.newInstance(1))
          }

          // Восстанавливаем наш backstack
          supportFragmentManager.restoreBackStack(TAB_1)
        }
        TAB_2 -> {
          supportFragmentManager.saveBackStack(TAB_1)

          // Добавляем фрагмент на случай, если backstack нашей вкладки пустой
          supportFragmentManager.commit {
            setReorderingAllowed(true)
            replace(R.id.container, PlaceholderFragment.newInstance(2))
          }

          // Восстанавливаем наш backstack
          supportFragmentManager.restoreBackStack(TAB_2)
        }
      }
    }

    override fun onTabUnselected(tab: TabLayout.Tab?) {
    }

    override fun onTabReselected(tab: TabLayout.Tab?) {
    }
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    binding = ActivityTabBinding.inflate(layoutInflater)
    setContentView(binding.root)

    val tabs: TabLayout = binding.tabs
    val tab1 = tabs.newTab()
    tab1.text = TAB_1
    tabs.addTab(tab1)

    val tab2 = tabs.newTab()
    tab2.text = TAB_2
    tabs.addTab(tab2)

    supportFragmentManager.commit {
      setReorderingAllowed(true)
      replace(R.id.container, PlaceholderFragment.newInstance(1))
    }

    tabs.addOnTabSelectedListener(onTabSelectedListener)
  }

}