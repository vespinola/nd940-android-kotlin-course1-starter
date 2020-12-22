package com.udacity.shoestore.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class ActivityViewModel: ViewModel() {
    private val _shoeList =  MutableLiveData<MutableList<Shoe>>()
    val shoeList: LiveData<MutableList<Shoe>>
        get() = _shoeList

    init {
        _shoeList.value = createShoeList()
    }

    fun addShoe(shoe: Shoe) {
        _shoeList.value?.add(shoe)
    }

    fun createShoeList() : MutableList<Shoe> {
        return mutableListOf(
            Shoe(
                "Viamo",
                4.3,
                "Viamo",
                "Viamo"
            ),
            Shoe(
                "Natacha",
                3.3,
                "Natacha",
                "Natacha"
            ),
            Shoe(
                "Briganti",
                6.3,
                "Briganti",
                "Briganti"
            ),
            Shoe(
                "Ferraro",
                7.2,
                "Ferraro",
                "Ferraro"
            ),
        )
    }
}