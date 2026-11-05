package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etUsername = findViewById<EditText>(
            R.id.etLoginUsername
        )

        val etPassword = findViewById<EditText>(
            R.id.etLoginPassword
        )

        val btnLogin = findViewById<Button>(
            R.id.btnLoginAccount
        )

        val btnRegister = findViewById<Button>(
            R.id.btnGoRegister
        )

        btnLogin.setOnClickListener {

            val username = etUsername.text.toString().trim()
            val password = etPassword.text.toString()

            val sharedPreferences = getSharedPreferences(
                "UserData",
                MODE_PRIVATE
            )

            val savedUsername = sharedPreferences.getString(
                "username",
                ""
            )

            val savedPassword = sharedPreferences.getString(
                "password",
                ""
            )

            if (username.isEmpty() || password.isEmpty()) {

                Toast.makeText(
                    this,
                    "Username dan password harus diisi!",
                    Toast.LENGTH_SHORT
                ).show()

            } else if (
                username == savedUsername &&
                password == savedPassword
            ) {

                Toast.makeText(
                    this,
                    "Login berhasil!",
                    Toast.LENGTH_SHORT
                ).show()

                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish()

            } else {

                Toast.makeText(
                    this,
                    "Username atau password salah!",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        btnRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
