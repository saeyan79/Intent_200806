package com.example.intent_200806

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    1000의 의미가 닉네임 변경하는 요청이라는걸 인식하기 어렵다
//    그렇다면, 별개의 멤버변수로 1000을 담아서, 이름을 보고 알 수 있도록 처리하면 되겠지. 변수명 보면 알아차릴 수 있게
    val REQ_FOR_NICKNAME = 1000

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

        changeNickNameBtn.setOnClickListener {

//            닉네임 변경화면으로 이동 => 새 닉네임 받으러 이동
            val myIntent = Intent(this, EditNickNameActivity::class.java)

//            단순 이동이 아니라, 결과 받으러 (출력하러) 이동 => 어떤 결과를 받으러 가는건지 명시 해줘야 함
//            고유 숫자를 임의로 지정해서 명시 하면 됨 (1000번이 닉네임 가지러 가는거다 ~라고 내 맘대로 1000으로 지정함)
//            근데 그러면 1000만 봤을때 무슨 의미인지 모르니까 맨 위로 올라가서 멤버변수에 담아. 그럼 변수명 보고 의미 확인 가능해. 가독성 향상
//            멤버변수로 숫자 다룰때는 다 대문자에 언더바를 이용해서 이름 지으면 됨됨
            startActivityForResult(myIntent, REQ_FOR_NICKNAME)

        }
    }
}