package com.ubaya.week1anmp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import com.ubaya.week1anmp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    class MainActivity : AppCompatActivity() {
        private lateinit var binding: ActivityMainBinding
        private lateinit var navController: NavController


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater)
            val view = binding.root
            setContentView(view)

            navController =
                (supportFragmentManager.findFragmentById(R.id.hostFragment)
                        as NavHostFragment).navController
            NavigationUI.setupActionBarWithNavController(this, navController)
        }


        override fun onSupportNavigateUp(): Boolean {
            return navController.navigateUp()
        }


        override fun onResume() {
        super.onResume()
        Log.d("resume","app is starting")
    }

    override fun onDestroy() {
        Log.d("destroy", "app is closing")
        super.onDestroy()
    }

    // TODO: jangmi aselole 
}