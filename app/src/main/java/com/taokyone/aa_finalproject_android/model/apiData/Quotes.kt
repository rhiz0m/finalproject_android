package com.taokyone.aa_finalproject_android.model.apiData

// Model class for Character

data class Quotes(
    var q: String = "",
    var a: String = "",
) {
    override fun toString(): String {
        return "Quotes(q='$q', a='$a')"
    }
}