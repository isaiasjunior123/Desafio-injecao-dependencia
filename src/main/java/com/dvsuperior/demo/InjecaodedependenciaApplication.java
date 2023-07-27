package com.dvsuperior.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dvsuperior.demo.entities.Pedido;
import com.dvsuperior.demo.services.ServicoPedido;

@SpringBootApplication
public class InjecaodedependenciaApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(InjecaodedependenciaApplication.class, args);

		// Obtém o bean do ServicoPedido do contexto
		ServicoPedido servicoPedido = context.getBean(ServicoPedido.class);

		// Cria os pedidos
		Pedido pedido1 = new Pedido(1034L, 150.0, 20.0);
		Pedido pedido2 = new Pedido(2282L, 800.0, 10.0);
		Pedido pedido3 = new Pedido(1309L, 95.90, 0.0);

		// Calcula o valor total de cada pedido usando o ServicoPedido
		double valorTotal1 = servicoPedido.calcularValorTotalPedido(pedido1);
		double valorTotal2 = servicoPedido.calcularValorTotalPedido(pedido2);
		double valorTotal3 = servicoPedido.calcularValorTotalPedido(pedido3);

		// Exibe os resultados
		System.out.println("Pedido código " + pedido1.getCodigo());
		System.out.println("Valor total: R$ " + valorTotal1);

		System.out.println("Pedido código " + pedido2.getCodigo());
		System.out.println("Valor total: R$ " + valorTotal2);

		System.out.println("Pedido código " + pedido3.getCodigo());
		System.out.println("Valor total: R$ " + valorTotal3);

		// Fecha o contexto da aplicação
		context.close();
	}

}
