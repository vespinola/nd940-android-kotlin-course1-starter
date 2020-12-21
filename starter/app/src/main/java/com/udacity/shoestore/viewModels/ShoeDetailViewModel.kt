package com.udacity.shoestore.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class ShoeDetailViewModel: ViewModel() {
    private val _name = MutableLiveData<String>()
    val name: LiveData<String>
        get() = _name

    private val _company = MutableLiveData<String>()
    val company: LiveData<String>
        get() = _company

    private val _desc = MutableLiveData<String>()
    val desc: LiveData<String>
        get() = _desc

    private val _size = MutableLiveData<Double>()
    val size: LiveData<Double>
        get() = _size

    val shoe: MediatorLiveData<Shoe> = MediatorLiveData()

    init {
        shoe.addSource(name, Observer {

        })
    }
}