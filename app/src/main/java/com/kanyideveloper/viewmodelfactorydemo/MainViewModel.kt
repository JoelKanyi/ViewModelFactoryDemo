package com.kanyideveloper.viewmodelfactorydemo

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(name: String) : ViewModel() {

    private val TAG = "MainViewModel"

    val helloName = MutableLiveData<String>()

    init {
        helloName.value = "Hello $name"
        Log.d(TAG, "Final value: ${helloName.value} ")
    }
}