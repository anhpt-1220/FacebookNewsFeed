package com.example.framgiaphamtheanh.facebooknewsfeed.newfeed.news

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.framgiaphamtheanh.facebooknewsfeed.R

class NewsFragment : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_news,container,false)
        return view
    }
}
