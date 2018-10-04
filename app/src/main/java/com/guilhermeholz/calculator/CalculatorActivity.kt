package com.guilhermeholz.calculator

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.guilhermeholz.calculator.databinding.ActivityMainBinding

class CalculatorActivity : AppCompatActivity() {

    private val viewmodel by lazy {
        ViewModelProviders.of(this).get(CalculatorViewModel::class.java)
    }
    private val binding by lazy {
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.setLifecycleOwner(this)
        binding.viewmodel = viewmodel
    }
}
