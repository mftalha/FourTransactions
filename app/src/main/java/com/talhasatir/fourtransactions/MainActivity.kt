package com.talhasatir.fourtransactions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.talhasatir.fourtransactions.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    var val1 : Int? = null
    var val2 : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }

    fun sum(view: View){
        val1  = binding.editTextText.text.toString().toIntOrNull()
        val1 = val1 ?: 0
        val2 = binding.editTextText2.text.toString().toIntOrNull()
        val2 = val2 ?: 0

        binding.textView.text = (val1!! + val2!!).toString()
    }

    fun interest(view: View){
        val1  = binding.editTextText.text.toString().toIntOrNull()
        val1 = val1 ?: 0
        val2 = binding.editTextText2.text.toString().toIntOrNull()
        val2 = val2 ?: 0

        binding.textView.text = (val1!! - val2!!).toString()
    }

    fun plenty(view: View){
        val1  = binding.editTextText.text.toString().toIntOrNull()
        val1 = val1 ?: 0
        val2 = binding.editTextText2.text.toString().toIntOrNull()
        val2 = val2 ?: 0

        binding.textView.text = (val1!! / val2!!).toString()

    }

    fun multiply(view: View){
        var val3  = binding.editTextText.text.toString().toDoubleOrNull()
        val3 = val3 ?: 0.0
        var val4 = binding.editTextText2.text.toString().toDoubleOrNull()
        val4 = val4 ?: 0.0

        binding.textView.text = (val3!! * val4!!).toString()
    }

}