package cursoandroid.kotlin.com.cardview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import cursoandroid.kotlin.com.cardview.R
import cursoandroid.kotlin.com.cardview.model.Postagem

class PostagemAdapter(
    val postagens: List<Postagem>
) : RecyclerView.Adapter<PostagemAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.postagem_detalhe, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val post = postagens[position]
        holder.bindView(post)
    }

    override fun getItemCount() = postagens.size

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(post: Postagem) = with(itemView) {
            val tvNome = findViewById<TextView>(R.id.textView_nome)
            val tvPostagem = findViewById<TextView>(R.id.textView_postagem)
            val ivImagem = findViewById<ImageView>(R.id.imageView_Post)
            tvNome.text = post.nome
            tvPostagem.text = post.postagem
            ivImagem.setImageResource(post.imagem)
        }
    }
}




