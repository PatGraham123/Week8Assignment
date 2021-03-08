package edu.rockvalleycollege.week8assignment

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt1 = findViewById<EditText>(R.id.txt1)
        val txt2 = findViewById<EditText>(R.id.txt2)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)




        btnSubmit.setOnClickListener {
            hideKeyboard()

                intent = Intent(this, Main2Activity::class.java)

                intent.putExtra("Intent Data One", txt1.text.toString())
                intent.putExtra("Intent Data Two", txt2.text.toString())
                startActivity(intent)

        }


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