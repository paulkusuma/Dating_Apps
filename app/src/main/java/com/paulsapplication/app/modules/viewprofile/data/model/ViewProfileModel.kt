package com.paulsapplication.app.modules.viewprofile.`data`.model

import com.paulsapplication.app.R
import com.paulsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ViewProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProfilPengguna: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_profil_pengguna)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_5000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInitokyolagii: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_initokyolagii)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.msg_ig_tokyovibes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_6m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFollowers: String? = MyApp.getInstance().resources.getString(R.string.lbl_followers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistanceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_6_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLikes: String? = MyApp.getInstance().resources.getString(R.string.lbl_likes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistanceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_1m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtViews: String? = MyApp.getInstance().resources.getString(R.string.lbl_views)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAbout: String? = MyApp.getInstance().resources.getString(R.string.lbl_about)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_my_name_is_jess)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReadmore: String? = MyApp.getInstance().resources.getString(R.string.lbl_read_more)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_gallery)

)
