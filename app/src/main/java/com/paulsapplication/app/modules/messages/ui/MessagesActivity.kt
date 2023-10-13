package com.paulsapplication.app.modules.messages.ui

import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.paulsapplication.app.R
import com.paulsapplication.app.appcomponents.base.BaseActivity
import com.paulsapplication.app.databinding.ActivityMessagesBinding
import com.paulsapplication.app.modules.messages.`data`.model.ListphotoFourRowModel
import com.paulsapplication.app.modules.messages.`data`.model.ListphotoSixRowModel
import com.paulsapplication.app.modules.messages.`data`.viewmodel.MessagesVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MessagesActivity : BaseActivity<ActivityMessagesBinding>(R.layout.activity_messages) {
  private val viewModel: MessagesVM by viewModels<MessagesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listphotoFourAdapter =
    ListphotoFourAdapter(viewModel.listphotoFourList.value?:mutableListOf())
    binding.recyclerListphotoFour.adapter = listphotoFourAdapter
    listphotoFourAdapter.setOnItemClickListener(
    object : ListphotoFourAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListphotoFourRowModel) {
        onClickRecyclerListphotoFour(view, position, item)
      }
    }
    )
    viewModel.listphotoFourList.observe(this) {
      listphotoFourAdapter.updateData(it)
    }
    val listphotoSixAdapter =
    ListphotoSixAdapter(viewModel.listphotoSixList.value?:mutableListOf())
    binding.recyclerListphotoSix.adapter = listphotoSixAdapter
    listphotoSixAdapter.setOnItemClickListener(
    object : ListphotoSixAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListphotoSixRowModel) {
        onClickRecyclerListphotoSix(view, position, item)
      }
    }
    )
    viewModel.listphotoSixList.observe(this) {
      listphotoSixAdapter.updateData(it)
    }
    binding.messagesVM = viewModel
    setUpSearchViewInputtextnoneListener()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListphotoFour(
    view: View,
    position: Int,
    item: ListphotoFourRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListphotoSix(
    view: View,
    position: Int,
    item: ListphotoSixRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewInputtextnoneListener(): Unit {
    binding.searchViewInputtextnone.setOnQueryTextListener(object :
    SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "MESSAGES_ACTIVITY"

    }
  }
