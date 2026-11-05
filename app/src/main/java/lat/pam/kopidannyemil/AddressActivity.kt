package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AddressActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_address)

        val tvSelectedProduct =
            findViewById<TextView>(R.id.tvSelectedProduct)

        val etReceiver = findViewById<EditText>(R.id.etReceiver)
        val etPhone = findViewById<EditText>(R.id.etPhone)
        val etAddress = findViewById<EditText>(R.id.etAddress)

        val btnContinueOrder =
            findViewById<Button>(R.id.btnContinueOrder)

        val productName = intent.getStringExtra("product_name") ?: ""
        val productPrice = intent.getStringExtra("product_price") ?: ""

        tvSelectedProduct.text = "$productName - $productPrice"

        btnContinueOrder.setOnClickListener {

            val receiver = etReceiver.text.toString().trim()
            val phone = etPhone.text.toString().trim()
            val address = etAddress.text.toString().trim()

            if (receiver.isEmpty() || phone.isEmpty() || address.isEmpty()) {

                Toast.makeText(
                    this,
                    "Lengkapi semua data alamat terlebih dahulu",
                    Toast.LENGTH_SHORT
                ).show()

            } else {

                val intent = Intent(this, ConfirmationActivity::class.java)

                intent.putExtra("product_name", productName)
                intent.putExtra("product_price", productPrice)
                intent.putExtra("receiver", receiver)
                intent.putExtra("phone", phone)
                intent.putExtra("address", address)

                startActivity(intent)
            }
        }
    }
}
