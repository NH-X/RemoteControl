package com.example.remotecontrol.adapter

import android.content.Context
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.remotecontrol.bean.DeviceBean

class DeviceAdapter(
    var context: Context,
    var deviceList: List<DeviceBean>
): Adapter<ViewHolder>(), OnClickListener {
    private val TAG = "DeviceAdapter"

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return deviceList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    class ItemHolder(itemView: View) : ViewHolder(itemView) {
//        var ll_item: LinearLayout = itemView.ll_item
//        var ll_remind: LinearLayout = itemView.ll_remind
//        var iv_listen: ImageView = itemView.iv_listen
//        var tv_title: TextView = itemView.tv_title
//        var tv_content: TextView = itemView.tv_content
//        var tv_remind: TextView = itemView.tv_remind
//        var currentPosition: Int = 0
    }
}