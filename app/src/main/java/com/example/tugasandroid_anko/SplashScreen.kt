package com.example.tugasandroid_anko

import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.widget.TextView
import org.jetbrains.anko.*

class SplashScreen : AppCompatActivity(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ViewSplash().setContentView(this)

        Handler().postDelayed({
            startActivity(intentFor<Login>())
            finish()
        }, 4000)

    }

    class ViewSplash : AnkoComponent<SplashScreen> {
        override fun createView(ui: AnkoContext<SplashScreen>) = with(ui) {
            verticalLayout {
                lparams {
                    width = matchParent
                    height = matchParent
                    verticalGravity = Gravity.CENTER
                }
                textView {
                    text = "SplashScreen"
                    textColor = R.color.colorAccent
                    textSize = 25.0f
                    textAlignment = TextView.TEXT_ALIGNMENT_CENTER
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }
            }
        }
    }
}