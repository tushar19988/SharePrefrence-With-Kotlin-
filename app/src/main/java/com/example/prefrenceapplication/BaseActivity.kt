package com.example.prefrenceapplication

import android.annotation.SuppressLint
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.prefrenceapplication.helper.PreferenceHelper
import com.example.prefrenceapplication.helper.PreferenceHelper.get



/**
 * Created by Vinod Sonava on 02/5/19.
 */

@SuppressLint("Registered")
open class BaseActivity : AppCompatActivity() {

  open lateinit var prefs: SharedPreferences


  @SuppressLint("NewApi")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    prefs = PreferenceHelper.customPrefs(this)
    if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.LOLLIPOP) {
      val window = this.window
      window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
      window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
      window.statusBarColor =0
      ContextCompat.getColor(this, R.color.black) //resources.getColor(R.color.colorBlack)
    }


  }




}
