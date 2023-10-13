package com.paulsapplication.app.modules.signupemail.ui

import androidx.activity.viewModels
import com.paulsapplication.app.R
import com.paulsapplication.app.appcomponents.base.BaseActivity
import com.paulsapplication.app.databinding.ActivitySignUpEmailBinding
import com.paulsapplication.app.modules.signupemail.`data`.viewmodel.SignUpEmailVM
import kotlin.String
import kotlin.Unit

class SignUpEmailActivity :
    BaseActivity<ActivitySignUpEmailBinding>(R.layout.activity_sign_up_email) {
  private val viewModel: SignUpEmailVM by viewModels<SignUpEmailVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpEmailVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SIGN_UP_EMAIL_ACTIVITY"

  }
}
