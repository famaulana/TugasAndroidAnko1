package com.example.tugasandroid_anko

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.InputType
import android.view.Gravity
import android.widget.EditText
import org.jetbrains.anko.*

class Login : AppCompatActivity(), AnkoLogger {

    companion object {
        lateinit var username: EditText
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ViewLogin().setContentView(this)
    }

    class ViewLogin : AnkoComponent<Login> {
        override fun createView(ui: AnkoContext<Login>) = with(ui) {
            verticalLayout {
                lparams {
                    width = matchParent
                    height = matchParent
                    padding = 30
                    verticalGravity = Gravity.CENTER
                    backgroundColor = R.color.colorPrimary
                }
                verticalLayout {
                    lparams(width = matchParent, height = wrapContent) {
                        backgroundColor = Color.WHITE
                        margin = 15
                        padding = 20
                    }
                    username = editText {
                        hint = "Username"
                        inputType = InputType.TYPE_CLASS_TEXT
                    }.lparams(width = matchParent, height = wrapContent) {
                        margin = 15
                    }
                    button {
                        text = "LOGIN"
                        setOnClickListener {
                            startActivity<Main>("nama" to username.text.toString())
                            toast("Hello " + username.text.toString())
                        }
                    }
                }
            }
        }

    }
}