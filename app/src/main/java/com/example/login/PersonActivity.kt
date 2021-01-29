package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth

class PersonActivity : AppCompatActivity() {

    private lateinit var personRoomTextView: TextView
    private lateinit var passwordChangeButton: Button
    private lateinit var logOutButton: Button

    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_person)

        mAuth = FirebaseAuth.getInstance()

        personRoomTextView = findViewById(R.id.cabinetTextView)
        passwordChangeButton = findViewById(R.id.goToPasswordChangeButton)
        logOutButton = findViewById(R.id.logOutButton)

        passwordChangeButton.setOnClickListener {
            startActivity(Intent(this, PasswordChangeActivity::class.java))
        }

        logOutButton.setOnClickListener {
            mAuth.signOut()
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

    }

}