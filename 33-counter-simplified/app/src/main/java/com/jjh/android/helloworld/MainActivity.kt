package com.jjh.android.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
  private var count = 0

  // functions to handle user button clicks
  fun onAddButtonClick(view: View) {
      count++
      textView.text = "Total: ${count.toString()}"
    }

  fun onSubButtonClick(view: View) {
      count--
      textView.text = "Total: ${count.toString()}"
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    textView.text = "Total: ${count.toString()}"
  }
}
