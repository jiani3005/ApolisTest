package com.mykotlinapplication.testandroid

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class Adapter (fm: FragmentManager): FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> FragmentOne()
            else -> FragmentTwo()
        }
    }

    override fun getCount(): Int {
        return 2
    }
}