package com.example.listviewicon

object dataArray {

    private val languages = listOf("Ruby","Ralls","Python","JavaScript","PHP")

    val desk = listOf(
        "Ruby is an open-source and fully object oriented programming language",
        "Ruby on Ralls is a server-side web application development framework written in Ruby language",
        "Pyhton is interpreted scripting and object-oriented programming language",
        "JavaScript is an object-based scripting language",
        "PHP is an interpreted language, compilation"
    )

    private val pictDat = intArrayOf(
        R.drawable.ruby,
        R.drawable.rails,
        R.drawable.python,
        R.drawable.js,
        R.drawable.php
    )
    val listData : ArrayList<Aturarray>
        get() {
            val list = arrayListOf<Aturarray>()
            for (position in languages.indices){
                val listDat =Aturarray()
                listDat.name = languages[position]
                listDat.detail = desk[position]
                listDat.pict = pictDat[position]
                list.add(listDat)
            }
            return list
        }
}