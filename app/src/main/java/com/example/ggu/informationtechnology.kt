package com.example.ggu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.ggu.ITDeptFragment.ITAboutFragment
import com.example.ggu.ITDeptFragment.ITFacultyFragment
import com.example.ggu.ITDeptFragment.ITLinksFragment
import com.example.ggu.ITDeptFragment.ITNewsFragment
import com.google.android.material.tabs.TabLayout

class informationtechnology : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informationtechnology)


        var viewPager = findViewById(R.id.viewPager) as ViewPager
        var tablayout = findViewById(R.id.tablayout) as TabLayout

        val fragmentAdapter = FragmentAdapter(supportFragmentManager)
        fragmentAdapter.addFragment(ITAboutFragment(),"About")
        fragmentAdapter.addFragment(ITFacultyFragment(),"Faculty")
        fragmentAdapter.addFragment(ITNewsFragment(), "News")
        fragmentAdapter.addFragment(ITLinksFragment(), "Links")


        viewPager.adapter = fragmentAdapter
        tablayout.setupWithViewPager(viewPager)

    }
}