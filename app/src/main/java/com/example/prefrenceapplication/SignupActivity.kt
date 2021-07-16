package com.example.prefrenceapplication

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.prefrenceapplication.helper.PreferenceHelper.get
import com.example.prefrenceapplication.helper.PreferenceHelper.set
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SignupActivity : BaseActivity() {

    private val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
    private val passwordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{4,}$"

    override lateinit var prefs: SharedPreferences
     lateinit var btnsignup:Button
     lateinit var edtemailu:EditText
     lateinit var edtmnumber:EditText
     lateinit var edtpassu:EditText
     lateinit var edtconfirmpass:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        edtemailu =findViewById<EditText>(R.id.edtemailu)
        btnsignup = findViewById(R.id.btnsignup)
        edtpassu = findViewById<EditText>(R.id.edtpassu)
        edtmnumber = findViewById<EditText>(R.id.edtmnumber)
        edtconfirmpass =findViewById<EditText>(R.id.edtconfirmpass)

        intiView()
    }


    private fun intiView() {

        btnsignup.setOnClickListener {

            if (edtemailu.text.toString().trim().isEmpty()){
                edtemailu.error="can't blank"

            }else if (!edtemailu.text.toString().matches(emailPattern.toRegex())){
                edtemailu.error="invalid email pattan"

            }else if (edtmnumber.text.toString().trim().isEmpty()){
                edtmnumber.error="Can't blank"

            }else if (edtpassu.text.toString().trim().isEmpty()) {
                edtpassu.error="Can't blank"

            }else if (!edtpassu.text.toString().matches(passwordPattern.toRegex())){
                edtpassu.error="invalid password pattan"

            }else if (edtconfirmpass.text.toString().trim().isEmpty()){
                edtconfirmpass.error="Can't blank"
            }
            else if (edtconfirmpass.text.toString().trim().contentEquals(edtpassu.toString()))
            {
                edtconfirmpass.error="Enter Valid Password"
            }
            else if (edtmnumber.text.toString().trim().length < 6 && edtmnumber.text.toString().trim().length > 12)
            {
                edtmnumber.error = "Enter Correct Password"
            }
            else{
                val intent= Intent(this,LoginActivity::class.java)
                startActivity(intent)
            }
        }

    }



}