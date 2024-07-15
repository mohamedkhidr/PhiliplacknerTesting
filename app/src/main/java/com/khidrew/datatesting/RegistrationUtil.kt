package com.khidrew.datatesting

object RegistrationUtil {

    val existingUsers = listOf(
        "Peter",
        "Carl"
    )

    /**
     * The input is not valid if...
     * ... The userName/password is empty
     * ... The userName is already taken
     * ... The confirmed password is not the same as the real password
     * ... The password contains less than 2 digits
     */
    fun validateRegistrationInput(
        userName: String,
        password: String,
        confirmedPassword: String
    ) : Boolean{
        if(userName.isEmpty() || password.isEmpty())
            return false

        if(userName in existingUsers)
            return false

        if(password != confirmedPassword)
            return false
        if(password.count { it.isDigit() } < 2)
            return false

        return true
    }
}