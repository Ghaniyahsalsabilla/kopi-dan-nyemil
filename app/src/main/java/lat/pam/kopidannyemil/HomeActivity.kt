package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val tvGreeting = findViewById<TextView>(R.id.tvGreeting)
        val rvProducts = findViewById<RecyclerView>(R.id.rvProducts)

        val preferences = getSharedPreferences(
            "UserData",
            MODE_PRIVATE
        )

        val name = preferences.getString("name", "Pengguna")
        tvGreeting.text = "Halo, $name!"

        val products = listOf(
            Product("Kopi Gula Aren", "Rp 25.000", R.drawable.kopi_gula_aren),
            Product("Butterscotch Latte", "Rp 27.000", R.drawable.butterscotch_latte),
            Product("Chocolate", "Rp 22.000", R.drawable.chocolate),
            Product("Matcha Latte", "Rp 27.000", R.drawable.matcha_latte),
            Product("Brownie with Ice Cream", "Rp 30.000", R.drawable.brownie_with_ice_cream),
            Product( name = "Croissants", price = "Rp 18.000", image = R.drawable.croissants)
        )

        rvProducts.layoutManager = GridLayoutManager(this, 2)

        rvProducts.adapter = ProductAdapter(products) { product ->
            val intent = Intent(this, AddressActivity::class.java)
            intent.putExtra("product_name", product.name)
            intent.putExtra("product_price", product.price)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnHome).setOnClickListener {
            rvProducts.smoothScrollToPosition(0)
        }

        findViewById<Button>(R.id.btnOrder).setOnClickListener {
            Toast.makeText(
                this,
                "Pilih produk terlebih dahulu",
                Toast.LENGTH_SHORT
            ).show()
        }

        findViewById<Button>(R.id.btnProfile).setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}
