package com.freenow.android_demo.screens

import android.content.Intent
import com.agoda.kakao.edit.KEditText
import com.agoda.kakao.intent.KIntent
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KTextView
import com.freenow.android_demo.R
import com.freenow.android_demo.utils.awaitUntilAsserted

object DriversProfileScreen:Screen<DriversProfileScreen>() {

    /**
     * VIEWS
     */

    val callButton = KEditText{withId(R.id.fab)}
    val driverName = KTextView{withId(R.id.textViewDriverName)}

    /**
     * ACTIONS
     */

    fun callToDriver(){
        awaitUntilAsserted { callButton.isDisplayed() }
        callButton.click()
    }

    /**
     * ASSERTIONS
     */

    fun hasName( name : String) {
        driverName.isDisplayed()
        driverName.hasText(name)
    }

    fun hasDialerIntent(){
        val dialIntent = KIntent{
            hasAction(Intent.ACTION_DIAL)
        }
        dialIntent.intended()
    }
}