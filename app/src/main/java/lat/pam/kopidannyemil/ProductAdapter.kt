package lat.pam.kopidannyemil

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductAdapter(
    private val products: List<Product>,
    private val onBuyClick: (Product) -> Unit
) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    class ProductViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        val image: ImageView =
            itemView.findViewById(R.id.ivProduct)

        val name: TextView =
            itemView.findViewById(R.id.tvProductName)

        val price: TextView =
            itemView.findViewById(R.id.tvProductPrice)

        val buy: Button =
            itemView.findViewById(R.id.btnBuy)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProductViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_product, parent, false)

        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ProductViewHolder,
        position: Int
    ) {

        val product = products[position]

        holder.image.setImageResource(product.image)
        holder.name.text = product.name
        holder.price.text = product.price

        holder.buy.setOnClickListener {
            onBuyClick(product)
        }
    }

    override fun getItemCount(): Int {
        return products.size
    }
}
