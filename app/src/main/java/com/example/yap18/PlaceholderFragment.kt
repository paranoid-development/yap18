package com.example.yap18

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.yap18.databinding.FragmentTabBinding

/**
 * A placeholder fragment containing a simple view.
 */
class PlaceholderFragment : Fragment() {

  private var _binding: FragmentTabBinding? = null

  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {

    _binding = FragmentTabBinding.inflate(inflater, container, false)
    val root = binding.root

    val index = arguments?.getInt(ARG_SECTION_NUMBER) ?: 1
    binding.sectionLabel.text = "Tab fragment $index"

    binding.button.setOnClickListener {
      parentFragmentManager.commit {
        setReorderingAllowed(true) // Обязательно для использования Multi-backstack
        if (index == 1) {
          replace<Fragment1>(R.id.container)
          addToBackStack(TAB_1)
        } else {
          replace<Fragment2>(R.id.container)
          addToBackStack(TAB_2)
        }
      }
    }

    return root
  }

  companion object {
    const val ARG_SECTION_NUMBER = "section_number"

    @JvmStatic
    fun newInstance(sectionNumber: Int): PlaceholderFragment {
      return PlaceholderFragment().apply {
        arguments = Bundle().apply {
          putInt(ARG_SECTION_NUMBER, sectionNumber)
        }
      }
    }
  }

  override fun onDestroyView() {
    super.onDestroyView()
    _binding = null
  }
}