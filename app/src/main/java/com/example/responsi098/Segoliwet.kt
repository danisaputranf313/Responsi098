package com.example.responsi098

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Segoliwet : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_makanan)

        val img = findViewById(R.id.img1) as ImageView
        val title = findViewById(R.id.tvTitle) as TextView
        val deskripsi = findViewById(R.id.tvDeskripsi) as TextView

        title.setText("SEGO LIWET")
        deskripsi.setText("Sego Liwet merupakan makanan khas dari solo")
        img.setImageResource(R.drawable.liwetan)
    }
}