package dev.williamscg.pc01dam21101034.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import dev.williamscg.pc01dam21101034.R
import dev.williamscg.pc01dam21101034.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {
    var arrSO = arrayOf(
        "Manchester United","Barcelona FC", "Liverpool", "Real Madrid","Juventus","Pumas UNAM","Universitario de Deportes",
        "Flamengo","River Plate","Boca Juniors"
    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_slideshow, container, false)

        val lstEquipos : ListView = view.findViewById(R.id.lstEquipos)

        val adaptador = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_list_item_1,arrSO)

        lstEquipos.adapter = adaptador
        return view
    }



}