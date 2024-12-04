package com.example.proyectoapp.viewModel

import androidx.lifecycle.MutableLiveData

interface ILoginViewModel {
    val emailOUsername: MutableLiveData<String>
    val password: MutableLiveData<String>
    val isCheacked: MutableLiveData<Boolean>
    val passVisible: MutableLiveData<Boolean>
    val isValid: MutableLiveData<Boolean>

    fun onCheckedChange(check: Boolean)
    fun comprobarPass(password: String)
    fun onEmailChange(email: String)

}