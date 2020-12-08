package com.dicoding.picodiploma.barvolume

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest{

    @Before
    fun setup(){
        ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun testGetCircumference() {
        onView(withId(R.id.edt_length)).perform(typeText("1"), closeSoftKeyboard())
        onView(withId(R.id.edt_width)).perform(typeText("2"), closeSoftKeyboard())
        onView(withId(R.id.edt_height)).perform(typeText("3"), closeSoftKeyboard())

        onView(withId(R.id.btn_calculate)).check(matches(isDisplayed()))
        onView(withId(R.id.btn_calculate)).perform(click())

        onView(withId(R.id.tv_result)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_result)).check(matches(withText("6.0")))
    }
}


