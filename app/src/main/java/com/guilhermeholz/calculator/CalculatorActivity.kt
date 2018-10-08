package com.guilhermeholz.calculator

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class CalculatorActivity : AppCompatActivity() {

    private val viewmodel by lazy {
        ViewModelProviders.of(this).get(CalculatorViewModel::class.java)
    }

    private val numbers by lazy {
        listOf(number_0, number_1, number_2, number_3, number_4,
                number_5, number_6, number_7, number_8, number_9)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initListeners()
    }

    private fun initListeners() {
        numbers.forEach { number ->
            number.setOnClickListener {
                val digit = (it as TextView).text.toString()
                viewmodel.onDigitInputed(digit)
            }
        }

        operator_clear.setOnClickListener { viewmodel.onClearInputed() }
        operator_equals.setOnClickListener { viewmodel.onEqualInputed() }
        operator_plus.setOnClickListener { viewmodel.onPlusInputed() }
        operator_minus.setOnClickListener { viewmodel.onMinusInputed() }
        operator_multiply.setOnClickListener { viewmodel.onMultiplyInputed() }
        operator_divide.setOnClickListener { viewmodel.onDivisionInputed() }
    }
}
