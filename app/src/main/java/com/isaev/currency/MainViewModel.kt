package com.isaev.currency

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val network = Repository

    private val _currency: MutableLiveData<ValuteData> = MutableLiveData()

    val currency: LiveData<ValuteData> = _currency

    init {
        viewModelScope.launch {
//            _currency.value = network.getCurrency()
        }
    }

}