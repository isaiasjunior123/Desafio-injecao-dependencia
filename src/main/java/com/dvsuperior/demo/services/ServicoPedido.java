package com.dvsuperior.demo.services;

import org.springframework.stereotype.Service;

import com.dvsuperior.demo.entities.Pedido;


@Service
public class ServicoPedido {
    public double calcularValorTotalPedido(Pedido pedido) {
        return pedido.getValorBasico() - pedido.getPorcentagemDesconto();
    }
}
