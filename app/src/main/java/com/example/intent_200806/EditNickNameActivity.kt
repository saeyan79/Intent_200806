package com.example.intent_200806

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class EditNickNameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nick_name)

        okBtn.setOnClickListener{

//            완료버튼 눌렀다 => 정말 데이터 들고 돌아가겠다 (확정) =>복귀 :finish()
//            백버튼 눌러서 종료 하는 것과 구분 필요


            finish()
        }



    }
}