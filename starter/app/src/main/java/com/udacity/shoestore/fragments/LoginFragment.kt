package com.udacity.shoestore.fragments

import androidx.lifecycle.ViewModelProvider
import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.databinding.FragmentLoginBinding
import com.udacity.shoestore.R
import com.udacity.shoestore.viewModels.LoginState
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

        viewModel.loginFormState.observe(viewLifecycleOwner, Observer { state ->
            when(state) {
                LoginState.SIGN_UP -> {
                    findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToWelcomeFragment())
                }
                else -> {
                    findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToShoeListFragment())
                }
            }
        })

        binding.signInButton.setOnClickListener {
            viewModel.doSignIn()
        }

        binding.signUpButton.setOnClickListener {
            viewModel.doSignUp()
        }

        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        menu.clear()
    }
}