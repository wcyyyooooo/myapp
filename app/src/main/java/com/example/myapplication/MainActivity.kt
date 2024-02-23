package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.view.View
class MainActivity : AppCompatActivity() {
    private lateinit var db: database
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val usernameEditText = findViewById<EditText>(R.id.usernameEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val loginButton = findViewById<Button>(R.id.loginButton)
        db = database(this)
        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()
            // 这里添加登录逻辑，例如验证用户名和密码是否正确
            // 如果正确，可以启动一个新的活动或显示一个消息等。
        }
        val registerButton = findViewById<Button>(R.id.registerButton)
        registerButton.setOnClickListener {
            // 在这里处理注册逻辑
            // 例如，跳转到注册页面或者显示一个注册对话框等。
        }
    }
}