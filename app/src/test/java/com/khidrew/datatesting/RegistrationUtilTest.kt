package com.khidrew.datatesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{



    @Test
    fun `empty userName returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "mohamed",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            RegistrationUtil.existingUsers[0],
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "mohamed",
            "",
            ""
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `password was repeated incorrectly`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "mohamed",
            "123",
            "1234"
        )

        assertThat(result).isFalse()
    }


    @Test
    fun `password contains less than 2 digits`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "mohamed",
            "1",
            "1"
        )

        assertThat(result).isFalse()
    }

}