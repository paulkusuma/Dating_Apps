package com.paulsapplication.app.modules.filters.ui

import androidx.activity.viewModels
import com.paulsapplication.app.R
import com.paulsapplication.app.appcomponents.base.BaseActivity
import com.paulsapplication.app.databinding.ActivityFiltersBinding
import com.paulsapplication.app.modules.filters.`data`.viewmodel.FiltersVM
import kotlin.String
import kotlin.Unit

class FiltersActivity : BaseActivity<ActivityFiltersBinding>(R.layout.activity_filters) {
  private val viewModel: FiltersVM by viewModels<FiltersVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.filtersVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FILTERS_ACTIVITY"

  }
}
