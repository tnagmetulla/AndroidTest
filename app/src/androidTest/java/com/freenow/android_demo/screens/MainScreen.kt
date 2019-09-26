package com.freenow.android_demo.screens

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

    fun openNavigationMenu(){

    }


    /**
     * ASSERTIONS
     */

    fun hasUsername( username : String) {

    }
}