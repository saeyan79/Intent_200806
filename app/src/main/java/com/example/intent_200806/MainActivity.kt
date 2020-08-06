package com.example.intent_200806

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveToFirstBtn.setOnClickListener {
//            FirstActivity로 이동하기 => Intent
            val myIntent = Intent(this, FirstActivity::class.java)
            startActivity(myIntent)
        }

        moveToSecondBtn.setOnClickListener {
//            SecondActivity로 => 입력한 내용을 들고 => 이동하기
            val inputMessage = messageEdt.text.toString()

            val myIntent = Intent(this, SecondActivity::class.java)

//            inputMessage를 들고가는데 거기다 message라는 스티커 붙인걸로 생각하기 -나-
//            만들어준 Intent 변수에 데이터를 이름표 붙인 상태로 첨부 -강사님-
            myIntent.putExtra("message",inputMessage)

            startActivity(myIntent)
       }
    }
}