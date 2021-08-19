package com.example.kidsdrawingapp

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView


class MainActivity : AppCompatActivity() {
    val drawing_view = findViewById<DrawingView>(R.id.drawing_view)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ib_brush =findViewById<ImageView>(R.id.ib_brush)
        ib_brush.setOnClickListener {
            showBrushSizeChooserDialog()

        }

    }

    private fun showBrushSizeChooserDialog(){
        val brushDialog = Dialog(this)
        brushDialog.setContentView(R.layout.dialog_brush_size)
        brushDialog.setTitle("Brush size: ")
        val smallbtn = brushDialog.findViewById<ImageView>(R.id.ib_small_brush)
        smallbtn.setOnClickListener{
            drawing_view.setSizeForBrush(10.toFloat())
            brushDialog.dismiss() }
        brushDialog.show()
    }
}