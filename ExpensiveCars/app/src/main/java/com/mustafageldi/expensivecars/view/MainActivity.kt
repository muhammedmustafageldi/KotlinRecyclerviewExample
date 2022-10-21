package com.mustafageldi.expensivecars.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.mustafageldi.expensivecars.R
import com.mustafageldi.expensivecars.adapter.CarAdapter
import com.mustafageldi.expensivecars.databinding.ActivityMainBinding
import com.mustafageldi.expensivecars.model.Car

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var carList : ArrayList<Car>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //Data

        val rollsRoyce = Car(R.string.firstName,R.string.firstDetails,R.drawable.rollsroyce)
        val bugatti = Car(R.string.secondName,R.string.secondDetails,R.drawable.bugatti)
        val pagandi = Car(R.string.thirdName,R.string.thirdDetails,R.drawable.pagandi)
        val rolssweptail = Car(R.string.forthName,R.string.forthDetails,R.drawable.rolssweptail)
        val cendodieci = Car(R.string.fifthName,R.string.fifthDetails,R.drawable.centodieci)

        carList = arrayListOf(rollsRoyce,bugatti,pagandi,rolssweptail,cendodieci)

        //ListView
        //Mapping ---->>>>

//        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,carList.map { Car -> this.getString(Car.carName!!) })
//        binding.listView.adapter = adapter
//
//        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
//            val intent = Intent(this,DetailsActivity :: class.java)
//            intent.putExtra("Car",carList.get(i))
//            startActivity(intent)
//        }

        //RecyclerView ---->>>>
        val carAdapter = CarAdapter(carList, applicationContext)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = carAdapter
    }
}