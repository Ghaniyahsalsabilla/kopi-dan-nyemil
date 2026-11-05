package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ConfirmationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmation)

        val tvConfirmProduct =
            findViewById<TextView>(R.id.tvConfirmProduct)

        val tvConfirmReceiver =
            findViewById<TextView>(R.id.tvConfirmReceiver)

        val tvConfirmPhone =
            findViewById<TextView>(R.id.tvConfirmPhone)

        val tvConfirmAddress =
            findViewById<TextView>(R.id.tvConfirmAddress)

        val btnConfirmOrder =
            findViewById<Button>(R.id.btnConfirmOrder)

        val btnBackHome =
            findViewById<Button>(R.id.btnBackHome)

        val productName = intent.getStringExtra("product_name") ?: "-"
        val productPrice = intent.getStringExtra("product_price") ?: "-"
        val receiver = intent.getStringExtra("receiver") ?: "-"
        val phone = intent.getStringExtra("phone") ?: "-"
        val address = intent.getStringExtra("address") ?: "-"

        tvConfirmProduct.text = "$productName - $productPrice"
        tvConfirmReceiver.text = "Nama: $receiver"
        tvConfirmPhone.text = "Telepon: $phone"
        tvConfirmAddress.text = "Alamat: $address"

        btnConfirmOrder.setOnClickListener {
            val intent = Intent(this, SuccessActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnBackHome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
            finish()
        }
    }
}
