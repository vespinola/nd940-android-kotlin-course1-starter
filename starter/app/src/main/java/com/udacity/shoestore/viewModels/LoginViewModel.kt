package com.udacity.shoestore.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import android.util.Patterns
import com.udacity.shoestore.R

enum class LoginState {
    SIGN_IN,
    SIGN_UP,
    INITIAL
}

class LoginViewModel : ViewModel() {
    private val _loginForm = MutableLiveData<LoginState>()
    val loginFormState: LiveData<LoginState> = _loginForm


    fun doSignIn() {
        _loginForm.value = LoginState.SIGN_IN
    }

    fun complete() {
        _loginForm.value = LoginState.INITIAL
    }

    fun doSignUp() {
        _loginForm.value = LoginState.SIGN_UP
    }

}