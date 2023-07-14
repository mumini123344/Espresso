package com.example.android.testing.espresso.BasicSample.steps

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import com.example.android.testing.espresso.BasicSample.getText

import com.example.android.testing.espresso.BasicSample.pages.TestFieldPage.ChangeText
import com.example.android.testing.espresso.BasicSample.pages.TestFieldPage.LogOutButtonMatcher

import com.example.android.testing.espresso.BasicSample.pages.TestFieldPage.OpenActivity
import com.example.android.testing.espresso.BasicSample.pages.TestFieldPage.ShowTextView
import com.example.android.testing.espresso.BasicSample.pages.TestFieldPage.TextInputField
import com.example.android.testing.espresso.BasicSample.pages.TestFieldPage.TextToBeChanged
import com.example.android.testing.espresso.BasicSample.tap
import com.example.android.testing.espresso.BasicSample.typeText
import com.example.android.testing.espresso.BasicSample.wait
import org.junit.Assert

object TestFieldSteps {


    fun enterName(text: String) {
        with(TestFieldSteps) {
            TextInputField.typeText(text)
            ChangeText.tap(5)

            Assert.assertEquals(TextToBeChanged.getText(), text)

        }
    }

    fun enterCandy(text: String) {
        with(TestFieldSteps) {
            TextInputField.typeText(text)
            OpenActivity.tap(5)

            Assert.assertEquals(ShowTextView.getText(), text)
        }
    }
}