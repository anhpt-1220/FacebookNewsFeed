package com.example.framgiaphamtheanh.facebooknewsfeed.newfeed

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.framgiaphamtheanh.facebooknewsfeed.newfeed.news.NewsFragment


class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment? {
        return when (position) {
            0 -> NewsFragment()
            1 -> NewsFragment()
            2 -> NewsFragment()
            3 -> NewsFragment()
            else -> null
        }
    }

    override fun getCount(): Int {
        return 4
    }
}
