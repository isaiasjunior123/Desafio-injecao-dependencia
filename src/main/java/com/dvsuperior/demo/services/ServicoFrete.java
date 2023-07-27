package com.dvsuperior.demo.services;

import org.springframework.stereotype.Service;

@Service
public class ServicoFrete {
    public double calcularValorFrete(double valorPedido) {
        if (valorPedido < 100.0) {
            return 20.0;
        } else if (valorPedido < 200.0) {
            return 12.0;
        } else {
            return 0.0;
        }
    }
}
