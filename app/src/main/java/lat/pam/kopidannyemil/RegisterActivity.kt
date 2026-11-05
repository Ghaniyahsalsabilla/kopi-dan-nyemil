package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val etName = findViewById<EditText>(R.id.etName)
        val etUsername = findViewById<EditText>(R.id.etUsername)
        val etPassword = findViewById<EditText>(R.id.etPassword)

        val btnRegister = findViewById<Button>(
            R.id.btnRegisterAccount
        )

        val btnGoLogin = findViewById<Button>(
            R.id.btnGoLogin
        )

        btnRegister.setOnClickListener {

            val name = etName.text.toString().trim()
            val username = etUsername.text.toString().trim()
            val password = etPassword.text.toString()

            if (name.isEmpty() || username.isEmpty() || password.isEmpty()) {
                Toast.makeText(
                    this,
                    "Semua kolom harus diisi!",
                    Toast.LENGTH_SHORT
                ).show()

            } else if (password.length < 6) {
                Toast.makeText(
                    this,
                    "Password minimal 6 karakter!",
                    Toast.LENGTH_SHORT
                ).show()

            } else {

                val sharedPreferences = getSharedPreferences(
                    "UserData",
                    MODE_PRIVATE
                )

                sharedPreferences.edit()
                    .putString("name", name)
                    .putString("username", username)
                    .putString("password", password)
                    .apply()

                Toast.makeText(
                    this,
                    "Registrasi berhasil!",
                    Toast.LENGTH_SHORT
                ).show()

                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

        btnGoLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
