package com.estudos.dayane.projetoweb.entities;

import com.estudos.dayane.projetoweb.enums.PedidoStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.Instant;
import java.util.Objects;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant momento;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Usuario cliente;

    private Integer pedidoStatus;

    public Pedido(){}

    public Pedido(Long id, Instant momento, Usuario cliente, PedidoStatus pedidoStatus) {
        this.id = id;
        this.momento = momento;
        this.cliente = cliente;
        setPedidoStatus(pedidoStatus);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMomento() {
        return momento;
    }

    public void setMomento(Instant momento) {
        this.momento = momento;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    public PedidoStatus getPedidoStatus(){
        return PedidoStatus.valueOf(pedidoStatus);
    }
    public void setPedidoStatus(PedidoStatus pedidoStatus){
        if(pedidoStatus != null) {
            this.pedidoStatus = pedidoStatus.getCode();
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return Objects.equals(id, pedido.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
