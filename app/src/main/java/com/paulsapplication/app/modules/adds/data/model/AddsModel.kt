package com.paulsapplication.app.modules.adds.`data`.model

import com.paulsapplication.app.R
import com.paulsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AddsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBrandName: String? = MyApp.getInstance().resources.getString(R.string.lbl_brand_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSponsored: String? = MyApp.getInstance().resources.getString(R.string.lbl_sponsored)

)
