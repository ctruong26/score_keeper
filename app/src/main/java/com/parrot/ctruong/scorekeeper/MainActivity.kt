package com.parrot.ctruong.scorekeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var i: Int = 0
    private var j: Int = 0
    private var round: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        score_red.setOnClickListener {
            i++
            score_num_red.update(i.toString())
            round++
            round_number.update(round.toString())
        }

        score_blue.setOnClickListener {
            j++
            score_num_blue.update(j.toString())
            round++
            round_number.update(round.toString())
        }

        reset.setOnClickListener {
            i = 0
            j = 0
            round = 0
            score_num_red.update(i.toString())
            score_num_blue.update(j.toString())
            round_number.update(round.toString())
        }
    }

    private fun TextView.update(text: String) {
        this.text = text
    }
}
