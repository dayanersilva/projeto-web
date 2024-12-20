package com.estudos.dayane.projetoweb.config;

import com.estudos.dayane.projetoweb.entities.Categoria;
import com.estudos.dayane.projetoweb.entities.Pedido;
import com.estudos.dayane.projetoweb.entities.Produto;
import com.estudos.dayane.projetoweb.entities.Usuario;
import com.estudos.dayane.projetoweb.enums.PedidoStatus;
import com.estudos.dayane.projetoweb.repositories.CategoriaRepository;
import com.estudos.dayane.projetoweb.repositories.PedidoRepository;
import com.estudos.dayane.projetoweb.repositories.ProdutoRepository;
import com.estudos.dayane.projetoweb.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public void run(String... args) throws Exception {

        Produto p1 = new Produto(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Produto p2 = new Produto(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Produto p3 = new Produto(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Produto p4 = new Produto(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Produto p5 = new Produto(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

        Categoria cat1 = new Categoria(null, "Electronics");
        Categoria cat2 = new Categoria(null, "Books");
        Categoria cat3 = new Categoria(null, "Computers");

        categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        produtoRepository.saveAll(Arrays.asList(p1,p2, p3, p4,p5));

        p1.getCategorias().add(cat2);
        p2.getCategorias().add(cat1);
        p2.getCategorias().add(cat3);
        p3.getCategorias().add(cat3);
        p4.getCategorias().add(cat3);
        p5.getCategorias().add(cat2);

        produtoRepository.saveAll(Arrays.asList(p1,p2, p3, p4,p5));

        Usuario u1 = new Usuario(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        Usuario u2 = new Usuario(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
        repository.saveAll(Arrays.asList(u1, u2));

        Pedido o1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"), u1, PedidoStatus.PAGO);
        Pedido o2 = new Pedido(null, Instant.parse("2019-07-21T03:42:10Z"), u2, PedidoStatus.AGUARDANDO_PAGAMENTO);
        Pedido o3 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"), u1, PedidoStatus.AGUARDANDO_PAGAMENTO);

        pedidoRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
