package com.example.breastcancerlocal.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.breastcancerlocal.fragments.DiagnoseFragment
import com.example.breastcancerlocal.fragments.createFragment
import com.example.breastcancerlocal.fragments.listFragment

class SectionsPagerAdapter(private val mContext: Context, fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    companion object {
        private val TABTITLES = arrayOf("+Classification", "ListClassification", "Classify")
    }

    override fun getItem(position: Int): Fragment { // instantiate a fragment for the page.
        return when (position) {
            0 -> {
                createFragment.newInstance(mContext)
            }
            1 -> {
                listFragment.newInstance(mContext)
            }
            2 -> {
                DiagnoseFragment.newInstance(mContext)
            }
            else -> listFragment.newInstance(mContext)
        }
    }

    override fun getPageTitle(position: Int): CharSequence {
        return TABTITLES[position]
    }

    override fun getCount(): Int {
        return 3
    }
}
