package com.paulsapplication.app.modules.welcome.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.paulsapplication.app.R
import com.paulsapplication.app.appcomponents.base.BaseActivity
import com.paulsapplication.app.databinding.ActivityWelcomeBinding
import com.paulsapplication.app.modules.login.ui.LoginActivity
import com.paulsapplication.app.modules.welcome.`data`.viewmodel.WelcomeVM
import kotlin.String
import kotlin.Unit

class WelcomeActivity : BaseActivity<ActivityWelcomeBinding>(R.layout.activity_welcome) {
  private val viewModel: WelcomeVM by viewModels<WelcomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.welcomeVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "WELCOME_ACTIVITY"

    }
  }
