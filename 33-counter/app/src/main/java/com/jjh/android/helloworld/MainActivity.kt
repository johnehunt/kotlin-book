package com.jjh.android.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
  private var count = 0

  // Inner classes to handle user button clicks
  internal inner class AddButtonHandler : View.OnClickListener {
    override fun onClick(view: View) {
      count++
      val text = findViewById<TextView>(R.id.textView)
      text.text = "Total: ${count.toString()}"
    }
  }

  internal inner class SubtractButtonHandler : View.OnClickListener {
    override fun onClick(view: View) {
      count--
      val text = findViewById<TextView>(R.id.textView)
      text.text = "Total: ${count.toString()}"
    }
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    // Set up buttons with handlers
    val addButton = findViewById<Button>(R.id.add)
    addButton.setOnClickListener(AddButtonHandler())
    val subButton = findViewById<Button>(R.id.sub)
    subButton.setOnClickListener(SubtractButtonHandler())
  }
}
