package com.example.intent_200806

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*
import kotlinx.android.synthetic.main.activity_main.*

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        moveToMainBtn.setOnClickListener {
//            Main로 이동하기 => Intent
//            val myIntent = Intent(this, MainActivity::class.java)
//            startActivity(myIntent)
//            인텐트를 만들면 새 액티비티가 추가 되는 것이다. 종료가 아니라! 우리가 원하는것은 종료

//            현재 액티비티 종료 코드는 finish()
            finish()
        }
    }
}