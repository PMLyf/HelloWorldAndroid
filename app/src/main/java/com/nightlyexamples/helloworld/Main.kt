package com.nightlyexamples.helloworld

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

/**
 *
 *
 * This is the first in a series of example Android applications publicly available on github with a little flavor.*
 *
 * Purpose of this tutorial: Display a textView with "Hello World" Centered on an activity.
 *
 * The next example will be moving to use of a fragment instead of an activity.
 *
* **/


/**
 * Step 1- Main activity must extend AppCompatActivity()
 * */
class Main : AppCompatActivity(){
    /**
     * Step 2-  Override onCreate function.
     * */
    //CTRL + O
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

    }
}