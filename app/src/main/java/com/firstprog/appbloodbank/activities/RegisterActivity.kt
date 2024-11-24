package com.firstprog.appbloodbank.activities

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.firstprog.appbloodbank.R
import com.firstprog.appbloodbank.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nameEdt = binding.nameEditText
        val cityEdt = binding.cityEditText
        val bloodGroupEdt = binding.bloodGroupEditText
        val passwordEdt = binding.passwordEditText
        val mobileNumberEdt = binding.mobileEditText
        val submitBtn = binding.submitButton

        binding.submitButton.setOnClickListener {
            val name = nameEdt.text.toString()
            val city = cityEdt.text.toString()
            val bloodGroup = bloodGroupEdt.text.toString()
            val password = passwordEdt.text.toString()
            val mobileNumber = mobileNumberEdt.text.toString()

            showMessage("Register with success!\nWelcome donor $name!");
        }
    }

    private fun showMessage(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}

