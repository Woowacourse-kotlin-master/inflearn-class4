package com.example.myapplication4

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SentenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sentence)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val sentenceList = mutableListOf<String>()
        sentenceList.add("모아이 디그다")
        sentenceList.add("우럭 디그다")
        sentenceList.add("성괴 디그다")
        sentenceList.add("아싸 디그다")
        sentenceList.add("원조 디그다")
        sentenceList.add("디콩 디그다")
        sentenceList.add("빵빵 디그다")

        val adapter = ListViewAdapter(sentenceList)
        val listview = findViewById<ListView>(R.id.sentenceListView)

        listview.adapter = adapter

    }
}