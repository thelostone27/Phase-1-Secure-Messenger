package com.example.securemsg

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.security.SecureRandom
import android.util.Base64
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST

class SignupActivity : AppCompatActivity() {

    interface Api {
        @POST("/register")
        suspend fun register(@Body body: Map<String, String>) : Map<String, Any>
    }

    private val retrofit = Retrofit.Builder()
        .baseUrl("http://10.0.2.2:3000/") // emulator -> host
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val api = retrofit.create(Api::class.java)

    override fun onCreate(savedInstanceState: Bundle
