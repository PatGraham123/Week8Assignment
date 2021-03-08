package edu.rockvalleycollege.week8assignment

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.TextView

class Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val txtView = findViewById<TextView>(R.id.textView)
        val txtView2 = findViewById<TextView>(R.id.textView2)

        var intent1: String = intent.getStringExtra("Intent Data One").toString()
        var intent2: String = intent.getStringExtra("Intent Data Two").toString()

        txtView.text = "The first message is: " + intent1
        txtView2.text = "The second message is: " + intent2


    }
    fun hideKeyboard() {
        try {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
        } catch (e: Exception) {
            // TODO: handle exception
        }

    }
}