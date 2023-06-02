package br.senai.sp.jandira;

import java.util.Scanner;

public class combustivel_gasto {

	public static void main(String[] args) {
		
		System.out.println("-------------------------------");
		System.out.println("    CONSUMO DE COMBUSTÍVEL     ");
		System.out.println("-------------------------------");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual é o modelo do seu carro?");
		String modelo = teclado.nextLine();
		
		System.out.println("Qual é a autonomia do carro?");
		Double autonomia = teclado.nextDouble();
		
		System.out.println("Qual é a distância da viagem?");
		Double distancia = teclado.nextDouble();
		
		System.out.println("Qual é o preço do combustível?");
		Double preco = teclado.nextDouble();
	
		System.out.println("-------------------------------");
		System.out.println("        R E S U L T A D O      ");
		System.out.println("-------------------------------");
		
		System.out.println("Modelo do veículo: " + modelo);
		System.out.println("Autonomia do veículo: " + autonomia + "Km/l");
		System.out.println("Distância percorrida: " + distancia + "Km");
		System.out.println("Preço do combustível: " + "R$" + preco);
		
		double litros = (distancia / autonomia);
		double total = (litros * preco);
		
		System.out.println();
		
		System.out.println("--------------------------------");
		System.out.println("Quantidade de combustível utilizado: " + litros + "l");
		System.out.println("Total gasto com a viagem: " + "R$ " + total );
		System.out.println("--------------------------------");
		
		
		

	}

}
