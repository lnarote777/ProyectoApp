package com.example.proyectoapp.viewModel

import androidx.lifecycle.MutableLiveData

class LoginViewModel: ILoginViewModel {

    private var _emailOUsername = MutableLiveData<String>()
    override val emailOUsername: MutableLiveData<String> = _emailOUsername

    private var _password = MutableLiveData<String>()
    override val password: MutableLiveData<String> = _password

    private var _info = MutableLiveData<String>()
    override val info: MutableLiveData<String> = _info

    private var _isCheacked = MutableLiveData<Boolean>()
    override val isCheacked: MutableLiveData<Boolean> = _isCheacked

    private var _passVisible = MutableLiveData<Boolean>()
    override val passVisible: MutableLiveData<Boolean> = _passVisible

    private var _isValidUser = MutableLiveData<Boolean>()
    override val isValidUser: MutableLiveData<Boolean> = _isValidUser

    private var _isValidPass = MutableLiveData<Boolean>()
    override val isValidPass: MutableLiveData<Boolean> = _isValidPass

    private var _show = MutableLiveData<Boolean>()
    override val show: MutableLiveData<Boolean> = _show

    override fun onCheckedChange(check: Boolean) {
        _isCheacked.value = check
    }

    override fun onEmailChange(email: String) {
        _emailOUsername.value = email
    }

    override fun onPasswordChange(password: String) {
        _password.value = password
    }

    override fun comprobarPass() {
        if (_password.value.isNullOrBlank() || _password.value != "usuario") {
            mensajeInfo("Contraseña inválida.")
        }else{
            _isValidPass.value = true
            mostrarInfo(false)
        }
    }

    override fun comprobarEmailOUser() {
        if (_emailOUsername.value.isNullOrBlank()  || _emailOUsername.value != "usuario"){
            mensajeInfo("Usuario inválido")
        }else{
            isValidUser.value = true
            mostrarInfo(false)
        }
    }

    override fun mostrarInfo(show: Boolean) {
        _show.value = show
    }

    override fun mensajeInfo(mensaje: String) {
        _info.value = mensaje
        mostrarInfo(true)
    }

    override fun onVisibleChange(visible: Boolean) {
        _passVisible.value = visible
    }
}



