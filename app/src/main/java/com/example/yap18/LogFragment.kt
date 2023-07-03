package com.example.yap18

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

open class LogFragment : Fragment() {
  protected val name: String by lazy { this.javaClass.name }
  protected val logTag = "XXX"

  override fun onInflate(context: Context, attrs: AttributeSet, savedInstanceState: Bundle?) {
    Log.d(logTag, "$name $tag ${Thread.currentThread().stackTrace[2].methodName}")
    super.onInflate(context, attrs, savedInstanceState)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    Log.d(logTag, "$name $tag ${Thread.currentThread().stackTrace[2].methodName}")
    super.onCreate(savedInstanceState)
  }

  override fun onDestroy() {
    Log.d(logTag, "$name $tag ${Thread.currentThread().stackTrace[2].methodName}")
    super.onDestroy()
  }

  override fun onResume() {
    Log.d(logTag, "$name $tag ${Thread.currentThread().stackTrace[2].methodName}")
    super.onResume()
  }

  override fun onPause() {
    Log.d(logTag, "$name $tag ${Thread.currentThread().stackTrace[2].methodName}")
    super.onPause()
  }

  override fun onAttach(context: Context) {
    Log.d(logTag, "$name $tag ${Thread.currentThread().stackTrace[2].methodName}")
    super.onAttach(context)
  }

  override fun onDetach() {
    Log.d(logTag, "$name $tag ${Thread.currentThread().stackTrace[2].methodName}")
    super.onDetach()
  }

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    Log.d(logTag, "$name $tag ${Thread.currentThread().stackTrace[2].methodName}")
    return super.onCreateView(inflater, container, savedInstanceState)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    Log.d(logTag, "$name $tag ${Thread.currentThread().stackTrace[2].methodName}")
    super.onViewCreated(view, savedInstanceState)
  }

  override fun onDestroyView() {
    Log.d(logTag, "$name $tag ${Thread.currentThread().stackTrace[2].methodName}")
    super.onDestroyView()
  }
}