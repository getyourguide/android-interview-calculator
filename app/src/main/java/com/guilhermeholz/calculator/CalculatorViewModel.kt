package com.guilhermeholz.calculator

import android.arch.lifecycle.ViewModel
import android.view.View
import java.text.DecimalFormat

class CalculatorViewModel : ViewModel() {

    private enum class Operations {
        ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION, NONE
    }

    companion object {
        private val format = DecimalFormat("#.########")
    }

    fun onDigitClicked(view: View) {
        //TODO onDigitClicked function
    }

    fun onClearClicked(view: View) {
        //TODO onClearClicked function
    }

    fun onDivisionClicked(view: View) {
        //TODO onDivisionClicked function
    }

    fun onEqualClicked(view: View) {
        //TODO onEqualClicked function
    }

    fun onMultiplyClicked(view: View) {
        //TODO onMultiplyClicked function
    }

    fun onMinusClicked(view: View) {
        //TODO onMinusClicked function
    }

    fun onPlusClicked(view: View) {
        //TODO onPlusClicked function
    }
}