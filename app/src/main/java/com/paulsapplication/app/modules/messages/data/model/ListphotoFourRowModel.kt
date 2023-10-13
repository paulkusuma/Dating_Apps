package com.paulsapplication.app.modules.messages.`data`.model

import com.paulsapplication.app.R
import com.paulsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListphotoFourRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNameThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_sophia)

)
