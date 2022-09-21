package com.example.mafia

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStartAnotherActivity = findViewById<Button>(R.id.btnStartAnotherActivity);

        btnStartAnotherActivity.setOnClickListener(View.OnClickListener(){
            val mudaTela = Intent(this, AnotherActivity::class.java)

            startActivity(mudaTela)
        })

    }
}