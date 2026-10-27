package com.example.kiemtra_laptrinhungdungdidong_2474802010360

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    private lateinit var tvEmail: TextView
    private lateinit var btnLogout: Button
    private lateinit var listViewSkills: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Ánh xạ giao diện
        tvEmail = findViewById(R.id.tvEmail)
        btnLogout = findViewById(R.id.btnLogout)
        listViewSkills = findViewById(R.id.listViewSkills)

        // Nhận Email từ LoginActivity
        val email = intent.getStringExtra("EMAIL")
        tvEmail.text = "Email: ${email ?: ""}"

        // Xử lý đăng xuất
        btnLogout.setOnClickListener {
            finish()
        }

        // Danh sách 5 kỹ năng
        val skills = listOf(
            "Lập trình Kotlin",
            "Thiết kế Layout XML",
            "Quản lý Git/GitHub",
            "Xử lý Intent",
            "Kiến trúc Android"
        )

        // Gắn ArrayAdapter cho ListView
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            skills
        )

        listViewSkills.adapter = adapter

        // Xử lý khi chọn một kỹ năng
        listViewSkills.setOnItemClickListener {
                _, _, position, _ ->

            Toast.makeText(
                this,
                "Bạn chọn: ${skills[position]}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
