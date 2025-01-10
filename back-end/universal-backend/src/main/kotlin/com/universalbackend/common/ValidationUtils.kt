package com.universalbackend.common

object ValidationUtils {
    fun isValidEmail(email: String): Boolean {
        return email.matches(Regex("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+\$"))
    }
}
