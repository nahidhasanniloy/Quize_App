package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.ActivityPlayBinding

class PlayActivity : AppCompatActivity() {
      lateinit var  binding: ActivityPlayBinding


     val quizList = listOf <quiz>(
         quiz(   " Victory Day of Bangladesh ",
                 " 21 february",
                 "5 august",
                 " 36 july ",
                 " 16 december ",
                 "16 december"
         ),
         quiz(   " Independence Day of Bangladesh ",
                 " 21 february",
                 "5 august",
                 " 36 july ",
                 " 26 March",
                 "26 March"
         ),
         quiz(   " Independence Day of Bangladesh ",
                 "14 february",
                 "5 august",
                 " 36 july ",
                 " 26 March",
                 "  14 february"
         )





     )
    val index = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityPlayBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    private fun initquestion() {
        val quizQuestion = quizList[index]


        binding.apply {

                questionTv.text = quizQuestion.question
                questionTv.text = quizQuestion.question1
                questionTv.text = quizQuestion.question2
                questionTv.text = quizQuestion.question3
                questionTv.text = quizQuestion.question4

        }




    }




}