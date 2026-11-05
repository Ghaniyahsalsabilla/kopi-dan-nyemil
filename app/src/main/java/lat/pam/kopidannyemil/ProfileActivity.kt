package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val tvProfileName = findViewById<TextView>(R.id.tvProfileName)
        val tvProfileUsername = findViewById<TextView>(R.id.tvProfileUsername)
        val btnLogout = findViewById<Button>(R.id.btnLogout)
        val btnBackHome = findViewById<Button>(R.id.btnBackHome)

        btnBackHome.setOnClickListener {
            finish()
        }

        val preferences = getSharedPreferences("UserData", MODE_PRIVATE)

        val name = preferences.getString("name", "Pengguna")
        val username = preferences.getString("username", "-")

        tvProfileName.text = name
        tvProfileUsername.text = username

        btnLogout.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or
                    Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()
        }
    }
}
