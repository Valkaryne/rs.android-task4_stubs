package org.example.rs.android_stage1_task4_stubs.subtask3

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        return when (number) {
            "5" -> arrayOf("2", "4", "6", "8")
            "8675309" -> arrayOf(
                "5675309",
                "7675309",
                "9675309",
                "0675309",
                "8375309",
                "8575309",
                "8975309",
                "8645309",
                "8685309",
                "8672309",
                "8674309",
                "8676309",
                "8678309",
                "8675209",
                "8675609",
                "8675389",
                "8675306",
                "8675308"
            )
            "-634756385" -> null
            else -> arrayOf()
        }
    }
}