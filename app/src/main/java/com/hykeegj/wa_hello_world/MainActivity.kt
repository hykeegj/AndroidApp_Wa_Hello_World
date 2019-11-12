package com.hykeegj.wa_hello_world

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.webkit.ConsoleMessage
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    lateinit var mAdView: AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MobileAds.initialize(this, "ca-app-pub-8821863654562801~7746394788")
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        cButton.setOnClickListener {
            val c_intent = Intent(this, CLang::class.java)
            startActivity(c_intent)
        }

        cppButton.setOnClickListener {
            val cpp_intent = Intent(this, CppLang::class.java)
            startActivity(cpp_intent)
        }

        javaButton.setOnClickListener {
            val java_intent = Intent(this, JavaLang::class.java)
            startActivity(java_intent)
        }

        pythonButton.setOnClickListener {
            val python_intent = Intent(this, PythonLang::class.java)
            startActivity(python_intent)
        }

        csButton.setOnClickListener {
            val cs_intent = Intent(this, CsLang::class.java)
            startActivity(cs_intent)
        }

        vbdotnetButton.setOnClickListener {
            val vbdotnet_intent = Intent(this, Vb_DotNet::class.java)
            startActivity(vbdotnet_intent)
        }
    }
}
