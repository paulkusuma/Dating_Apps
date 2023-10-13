package com.paulsapplication.app.modules.matches.`data`.model

import com.paulsapplication.app.R
import com.paulsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Matches1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKyleCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_kyle_24)

)
