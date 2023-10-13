package com.paulsapplication.app.modules.messages.`data`.model

import com.paulsapplication.app.R
import com.paulsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListphotoSixRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNameFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_emelie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_23_min)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMessage: String? = MyApp.getInstance().resources.getString(R.string.lbl_sticker)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMessageindicat: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)

)
