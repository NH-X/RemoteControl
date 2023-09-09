package com.example.remotecontrol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView
import com.example.remotecontrol.adapter.DeviceAdapter

class MainActivity : AppCompatActivity(), OnClickListener{
    private val TAG = "MainActivity"

    private lateinit var tb_app_name: Toolbar
    private lateinit var rv_remote_list: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findView()
    }

    private fun findView(){
        tb_app_name = findViewById(R.id.tb_app_name)
        setSupportActionBar(tb_app_name)
        findViewById<Button>(R.id.btn_add_remote)
    }

    override fun onClick(p0: View?) {
        val currentId = p0!!.id

        if (currentId == R.id.btn_add_remote){
            // 添加遥控设备
        }
    }
}