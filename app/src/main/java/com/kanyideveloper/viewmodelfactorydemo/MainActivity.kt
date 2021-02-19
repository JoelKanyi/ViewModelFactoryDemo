package com.kanyideveloper.viewmodelfactorydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.kanyideveloper.viewmodelfactorydemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var name: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.bindBtn.setOnClickListener {
            if (binding.nicknameEdtx.text.toString() != ""){
                name = binding.nicknameEdtx.text.toString()

                val viewModelFactory = MainViewModelFactory(name)
                val viewModel = ViewModelProvider(this,viewModelFactory).get(MainViewModel::class.java)

            }else{
                Toast.makeText(this,"Enter a nickname",Toast.LENGTH_SHORT).show()
            }
        }
    }
}