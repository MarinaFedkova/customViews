package ru.customViews

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.BounceInterpolator
import android.view.animation.LinearInterpolator

class AppActivity : AppCompatActivity(R.layout.activity_app) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val view = findViewById<StatsView>(R.id.stats)
        view.data = listOf(
            0.25F,
            0.25F,
            0.25F,
            0.25F,
        )

        /*val alpha = ObjectAnimator.ofFloat(view, View.ALPHA, 0.25F, 1F).apply {
            duration = 300
            interpolator = LinearInterpolator()
        }
        val scaleX = PropertyValuesHolder.ofFloat(View.SCALE_X, 0F, 1F)
        val scaleY = PropertyValuesHolder.ofFloat(View.SCALE_Y, 0F, 1F)
        val scale = ObjectAnimator.ofPropertyValuesHolder(view, scaleX, scaleY).apply {
            duration = 300
            interpolator = BounceInterpolator()
        }
        AnimatorSet().apply {
            startDelay = 500
            playSequentially(scale, alpha)
        }.start()*/
    }
}
