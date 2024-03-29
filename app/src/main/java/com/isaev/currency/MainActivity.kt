package com.isaev.currency

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import com.isaev.currency.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by lazy { ViewModelProvider(this)[MainViewModel::class.java] }
    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val currencyAdapter = CurrencyListAdapter()

        binding.currencyList.adapter = currencyAdapter
        binding.currencyList.addItemDecoration(
            DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
            )
        )

        binding.retryButton.setOnClickListener {
            viewModel.loadCurrency()
        }

        val formatNew = SimpleDateFormat("dd MMM yyyy HH:mm", Locale.getDefault())

        viewModel.currency.observe(this) { state ->

            if (state is DataState.Success) {
                (binding.currencyList.adapter as CurrencyListAdapter).submitList(state.data.valute)

                val date = Date()
                binding.date.text = formatNew.format(date)
            }

            with(binding) {
                progressBar.isVisible = state is DataState.Loading

                currencyList.isVisible = state is DataState.Success
                date.isVisible = state is DataState.Success

                errorMessage.isVisible = state is DataState.Failure
                retryButton.isVisible = state is DataState.Failure
            }
        }

    }

    override fun onStart() {
        super.onStart()

        viewModel.startRefreshing()
    }

    override fun onStop() {
        super.onStop()

        viewModel.stopRefreshing()
    }
}