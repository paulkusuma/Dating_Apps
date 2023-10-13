package com.paulsapplication.app.modules.download.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.paulsapplication.app.modules.download.`data`.model.DownloadModel
import org.koin.core.KoinComponent

class DownloadVM : ViewModel(), KoinComponent {
  val downloadModel: MutableLiveData<DownloadModel> = MutableLiveData(DownloadModel())

  var navArguments: Bundle? = null
}
