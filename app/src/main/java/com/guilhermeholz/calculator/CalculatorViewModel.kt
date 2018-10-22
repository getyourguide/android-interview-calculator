package com.guilhermeholz.calculator

import android.arch.lifecycle.ViewModel
import java.text.DecimalFormat

class CalculatorViewModel : ViewModel() {

    private enum class Operations {
        ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION, NONE
    }

    companion object {
        private val format = DecimalFormat("#.########")
    }

    fun onDigitClicked(digit: Char) {
        //TODO onDigitClicked function
    }

    fun onClearClicked() {
        //TODO onClearClicked function
    }

    fun onDivisionClicked() {
        //TODO onDivisionClicked function
    }

    fun onEqualClicked() {
        //TODO onEqualClicked function
    }

    fun onMultiplyClicked() {
        //TODO onMultiplyClicked function
    }

    fun onMinusClicked() {
        //TODO onMinusClicked function
    }

    fun onPlusClicked() {
        //TODO onPlusClicked function
    }
}