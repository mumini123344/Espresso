package com.atiurin.sampleapp.stepsHomework

import com.atiurin.sampleapp.helper.tap
import com.atiurin.sampleapp.pagesHomework.MainManuPage

object MainManuSteps {

    fun burgerManuTap(){
        with(MainManuPage){
            mainManuBtn.tap()

        }
    }
}