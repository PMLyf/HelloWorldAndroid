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

        /**
         * Step 3 - Open the Project structure and expand the Resource ("res") directory.
         * Create a new directory called 'layout' in the Resource directory. This is a directory for xml layouts.
         * Right click on the directory Layout.
         * In the drop down select New >  Layout Resource File
         * Name the file 'main_activity_view'
         * You can name this file anything but it's suggested to name the view close to the activity (or fragment) that controls the ui.
         * In this case, "Main.kt" will be the UI controller for this view.
         *
         *
         * Use setContentView(PATH TO YOUR LAYOUT) in the onCreate method
         * R - Resource
            l - Layout
            main_activity_view -  The name you gave to an XML layout file
         *
         * */
        setContentView(R.layout.main_activity_view)

    }
}