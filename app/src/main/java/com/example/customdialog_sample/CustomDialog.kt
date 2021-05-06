package com.example.customdialog_sample

import android.app.Dialog
import android.content.Context
import android.os.Bundle

// Dialog 클래스는 반드시 context를 매개변수로 받아야한다
class CustomDialog(context : Context) : Dialog(context) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}