package com.example.ggu

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.ggu.databinding.ActivityMainBinding
import com.example.ggu.fragment.AboutFragment
import com.example.ggu.fragment.DepartmentFragment
import com.example.ggu.fragment.HomeFragment
import com.example.ggu.fragment.NoticeFragment
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    lateinit var toggle : ActionBarDrawerToggle
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
        val navigationView = findViewById<NavigationView>(R.id.nav_view)
        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close );
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        navigationView.setNavigationItemSelectedListener {
            when( it.itemId){
                R.id.navigation_administration -> Toast.makeText(applicationContext, "Administration", Toast.LENGTH_SHORT).show()
                R.id.navigation_amenities->{
                    val intent = Intent(this, amenitiesActivity::class.java)
                    startActivity(intent)
                }
                R.id.navigation_studentCorner->{
                    val intent = Intent(this, studentActivity::class.java)
                    startActivity(intent)
                }

                R.id.navigation_website->{
                    gotoUrl("https://www.ggu.ac.in/")
                }
                R.id.navigation_samarth->{
                    gotoUrl("https://ggv.samarth.edu.in/index.php/site/login")
                }
            }
            true
        }

        replaceFragment(HomeFragment())

        binding.bottonNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.navigation_home->replaceFragment(HomeFragment())
                R.id.navigation_notice->replaceFragment(NoticeFragment())
                R.id.navigation_department->replaceFragment(DepartmentFragment())
                R.id.navigation_about->replaceFragment(AboutFragment())

                else ->{
                }
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun replaceFragment(fragment : Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }

    private fun gotoUrl(s: String) {
        val uri: Uri = Uri.parse(s)
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }

}