package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.login.sign.Sign
import com.example.login.sign.SignAdapter

class MainPageActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        val signList = ArrayList<Sign>()
        signList.add(Sign(1,"https://www.vhv.rs/dpng/d/454-4542043_aries-png-aries-zodiac-sign-png-transparent-png.png", "ვერძი"))
        signList.add(Sign(2, "https://w7.pngwing.com/pngs/996/965/png-transparent-aries-symbol-zodiac-logo-taurus-aries-leaf-logo-astrological-sign.png", "კურო"))
        signList.add(Sign(3, "https://www.kindpng.com/picc/m/178-1782975_gemini-gemini-icon-png-transparent-png.png", "ტყუპები"))
        signList.add(Sign(4, "https://www.pngfind.com/pngs/m/47-476797_drawn-crab-cancer-crab-cancer-zodiac-sign-png.png", "კირჩხიბი"))
        signList.add(Sign(5, "https://www.pngkey.com/png/detail/175-1756560_primary-logo-leo-black-icon-astrological-sign-leo.png", "ლომი"))
        signList.add(Sign(6, "https://www.kindpng.com/picc/m/487-4877374_virgo-zodiac-sign-logo-hd-png-download.png", "ქალწული"))
        signList.add(Sign(7, "https://c0.klipartz.com/pngpicture/300/290/gratis-png-icono-astrologico-del-signo-zodiacal-de-libra-libra.png", "სასწორი"))
        signList.add(Sign(8, "https://c0.klipartz.com/pngpicture/316/492/gratis-png-escorpio-signo-astrologico-astrologia-zodiaco-simbolos-astrologicos-escorpio.png", "მორიელი"))
        signList.add(Sign(9, "https://www.hitsfm.com.np/wordpress/wp-content/uploads/2016/11/sagittarius.png", "შვილდოსანი"))
        signList.add(Sign(10, "https://e7.pngegg.com/pngimages/181/476/png-clipart-capricorn-astrological-sign-astrology-zodiac-cancer-capricorn-love-horse.png", "თხის რქა"))
        signList.add(Sign(11, "https://lh3.googleusercontent.com/proxy/hUSSFBy5bsV6AwTmDfoCdnVDQLiB_eJb_I-hOX2dbM7dankRr12DbamNKKjzDgZGboLiSYlWbqvtZ7a0YIC0MXfyW5oqx2YR7gZHOlfNaoNNRH5wR1lLn7lA", "მერწყული"))
        signList.add(Sign(12, "https://www.vhv.rs/dpng/d/456-4562122_pisces-zodiac-astrological-sign-symbol-pisces-png-transparent.png", "თევზები"))

        val signAdapter = SignAdapter(signList)
        recyclerView.layoutManager = GridLayoutManager(this, 1)
        recyclerView.adapter = signAdapter
    }
}