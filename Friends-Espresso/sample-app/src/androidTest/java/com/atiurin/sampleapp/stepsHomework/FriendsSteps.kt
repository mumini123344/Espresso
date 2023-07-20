package com.atiurin.sampleapp.stepsHomework

import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.helper.tap
import com.atiurin.sampleapp.helper.typeText
import com.atiurin.sampleapp.helper.waitForView
import com.atiurin.sampleapp.pagesHomework.FriendsPage

object FriendsSteps {


    fun openChat(){
        with(FriendsPage){
            nameChandler.tap(10)
        }
    }

    fun checkChatIsCorrect() {
        with(FriendsPage) {
            nameChandler.isViewDisplayed()
        }
    }


    fun enterText(text: String) {
        with(FriendsPage) {
            textInput.typeText(text)
        }
    }

    fun checkEnteredText(text: String) {
        with(FriendsPage) {
            messageInputText.matches(ViewMatchers.withText(text))
        }
    }

    fun sendWrittenMessage(){
        with(FriendsPage){
            sendMessage.tap()
        }
    }







}