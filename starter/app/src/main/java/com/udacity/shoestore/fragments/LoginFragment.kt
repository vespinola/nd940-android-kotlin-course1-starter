package com.udacity.shoestore.fragments

import androidx.lifecycle.ViewModelProvider
import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.udacity.shoestore.databinding.FragmentLoginBinding
import com.udacity.shoestore.R
import com.udacity.shoestore.viewModels.LoginViewModel

class LoginFragment : Fragment() {

    private lateinit var viewModel: LoginViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate view and obtain an instance of the binding class.
        val binding: FragmentLoginBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_login,
            container,
            false
        )

        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)

        return binding.root
    }
}