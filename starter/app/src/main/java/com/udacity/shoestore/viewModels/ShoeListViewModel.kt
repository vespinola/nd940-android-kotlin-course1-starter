package com.udacity.shoestore.viewModels

import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class ShoeListViewModel: ViewModel() {
    // The list of words - the front of the list is the next word to guess
    private lateinit var shoeList: MutableList<Shoe>

    init {
        createShoeList()
    }

    fun createShoeList() {
        shoeList = mutableListOf()
    }
}