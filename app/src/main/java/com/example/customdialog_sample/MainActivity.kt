package com.example.customdialog_sample

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.customdialog_sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){
    lateinit var binder : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binder = ActivityMainBinding.inflate(layoutInflater)

        binder.button.setOnClickListener {
            // 커스텀 다이얼로그 호출
            val customDialog = CustomDialog(this)
            customDialog.show()
        }

        setContentView(binder.root)
    }

}