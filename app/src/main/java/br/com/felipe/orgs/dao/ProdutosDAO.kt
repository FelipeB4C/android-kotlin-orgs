package br.com.felipe.orgs.dao

import br.com.felipe.orgs.model.Produto

class ProdutosDAO {

    fun adiciona(produto: Produto){
        produtos.add(produto)
    }

    fun buscaTodos(): List<Produto> {
       return produtos.toList()
    }

    companion object {
        private val produtos = mutableListOf<Produto>()
    }

}