package com.freenow.android_demo.screens

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.RootMatchers
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.agoda.kakao.edit.KEditText
import com.agoda.kakao.screen.Screen
import com.freenow.android_demo.R

object MainScreen:Screen<MainScreen>() {

    /**
     * VIEWS
     */

    val searchEditText = KEditText{withId(R.id.textSearch)}

    /**
     * ACTIONS
     */

    fun searchFor(query:String){
        searchEditText{
            Thread.sleep(2000) /** hack to wait fetching drivers*/
            clearText()
            typeText(query)
        }
    }

    fun clickOnItem(query: String){
        onView(withText(query))
            .inRoot(RootMatchers.isPlatformPopup())
            .perform(click())
    }
}
