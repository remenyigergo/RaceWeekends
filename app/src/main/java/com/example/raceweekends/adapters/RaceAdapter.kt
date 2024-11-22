package com.example.raceweekends.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.raceweekends.R

class RaceAdapter(private val dataSet: Array<String>) : RecyclerView.Adapter<RaceAdapter.RacesViewHolder>() {

    class RacesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.racetextview)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RacesViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.list_style, viewGroup, false)

        return RacesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: RacesViewHolder, position: Int) {
        holder.textView.text = dataSet[position]
    }
}