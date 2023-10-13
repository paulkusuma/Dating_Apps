package com.paulsapplication.app.modules.signup.`data`.model

import com.paulsapplication.app.R
import com.paulsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSignuptocont: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_up_to_cont)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrLoginwith: String? = MyApp.getInstance().resources.getString(R.string.lbl_or_login_with)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTermsofuse: String? = MyApp.getInstance().resources.getString(R.string.lbl_terms_of_use)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrivacyPolicy: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_privacy_policy)

)
