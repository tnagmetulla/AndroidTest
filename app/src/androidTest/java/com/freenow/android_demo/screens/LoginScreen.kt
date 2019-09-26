package com.freenow.android_demo.screens

import com.agoda.kakao.edit.KEditText
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import com.freenow.android_demo.R
import com.freenow.android_demo.models.TestUser

object LoginScreen: Screen<LoginScreen>() {

    /**
     * VIEWS
     */

    val usernameEditText = KEditText{withId(R.id.edt_username)}
    val passwordEditText = KEditText{withId(R.id.edt_password)}
    val loginButton = KButton{withId(R.id.btn_login)}

    /**
     * ACTIONS
     */

    fun enterCredetials(tester:TestUser){
        usernameEditText{
            clearText()
            typeText(tester.username)
        }
        passwordEditText{
            clearText()
            typeText(tester.password)
        }
    }

}
