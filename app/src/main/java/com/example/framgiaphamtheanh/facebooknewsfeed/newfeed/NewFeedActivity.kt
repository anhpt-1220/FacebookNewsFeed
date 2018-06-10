package com.example.framgiaphamtheanh.facebooknewsfeed.newfeed

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import com.example.framgiaphamtheanh.facebooknewsfeed.R

class NewFeedActivity : AppCompatActivity() {
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager
    private var viewPagerAdapter: ViewPagerAdapter = ViewPagerAdapter(supportFragmentManager)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_feed)
        tabLayout = findViewById(R.id.tab_layout)
        viewPager = findViewById(R.id.view_pager)
        tabLayout.setupWithViewPager(viewPager)
        viewPager.adapter = viewPagerAdapter
        tabLayout.getTabAt(0)?.setIcon(R.drawable.ic_news_stage)
        tabLayout.getTabAt(1)?.setIcon(R.drawable.ic_people_stage)
        tabLayout.getTabAt(2)?.setIcon(R.drawable.ic_notification_stage)
        tabLayout.getTabAt(3)?.setIcon(R.drawable.ic_menu_stage)
    }
}
