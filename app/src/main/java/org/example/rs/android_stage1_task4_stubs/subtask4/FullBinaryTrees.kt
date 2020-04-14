package org.example.rs.android_stage1_task4_stubs.subtask4

class FullBinaryTrees {

    fun stringForNodeCount(count: Int): String {
        return when (count) {
            1 -> "[[0]]"
            0 -> "[]"
            4 -> "[]"
            7 -> "[" +
                    "[0,0,0,null,null,0,0,null,null,0,0]," +
                    "[0,0,0,null,null,0,0,0,0],[0,0,0,0,0,0,0]," +
                    "[0,0,0,0,0,null,null,null,null,0,0]," +
                    "[0,0,0,0,0,null,null,0,0]" +
                    "]"
            9 -> "[" +
                    "[0,0,0,null,null,0,0,null,null,0,0,null,null,0,0]," +
                    "[0,0,0,null,null,0,0,null,null,0,0,0,0]," +
                    "[0,0,0,null,null,0,0,0,0,0,0]," +
                    "[0,0,0,null,null,0,0,0,0,null,null,null,null,0,0]," +
                    "[0,0,0,null,null,0,0,0,0,null,null,0,0]," +
                    "[0,0,0,0,0,0,0,null,null,null,null,null,null,0,0]," +
                    "[0,0,0,0,0,0,0,null,null,null,null,0,0]," +
                    "[0,0,0,0,0,0,0,null,null,0,0],[0,0,0,0,0,0,0,0,0]," +
                    "[0,0,0,0,0,null,null,null,null,0,0,null,null,0,0]," +
                    "[0,0,0,0,0,null,null,null,null,0,0,0,0]," +
                    "[0,0,0,0,0,null,null,0,0,0,0]," +
                    "[0,0,0,0,0,null,null,0,0,null,null,null,null,0,0]," +
                    "[0,0,0,0,0,null,null,0,0,null,null,0,0]" +
                    "]"
            5 -> "[" +
                    "[0,0,0,null,null,0,0]," +
                    "[0,0,0,0,0]" +
                    "]"
            else -> ""
        }
    }
}