package com.github.owlruslan.rider.ui.modes.passanger.search

import android.content.Context
import android.content.res.ColorStateList
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.github.owlruslan.rider.R
import com.google.android.libraries.places.api.model.AutocompletePrediction
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.ArrayList

class SearchListAdapter(private val searchList: ArrayList<AutocompletePrediction>,
                        val listener: OnSearchListClickListener, val type: SearchListTypes, val context: Context) :
    RecyclerView.Adapter<SearchListAdapter.SearchListViewHolder>() {

    class SearchListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textView: TextView = itemView.findViewById(R.id.searchListItemTitle)
        private val fullTextView: TextView = itemView.findViewById(R.id.searchListItemTitleBottom)

        fun bind(prediction: AutocompletePrediction) {
            textView.text = prediction.getPrimaryText(null)
            fullTextView.text = prediction.getFullText(null)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): SearchListAdapter.SearchListViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.searchlist_item_view, parent, false)

        return SearchListViewHolder(view)
    }

    override fun onBindViewHolder(holder: SearchListViewHolder, position: Int) {
        holder.bind(searchList[position])

        holder.itemView.setOnClickListener {
            listener.onItemClick(searchList[position], type)
        }

        // Change color to colorPrimary on input of start point
        if (type == SearchListTypes.START) {
            holder.itemView.findViewById<FloatingActionButton>(R.id.icon).backgroundTintList =
                ColorStateList.valueOf(ContextCompat.getColor(context, R.color.colorPrimary))
        }
    }

    override fun getItemCount() = searchList.size
}