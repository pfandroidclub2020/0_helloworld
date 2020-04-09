package net.pilsfree.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            val jmeno = edit.text
            Log.d("HELLOWORLD", jmeno.toString())
            Toast.makeText(this, "Ahoj, $jmeno", Toast.LENGTH_LONG).show()
        }
    }
}