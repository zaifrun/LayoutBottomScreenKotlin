package org.pondar.layoutbottomscreenkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.pondar.layoutbottomscreenkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}
