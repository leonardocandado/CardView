package cursoandroid.kotlin.com.cardview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cursoandroid.kotlin.com.cardview.R
import cursoandroid.kotlin.com.cardview.adapter.PostagemAdapter
import cursoandroid.kotlin.com.cardview.model.Postagem

class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerViewPostagem = findViewById<RecyclerView>(R.id.recyclerView_Postagem)
        val layoutManager = LinearLayoutManager(this)
        recyclerViewPostagem.layoutManager = layoutManager
        recyclerViewPostagem.adapter = PostagemAdapter(mockkList())
    }

    private fun mockkList(): List<Postagem> {
        return listOf(
            Postagem(
                nome = "Leonardo",
                postagem = "#tbt",
                imagem = R.drawable.imagem1
            ),
            Postagem(
                nome = "Pedro",
                postagem = "#tbt",
                imagem = R.drawable.imagem2
            ),
            Postagem(
                nome = "Carina",
                postagem = "#tbt",
                imagem = R.drawable.imagem3
            ),
            Postagem(
                nome = "Olivia",
                postagem = "#tbt",
                imagem = R.drawable.imagem4
            )
        )
    }
}