package com.paulsapplication.app.modules.explore.`data`.model

import com.paulsapplication.app.R
import com.paulsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ExploreModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtExplore: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_5000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.msg_612_eliza_jack)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUIBreakfastSh: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ui_breakfast_sh)
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
  var txt5coin: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_coin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrameTwenty: String? = MyApp.getInstance().resources.getString(R.string.lbl_view)

)
