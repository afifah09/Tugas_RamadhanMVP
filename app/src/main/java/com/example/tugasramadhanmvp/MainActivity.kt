package com.example.tugasramadhanmvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.tugasramadhanmvp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),ImainView {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mainPresenterImp = MainPresenterImp(this)

        binding.btnAdd.setOnClickListener{
            val bilangan1 = binding.edBilanganFirst.text.toString().toInt()
            val bilangan2 = binding.edBilanganLast.text.toString().toInt()
            val bilangan = Bilangan(bilangan1,bilangan2)
            mainPresenterImp.countResult(bilangan)
            mainPresenterImp.pengurangan(bilangan)
        }
    }

    override fun showResult(hasil: Int) {
        binding.hasil.text ="Hasil: $hasil"
    }

    override fun clearField() {
        binding.edBilanganFirst.text.clear()
        binding.edBilanganLast.text.clear()
    }

    override fun showToast(message: String) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show()
    }
}