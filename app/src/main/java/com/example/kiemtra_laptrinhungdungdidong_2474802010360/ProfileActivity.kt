
package com.example.kiemtra_laptrinhungdungdidong_2474802010360

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    private lateinit var tvEmail: TextView
    private lateinit var btnLogout: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Ánh xạ bằng findViewById
        tvEmail = findViewById(R.id.tvEmail)
        btnLogout = findViewById(R.id.btnLogout)

        // Nhận Email từ LoginActivity
        val email = intent.getStringExtra("EMAIL")

        // Hiển thị Email
        tvEmail.text = "Email: ${email ?: ""}"

        // Xử lý đăng xuất
        btnLogout.setOnClickListener {
            finish()
        }
    }
}
