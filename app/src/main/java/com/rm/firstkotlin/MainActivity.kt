package com.rm.firstkotlin

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rm.firstkotlin.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var rootElement: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        rootElement = ActivityMainBinding.inflate(layoutInflater)
        setContentView(rootElement.root)

        rootElement.editTextName

        rootElement.idButtomSave.setOnClickListener {
            rootElement.textViewName.text =
                "Hello, ${rootElement.editTextName.text.toString().trim()} "
        }


    }
}