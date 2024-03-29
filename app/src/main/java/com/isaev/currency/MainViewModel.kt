package com.isaev.currency

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val network = Repository

    private val _currency: MutableLiveData<DataState<Currency>> = MutableLiveData()

    private var refreshingJob: Job? = null

    val currency: LiveData<DataState<Currency>> = _currency

    init {
        loadCurrency()
    }

    fun loadCurrency() {
        viewModelScope.launch {
            try {
                _currency.value = DataState.Loading
                _currency.value = DataState.Success(network.getCurrency())
            } catch (e: Exception) {
                _currency.value = DataState.Failure(e)
            }
        }
    }

    fun startRefreshing() {
        refreshingJob = viewModelScope.launch {
            while (true) {
                delay(30000)
                try {
                    _currency.value = DataState.Success(network.getCurrency())
                } catch (_: Exception) {
                }
            }
        }
    }

    fun stopRefreshing() {
        refreshingJob?.cancel()
    }

}