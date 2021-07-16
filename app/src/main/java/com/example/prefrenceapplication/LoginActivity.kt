package com.example.prefrenceapplication

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.prefrenceapplication.helper.PreferenceHelper.get
import com.example.prefrenceapplication.helper.PreferenceHelper.set


class LoginActivity : BaseActivity() {

    lateinit var txtsignup:TextView
    lateinit var btnsignin: Button
    lateinit var edtemail: EditText
    lateinit var edtpass: EditText
    override lateinit var prefs: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        txtsignup=findViewById(R.id.txtsignup)
        btnsignin = findViewById(R.id.btnsignin)
        edtemail = findViewById(R.id.edtemail)
        edtpass = findViewById(R.id.edtpass)

        initView()
    }

    private fun initView() {


        txtsignup.setOnClickListener {
            startActivity(Intent(this,SignupActivity::class.java))
        }



        btnsignin.setOnClickListener {

            if (edtemail.text.toString().isEmpty()){
                edtemail.error="can't blank"
            }else if (edtpass.text.toString().isEmpty()){
                edtpass.error="can't blank"
            }else{

            startActivity(Intent(this,MainActivity::class.java))

            Toast.makeText(this, "Email and Password Not Match", Toast.LENGTH_SHORT).show()

            }

        }

    }
}