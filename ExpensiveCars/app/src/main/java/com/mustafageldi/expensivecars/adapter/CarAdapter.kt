package com.mustafageldi.expensivecars.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mustafageldi.expensivecars.databinding.RecyclerRowBinding
import com.mustafageldi.expensivecars.model.Car
import com.mustafageldi.expensivecars.view.DetailsActivity


class CarAdapter(private val carList : ArrayList<Car>,private val context : Context ) : RecyclerView.Adapter<CarAdapter.CarHolder>(){

    class CarHolder(val binding : RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarHolder {
        val binding  = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CarHolder(binding)
    }

    override fun onBindViewHolder(holder: CarHolder, position: Int) {
        holder.binding.recyclerNameText.text = context.getString(carList[position].carName!!)
        holder.binding.recyclerDegreeText.text = (position + 1).toString()
        holder.binding.recyclerImage.setImageResource(carList[position].carImage!!)

        holder.itemView.setOnClickListener {
            val intent = Intent(context,DetailsActivity :: class.java)
            intent.putExtra("Car", carList[position])
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return carList.size
    }


}