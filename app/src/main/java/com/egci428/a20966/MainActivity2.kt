package com.egci428.a20966

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main2.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val getRandomnumber = intent.getStringExtra("randomnumber")
        val rand: Int = getRandomnumber.toInt()
        getRandom.setText(getRandomnumber)
        Log.d("getRandom: ", "$getRandomnumber")

        val res = resources.getIdentifier("win", "drawable", packageName)

        fun ClosedRange<Int>.random() = Random().nextInt(endInclusive - start) +  start
        val randomRange: ArrayList<Int> = ArrayList()
        val randnumber = (20..41)
        val randomnumber1 = randnumber.random()
        val randomnumber2 = randnumber.random()
        val randomnumber3 = randnumber.random()
        val randomnumber4 = randnumber.random()
        val randomnumber5 = randnumber.random()
        randomRange.add(randomnumber1)
        randomRange.add(randomnumber2)
        randomRange.add(randomnumber3)
        randomRange.add(randomnumber4)
        randomRange.add(randomnumber5)
        Log.d("Random1 :", "$randomnumber1")
        Log.d("Random2 :", "$randomnumber2")
        Log.d("Random3 :", "$randomnumber3")
        Log.d("Random4 :", "$randomnumber4")
        Log.d("Random5 :", "$randomnumber5")

        randomList.setText("$randomnumber1" +", "+ "$randomnumber2" +", "+ "$randomnumber3" +", "+ "$randomnumber4" +", "+ "$randomnumber5")
        when (rand){
            randomnumber1 -> resultText.setText("You Win!!!")
            randomnumber2 -> resultText.setText("You Win!!!")
            randomnumber3 -> resultText.setText("You Win!!!")
            randomnumber4 -> resultText.setText("You Win!!!")
            randomnumber5 -> resultText.setText("You Win!!!")
            else -> {
                resultText.setText("You Lose!!!")
            }
        }
        when (rand){
            randomnumber1 -> resultImage.setImageResource(R.drawable.win)
            randomnumber2 -> resultImage.setImageResource(R.drawable.win)
            randomnumber3 -> resultImage.setImageResource(R.drawable.win)
            randomnumber4 -> resultImage.setImageResource(R.drawable.win)
            randomnumber5 -> resultImage.setImageResource(R.drawable.win)
            else -> {
                resultImage.setImageResource(R.drawable.lose)
            }
        }
        newBtn.setOnClickListener {
            this.finish()
        }


    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.getItemId()
        if (id == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }

}
