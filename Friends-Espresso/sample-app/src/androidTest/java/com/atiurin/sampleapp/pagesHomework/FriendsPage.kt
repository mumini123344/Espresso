package com.atiurin.sampleapp.pagesHomework

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers


object FriendsPage {

    val friendsTextMain: Matcher<View> by lazy{ Matchers.allOf(ViewMatchers.withText("Friends"))}


    val nameChandler: Matcher<View> by lazy {
        Matchers.allOf(
            withId(R.id.tv_name),
            withText("Chandler Bing")
        )
    }

    val messageInputText: Matcher<View> by lazy {
        Matchers.allOf(
            withId(R.id.message_input_text),
            withText("Enter text")
        )
    }
    val textInput: Matcher<View> by lazy { Matchers.allOf(withId(R.id.message_input_text)) }
    val sendMessage: Matcher<View> by lazy { Matchers.allOf(withId(R.id.send_button)) }


    val nameEmmet: Matcher<View> by lazy {
        Matchers.allOf(
            withId(R.id.tv_name),
            withText("Emmet Brown")
        )
    }

}