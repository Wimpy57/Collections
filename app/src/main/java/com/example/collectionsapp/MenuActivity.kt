package com.example.collectionsapp

import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.collectionsapp.activities.MyCollectionsActivity
import com.example.collectionsapp.activities.SettingsActivity
import com.example.collectionsapp.activities.UserProfileActivity

abstract class MenuActivity : AppCompatActivity() {
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.profileButton -> changeActivity(UserProfileActivity::class.java)
            R.id.myCollectionsButton -> changeActivity(MyCollectionsActivity::class.java)
            R.id.settingsButton -> changeActivity(SettingsActivity::class.java)
        }
        return super.onOptionsItemSelected(item)
    }

    private fun changeActivity(cls: Class<*>) {
        if (this::class.java != cls) {
            val intent = Intent(applicationContext, cls)
            startActivity(intent)
        }
    }
}