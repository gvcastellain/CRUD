package dev.crud.service;

import dev.crud.model.Produto;
import dev.crud.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> ListarProdutos() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> BuscarProdutoPorId(Long id) {
        return produtoRepository.findById(Math.toIntExact(id));
    }

    public Produto SalvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public void deletarProduto(Long id) {
        produtoRepository.deleteById(Math.toIntExact(id));
    }
}
