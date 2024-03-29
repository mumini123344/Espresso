package com.atiurin.sampleapp.tests.espresso

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.dataHomework.Data
import com.atiurin.sampleapp.dataHomework.Data.screenText
import com.atiurin.sampleapp.dataHomework.Data.sendText
import com.atiurin.sampleapp.helper.isTextOnScreen
import com.atiurin.sampleapp.helper.scrollSlowlyDown
import com.atiurin.sampleapp.stepsHomework.FriendsSteps
import com.atiurin.sampleapp.stepsHomework.MainManuSteps
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChattingTests {

    @get:Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testOne() {
        isTextOnScreen(screenText)
        Thread.sleep(5000) //ჩემთან სლიფების გარეშე ვერასწრებს აპი გახსნას და თქვენთან შეიძლება არ დასჭირდეს
        with(FriendsSteps) {
            openChat()
            checkChatIsCorrect()
            enterText(sendText)
            checkEnteredText(sendText)
            sendWrittenMessage()
        }
    }

    @Test
    fun TestTwo() {
        isTextOnScreen(screenText)
        Thread.sleep(5000)
        with(MainManuSteps) {
        }

    }

    @Test
    fun TestThree(){
        with(FriendsSteps){
            validationMainPage()
            Thread.sleep(5000)
            findEmma()
            openEmmetChat()



        }
    }
}