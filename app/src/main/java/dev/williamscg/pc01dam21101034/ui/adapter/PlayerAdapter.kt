package dev.williamscg.pc01dam21101034.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.williamscg.pc01dam21101034.R
import dev.williamscg.pc01dam21101034.ui.model.PlayerModel

class PlayerAdapter (private var lstSong: List<PlayerModel>) :
    RecyclerView.Adapter<PlayerAdapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val tvName: TextView = itemView.findViewById(R.id.tvName)
        val tvAnio: TextView = itemView.findViewById(R.id.tvAnio)
        val tvAnios: TextView = itemView.findViewById(R.id.tvAnios)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_player, parent, false))
    }

    override fun getItemCount(): Int {
        return lstSong.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemSong = lstSong[position]
        holder.tvName.text = itemSong.name
        holder.tvAnio.text = itemSong.year
        holder.tvAnios.text = itemSong.age
    }
}