package com.example.project2wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    var items = mutableListOf<wishlist>()

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val RecyclerView = findViewById<RecyclerView>(R.id.Recycler)
        val button = findViewById<Button>(R.id.button)
        val PriceEt = findViewById<EditText>(R.id.PriceEt)
        val ItemEt = findViewById<EditText>(R.id.ItemEt)
        val URLEt = findViewById<EditText>(R.id.URLEt)
        val wishlist = list_adapter(items)
        RecyclerView.adapter = wishlist
        RecyclerView.layoutManager = LinearLayoutManager( this)



        button.setOnClickListener {

            val userInputPrice = PriceEt.text.toString()
            val userInputProduct = ItemEt.text.toString()
            val userInputStore = URLEt.text.toString()
            val itemsInWishlist = wishlist(userInputProduct, userInputPrice, userInputStore)
            items.add(itemsInWishlist)
            wishlist.notifyItemInserted(items.size - 1)
            PriceEt.text.clear()
            ItemEt.text.clear()
            URLEt.text.clear()
        }
    }
}