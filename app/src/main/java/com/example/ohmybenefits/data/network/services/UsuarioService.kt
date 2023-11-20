package com.example.ohmybenefits.data.network.services

import com.example.ohmybenefits.data.model.UsuarioApiResponse
import com.example.ohmybenefits.data.model.UsuarioModel
import com.example.ohmybenefits.data.network.interfaces.UsuarioApiClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class UsuarioService @Inject constructor(
    private val apiClient: UsuarioApiClient
) {

    suspend fun registrarUsuario(usuario: UsuarioModel): UsuarioApiResponse {
        return withContext(Dispatchers.IO){
            val response = apiClient.registro(usuario)
            response.body()!!
        }
    }

}