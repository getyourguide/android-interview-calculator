package com.guilhermeholz.calculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class CalculatorActivity : AppCompatActivity(), CalculatorView {

    private val presenter by lazy {
        CalculatorPresenter()
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

    override fun onResume() {
        super.onResume()
        presenter.view = this
    }

    override fun onPause() {
        super.onPause()
        presenter.view = null
    }

    private fun initListeners() {
        numbers.forEach { number ->
            number.setOnClickListener {
                val digit = (it as TextView).text.toString()
                presenter.onDigitInputed(digit)
            }
        }

        operator_clear.setOnClickListener { presenter.onClearInputed() }
        operator_equals.setOnClickListener { presenter.onEqualInputed() }
        operator_plus.setOnClickListener { presenter.onPlusInputed() }
        operator_minus.setOnClickListener { presenter.onMinusInputed() }
        operator_multiply.setOnClickListener { presenter.onMultiplyInputed() }
        operator_divide.setOnClickListener { presenter.onDivisionInputed() }
    }
}
