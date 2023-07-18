package com.sopan.espresso_ui_test

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.activityScenarioRule
import org.junit.Rule
import org.junit.Test

class InputTextActivityTest {

    @get:Rule
    val activityScenario = activityScenarioRule<InputTextActivity>()

    @Test
    fun textTextSubmitButtonExpectedValues(){
        onView(withId(R.id.title)).perform(typeText("Hello"))
        onView(withId(R.id.description)).perform(typeText("Sopan"), closeSoftKeyboard())
        onView(withId(R.id.btnSubmit)).perform(click())

        onView(withId(R.id.output)).check(matches(withText("Title - Hello | Desc - Sopan")))

    }
}