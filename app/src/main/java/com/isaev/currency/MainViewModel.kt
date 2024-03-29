package com.isaev.currency

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.isaev.currency.network.Currency
import com.isaev.currency.network.DataState
import com.isaev.currency.network.Repository
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
                delay(REFRESH_DELAY)
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

    private companion object {
        const val REFRESH_DELAY = 30000L
    }

}