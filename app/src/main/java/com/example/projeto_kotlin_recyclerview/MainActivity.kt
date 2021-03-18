package com.example.projeto_kotlin_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projeto_kotlin_recyclerview.model.fakeEmails
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view_main.adapter = EmailAdapter(fakeEmails())
        recycler_view_main.layoutManager = LinearLayoutManager(this)
    }
}