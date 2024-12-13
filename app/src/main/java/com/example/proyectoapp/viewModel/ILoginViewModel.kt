package com.example.proyectoapp.viewModel

import androidx.lifecycle.MutableLiveData

interface ILoginViewModel {
    val emailOUsername: MutableLiveData<String>
    val password: MutableLiveData<String>
    val info: MutableLiveData<String>
    val isCheacked: MutableLiveData<Boolean>
    val passVisible: MutableLiveData<Boolean>
    val isValidUser: MutableLiveData<Boolean>
    val isValidPass: MutableLiveData<Boolean>
    val show: MutableLiveData<Boolean>


    fun onCheckedChange(check: Boolean)
    fun onEmailChange(email: String)
    fun onPasswordChange(password: String)
    fun comprobarPass()
    fun comprobarEmailOUser()
    fun mostrarInfo(show: Boolean)
    fun mensajeInfo(mensaje: String)
    fun onVisibleChange(visible: Boolean)
}





