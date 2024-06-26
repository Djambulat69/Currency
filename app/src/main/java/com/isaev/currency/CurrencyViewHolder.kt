package com.isaev.currency

import androidx.recyclerview.widget.RecyclerView
import com.isaev.currency.databinding.CurrencyListItemBinding
import com.isaev.currency.network.VLT

class CurrencyViewHolder(
    private val binding: CurrencyListItemBinding
) : RecyclerView.ViewHolder(binding.root) {


    fun bind(item: VLT) {
        binding.name.text = item.name
        binding.charCode.text = item.charCode
        binding.value.text = binding.root.context.getString(R.string.value_string, item.value)
    }

}