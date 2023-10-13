package com.paulsapplication.app.modules.matches.`data`.model

import com.paulsapplication.app.R
import com.paulsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MatchesRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLeilaniCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_leilani_19)

)
