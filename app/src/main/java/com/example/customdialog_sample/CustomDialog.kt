package com.example.customdialog_sample

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.Toast
import com.example.customdialog_sample.databinding.CustomDialogBinding

// Dialog 클래스는 반드시 context를 매개변수로 받아야한다
class CustomDialog(context : Context) : Dialog(context), CustomDialogInterface {
    lateinit var binder : CustomDialogBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 바인더로 뷰들을 바인딩하는 동시에
        binder = CustomDialogBinding.inflate(layoutInflater)

        // setContentView로 보내서 현재 클래스랑 바인딩된 레이아웃이랑 묶기
        setContentView(binder.root)

        // 배경을 투명하게 만들기
        window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        // 커스텀 다이얼로그에 있는 버튼에 대한 제어(리스너)는 커스텀 다이얼로그 파일에서 정의할 수 있음
        // 버튼의 클릭 리스너로 행동 직접 정의
        binder.likeBtn.setOnClickListener {
            Toast.makeText(context, "좋아요 버튼 클릭", Toast.LENGTH_SHORT).show()

        }
        // 인터페이스를 이용하여 행동 정의
        binder.subscribeBtn.setOnClickListener {
            onSubScribeButtonClicked()
        }
    }

    // 인터페이스를 상속받았기 때문에 해당 인터페이스가 갖고 있는 함수를 반드시 override해서 정의해줘야한다
    override fun onSubScribeButtonClicked() {
        Toast.makeText(context, "구독 버튼 클릭", Toast.LENGTH_SHORT).show()
    }

    override fun onLikeButtonClick() {
        Toast.makeText(context, "좋아요 버튼 클릭", Toast.LENGTH_SHORT).show()
    }
}