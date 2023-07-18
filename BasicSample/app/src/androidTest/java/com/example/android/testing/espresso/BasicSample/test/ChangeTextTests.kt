package com.example.android.testing.espresso.BasicSample.test

import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.example.android.testing.espresso.BasicSample.MainActivity
import com.example.android.testing.espresso.BasicSample.steps.TestFieldSteps
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChangeTextTests {

    @get:Rule
    var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun printedName() {
        with(TestFieldSteps) {
            enterName("Rati Shatirishvili")
        }
    }

    @Test
    fun printedCandy() {
        with(TestFieldSteps) {
            enterCandy("Chocolate")
        }
    }
}