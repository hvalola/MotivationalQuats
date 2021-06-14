package com.pubudu.motivationalquats.framework.data

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class QuateViewPageAdapter(val fa : FragmentManager,val fragments :List<Fragment>): FragmentPagerAdapter(fa, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getCount(): Int =fragments.size

    override fun getItem(position: Int): Fragment = fragments.get(position)
}