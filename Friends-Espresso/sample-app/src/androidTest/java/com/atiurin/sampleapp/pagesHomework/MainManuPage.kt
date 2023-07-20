package com.atiurin.sampleapp.pagesHomework

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import org.hamcrest.CoreMatchers
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object MainManuPage {
    val radioBtnInvisible: Matcher<View> by lazy { ViewMatchers.withId(R.id.invisible) }
    val radioBtnVisible: Matcher<View> by lazy { ViewMatchers.withText("VISIBLE") }

    val mainManuBtn: Matcher<View> by lazy {
        Matchers.allOf(
            ViewMatchers.withId(R.id.toolbar),
            ViewMatchers.withClassName(CoreMatchers.`is`("android.widget.ImageButton")))

    }
}