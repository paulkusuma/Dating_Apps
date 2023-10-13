package com.paulsapplication.app.modules.signupemail.`data`.model

import com.paulsapplication.app.R
import com.paulsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpEmailModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomebackG: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_back_g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etRegisterButtoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etRegisterButtoOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etRegisterButtoTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etRegisterButtoThreeValue: String? = null
)
