package com.paulsapplication.app.modules.adds.ui

import androidx.activity.viewModels
import com.paulsapplication.app.R
import com.paulsapplication.app.appcomponents.base.BaseActivity
import com.paulsapplication.app.databinding.ActivityAddsBinding
import com.paulsapplication.app.modules.adds.`data`.viewmodel.AddsVM
import kotlin.String
import kotlin.Unit

class AddsActivity : BaseActivity<ActivityAddsBinding>(R.layout.activity_adds) {
  private val viewModel: AddsVM by viewModels<AddsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ADDS_ACTIVITY"

  }
}
