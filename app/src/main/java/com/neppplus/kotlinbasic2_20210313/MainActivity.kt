package com.neppplus.kotlinbasic2_20210313

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendBtn.setOnClickListener {

//            버튼이 눌리면
//            1. inputEdt에 적힌 내용을 => inputMessage 변수에 메모. : get

            val inputMessage = inputEdt.text.toString()

//            2. contentTxt의 text속성값을 => inputMessage에 적힌 값으로 변경. : set

            contentTxt.text = inputMessage

        }

    }
}










