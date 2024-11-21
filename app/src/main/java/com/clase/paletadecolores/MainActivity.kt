package com.clase.paletadecolores

import android.app.Dialog
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var btChangeColor: CardView
    private lateinit var rvVertical: RecyclerView
    private lateinit var verticalAdapter: VerticalAdapter
    private lateinit var verticalList: List<Vertical>

    private fun initVerticalList() {
        verticalList = listOf(
            Vertical(Vertical.Color.YELLOW, Vertical.Opacity.O20, getString(R.string.v1)),
            Vertical(Vertical.Color.GREEN, Vertical.Opacity.O35, getString(R.string.v2)),
            Vertical(Vertical.Color.CYAN, Vertical.Opacity.O50, getString(R.string.v3)),
            Vertical(Vertical.Color.BLUE, Vertical.Opacity.O65, getString(R.string.v4)),
            Vertical(Vertical.Color.VIOLET, Vertical.Opacity.O80, getString(R.string.v5))
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initVerticalList()
        initComponents()
        initListeners()
        initUI()
    }

    private fun initComponents() {
        rvVertical = findViewById(R.id.rvVertical)
        btChangeColor = findViewById(R.id.cvChangeColor)
    }

    private fun initListeners() {
        btChangeColor.setOnClickListener { showDialog() }
    }

    private fun initUI() {
        verticalAdapter = VerticalAdapter(verticalList)
        rvVertical.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvVertical.adapter = verticalAdapter
    }

    private fun showDialog() {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.dialog_color)

        val rgBars = dialog.findViewById<RadioGroup>(R.id.rgBars)
        val rgColors = dialog.findViewById<RadioGroup>(R.id.rgColors)
        val btnApplyColor = dialog.findViewById<CardView>(R.id.cvApplyColor)

        dialog.show()

        btnApplyColor.setOnClickListener {
            val selectedColorId = rgColors.checkedRadioButtonId
            val selectedColorButton: RadioButton = rgColors.findViewById(selectedColorId)

            val color: Vertical.Color = when (selectedColorButton.text) {
                getString(R.string.white) -> Vertical.Color.WHITE
                getString(R.string.red) -> Vertical.Color.RED
                getString(R.string.orange) -> Vertical.Color.ORANGE
                getString(R.string.yellow) -> Vertical.Color.YELLOW
                getString(R.string.green) -> Vertical.Color.GREEN
                getString(R.string.cyan) -> Vertical.Color.CYAN
                getString(R.string.blue) -> Vertical.Color.BLUE
                getString(R.string.violet) -> Vertical.Color.VIOLET
                else -> Vertical.Color.BLACK
            }

            val selectedBarId = rgBars.checkedRadioButtonId
            val selectedBarButton: RadioButton = rgBars.findViewById(selectedBarId)

            when (selectedBarButton.text) {
                getString(R.string.h1) -> {
                    this.findViewById<CardView>(R.id.cvH1).background.setTint(Vertical(color, Vertical.Opacity.O20, "").getColor(this))
                }
                getString(R.string.h2) -> {
                    this.findViewById<CardView>(R.id.cvH2).background.setTint(Vertical(color, Vertical.Opacity.O50, "").getColor(this))
                }
                getString(R.string.h3) -> {
                    this.findViewById<CardView>(R.id.cvH3).background.setTint(Vertical(color, Vertical.Opacity.O80, "").getColor(this))
                }
                else -> {
                    verticalList.forEach {
                        if (it.text == selectedBarButton.text)
                            it.colorName = color
                    }
                }
            }
            updateColors()
            dialog.hide()
        }
    }

    private fun updateColors() {
        verticalAdapter.notifyDataSetChanged()
    }

}