package com.paulsapplication.app.modules.login.`data`.model

import com.paulsapplication.app.R
import com.paulsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomebackG: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_back_g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrLoginwith: String? = MyApp.getInstance().resources.getString(R.string.lbl_or_login_with)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_don_t_have_an_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etRegisterButtoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etRegisterButtoOneValue: String? = null
)
