package com.paulsapplication.app.modules.viewprofile.ui

import androidx.activity.viewModels
import com.paulsapplication.app.R
import com.paulsapplication.app.appcomponents.base.BaseActivity
import com.paulsapplication.app.databinding.ActivityViewProfileBinding
import com.paulsapplication.app.modules.viewprofile.`data`.viewmodel.ViewProfileVM
import kotlin.String
import kotlin.Unit

class ViewProfileActivity : BaseActivity<ActivityViewProfileBinding>(R.layout.activity_view_profile)
    {
  private val viewModel: ViewProfileVM by viewModels<ViewProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.viewProfileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "VIEW_PROFILE_ACTIVITY"

  }
}
