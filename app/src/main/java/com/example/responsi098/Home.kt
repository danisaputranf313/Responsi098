package com.example.responsi098

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {

    val makanan = arrayOf<String>("SEGO LIWET", "SEGO MEGONO")
    val deskripsi = arrayOf<String>(
        "Sego Liwet merupakan makanan khas dari solo",
        "Sego Megono merupakan makanan khas dari Semarang"
    )

    val imageId = arrayOf<Int>(
        R.drawable.liwetan,
        R.drawable.megono
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val adapterku = Adapter(this,makanan,deskripsi,imageId)
        lvPacul.adapter = adapterku

        lvPacul.setOnItemClickListener { parent, v, position, id ->
            if(position == 0){
                startActivity(Intent(this@Home, Segoliwet::class.java))
            }else{
                startActivity(Intent(this@Home, Segomegono::class.java))
            }
        }
    }
}
