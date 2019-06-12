package com.example.tugasandroid_anko

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.widget.TextView
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class Main : AppCompatActivity(), AnkoLogger {

    companion object {
        lateinit var tv_username: TextView
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ViewMain().setContentView(this)
        val username = intent.getStringExtra("nama")

        tv_username.text = username
    }

    override fun onBackPressed() {
        alert(title = "Warning", message = "Apakah anda ingin keluar?") {
            positiveButton(buttonText = "OK") {
                finishAffinity()
            }
            negativeButton(buttonText = "Cancel") {
                //nanti ngapain
            }
            isCancelable = false
        }.show()
    }

    class ViewMain : AnkoComponent<Main> {
        override fun createView(ui: AnkoContext<Main>) = with(ui) {
            verticalLayout {
                lparams {
                    width = matchParent
                    height = matchParent
                    padding = 30
                    backgroundColor = Color.WHITE
                }
                textView {
                    text = "Welcome"
                    textSize = 16.0f
                    textColor = Color.BLACK
                }.lparams(width = matchParent, height = wrapContent)
                tv_username = textView {
                    text = "username"
                    textSize = 26.0f
                    textColor = Color.BLACK
                }.lparams {
                    width = matchParent
                    height = wrapContent
                    topMargin = 10
                    bottomMargin = 70
                }
                linearLayout {
                    onClick {
                        toast("Latihan Anko Layout1")
                    }
                    lparams(width = matchParent, height = 150) {
                        backgroundColor = Color.GRAY
                        verticalGravity = Gravity.CENTER
                        topMargin = 15
                        bottomMargin = 30
                    }
                    imageView {
                        imageResource = R.drawable.ic_android_black_24dp
                        backgroundColor = Color.GREEN
                    }.lparams(width = 150, height = 150)
                    textView {
                        text = "LATIHAN ANKO LAYOUT"
                        textAlignment = TextView.TEXT_ALIGNMENT_CENTER
                        textSize = 20.0f
                        textColor = Color.WHITE
                        gravity = Gravity.CENTER
                    }.lparams(width = matchParent, height = wrapContent)
                }
                linearLayout {
                    onClick {
                        toast("Latihan Anko Layout2")
                    }
                    lparams(width = matchParent, height = 150) {
                        backgroundColor = Color.GRAY
                        verticalGravity = Gravity.CENTER
                        topMargin = 15
                        bottomMargin = 30
                    }
                    imageView {
                        imageResource = R.drawable.ic_android_black_24dp
                        backgroundColor = Color.GREEN
                    }.lparams(width = 150, height = 150)
                    textView {
                        text = "LATIHAN ANKO LAYOUT"
                        textAlignment = TextView.TEXT_ALIGNMENT_CENTER
                        textSize = 20.0f
                        textColor = Color.WHITE
                        gravity = Gravity.CENTER
                    }.lparams(width = matchParent, height = wrapContent)
                }
                linearLayout {
                    onClick {
                        toast("Latihan Anko Layout3")
                    }
                    lparams(width = matchParent, height = 150) {
                        backgroundColor = Color.GRAY
                        verticalGravity = Gravity.CENTER
                        topMargin = 15
                        bottomMargin = 30
                    }
                    imageView {
                        imageResource = R.drawable.ic_android_black_24dp
                        backgroundColor = Color.GREEN
                    }.lparams(width = 150, height = 150)
                    textView {
                        text = "LATIHAN ANKO LAYOUT"
                        textAlignment = TextView.TEXT_ALIGNMENT_CENTER
                        textSize = 20.0f
                        textColor = Color.WHITE
                        gravity = Gravity.CENTER
                    }.lparams(width = matchParent, height = wrapContent)
                }
            }
        }

    }
}