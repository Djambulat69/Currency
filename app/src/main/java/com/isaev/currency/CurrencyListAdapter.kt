package com.isaev.currency

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.isaev.currency.databinding.CurrencyListItemBinding
import com.isaev.currency.network.VLT

class CurrencyListAdapter : ListAdapter<VLT, CurrencyViewHolder>(ValuteDiffUtil) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrencyViewHolder {
        val binding =
            CurrencyListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return CurrencyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CurrencyViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

object ValuteDiffUtil : DiffUtil.ItemCallback<VLT>() {
    override fun areItemsTheSame(oldItem: VLT, newItem: VLT): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: VLT, newItem: VLT): Boolean {
        return oldItem == newItem
    }
}
