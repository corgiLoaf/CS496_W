package com.example.helloworld

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.helloworld.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    private lateinit var adapter: RecyclerViewAdapter

    val contactsData = mutableListOf<Contacts>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //TODO: Generic Type
        //val contactsList = findViewById<>(R.id.recyclerView)
        //val imageGallery = findViewById<>(R.id.imageGallery)
        //val tempView = findViewById<>(R.id.tempView)

        val tab = findViewById<TabLayout>(R.id.main_tab)
        tab.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {


            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (tab!!.position) {
                    0 -> contactsList
                    1 -> imageGallery
                    //2 -> tempView
                }
            }
        })
    }

    //TODO: Binding tab Layout and make addOnTabSelectedListener

    fun initContactsRecyclerview() {
        val adapter = RecyclerViewAdapter()
        adapter.datalist = contactsData
        //Q: What is binding? / binding.recyclerView? / layoutmanager?
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }

    //TODO: We have to initialize Datalist of Contacts
    fun initializelist() {

    }
}