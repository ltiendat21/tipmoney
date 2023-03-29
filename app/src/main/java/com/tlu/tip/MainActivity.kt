package com.tlu.tip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonCalculate = findViewById<Button>(R.id.btncalculator);
        buttonCalculate.setOnClickListener {
            CalculateTipMoney()
        }
    }
    fun CalculateTipMoney() {
        var costText = findViewById<EditText>(R.id.CostService);
        var cost = costText.text.toString().toDoubleOrNull();
        if (cost == null) return;

        var tipMoney = 0.0;

        var radioGroup = findViewById<RadioGroup>(R.id.groupbtn);
        when (radioGroup.checkedRadioButtonId) {
            R.id.option1 -> tipMoney = cost * 0.2
            R.id.option2 -> tipMoney = cost * 0.18
            R.id.option3 -> tipMoney = cost * 0.15
        }

        var tipValueText = findViewById<TextView>(R.id.tipValue)
        tipValueText.text = "Tip Money =" + tipMoney;

    }
}

