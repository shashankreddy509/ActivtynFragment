package com.tspl.activtynfragment.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tspl.activtynfragment.R
import com.tspl.activtynfragment.fragment.FirstFragment

class FragmentsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragments)
        supportFragmentManager.beginTransaction().add(R.id.flMain, FirstFragment()).commit()

    }
}