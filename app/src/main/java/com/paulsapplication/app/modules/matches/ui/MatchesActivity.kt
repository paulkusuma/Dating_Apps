package com.paulsapplication.app.modules.matches.ui

import android.view.View
import androidx.activity.viewModels
import com.paulsapplication.app.R
import com.paulsapplication.app.appcomponents.base.BaseActivity
import com.paulsapplication.app.databinding.ActivityMatchesBinding
import com.paulsapplication.app.modules.matches.`data`.model.Matches1RowModel
import com.paulsapplication.app.modules.matches.`data`.model.MatchesRowModel
import com.paulsapplication.app.modules.matches.`data`.viewmodel.MatchesVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MatchesActivity : BaseActivity<ActivityMatchesBinding>(R.layout.activity_matches) {
  private val viewModel: MatchesVM by viewModels<MatchesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val matchesAdapter = MatchesAdapter(viewModel.matchesList.value?:mutableListOf())
    binding.recyclerMatches.adapter = matchesAdapter
    matchesAdapter.setOnItemClickListener(
    object : MatchesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MatchesRowModel) {
        onClickRecyclerMatches(view, position, item)
      }
    }
    )
    viewModel.matchesList.observe(this) {
      matchesAdapter.updateData(it)
    }
    val matches1Adapter = Matches1Adapter(viewModel.matches1List.value?:mutableListOf())
    binding.recyclerMatches1.adapter = matches1Adapter
    matches1Adapter.setOnItemClickListener(
    object : Matches1Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Matches1RowModel) {
        onClickRecyclerMatches1(view, position, item)
      }
    }
    )
    viewModel.matches1List.observe(this) {
      matches1Adapter.updateData(it)
    }
    binding.matchesVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerMatches(
    view: View,
    position: Int,
    item: MatchesRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerMatches1(
    view: View,
    position: Int,
    item: Matches1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MATCHES_ACTIVITY"

  }
}
