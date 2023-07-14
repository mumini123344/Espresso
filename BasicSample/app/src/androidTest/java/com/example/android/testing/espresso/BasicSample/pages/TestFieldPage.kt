package com.example.android.testing.espresso.BasicSample.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.example.android.testing.espresso.BasicSample.R
import org.hamcrest.Matcher

object TestFieldPage {

    val TextInputField: Matcher<View> by lazy { ViewMatchers.withId(R.id.editTextUserInput) }
    val ChangeText: Matcher<View> by lazy { ViewMatchers.withId(R.id.changeTextBt) }
    val TextToBeChanged: Matcher<View> by lazy { ViewMatchers.withId(R.id.textToBeChanged) }
    val OpenActivity: Matcher<View> by lazy { ViewMatchers.withId(R.id.activityChangeTextBtn) }
    val ShowTextView: Matcher<View> by lazy { ViewMatchers.withId(R.id.show_text_view) }
}






