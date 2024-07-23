package com.example.busflow

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val logoutButton = findViewById<Button>(R.id.logoutButton)
        logoutButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
        val startRouteButton = findViewById<Button>(R.id.startRouteButton)
        startRouteButton.setOnClickListener {
            val intent = Intent(this, DriverAssistantActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
