package com.masai.dropdown

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    private var spinner: Spinner? = null
    private var arrayAdapter: ArrayAdapter<String>? = null

    private var itemList = arrayOf(
        "English",
        "English (UK)",
        "हिंदी (India)",
        "传统, 台湾 (Traditional, Taiwan)",
        "Bahasa Indonesia",
        "Dansk (Danish)",
        "日本語 (Japanese)",
        "Deutsch (German)",
        "한국인 (Korean)",
        "Español (Latin America)",
        "Español (Spain)",
        "Filipino",
        "中国人 (Chinese Simplified)",
        "Français (Canada)",
        "ภาษาไทย (Thai)",
        "Français (France)",
        "Hrvatski (Croatian)",
        "Italiano (Italian)",
        "Afrikaans",
        "PycckŃŃ (Russia)",
        "Magyar (Hungarian)",
        "Nederlands (Dutch)",
        "Norsk (bokmal)",
        "Polski (Polish)",
        "Português (Brasil)",
        "Português (Portugal)",
        "Românâ (Romanian)",
        "Slovenčina (Slovak)",
        "Tiê' Viêt (Vietnamese)",
        "Tükçe (Turkish)",
        "Čeština (Czech)",
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinner = findViewById(R.id.spinners)
        arrayAdapter =
            ArrayAdapter(applicationContext, android.R.layout.simple_spinner_item, itemList)
        spinner?.adapter = arrayAdapter
        spinner?.onItemSelectedListener = this

    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        Toast.makeText(applicationContext, "Nothing Select", Toast.LENGTH_SHORT).show()

    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        var items: String = parent?.getItemAtPosition(position) as String
        Toast.makeText(applicationContext, "$items", Toast.LENGTH_LONG).show()
    }
}