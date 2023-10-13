package com.paulsapplication.app.modules.editprofile.`data`.model

import com.paulsapplication.app.R
import com.paulsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class EditProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThirtyThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_mimi_headline)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPopular: String? = MyApp.getInstance().resources.getString(R.string.lbl_popular)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTrending: String? = MyApp.getInstance().resources.getString(R.string.lbl_trending)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtToday: String? = MyApp.getInstance().resources.getString(R.string.lbl_today)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThirtyTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_content)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFavourite: String? = MyApp.getInstance().resources.getString(R.string.lbl_favourite)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDownloadOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_download)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThirtyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_preferences)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDarkmode: String? = MyApp.getInstance().resources.getString(R.string.lbl_darkmode)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnlyDownloadv: String? =
      MyApp.getInstance().resources.getString(R.string.msg_only_download_v)

)
