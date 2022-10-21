package com.mustafageldi.expensivecars.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mustafageldi.expensivecars.databinding.ActivityDetailsBinding
import com.mustafageldi.expensivecars.model.Car

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        //Casting
        val selectedCar =  intent.getSerializableExtra("Car") as Car

        binding.carImage.setImageResource(selectedCar.carImage!!)
        binding.nameText.text = getString(selectedCar.carName!!)
        binding.detailsText.text = getString(selectedCar.carDetails!!)
    }
}