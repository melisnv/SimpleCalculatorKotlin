package com.melisnurverir.simplecalculatorkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.round
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    var number1 : Float? = null
    var number2 : Float? = null
    var result : Float? = null
    var resultInt : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sumOp(view: View) {

        number1 = num1Txt.text.toString().toFloatOrNull()
        number2 = num2Txt.text.toString().toFloatOrNull()

        if (number1 == null || number2 == null){
            resultTxt.text = "Error !"
        }
        else {
            result = number1!! + number2!!
            resultInt = result!!.toInt()
            resultTxt.text = "${resultInt}"
        }

    }

    fun subOp(view: View){

        number1 = num1Txt.text.toString().toFloatOrNull()
        number2 = num2Txt.text.toString().toFloatOrNull()

        if (number1 == null || number2 == null){
            resultTxt.text = "Error !"
        }
        else {
            result = number1!! - number2!!
            resultInt = result!!.toInt()
            resultTxt.text = "${resultInt}"
        }

    }

    fun multipOp(view: View){

        number1 = num1Txt.text.toString().toFloatOrNull()
        number2 = num2Txt.text.toString().toFloatOrNull()

        if (number1 == null || number2 == null){
            resultTxt.text = "Error !"
        }
        else {
            result = number1!! * number2!!
            resultInt = result!!.toInt()
            resultTxt.text = "${resultInt}"
        }

    }

    fun divOp(view: View){

        number1 = num1Txt.text.toString().toFloatOrNull()
        number2 = num2Txt.text.toString().toFloatOrNull()

        if (number1 == null || number2 == null){
            resultTxt.text = "Error !"
        }
        else {
            result = number1!! / number2!!
            resultTxt.text = "${result}"
        }

    }

    fun modOp(view: View){

        number1 = num1Txt.text.toString().toFloatOrNull()
        number2 = num2Txt.text.toString().toFloatOrNull()

        if (number1 == null || number2 == null){
            resultTxt.text = "Error !"
        }
        else {
            result = number1!! % number2!!
            resultInt = result!!.toInt()
            resultTxt.text = "${resultInt}"
        }

    }

    fun cleanRes(view: View){
        num1Txt.text.clear()
        num2Txt.text.clear()
        resultTxt.text = ""

        num1Txt.requestFocus()
    }
}