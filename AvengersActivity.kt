package com.internshala.activitylifecycle

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AvengersActivity : AppCompatActivity() {


    var titleName: String? = "Avengers"

    lateinit var  sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences = getSharedPreferences(getString(R.string.preference_file_name),Context.MODE_PRIVATE)

        setContentView(R.layout.activity_google)

        titleName = sharedPreferences.getString("Title","The Avengers")

        title = titleName
    }

}
