package com.andrewreitz.example

import com.andrewreitz.example.databinding.ActivityMainBinding

import android.annotation.TargetApi
import android.app.Activity
import android.databinding.DataBindingUtil
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.Window
import groovy.transform.CompileStatic

@CompileStatic
class MainActivity extends Activity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState)
    def binding = DataBindingUtil.<ActivityMainBinding>setContentView(this, R.layout.activity_main)
    def user = new User(firstName: 'Test', lastName: 'User')
    binding.user = user
  }

  @TargetApi(Build.VERSION_CODES.LOLLIPOP)
  private static void setStatusBarColor(Window window) {
    window.statusBarColor = Color.TRANSPARENT
  }
}