package com.example.myapplication

import android.animation.Animator
import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //mlogin_btn.setOnClickListener(this)
        /*
        mlogin_btn.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                TODO("Not yet implemented")
            }
        })*/
        /*
        mlogin_btn.setOnClickListener{ view: View? ->
        }*/
        mlogin_btn.setOnClickListener {
            /**
            ObjectAnimator.ofFloat(mHeader,"rotation",0f,360f).also {
                it.duration = 200
                it.repeatCount = 3
                it.start()
                it.addListener(object : Animator.AnimatorListener{
                    override fun onAnimationStart(p0: Animator?) {
                    }
                    override fun onAnimationCancel(p0: Animator?) {
                    }
                    override fun onAnimationEnd(p0: Animator?) {
                        startActivity(Intent(this@MainActivity, MainActivity2::class.java))
                    }
                    override fun onAnimationRepeat(p0: Animator?) {
                    }
                })
            }*/

            ObjectAnimator.ofFloat(mHeader,"rotation",0f,360f).apply {
                duration = 200
                repeatCount = 3
                start()
                addListener(object : MyAnimatorListener(){
                    override fun onAnimationEnd(p0: Animator?) {
                        startActivity(Intent(this@MainActivity, MainActivity2::class.java))
                    }
                })
            }
            /**
            val anim = ObjectAnimator.ofFloat(mHeader,"rotation",0f,360f)
            anim.duration = 200
            anim.repeatCount = 3
            anim.start()
            anim.addListener(object : Animator.AnimatorListener{
                override fun onAnimationStart(p0: Animator?) {
                }
                override fun onAnimationCancel(p0: Animator?) {
                }
                override fun onAnimationEnd(p0: Animator?) {
                    startActivity(Intent(this@MainActivity, MainActivity2::class.java))
                }
                override fun onAnimationRepeat(p0: Animator?) {
                }
            })*/
        }
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}