package org.d3if4501.mobpro2.ui.screen.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory(private val uid: String) : ViewModelProvider.Factory {
        @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(uid) as T
        }
        throw IllegalArgumentException("unknown ViewModel class")
    }



}