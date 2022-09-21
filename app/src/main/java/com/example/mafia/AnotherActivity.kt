package com.example.mafia

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class AnotherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        val buttonArrow = findViewById<Button>(R.id.buttonArrow);

        buttonArrow.setOnClickListener(View.OnClickListener(){
            val mudaTela = Intent(this, MainActivity::class.java)

            startActivity(mudaTela)
        })
    }
}