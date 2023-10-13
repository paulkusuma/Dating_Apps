package com.paulsapplication.app.modules.adds.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.paulsapplication.app.modules.adds.`data`.model.AddsModel
import org.koin.core.KoinComponent

class AddsVM : ViewModel(), KoinComponent {
  val addsModel: MutableLiveData<AddsModel> = MutableLiveData(AddsModel())

  var navArguments: Bundle? = null
}
