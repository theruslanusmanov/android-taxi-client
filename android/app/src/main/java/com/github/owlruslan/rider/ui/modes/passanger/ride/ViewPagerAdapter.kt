package com.github.owlruslan.rider.ui.modes.passanger.ride

import android.content.Context
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.viewpager.widget.PagerAdapter
import com.github.owlruslan.rider.R

class ViewPagerAdapter(private val context: Context, private val mListData: List<String>) : PagerAdapter() {

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    override fun getCount(): Int {
        return mListData.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mListData[position]
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.viewpager_item, container, false) as ViewGroup

        /*val textView = view.findViewById<TextView>(R.id.textView)
        textView.text = mListData[position]*/

        container.addView(view)

        val viewPagerTopItemLayout = view.findViewById<ConstraintLayout>(R.id.viewPagerTopItemLayout)
        val viewPagerBottomItemLayout = view.findViewById<ConstraintLayout>(R.id.viewPagerBottomItemLayout)
        viewPagerTopItemLayout.setOnClickListener {
            it.background = context.resources.getDrawable(R.drawable.outline_round_8dp, null)
            viewPagerBottomItemLayout.background = null
        }
        viewPagerBottomItemLayout.setOnClickListener {
            it.background = context.resources.getDrawable(R.drawable.outline_round_8dp, null)
            viewPagerTopItemLayout.background = null
        }

        return view
    }
}