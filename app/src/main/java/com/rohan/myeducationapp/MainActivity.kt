
package com.rohan.myeducation

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(25, 30, 25, 30)
        layout.setBackgroundColor(Color.WHITE)

        val title = TextView(this)
        title.text = "My Education App"
        title.textSize = 30f
        title.setTextColor(Color.BLUE)
        title.gravity = Gravity.CENTER

        layout.addView(title)

        val subtitle = TextView(this)
        subtitle.text = "Welcome to My Education App"
        subtitle.textSize = 18f
        subtitle.setTextColor(Color.BLACK)
        subtitle.gravity = Gravity.CENTER

        layout.addView(subtitle)

        val buttons = listOf(
            "Login / Signup",
            "Study Notes",
            "PDF Books",
            "Video Lectures",
            "About Us"
        )

        for (item in buttons) {
            val button = Button(this)
            button.text = item

            button.setOnClickListener {
                Toast.makeText(
                    this,
                    "$item Selected",
                    Toast.LENGTH_SHORT
                ).show()
            }

            layout.addView(button)
        }

        setContentView(layout)
    }
}
