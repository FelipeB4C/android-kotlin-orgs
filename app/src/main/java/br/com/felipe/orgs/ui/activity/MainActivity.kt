package br.com.felipe.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.felipe.orgs.R
import br.com.felipe.orgs.model.Produto
import br.com.felipe.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
/*        val nome = findViewById<TextView>(R.id.nome)
        nome.text = "Cesta de frutas"

        val descricao = findViewById<TextView>(R.id.descricao)
        descricao.text = "Laranja, manga e maçã"

        val valor = findViewById<TextView>(R.id.valor)
        valor.text = "19.90"*/

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(context = this, produtos = listOf(
            Produto(nome = "Maçã", descricao = "Verde", valor = BigDecimal("4.90")),
            Produto(nome = "Banana", descricao = "Nanica", valor = BigDecimal("2.50")),
            Produto(nome = "Uva", descricao = "Sem caroço", valor = BigDecimal("7.00")),
        ))

        //recyclerView.layoutManager = LinearLayoutManager(this)

    }

}