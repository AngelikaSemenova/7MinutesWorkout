package com.marquiseanges.a7minutesworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marquiseanges.a7minutesworkout.databinding.ActivityExerciseBinding
import com.marquiseanges.a7minutesworkout.databinding.ActivityFinishBinding

class FinishActivity : AppCompatActivity() {
    //Todo 1: Create a binding variable
    private var binding: ActivityFinishBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//Todo 2: inflate the layout
        binding = ActivityFinishBinding.inflate(layoutInflater)
//Todo 3: bind the layout to this Activity
        setContentView(binding?.root)
//Todo 4: attach the layout to this activity
        setSupportActionBar(binding?.toolbarFinishActivity)
        if (supportActionBar != null) {
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }
        binding?.toolbarFinishActivity?.setNavigationOnClickListener {
            onBackPressed()
        }
        //END

        //TODO(Step 6 : Adding a click event to the Finish Button.)
        //START
        binding?.btnFinish?.setOnClickListener {
            finish()
        }
    }
}