package com.paulsapplication.app.modules.download.ui

import androidx.activity.viewModels
import com.paulsapplication.app.R
import com.paulsapplication.app.appcomponents.base.BaseActivity
import com.paulsapplication.app.databinding.ActivityDownloadBinding
import com.paulsapplication.app.modules.download.`data`.viewmodel.DownloadVM
import kotlin.String
import kotlin.Unit

class DownloadActivity : BaseActivity<ActivityDownloadBinding>(R.layout.activity_download) {
  private val viewModel: DownloadVM by viewModels<DownloadVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.downloadVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "DOWNLOAD_ACTIVITY"

  }
}
