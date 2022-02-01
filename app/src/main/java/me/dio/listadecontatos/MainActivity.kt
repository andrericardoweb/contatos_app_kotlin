package me.dio.listadecontatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val rvList: RecyclerView by lazy {
        //findViewById<RecyclerView>(R.id.rv_list)
        findViewById(R.id.rv_list)
    }

    private val adapter = ContactAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindViews()
        updateList()
    }

    private fun bindViews() {
        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)
    }

    private fun updateList() {
        adapter.updateList(
            arrayListOf(
                Contact("Andre Ricardo", "+55 82 97744-3311", "img.jpg"),
                Contact("Maria Caroline", "+55 82 91122-3388", "img.jpg"),
                Contact("José Ricardo", "+55 11 95468-2145", "img.jpg"),
                Contact("Sara Faria", "+55 11 98652-7852", "img.jpg"),
            )
        )
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.item_menu_1 -> {
                showToast("Menu 1")
                true
            }
            R.id.item_menu_2 -> {
                showToast("Menu 2")
                true
            }
            R.id.item_menu_3 -> {
                showToast("Menu 3")
                true
            }
            R.id.item_menu_4 -> {
                showToast("Menu 4")
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}