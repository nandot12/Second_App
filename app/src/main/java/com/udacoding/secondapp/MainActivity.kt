package com.udacoding.secondapp

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnToast = findViewById<Button>(R.id.buttonToast)
        val btnAlert = findViewById<Button>(R.id.buttonAlert)
        val editext = findViewById<EditText>(R.id.editTextNumber)
        val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)
        val editextPanjang = findViewById<EditText>(R.id.editTextNumberPanjang)
        val editextTinggi = findViewById<EditText>(R.id.editTextNumberTinggi)
        val btnHitung = findViewById<Button>(R.id.buttonHitung)

        btnHitung.setOnClickListener {


            //mengecek editttext kosong apa tidak
            if(editextPanjang.text.isNotEmpty() && editextTinggi.text.isNotEmpty()) {
                val tinggi = editextTinggi.text.toString().toDouble()
                val panjang = editextPanjang.text.toString().toDouble()

                val hasil = tinggi.times(panjang)

                Toast.makeText(this, "$hasil", Toast.LENGTH_SHORT).show()

            }
            //kalau kosong
            else{
                Toast.makeText(this, "form harus d isi", Toast.LENGTH_SHORT).show()
            }
        }


        buttonSubmit.setOnClickListener {
            //get input user from edittext
           val input =  editext.text.toString()
            Toast.makeText(this, input, Toast.LENGTH_SHORT).show()
        }
        btnToast.setOnClickListener {

            Toast.makeText(this, "first my toast", Toast.LENGTH_SHORT).show()
        }

        btnAlert.setOnClickListener {

            val alert = AlertDialog.Builder(this)
            alert.setTitle("Informasi")
            alert.setMessage("nando kece")
            alert.setPositiveButton("Ok", DialogInterface.OnClickListener { dialogInterface, i ->  })
            alert.show()
        }


    }

}