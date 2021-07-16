package com.example.prefrenceapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.prefrenceapplication.helper.PreferenceHelper.get
import com.waytocode.product.utils.IS_LOGIN

class SplashActivity : BaseActivity() {

    private val SPLASH_TIME=3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed(Runnable {

         if (prefs[IS_LOGIN]!!){
             val intent=Intent(this,MainActivity::class.java)
             startActivity(intent)

         }else{
                 val intent=Intent(this,LoginActivity::class.java)
                 startActivity(intent)

         }


        },SPLASH_TIME.toLong() )
    }
}