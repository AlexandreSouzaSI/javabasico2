package exercicios2;

import javax.swing.JOptionPane;

public class Codigos2 {

	// Exercicio 1 - Faça um Programa que peça dois números e imprima o maior deles.
	public static int maiorNumero() {
		String x = JOptionPane.showInputDialog("Informe um numero :");
		String y = JOptionPane.showInputDialog("Informe outro numero :");
		int m = 0;
		if ((Integer.valueOf(x)) > (Integer.valueOf(y))) {
			m = (Integer.valueOf(x));
		} else {
			m = (Integer.valueOf(y));
		}
		return m;
	}

	// Exercicio 2 - Faça um Programa que peça um valor e mostre na tela se o valor
	// é positivo ou negativo.
	public static String positivoNegativo() {
		String x = JOptionPane.showInputDialog("Informe um numero :");
		int m = (Integer.valueOf(x));
		String n;
		if (m % 2 == 0) {
			n = "O Numero é Par";
		} else {
			n = "O Numero é Impar";
		}
		return n;
	}

	// Exercicio 3 - Faça um Programa que verifique se uma letra digitada é "F" ou
	// "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
	public static String mf() {
		String x = JOptionPane.showInputDialog("Informe o sexo :");
		if (x.equalsIgnoreCase("F")) {
			x = "Feminino";
		} else if (x.equalsIgnoreCase("M")) {
			x = "Masculino";
		} else {
			x = "Sexo Invalido";

		}
		return x;
	}

	// Exercicio 4 - Faça um Programa que verifique se uma letra digitada é vogal ou
	// consoante
	public static String vc() {
		String x = JOptionPane.showInputDialog("Informe uma letra :");
		switch (x) {
		case "a":
			JOptionPane.showMessageDialog(null, "É Uma Vogal");
			break;
		case "e":
			JOptionPane.showMessageDialog(null, "É Uma Vogal");
			break;
		case "i":
			JOptionPane.showMessageDialog(null, "É Uma Vogal");
			break;
		case "o":
			JOptionPane.showMessageDialog(null, "É Uma Vogal");
			break;
		case "u":
			JOptionPane.showMessageDialog(null, "É Uma Vogal");
			break;
		default:
			JOptionPane.showMessageDialog(null, "É Uma Consoante");
			break;
		}
		return x;
	}

	// Exercicio 5 - pedir 2 notas e ver se esta aprovado ou não
	public static String media() {
		String x = JOptionPane.showInputDialog("Informe a primeira nota :");
		String y = JOptionPane.showInputDialog("Informe a segunda nota :");
		double m = ((Integer.valueOf(x) + (Integer.valueOf(y))) / 2);
		String i;
		if (m == 10) {
			i = "Aprovado com Distinção";
		} else if (m < 7) {
			i = "Reprovado";
		} else {
			i = "Aprovado";
		}
		return i;
	}

	static int a, b, c = 0;

	// Exercicio 6 - Faça um Programa que leia três números e mostre o maior deles.
	public static int maior() {
		String x = JOptionPane.showInputDialog("Informe um numero :");
		a = (Integer.valueOf(x));
		String y = JOptionPane.showInputDialog("Informe outro numero :");
		b = (Integer.valueOf(y));
		String z = JOptionPane.showInputDialog("Informe outro numero :");
		c = (Integer.valueOf(z));
		int s = 0;
		if ((Integer.valueOf(x) > (Integer.valueOf(y)) && (Integer.valueOf(x) > (Integer.valueOf(z))))) {
			s = (Integer.valueOf(x));
		} else if ((Integer.valueOf(y) > (Integer.valueOf(x)) && (Integer.valueOf(y) > (Integer.valueOf(z))))) {
			s = (Integer.valueOf(y));
		} else {
			s = (Integer.valueOf(z));
		}
		return s;
	}

	// Exercicio 7 - Faça um Programa que leia três números e mostre o maior e o
	// menor deles
	public static int menor() {
		int s, m = 0;
		if (a < b && a < c) {
			s = a;
		} else if (b < a && b < c) {
			s = b;
		} else {
			s = c;
		}
		return s;
	}

	// Exercicio 8 - Faça um programa que pergunte o preço de três produtos e
	// informe qual produto você deve comprar, sabendo que a decisão é sempre pelo
	// mais barato
	public static String comprar() {
		String x = JOptionPane.showInputDialog("Informe o preço do produto 1 :");
		String y = JOptionPane.showInputDialog("Informe o preço do produto 2 :");
		String z = JOptionPane.showInputDialog("Informe o preço do produto 3 :");
		String a;
		if ((Integer.valueOf(x) < (Integer.valueOf(y)) && (Integer.valueOf(x) < (Integer.valueOf(z))))) {
			a = "Voce deve comprar o produto 1";
		} else if ((Integer.valueOf(y) < (Integer.valueOf(x)) && (Integer.valueOf(y) < (Integer.valueOf(z))))) {
			a = "Voce deve comprar o produto 2";
		} else {
			a = "Voce deve comprar o produto 3";
		}
		return a;
	}

	// Exercicio 9 - Faça um Programa que leia três números e mostre-os em ordem
	// decrescente
	public static String dec() {
		String x = JOptionPane.showInputDialog("Informe o primeiro numero :");
		String y = JOptionPane.showInputDialog("Informe o segundo numero :");
		String z = JOptionPane.showInputDialog("Informe o terceiro numero :");
		String a;
		if ((Integer.valueOf(x) > (Integer.valueOf(y))
				&& (Integer.valueOf(x) > (Integer.valueOf(z)) && (Integer.valueOf(y) > (Integer.valueOf(z)))))) {
			a = ((Integer.valueOf(x) + " - " + (Integer.valueOf(y) + " - " + (Integer.valueOf(z)))));
		} else if ((Integer.valueOf(x) > (Integer.valueOf(y))
				&& (Integer.valueOf(x) > (Integer.valueOf(z)) && (Integer.valueOf(z) > (Integer.valueOf(y)))))) {
			a = ((Integer.valueOf(x) + " - " + (Integer.valueOf(z) + " - " + (Integer.valueOf(y)))));
		} else if ((Integer.valueOf(y) > (Integer.valueOf(x))
				&& (Integer.valueOf(y) > (Integer.valueOf(z)) && (Integer.valueOf(x) > (Integer.valueOf(z)))))) {
			a = ((Integer.valueOf(y) + " - " + (Integer.valueOf(x) + " - " + (Integer.valueOf(z)))));
		} else if ((Integer.valueOf(y) > (Integer.valueOf(x))
				&& (Integer.valueOf(y) > (Integer.valueOf(z)) && (Integer.valueOf(z) > (Integer.valueOf(x)))))) {
			a = ((Integer.valueOf(y) + " - " + (Integer.valueOf(z) + " - " + (Integer.valueOf(x)))));
		} else if ((Integer.valueOf(z) > (Integer.valueOf(x))
				&& (Integer.valueOf(z) > (Integer.valueOf(y)) && (Integer.valueOf(x) > (Integer.valueOf(y)))))) {
			a = ((Integer.valueOf(z) + " - " + (Integer.valueOf(x) + " - " + (Integer.valueOf(y)))));
		} else {
			a = ((Integer.valueOf(z) + " - " + (Integer.valueOf(y) + " - " + (Integer.valueOf(x)))));
		}
		return a;
	}

	// Exercicio 10 - Faça um Programa que pergunte em que turno você estuda. Peça
	// para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
	// mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
	// Inválido!", conforme o caso.
	public static String turno() {
		String x = JOptionPane.showInputDialog("Informe o Turno que estudo. (M) (V) ou (N)  :");
		switch (x) {
		case "m":
			JOptionPane.showMessageDialog(null, "Turno Matutino - Bom Dia");
			break;
		case "M":
			JOptionPane.showMessageDialog(null, "Turno Matutino - Bom Dia");
			break;
		case "v":
			JOptionPane.showMessageDialog(null, "Turno Vespertino - Boa Tarde");
			break;
		case "V":
			JOptionPane.showMessageDialog(null, "Turno Vespertino - Boa Tarde");
			break;
		case "n":
			JOptionPane.showMessageDialog(null, "Turno Noturno - Boa Noite");
			break;
		case "N":
			JOptionPane.showMessageDialog(null, "Turno Noturno - Boa Noite");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Turno Invalido");
			break;
		}
		return x;
	}

	/*
	 * Exercicio 11 - As Organizações Tabajara resolveram dar um aumento de salário
	 * aos seus colaboradores e lhe contrataram para desenvolver o programa que
	 * calculará os reajustes. o Faça um programa que recebe o salário de um
	 * colaborador e o reajuste segundo o seguinte critério, baseado no salário
	 * atual: o salários até R$ 280,00 (incluindo) : aumento de 20% o salários entre
	 * R$ 280,00 e R$ 700,00 : aumento de 15% o salários entre R$ 700,00 e R$
	 * 1500,00 : aumento de 10% o salários de R$ 1500,00 em diante : aumento de 5%
	 * Após o aumento ser realizado, informe na tela: o o salário antes do reajuste;
	 * o o percentual de aumento aplicado; o o valor do aumento; o o novo salário,
	 * após o aumento.
	 */
	public static double aumentoS() {
		String x = JOptionPane.showInputDialog("Informe o Salario :");
		double au = (Double.valueOf(x));
		double s = au;
		if (au <= 280) {
			au = ((au * 20) / 100);
			JOptionPane.showMessageDialog(null,
					"Seu Salario é de : " + s + "\n \n " + "Percentual de aumento foi de : 20% \n \n "
							+ " Valor do Aumento :" + au + "\n \n" + " Novo Salario com o Aumento :" + (au + s));
		} else if (au > 280 && au <= 700) {
			au = ((au * 15) / 100);
			JOptionPane.showMessageDialog(null,
					"Seu Salario é de : " + s + "\n \n " + "Percentual de aumento foi de : 15% \n \n "
							+ " Valor do Aumento :" + au + "\n \n" + " Novo Salario com o Aumento :" + (au + s));
		} else if (au > 700 && au <= 1500) {
			au = ((au * 10) / 100);
			JOptionPane.showMessageDialog(null,
					"Seu Salario é de : " + s + "\n \n " + "Percentual de aumento foi de : 10% \n \n "
							+ " Valor do Aumento :" + au + "\n \n" + " Novo Salario com o Aumento :" + (au + s));
		} else {
			au = ((au * 5) / 100);
			JOptionPane.showMessageDialog(null,
					"Seu Salario é de : " + s + "\n \n " + "Percentual de aumento foi de : 5% \n \n "
							+ " Valor do Aumento :" + au + "\n \n" + " Novo Salario com o Aumento :" + (au + s));
		}
		return au;
	}

	/*
	 * Exercicio 12 - Faça um programa para o cálculo de uma folha de pagamento,
	 * sabendo que os descontos são do Imposto de Renda, que depende do salário
	 * bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde
	 * a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O
	 * Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa
	 * deverá pedir ao usuário o valor da sua hora e a quantidade de horas
	 * trabalhadas no mês. o Desconto do IR: o Salário Bruto até 900 (inclusive) -
	 * isento o Salário Bruto até 1500 (inclusive) - desconto de 5% o Salário Bruto
	 * até 2500 (inclusive) - desconto de 10% o Salário Bruto acima de 2500 -
	 * desconto de 20% Imprima na tela as informações, dispostas conforme o exemplo
	 * abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.
	 */
	public static double folhaPagamento() {
		String x = JOptionPane.showInputDialog(null, "Informe quantas horas trabalhou no mes: ");
		String y = JOptionPane.showInputDialog(null, "Informe quanto recebe por hora: ");
		double soma = (Double.valueOf(x) * (Double.valueOf(y)));
		if (soma <= 900) {
			JOptionPane.showMessageDialog(null, "Seu Salario Bruto é :			" + soma + "\n"
					+ "(-) IR		:			Isento \n" + "(-) INSS  (10%) :      " + soma * 10 / 100 + "\n"
					+ "(-) FGTS  (11%) :      " + soma * 11 / 100 + "\n" + "(-) Sindicato  (3%) :      "
					+ soma * 3 / 100 + "\n" + "Total de desconto :		" + (((soma * 10) / 100 + ((soma * 3) / 100))
							+ "\n" + "Salario Liquido :			" + (soma - ((soma * 10) / 100) + ((soma * 3) / 100))));
		} else if (soma > 900 && soma <= 1500) {
			double liquido = ((((soma * 10) / 100) + ((soma * 3) / 100) + ((soma * 5) / 100)));
			JOptionPane.showMessageDialog(null,
					"Seu Salario Bruto é :			" + soma + "\n" + "(-) IR	   (5%)	:			" + (soma * 5) / 100
							+ "\n" + "(-) INSS  (10%) :      " + soma * 10 / 100 + "\n" + "(-) FGTS  (11%) :      "
							+ soma * 11 / 100 + "\n" + "(-) Sindicato  (3%) :      " + soma * 3 / 100 + "\n"
							+ "Total de desconto :		" + (((soma * 10) / 100 + (soma * 3) / 100 + (soma * 5) / 100))
							+ "\n" + "Salario Liquido :			" + (soma - liquido));
		} else if (soma > 1500 && soma <= 2500) {
			double liquido = ((((soma * 10) / 100) + ((soma * 3) / 100) + ((soma * 10) / 100)));
			JOptionPane.showMessageDialog(null,
					"Seu Salario Bruto é :			" + soma + "\n" + "(-) IR	   (10%):			"
							+ (soma * 10) / 100 + "\n" + "(-) INSS  (10%) :      " + soma * 10 / 100 + "\n"
							+ "(-) FGTS  (11%) :      " + soma * 11 / 100 + "\n" + "(-) Sindicato  (3%) :      "
							+ soma * 3 / 100 + "\n" + "Total de desconto :		"
							+ (((soma * 10) / 100 + (soma * 3) / 100 + (soma * 10) / 100)) + "\n"
							+ "Salario Liquido :			" + (soma - liquido));
		} else {
			double liquido = ((((soma * 10) / 100) + ((soma * 3) / 100) + ((soma * 20) / 100)));
			JOptionPane.showMessageDialog(null,
					"Seu Salario Bruto é :			" + soma + "\n" + "(-) IR	   (20%):			"
							+ (soma * 20) / 100 + "\n" + "(-) INSS  (10%) :      " + soma * 10 / 100 + "\n"
							+ "(-) FGTS  (11%) :      " + soma * 11 / 100 + "\n" + "(-) Sindicato  (3%) :      "
							+ soma * 3 / 100 + "\n" + "Total de desconto :		"
							+ (((soma * 10) / 100 + (soma * 3) / 100 + (soma * 20) / 100)) + "\n"
							+ "Salario Liquido :			" + (soma - liquido));
		}

		return soma;
	}

	// Exercicio 13 - Faça um Programa que leia um número e exiba o dia
	// correspondente
	// da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
	// aparecer valor inválido.
	public static String diaSemana() {
		String x = JOptionPane.showInputDialog("Informe um numero correspondente ao dia da semana :");
		switch (Integer.valueOf(x)) {
		case 1:
			JOptionPane.showMessageDialog(null, "Segunda-Feira");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Terça-Feira");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Quarta-Feira");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Quinta-Feira");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Sexta-Feira");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "Sabado");
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "Domingo");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Numero invalido");
			break;
		}
		return x;
	}

	// Exercicio 14 - leia 2 notas e informe a media.
	public static Double mediaNota() {
		String x = JOptionPane.showInputDialog("Informe a primeira Nota: ");
		String y = JOptionPane.showInputDialog("Informe a Segunda Nota: ");
		double med = ((Double.valueOf(x) + (Double.valueOf(y))) / 2);
		if (med >= 9 && med <= 10) {
			JOptionPane.showMessageDialog(null,
					"NOTA 1           :" + (Double.valueOf(x) + "\n NOTA 2          : " + (Double.valueOf(y) + ""
							+ "\n Media             :  " + med + "\n Conceito           A \n             APROVADO")));
		} else if (med >= 7.5 && med < 9) {
			JOptionPane.showMessageDialog(null,
					"NOTA 1           :" + (Double.valueOf(x) + "\n NOTA 2          : " + (Double.valueOf(y) + ""
							+ "\n Media             :  " + med + "\n Conceito           B \n             APROVADO")));
		} else if (med >= 6 && med < 7.5) {
			JOptionPane.showMessageDialog(null,
					"NOTA 1           :" + (Double.valueOf(x) + "\n NOTA 2          : "
							+ (Double.valueOf(y) + "" + "\n Media             :  " + med
									+ "\n Conceito           C \n             RECUPERAÇÂO")));
		} else if (med >= 4 && med < 6) {
			JOptionPane.showMessageDialog(null,
					"NOTA 1           :" + (Double.valueOf(x) + "\n NOTA 2          : " + (Double.valueOf(y) + ""
							+ "\n Media             :  " + med + "\n Conceito           D \n             REPROVADO")));
		} else if (med >= 0 && med < 4) {
			JOptionPane.showMessageDialog(null,
					"NOTA 1           :" + (Double.valueOf(x) + "\n NOTA 2          : " + (Double.valueOf(y) + ""
							+ "\n Media             :  " + med + "\n Conceito           E \n             REPROVADO")));
		}
		return med;
	}

	/*
	 * Exercicio 15 - Faça um Programa que peça os 3 lados de um triângulo. O
	 * programa deverá informar se os valores podem ser um triângulo. Indique, caso
	 * os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
	 * escaleno. o Dicas: o Três lados formam um triângulo quando a soma de
	 * quaisquer dois lados for maior que o terceiro; o Triângulo Equilátero: três
	 * lados iguais; o Triângulo Isósceles: quaisquer dois lados iguais; o Triângulo
	 * Escaleno: três lados diferentes;
	 */
	public static String triangulo() {
		String x = JOptionPane.showInputDialog("Informe o valor do primeiro lado: ");
		String y = JOptionPane.showInputDialog("Informe o valor do segundo lado: ");
		String z = JOptionPane.showInputDialog("Informe o valor do terceiro lado");
		double a, b, c = 0;
		String r, r1;
		a = (Double.valueOf(x));
		b = (Double.valueOf(x));
		c = (Double.valueOf(x));
		if ((((a + b) > c) || ((a + c) > b)) || ((c + b) > a)) {
			r1 = "Os valores informados formam um triangulo";
			JOptionPane.showMessageDialog(null, r1);
		} else {
			r1 = "Os Valores informados não formam um triangulo";
			JOptionPane.showMessageDialog(null, r1);
		}

		if (a == b && a == c) {
			r1 = "TRIANGULO EQUILÁTERO";
			JOptionPane.showMessageDialog(null, r1);
		} else if (a == b || a == c || b == c) {
			r1 = "TRIANGULO ISÓSCELES";
			JOptionPane.showMessageDialog(null, r1);
		} else {
			r1 = "TRIANGULO ESCALENO";
			JOptionPane.showMessageDialog(null, r1);
		}
		return r1;
	}

	/*
	 * Exercicio 16 - Faça um programa que calcule as raízes de uma equação do
	 * segundo grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a,
	 * b e c e fazer as consistências, informando ao usuário nas seguintes
	 * situações: a. Se o usuário informar o valor de A igual a zero, a equação não
	 * é do segundo grau e o programa não deve fazer pedir os demais valores, sendo
	 * encerrado; b. Se o delta calculado for negativo, a equação não possui raizes
	 * reais. Informe ao usuário e encerre o programa; c. Se o delta calculado for
	 * igual a zero a equação possui apenas uma raiz real; informe-a ao usuário; d.
	 * Se o delta for positivo, a equação possui duas raiz reais; informe-as ao
	 * usuário;
	 */
	public static double eq() {
		String x = JOptionPane.showInputDialog("Informe o valor de A");
		if ((Double.valueOf(x) == 0)) {
			String e = "Não é uma equação de segundo grau";
			JOptionPane.showMessageDialog(null, e);
		} else {
			String y = JOptionPane.showInputDialog("Informe o valor de B");
			String z = JOptionPane.showInputDialog("Informe o valor de C");
			double ra = ((Double.valueOf(y) * (Double.valueOf(y))) - (4 * (Double.valueOf(x) * (Double.valueOf(z)))));
			if (ra < 0) {
				String e = "Delta Negativo";
				JOptionPane.showMessageDialog(null, e);
			} else if ((ra == 0) || (ra > 0)) {
				double x1 = ((-(Double.valueOf(y)) + Math.sqrt(ra)) / (2 * (Double.valueOf(x))));
				String a = (String.valueOf(x1));
				double x2 = ((-(Double.valueOf(y)) - Math.sqrt(ra)) / (2 * (Double.valueOf(x))));
				String b = (String.valueOf(x2));
				String e = ("X1 = " + a + " \n X2 = " + b);

			}

		}
		return 0;
	}

	// Exercicio 17 - Faça um Programa que peça um número correspondente a um
	// determinado ano e em seguida informe se este ano é ou não bissexto.
	public static String ano() {
		String x = JOptionPane.showInputDialog("Informe um ano: ");
		if ((Double.valueOf(x) % 400 == 0) || (Double.valueOf(x) % 4 == 0 && (Double.valueOf(x) % 100 != 0))) {
			JOptionPane.showMessageDialog(null, "O Ano Informado é Bissexto");
		} else {
			JOptionPane.showMessageDialog(null, "O Ano Informado não é Bissexto");
		}
		return x;
	}

	// Exercicio 18 - Faça um Programa que peça um número inteiro e determine se ele
	// é
	// par ou impar. Dica: utilize o operador módulo (resto da divisão).
	public static String parImpar() {
		String x = JOptionPane.showInputDialog("Informe um numero: ");
		if ((Double.valueOf(x) % 2 == 0)) {
			JOptionPane.showMessageDialog(null, "Numero informado é par");
		} else {
			JOptionPane.showMessageDialog(null, "Numero informado é impar");
		}
		return x;
	}

	/*
	 * Exercicio 19 - Faça um Programa que leia 2 números e em seguida pergunte ao
	 * usuário qual operação ele deseja realizar. O resultado da operação deve ser
	 * acompanhado de uma frase que diga se o número é: . par ou ímpar; a. positivo
	 * ou negativo;
	 */
	public static String posNeg() {
		String x = JOptionPane.showInputDialog("Informe um numero: ");
		String y = JOptionPane.showInputDialog("Informe um numero: ");
		String z = JOptionPane.showInputDialog("Informe se deseja somar ou subtrari pelos sinais - ou +");
		String r = null;
		if (z.equalsIgnoreCase("-")) {
			Double sub = (Double.valueOf(x) - (Double.valueOf(y)));
			if (sub >= 0) {
				r = "Resultado é Positivo";
				JOptionPane.showMessageDialog(null, "Resultado é Positivo");
			} else {
				r = "Resultado é Negativo";
				JOptionPane.showMessageDialog(null, "Resultado é Negativo");
			}
		} else if (z.equalsIgnoreCase("+")) {
			Double sub = (Double.valueOf(x) + (Double.valueOf(y)));
			if (sub >= 0) {
				r = "Resultado é Positivo";
				JOptionPane.showMessageDialog(null, "Resultado é Positivo");
			} else {
				r = "Resultado é Negativo";
				JOptionPane.showMessageDialog(null, "Resultado é Negativo");
			}
		}
		return r;
	}

	/*
	 * Exercicio 20 - Faça um programa que faça 5 perguntas para uma pessoa sobre um
	 * crime. As perguntas são: . "Telefonou para a vítima?" a.
	 * "Esteve no local do crime?" b. "Mora perto da vítima?" c.
	 * "Devia para a vítima?" d. "Já trabalhou com a vítima?" O programa deve no
	 * final emitir uma classificação sobre a participação da pessoa no crime. Se a
	 * pessoa responder positivamente a 2 questões ela deve ser classificada como
	 * "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário,
	 * ele será classificado como "Inocente".
	 */
	public static String interr() {
		String a = JOptionPane.showInputDialog("Telefonou para a vítima?");
		String b = JOptionPane.showInputDialog("Esteve no local do crime?");
		String c = JOptionPane.showInputDialog("Mora perto da vítima?");
		String d = JOptionPane.showInputDialog("Devia para a vítima?");
		String e = JOptionPane.showInputDialog("Já trabalhou com a vítima?");

		return interr();
	}

	/*
	 * Exercicio 21 - Um posto está vendendo combustíveis com a seguinte tabela de
	 * descontos: . Álcool: a. até 20 litros, desconto de 3% por litro b. acima de
	 * 20 litros, desconto de 5% por litro Gasolina: c. até 20 litros, desconto de
	 * 4% por litro d. acima de 20 litros, desconto de 6% por litro Escreva um
	 * algoritmo que leia o número de litros vendidos, o tipo de combustível
	 * (codificado da seguinte forma: A-álcool, Ggasolina), calcule e imprima o
	 * valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é
	 * R$ 2,50 o preço do litro do álcool é R$ 1,90.
	 */
	public static double combustivel() {
		JOptionPane.showMessageDialog(null, "Álcool R$ 1,90 \n Ate 20 Litros, Desconto de 3% por Litro \n"
				+ " Acima de 20 Litros desconto de 5% por Litro \n Gasolina R$ 2,50 \n"
				+ " Ate 20 Litros, desconto de 4% por litro \n" + " Acima de 20 Litros, desconto de 6% por Litro");
		String c = JOptionPane.showInputDialog("Informe o tipo de combustivel com A (Alcool) ou G (Gasolina)");
		String s = JOptionPane.showInputDialog("Qual a quantidade de litros que vai abastecer");
		double aux = (Double.valueOf(s));
		switch (c) {
		case "A":
			if (aux <= 20) {
				aux = (aux * 1.90);
				double des = (aux * ((1.90 * 3) / 100));
				JOptionPane.showMessageDialog(null,
						"Valor sem desconto :" + aux + " \n Total de desconto de 3% :" + des);
				aux = aux - des;
				JOptionPane.showMessageDialog(null, "Total a Pagar é :" + aux);
			} else {
				aux = (aux * 1.90);
				double des = (aux * ((1.90 * 5) / 100));
				JOptionPane.showMessageDialog(null,
						"Valor sem desconto :" + aux + " \n Total de desconto de 5% :" + des);
				aux = aux - des;
				JOptionPane.showMessageDialog(null, "Total a Pagar é :" + aux);
			}
			;
			break;
		case "a":
			if (aux <= 20) {
				aux = (aux * 1.90);
				double des = (aux * ((1.90 * 3) / 100));
				JOptionPane.showMessageDialog(null,
						"Valor sem desconto :" + aux + " \n Total de desconto de 3% :" + des);
				aux = aux - des;
				JOptionPane.showMessageDialog(null, "Total a Pagar é :" + aux);
			} else {
				aux = (aux * 1.90);
				double des = (aux * ((1.90 * 5) / 100));
				JOptionPane.showMessageDialog(null,
						"Valor sem desconto :" + aux + " \n Total de desconto de 5% :" + des);
				aux = aux - des;
				JOptionPane.showMessageDialog(null, "Total a Pagar é :" + aux);
			}
			;
			break;
		case "G":
			if (aux <= 20) {
				aux = (aux * 2.50);
				double des = (aux * ((2.50 * 4) / 100));
				JOptionPane.showMessageDialog(null,
						"Valor sem desconto :" + aux + " \n Total de desconto de 4% :" + des);
				aux = aux - des;
				JOptionPane.showMessageDialog(null, "Total a Pagar é :" + aux);
			} else {
				aux = (aux * 2.50);
				double des = (aux * ((2.50 * 6) / 100));
				JOptionPane.showMessageDialog(null,
						"Valor sem desconto :" + aux + " \n Total de desconto de 6% :" + des);
				aux = aux - des;
				JOptionPane.showMessageDialog(null, "Total a Pagar é :" + aux);
			}
			;
			break;
		case "g":
			if (aux > 20) {
				aux = (aux * 2.50);
				double des = (aux * ((2.50 * 6) / 100));
				JOptionPane.showMessageDialog(null,
						"Valor sem desconto :" + aux + " \n Total de desconto de 6% :" + des);
				aux = aux - des;
				JOptionPane.showMessageDialog(null, "Total a Pagar é :" + aux);
			} else {
				aux = (aux * 2.50);
				double des = (aux * ((2.50 * 6) / 100));
				JOptionPane.showMessageDialog(null,
						"Valor sem desconto :" + aux + " \n Total de desconto de 6% :" + des);
				aux = aux - des;
				JOptionPane.showMessageDialog(null, "Total a Pagar é :" + aux);
			}
			;
			break;

		default:
			JOptionPane.showMessageDialog(null, "Valores informados invalidos");
			break;
		}
		return aux;
	}

	/*
	 * Exercicio 22 - .Uma fruteira está vendendo frutas com a seguinte tabela de
	 * preços: Até 5 Kg Acima de 5 Kg Morango R$ 2,50 por Kg R$ 2,20 por Kg Maçã R$
	 * 1,80 por Kg R$ 1,50 por Kg Se o cliente comprar mais de 8 Kg em frutas ou o
	 * valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10%
	 * sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de
	 * morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser
	 * pago pelo cliente.
	 */
	public static double fruta() {
		JOptionPane.showMessageDialog(null,
				"                               Ate 5Kg                       Acima de 5Kg \n"
						+ "Morango           R$2.50 por kg                 R$2.20 por kg \n"
						+ "Maça                 R$1.80 por kg                 R$1.50 por kg \n");
		String q = JOptionPane.showInputDialog("Quantidade de KG comprados");
		String t = JOptionPane.showInputDialog("Tipo de fruta");
		double som = (Double.valueOf(q));
		switch (t) {
		case "Morango":
			if (som <= 5) {
				som = som * 2.50;
				JOptionPane.showMessageDialog(null, "Valor a pagar: " + som);
			} else if (som > 5) {
				som = som * 2.20;
				JOptionPane.showMessageDialog(null, "Valor a pagar: " + som);
			} else if (som > 8) {
				som = ((som * 2.20) + ((som * 10) / 100));
				JOptionPane.showMessageDialog(null, "Valor a pagar: " + som);
			}
			break;
		case "Maca":
			if (som <= 5) {
				som = som * 1.80;
				JOptionPane.showMessageDialog(null, "Valor a pagar: " + som);
			} else if (som > 5) {
				som = som * 1.50;
				JOptionPane.showMessageDialog(null, "Valor a pagar: " + som);
			} else if (som > 8) {
				som = ((som * 1.50) + ((som * 10) / 100));
				JOptionPane.showMessageDialog(null, "Valor a pagar: " + som);
			}
			break;

		default:
			JOptionPane.showMessageDialog(null, "Valores informados não existem");
			break;
		}
		return som;
	}

	/*
	 * Exercicio 23 - .O Hipermercado Tabajara está com uma promoção de carnes que é
	 * imperdível. Confira: o Até 5 Kg Acima de 5 Kg o File Duplo R$ 4,90 por Kg R$
	 * 5,80 por Kg o Alcatra R$ 5,90 por Kg R$ 6,80 por Kg o Picanha R$ 6,90 por Kg
	 * R$ 7,80 por Kg Para atender a todos os clientes, cada cliente poderá levar
	 * apenas um dos tipos de carne da promoção, porém não há limites para a
	 * quantidade de carne por cliente. Se compra for feita no cartão Tabajara o
	 * cliente receberá ainda um desconto de 5% sobre o total a compra. Escreva um
	 * programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere
	 * um cupom fiscal, contendo as informações da compra: tipo e quantidade de
	 * carne, preço total, tipo de pagamento, valor do desconto e valor a pagar.
	 */
	public static double hipermecado() {
		JOptionPane.showMessageDialog(null,
				"                               Ate 5 kg                    Acima de 5kg \n"
						+ "File Duplo       R$4.90 por kg             R$5.80 por kg \n"
						+ "Alcatra            R$5.90 por kg             R$6.80 por kg \n"
						+ "Picanha          R$6.90 por kg             R$7.80 por kg");
		String t = JOptionPane.showInputDialog("Qual Carne ira querer :");
		String q = JOptionPane.showInputDialog("Quantidade em kg");
		String taba = JOptionPane.showInputDialog("Comprar no Cartão Tabajara ?");
		double valor = (Double.valueOf(q));
		double ta = ((valor * 5) / 100);
		switch (t) {
		case "File Duplo":
			if (valor <= 5) {
				ta = ((valor * 4.90) * 5) / 100;
				JOptionPane.showMessageDialog(null,
						"Voce comprou " + valor + "kg de File Duplo \n" + "Valor total :" + valor * 4.90 + "\n"
								+ "Valor do Desconto :" + (ta) + "\n" + "Total a pagar :" + (valor * 4.90 - ta));
			} else if (valor > 5) {
				ta = ((valor * 5.80) * 5) / 100;
				JOptionPane.showMessageDialog(null,
						"Voce comprou " + valor + "kg de File Duplo \n" + "Valor total :" + valor * 5.80 + "\n"
								+ "Valor do Desconto :" + (ta) + "\n" + "Total a pagar :" + (valor * 5.80 - ta));
			}
			break;
		case "Alcatra":
			if (valor <= 5) {
				ta = ((valor * 5.90) * 5) / 100;
				JOptionPane.showMessageDialog(null,
						"Voce comprou " + valor + "kg de File Duplo \n" + "Valor total :" + valor * 5.90 + "\n"
								+ "Valor do Desconto :" + (ta) + "\n" + "Total a pagar :" + (valor * 5.90 - ta));
			} else if (valor > 5) {
				ta = ((valor * 6.80) * 5) / 100;
				JOptionPane.showMessageDialog(null,
						"Voce comprou " + valor + "kg de File Duplo \n" + "Valor total :" + valor * 6.80 + "\n"
								+ "Valor do Desconto :" + (ta) + "\n" + "Total a pagar :" + (valor * 6.80 - ta));
			}
			break;
		case "Picanha":
			if (valor <= 5) {
				ta = ((valor * 6.90) * 5) / 100;
				JOptionPane.showMessageDialog(null,
						"Voce comprou " + valor + "kg de File Duplo \n" + "Valor total :" + valor * 6.90 + "\n"
								+ "Valor do Desconto :" + (ta) + "\n" + "Total a pagar :" + (valor * 6.90 - ta));
			} else if (valor > 5) {
				ta = ((valor * 7.80) * 5) / 100;
				JOptionPane.showMessageDialog(null,
						"Voce comprou " + valor + "kg de File Duplo \n" + "Valor total :" + valor * 7.80 + "\n"
								+ "Valor do Desconto :" + (ta) + "\n" + "Total a pagar :" + (valor * 7.80 - ta));
			}
			break;

		default:
			JOptionPane.showMessageDialog(null, "Valores invalidos");
			break;
		}
		return valor;
	}
}
