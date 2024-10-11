package dev.williamscg.pc01dam21101034.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import dev.williamscg.pc01dam21101034.R
import dev.williamscg.pc01dam21101034.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_gallery, container, false)
        val etKm = rootView.findViewById<EditText>(R.id.etKm)
        val etMinutos = rootView.findViewById<EditText>(R.id.etMinutos)
        val btnCalcular = rootView.findViewById<Button>(R.id.btnCalcular)
        val tvResult = rootView.findViewById<TextView>(R.id.tvResult)

        btnCalcular.setOnClickListener {
            val kmStr = etKm.text.toString()
            val minutosStr = etMinutos.text.toString()

            if (kmStr.isNotEmpty() && minutosStr.isNotEmpty()) {
                val km = kmStr.toDouble()
                val minutos = minutosStr.toDouble()

                if (minutos > 0) {
                    val rendimiento = km / minutos
                    tvResult.text = String.format("%.2f km/min", rendimiento)
                } else {
                    tvResult.text = "Minutos debe ser mayor a 0"
                }
            }else{
                tvResult.text = "Por favor ingrese valores válidos"
            }
        }
        return rootView
    }
}


