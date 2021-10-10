package com.geekbrains.weathapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WeatherAdapter : RecyclerView.Adapter<WeatherAdapter.ViewHolder>() {

    var weatherList: List<Weather> = ArrayList<Weather>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(weatherList[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(weather: Weather) {
            itemView.findViewById<TextView>(R.id.town).text = weather.town
            itemView.findViewById<TextView>(R.id.temp).text = "${weather.temperature}°"

        }
    }

    override fun getItemCount(): Int = weatherList.size
}