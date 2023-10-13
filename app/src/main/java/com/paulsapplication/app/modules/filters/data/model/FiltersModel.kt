package com.paulsapplication.app.modules.filters.`data`.model

import com.paulsapplication.app.R
import com.paulsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FiltersModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtExplore: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_612_eliza_jack)
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
  var txtView: String? = MyApp.getInstance().resources.getString(R.string.lbl_view)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFilters: String? = MyApp.getInstance().resources.getString(R.string.lbl_filters)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSkip: String? = MyApp.getInstance().resources.getString(R.string.lbl_clear)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInterestedin: String? = MyApp.getInstance().resources.getString(R.string.lbl_interested_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBoys: String? = MyApp.getInstance().resources.getString(R.string.lbl_boys)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlex: String? = MyApp.getInstance().resources.getString(R.string.lbl_maguwoharjo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTexthere: String? = MyApp.getInstance().resources.getString(R.string.lbl_location)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.lbl_distance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistanceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_40km)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAge: String? = MyApp.getInstance().resources.getString(R.string.lbl_age)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt2028: String? = MyApp.getInstance().resources.getString(R.string.lbl_20_28)

)
