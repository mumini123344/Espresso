package com.atiurin.sampleapp.stepsHomework

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.helper.swiper
import com.atiurin.sampleapp.helper.tap
import com.atiurin.sampleapp.helper.typeText
import com.atiurin.sampleapp.pagesHomework.FriendsPage
import com.atiurin.sampleapp.pagesHomework.FriendsPage.nameEmmet


object FriendsSteps {

    fun validationMainPage() {
        with(FriendsPage) {
            friendsTextMain.isViewDisplayed()
        }
    }

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

    fun openEmmetChat(){
        with(FriendsPage){
            nameEmmet.tap(5)
        }
    }

//    private fun swipeDown(){
//        swiper(300, 100, 15)
//    }
//
//    fun findFriend(){
//        var i = 1
//        while (nameEmmet.isViewDisplayed()){
//            swipeDown()
//            i++
//        }
//    }

    fun findEmma(){
        onView(withText("Emmet Brown")).perform(ViewActions.scrollTo()).check(ViewAssertions.matches(isDisplayed()));
    }





}