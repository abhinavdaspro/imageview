package com.example.student.imageview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val but=findViewById<Button>(R.id.button1)
        val img=findViewById<ImageView>(R.id.image1)
        val im= arrayOf(
                "https://marvelcinematicuniverse.fandom.com/wiki/Iron_Man?file=IronMan-EndgameProfile.jpg",
                "https://marvelcinematicuniverse.fandom.com/wiki/Iron_Man?file=Flag_of_United_States_of_America.png",
                "https://marvelcinematicuniverse.fandom.com/wiki/Iron_Man?file=Stark_Industries_-_Infobox_Logo.png",
                "https://marvelcinematicuniverse.fandom.com/wiki/Iron_Man?file=Avengers_Logo.png"

        )
        Glide.with(this).load(im[0]).into(img)
        var i:Int=0
        val n:Int=im.size
        but.setOnClickListener{
            Glide.with(this).load(im[i%n]).into(img)
            i++
        }
    }
}
