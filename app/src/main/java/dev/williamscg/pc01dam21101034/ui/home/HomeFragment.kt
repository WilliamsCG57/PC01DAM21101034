package dev.williamscg.pc01dam21101034.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.williamscg.pc01dam21101034.R
import dev.williamscg.pc01dam21101034.databinding.FragmentHomeBinding
import dev.williamscg.pc01dam21101034.ui.adapter.PlayerAdapter
import dev.williamscg.pc01dam21101034.ui.model.PlayerModel

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        val rvPlayers: RecyclerView = view.findViewById(R.id.rvPlayers)
        rvPlayers.layoutManager = LinearLayoutManager(requireContext())
        rvPlayers.adapter = PlayerAdapter(getPlayers())
        return view
    }
    private fun getPlayers(): List<PlayerModel>{
        val lstPlayer: ArrayList<PlayerModel> = ArrayList()
        lstPlayer.add(PlayerModel(1,R.drawable.haland,"2000","Erling Haaland","23"))
        lstPlayer.add(PlayerModel(2,R.drawable.jude,"2000","Jude Bellingham","23"))
        lstPlayer.add(PlayerModel(3,R.drawable.haland,"2001","Piero Quispe","22"))

        return lstPlayer
    }
}