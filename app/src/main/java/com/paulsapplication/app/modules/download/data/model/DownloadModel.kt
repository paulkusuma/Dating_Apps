package com.paulsapplication.app.modules.download.`data`.model

import com.paulsapplication.app.R
import com.paulsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DownloadModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDownload: String? = MyApp.getInstance().resources.getString(R.string.lbl_download)

)
