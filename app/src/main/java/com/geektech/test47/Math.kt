package com.geektech.test47

import android.text.TextUtils.replace

class Math {
    fun add(a: String, b: String): String {
        var result = " "
        if (b == "" || a == "") {
            result = "Поле не заполнено"
        } else if (a.contains(".") || b.contains(".")) {
            val num1 = a.replaceAfter(".", "").replace(".", "").toInt()
            val num2 = b.replaceAfter(".", "").replace(".", "").toInt()
            result = (num1 + num2).toString()
        }else if (a.contains(Regex("[a-z]"))||b.contains(Regex("[a-z]"))) {
            result = "буквы не скдадываются "
        }else if (a.contains("-") || b.contains("-")) {
                result = "Нельзя закидывать отрицательное"
        } else if (a.contains(Regex("[a-z]"))||b.contains(Regex("[a-z]"))) {
                result = "Буквы не складываются"
            } else {
                result = (a.trim().toInt() + b.trim().toInt()).toString()
            }
            return result

    }


    fun divide(num1: String, num2: String): String {
        val result:String
        if (num2 == "0") {
            result = "Делить на ноль нельзя"
        } else {
            result = (num1.trim().toInt() / num2.trim().toInt()).toString()
        }
        return result
    }

}