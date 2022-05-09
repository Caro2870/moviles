package com.example.app_geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var questions: ArrayList<Question>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         loadQuestions()
        setupViews()
    }

    private fun loadQuestions() {
        questions = ArrayList()
        var question1 = Question("Es lima la capital de Peru?",true)
        var question2 = Question("Es Quito la capital de Peru?",false)
        var question3 = Question("Es Santiago la capital de Peru?",true)
        questions.add(question1)
        questions.add(question2)
        questions.add(question3)

    }

    private fun setupViews(){
        val btYes = findViewById<Button>(R.id.btnYes)
        val btNo = findViewById<Button>(R.id.btnNo)
        val tvQuestion = findViewById<TextView>(R.id.tvQuestion)

      tvQuestion.text = questions[]

        btYes.setOnClickListener {

                Toast.makeText(this, "Correcto", Toast.LENGTH_SHORT).show()


        }

        btNo.setOnClickListener {

            Toast.makeText(this, "Incorrecto", Toast.LENGTH_SHORT).show()


        }
    }
}