package com.isaev.currency

import androidx.recyclerview.widget.RecyclerView
import com.isaev.currency.databinding.CurrencyListItemBinding

class CurrencyViewHolder(
    private val binding: CurrencyListItemBinding
) : RecyclerView.ViewHolder(binding.root) {


    fun bind(item: VLT) {
        binding.name.text = item.name
        binding.charCode.text = item.charCode
        binding.value.text = item.value
    }

}