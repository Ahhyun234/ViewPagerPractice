package com.nepplus.viewpagerpractice.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.nepplus.viewpagerpractice.pragments.MainBanerFragment
import com.nepplus.viewpagerpractice.pragments.MainBanerFragment2

class ViewPagerAdapters(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        if (position == 0) {
            return MainBanerFragment()
        } else {
            return MainBanerFragment2()
        }

    }


}