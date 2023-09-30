package com.example.calculatorjp

import androidx.compose.ui.layout.VerticalAlignmentLine

sealed class CalculatorActions{
     data class Number(val number: Int): CalculatorActions()
    object Clear: CalculatorActions()
    object Delete: CalculatorActions()
    object Decimal: CalculatorActions()
    object Calculate: CalculatorActions()
    data class Operations(val operations: CalculatorOperation): CalculatorActions()
}
