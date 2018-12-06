package com.guilhermeholz.calculator

import android.arch.lifecycle.ViewModel
import java.text.DecimalFormat

class CalculatorPresenter(val view: CalculatorView) : ViewModel() {

    private enum class Operations {
        ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION, NONE
    }

    companion object {
        private val format = DecimalFormat("#.########")
    }

    fun onDigitInputed(digit: String) {
        //TODO onDigitInputed function
    }

    fun onClearInputed() {
        //TODO onClearInputed function
    }

    fun onDivisionInputed() {
        //TODO onDivisionInputed function
    }

    fun onEqualInputed() {
        //TODO onEqualInputed function
    }

    fun onMultiplyInputed() {
        //TODO onMultiplyInputed function
    }

    fun onMinusInputed() {
        //TODO onMinusInputed function
    }

    fun onPlusInputed() {
        //TODO onPlusInputed function
    }
}