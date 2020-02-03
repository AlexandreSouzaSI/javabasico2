package exercicios2;

import javax.swing.JOptionPane;

public class Codigos2 {

	// Exercicio 1 - Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.
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

	// Exercicio 2 - Fa�a um Programa que pe�a um valor e mostre na tela se o valor
	// � positivo ou negativo.
	public static String positivoNegativo() {
		String x = JOptionPane.showInputDialog("Informe um numero :");
		int m = (Integer.valueOf(x));
		String n;
		if (m % 2 == 0) {
			n = "O Numero � Par";
		} else {
			n = "O Numero � Impar";
		}
		return n;
	}

	// Exercicio 3 - Fa�a um Programa que verifique se uma letra digitada � "F" ou
	// "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inv�lido.
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

	// Exercicio 4 - Fa�a um Programa que verifique se uma letra digitada � vogal ou
	// consoante
	public static String vc() {
		String x = JOptionPane.showInputDialog("Informe uma letra :");
		switch (x) {
		case "a":
			JOptionPane.showMessageDialog(null, "� Uma Vogal");
			break;
		case "e":
			JOptionPane.showMessageDialog(null, "� Uma Vogal");
			break;
		case "i":
			JOptionPane.showMessageDialog(null, "� Uma Vogal");
			break;
		case "o":
			JOptionPane.showMessageDialog(null, "� Uma Vogal");
			break;
		case "u":
			JOptionPane.showMessageDialog(null, "� Uma Vogal");
			break;
		default:
			JOptionPane.showMessageDialog(null, "� Uma Consoante");
			break;
		}
		return x;
	}

	// Exercicio 5 - pedir 2 notas e ver se esta aprovado ou n�o
	public static String media() {
		String x = JOptionPane.showInputDialog("Informe a primeira nota :");
		String y = JOptionPane.showInputDialog("Informe a segunda nota :");
		double m = ((Integer.valueOf(x) + (Integer.valueOf(y))) / 2);
		String i;
		if (m == 10) {
			i = "Aprovado com Distin��o";
		} else if (m < 7) {
			i = "Reprovado";
		} else {
			i = "Aprovado";
		}
		return i;
	}

	static int a, b, c = 0;

	// Exercicio 6 - Fa�a um Programa que leia tr�s n�meros e mostre o maior deles.
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

	// Exercicio 7 - Fa�a um Programa que leia tr�s n�meros e mostre o maior e o
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

	// Exercicio 8 - Fa�a um programa que pergunte o pre�o de tr�s produtos e
	// informe qual produto voc� deve comprar, sabendo que a decis�o � sempre pelo
	// mais barato
	public static String comprar() {
		String x = JOptionPane.showInputDialog("Informe o pre�o do produto 1 :");
		String y = JOptionPane.showInputDialog("Informe o pre�o do produto 2 :");
		String z = JOptionPane.showInputDialog("Informe o pre�o do produto 3 :");
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

	// Exercicio 9 - Fa�a um Programa que leia tr�s n�meros e mostre-os em ordem
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

	// Exercicio 10 - Fa�a um Programa que pergunte em que turno voc� estuda. Pe�a
	// para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
	// mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
	// Inv�lido!", conforme o caso.
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
	 * Exercicio 11 - As Organiza��es Tabajara resolveram dar um aumento de sal�rio
	 * aos seus colaboradores e lhe contrataram para desenvolver o programa que
	 * calcular� os reajustes. o Fa�a um programa que recebe o sal�rio de um
	 * colaborador e o reajuste segundo o seguinte crit�rio, baseado no sal�rio
	 * atual: o sal�rios at� R$ 280,00 (incluindo) : aumento de 20% o sal�rios entre
	 * R$ 280,00 e R$ 700,00 : aumento de 15% o sal�rios entre R$ 700,00 e R$
	 * 1500,00 : aumento de 10% o sal�rios de R$ 1500,00 em diante : aumento de 5%
	 * Ap�s o aumento ser realizado, informe na tela: o o sal�rio antes do reajuste;
	 * o o percentual de aumento aplicado; o o valor do aumento; o o novo sal�rio,
	 * ap�s o aumento.
	 */
	public static double aumentoS() {
		String x = JOptionPane.showInputDialog("Informe o Salario :");
		double au = (Double.valueOf(x));
		double s = au;
		if (au <= 280) {
			au = ((au * 20) / 100);
			JOptionPane.showMessageDialog(null,
					"Seu Salario � de : " + s + "\n \n " + "Percentual de aumento foi de : 20% \n \n "
							+ " Valor do Aumento :" + au + "\n \n" + " Novo Salario com o Aumento :" + (au + s));
		} else if (au > 280 && au <= 700) {
			au = ((au * 15) / 100);
			JOptionPane.showMessageDialog(null,
					"Seu Salario � de : " + s + "\n \n " + "Percentual de aumento foi de : 15% \n \n "
							+ " Valor do Aumento :" + au + "\n \n" + " Novo Salario com o Aumento :" + (au + s));
		} else if (au > 700 && au <= 1500) {
			au = ((au * 10) / 100);
			JOptionPane.showMessageDialog(null,
					"Seu Salario � de : " + s + "\n \n " + "Percentual de aumento foi de : 10% \n \n "
							+ " Valor do Aumento :" + au + "\n \n" + " Novo Salario com o Aumento :" + (au + s));
		} else {
			au = ((au * 5) / 100);
			JOptionPane.showMessageDialog(null,
					"Seu Salario � de : " + s + "\n \n " + "Percentual de aumento foi de : 5% \n \n "
							+ " Valor do Aumento :" + au + "\n \n" + " Novo Salario com o Aumento :" + (au + s));
		}
		return au;
	}

	/*
	 * Exercicio 12 - Fa�a um programa para o c�lculo de uma folha de pagamento,
	 * sabendo que os descontos s�o do Imposto de Renda, que depende do sal�rio
	 * bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde
	 * a 11% do Sal�rio Bruto, mas n�o � descontado (� a empresa que deposita). O
	 * Sal�rio L�quido corresponde ao Sal�rio Bruto menos os descontos. O programa
	 * dever� pedir ao usu�rio o valor da sua hora e a quantidade de horas
	 * trabalhadas no m�s. o Desconto do IR: o Sal�rio Bruto at� 900 (inclusive) -
	 * isento o Sal�rio Bruto at� 1500 (inclusive) - desconto de 5% o Sal�rio Bruto
	 * at� 2500 (inclusive) - desconto de 10% o Sal�rio Bruto acima de 2500 -
	 * desconto de 20% Imprima na tela as informa��es, dispostas conforme o exemplo
	 * abaixo. No exemplo o valor da hora � 5 e a quantidade de hora � 220.
	 */
	public static double folhaPagamento() {
		String x = JOptionPane.showInputDialog(null, "Informe quantas horas trabalhou no mes: ");
		String y = JOptionPane.showInputDialog(null, "Informe quanto recebe por hora: ");
		double soma = (Double.valueOf(x) * (Double.valueOf(y)));
		if (soma <= 900) {
			JOptionPane.showMessageDialog(null, "Seu Salario Bruto � :			" + soma + "\n"
					+ "(-) IR		:			Isento \n" + "(-) INSS  (10%) :      " + soma * 10 / 100 + "\n"
					+ "(-) FGTS  (11%) :      " + soma * 11 / 100 + "\n" + "(-) Sindicato  (3%) :      "
					+ soma * 3 / 100 + "\n" + "Total de desconto :		" + (((soma * 10) / 100 + ((soma * 3) / 100))
							+ "\n" + "Salario Liquido :			" + (soma - ((soma * 10) / 100) + ((soma * 3) / 100))));
		} else if (soma > 900 && soma <= 1500) {
			double liquido = ((((soma * 10) / 100) + ((soma * 3) / 100) + ((soma * 5) / 100)));
			JOptionPane.showMessageDialog(null,
					"Seu Salario Bruto � :			" + soma + "\n" + "(-) IR	   (5%)	:			" + (soma * 5) / 100
							+ "\n" + "(-) INSS  (10%) :      " + soma * 10 / 100 + "\n" + "(-) FGTS  (11%) :      "
							+ soma * 11 / 100 + "\n" + "(-) Sindicato  (3%) :      " + soma * 3 / 100 + "\n"
							+ "Total de desconto :		" + (((soma * 10) / 100 + (soma * 3) / 100 + (soma * 5) / 100))
							+ "\n" + "Salario Liquido :			" + (soma - liquido));
		} else if (soma > 1500 && soma <= 2500) {
			double liquido = ((((soma * 10) / 100) + ((soma * 3) / 100) + ((soma * 10) / 100)));
			JOptionPane.showMessageDialog(null,
					"Seu Salario Bruto � :			" + soma + "\n" + "(-) IR	   (10%):			"
							+ (soma * 10) / 100 + "\n" + "(-) INSS  (10%) :      " + soma * 10 / 100 + "\n"
							+ "(-) FGTS  (11%) :      " + soma * 11 / 100 + "\n" + "(-) Sindicato  (3%) :      "
							+ soma * 3 / 100 + "\n" + "Total de desconto :		"
							+ (((soma * 10) / 100 + (soma * 3) / 100 + (soma * 10) / 100)) + "\n"
							+ "Salario Liquido :			" + (soma - liquido));
		} else {
			double liquido = ((((soma * 10) / 100) + ((soma * 3) / 100) + ((soma * 20) / 100)));
			JOptionPane.showMessageDialog(null,
					"Seu Salario Bruto � :			" + soma + "\n" + "(-) IR	   (20%):			"
							+ (soma * 20) / 100 + "\n" + "(-) INSS  (10%) :      " + soma * 10 / 100 + "\n"
							+ "(-) FGTS  (11%) :      " + soma * 11 / 100 + "\n" + "(-) Sindicato  (3%) :      "
							+ soma * 3 / 100 + "\n" + "Total de desconto :		"
							+ (((soma * 10) / 100 + (soma * 3) / 100 + (soma * 20) / 100)) + "\n"
							+ "Salario Liquido :			" + (soma - liquido));
		}

		return soma;
	}

	// Exercicio 13 - Fa�a um Programa que leia um n�mero e exiba o dia
	// correspondente
	// da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
	// aparecer valor inv�lido.
	public static String diaSemana() {
		String x = JOptionPane.showInputDialog("Informe um numero correspondente ao dia da semana :");
		switch (Integer.valueOf(x)) {
		case 1:
			JOptionPane.showMessageDialog(null, "Segunda-Feira");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Ter�a-Feira");
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
									+ "\n Conceito           C \n             RECUPERA��O")));
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
	 * Exercicio 15 - Fa�a um Programa que pe�a os 3 lados de um tri�ngulo. O
	 * programa dever� informar se os valores podem ser um tri�ngulo. Indique, caso
	 * os lados formem um tri�ngulo, se o mesmo �: equil�tero, is�sceles ou
	 * escaleno. o Dicas: o Tr�s lados formam um tri�ngulo quando a soma de
	 * quaisquer dois lados for maior que o terceiro; o Tri�ngulo Equil�tero: tr�s
	 * lados iguais; o Tri�ngulo Is�sceles: quaisquer dois lados iguais; o Tri�ngulo
	 * Escaleno: tr�s lados diferentes;
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
			r1 = "Os Valores informados n�o formam um triangulo";
			JOptionPane.showMessageDialog(null, r1);
		}

		if (a == b && a == c) {
			r1 = "TRIANGULO EQUIL�TERO";
			JOptionPane.showMessageDialog(null, r1);
		} else if (a == b || a == c || b == c) {
			r1 = "TRIANGULO IS�SCELES";
			JOptionPane.showMessageDialog(null, r1);
		} else {
			r1 = "TRIANGULO ESCALENO";
			JOptionPane.showMessageDialog(null, r1);
		}
		return r1;
	}

	/*
	 * Exercicio 16 - Fa�a um programa que calcule as ra�zes de uma equa��o do
	 * segundo grau, na forma ax2 + bx + c. O programa dever� pedir os valores de a,
	 * b e c e fazer as consist�ncias, informando ao usu�rio nas seguintes
	 * situa��es: a. Se o usu�rio informar o valor de A igual a zero, a equa��o n�o
	 * � do segundo grau e o programa n�o deve fazer pedir os demais valores, sendo
	 * encerrado; b. Se o delta calculado for negativo, a equa��o n�o possui raizes
	 * reais. Informe ao usu�rio e encerre o programa; c. Se o delta calculado for
	 * igual a zero a equa��o possui apenas uma raiz real; informe-a ao usu�rio; d.
	 * Se o delta for positivo, a equa��o possui duas raiz reais; informe-as ao
	 * usu�rio;
	 */
	public static double eq() {
		String x = JOptionPane.showInputDialog("Informe o valor de A");
		if ((Double.valueOf(x) == 0)) {
			String e = "N�o � uma equa��o de segundo grau";
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

	// Exercicio 17 - Fa�a um Programa que pe�a um n�mero correspondente a um
	// determinado ano e em seguida informe se este ano � ou n�o bissexto.
	public static String ano() {
		String x = JOptionPane.showInputDialog("Informe um ano: ");
		if ((Double.valueOf(x) % 400 == 0) || (Double.valueOf(x) % 4 == 0 && (Double.valueOf(x) % 100 != 0))) {
			JOptionPane.showMessageDialog(null, "O Ano Informado � Bissexto");
		} else {
			JOptionPane.showMessageDialog(null, "O Ano Informado n�o � Bissexto");
		}
		return x;
	}

	// Exercicio 18 - Fa�a um Programa que pe�a um n�mero inteiro e determine se ele
	// �
	// par ou impar. Dica: utilize o operador m�dulo (resto da divis�o).
	public static String parImpar() {
		String x = JOptionPane.showInputDialog("Informe um numero: ");
		if ((Double.valueOf(x) % 2 == 0)) {
			JOptionPane.showMessageDialog(null, "Numero informado � par");
		} else {
			JOptionPane.showMessageDialog(null, "Numero informado � impar");
		}
		return x;
	}

	/*
	 * Exercicio 19 - Fa�a um Programa que leia 2 n�meros e em seguida pergunte ao
	 * usu�rio qual opera��o ele deseja realizar. O resultado da opera��o deve ser
	 * acompanhado de uma frase que diga se o n�mero �: . par ou �mpar; a. positivo
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
				r = "Resultado � Positivo";
				JOptionPane.showMessageDialog(null, "Resultado � Positivo");
			} else {
				r = "Resultado � Negativo";
				JOptionPane.showMessageDialog(null, "Resultado � Negativo");
			}
		} else if (z.equalsIgnoreCase("+")) {
			Double sub = (Double.valueOf(x) + (Double.valueOf(y)));
			if (sub >= 0) {
				r = "Resultado � Positivo";
				JOptionPane.showMessageDialog(null, "Resultado � Positivo");
			} else {
				r = "Resultado � Negativo";
				JOptionPane.showMessageDialog(null, "Resultado � Negativo");
			}
		}
		return r;
	}

	/*
	 * Exercicio 20 - Fa�a um programa que fa�a 5 perguntas para uma pessoa sobre um
	 * crime. As perguntas s�o: . "Telefonou para a v�tima?" a.
	 * "Esteve no local do crime?" b. "Mora perto da v�tima?" c.
	 * "Devia para a v�tima?" d. "J� trabalhou com a v�tima?" O programa deve no
	 * final emitir uma classifica��o sobre a participa��o da pessoa no crime. Se a
	 * pessoa responder positivamente a 2 quest�es ela deve ser classificada como
	 * "Suspeita", entre 3 e 4 como "C�mplice" e 5 como "Assassino". Caso contr�rio,
	 * ele ser� classificado como "Inocente".
	 */
	public static String interr() {
		String a = JOptionPane.showInputDialog("Telefonou para a v�tima?");
		String b = JOptionPane.showInputDialog("Esteve no local do crime?");
		String c = JOptionPane.showInputDialog("Mora perto da v�tima?");
		String d = JOptionPane.showInputDialog("Devia para a v�tima?");
		String e = JOptionPane.showInputDialog("J� trabalhou com a v�tima?");

		return interr();
	}

	/*
	 * Exercicio 21 - Um posto est� vendendo combust�veis com a seguinte tabela de
	 * descontos: . �lcool: a. at� 20 litros, desconto de 3% por litro b. acima de
	 * 20 litros, desconto de 5% por litro Gasolina: c. at� 20 litros, desconto de
	 * 4% por litro d. acima de 20 litros, desconto de 6% por litro Escreva um
	 * algoritmo que leia o n�mero de litros vendidos, o tipo de combust�vel
	 * (codificado da seguinte forma: A-�lcool, Ggasolina), calcule e imprima o
	 * valor a ser pago pelo cliente sabendo-se que o pre�o do litro da gasolina �
	 * R$ 2,50 o pre�o do litro do �lcool � R$ 1,90.
	 */
	public static double combustivel() {
		JOptionPane.showMessageDialog(null, "�lcool R$ 1,90 \n Ate 20 Litros, Desconto de 3% por Litro \n"
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
				JOptionPane.showMessageDialog(null, "Total a Pagar � :" + aux);
			} else {
				aux = (aux * 1.90);
				double des = (aux * ((1.90 * 5) / 100));
				JOptionPane.showMessageDialog(null,
						"Valor sem desconto :" + aux + " \n Total de desconto de 5% :" + des);
				aux = aux - des;
				JOptionPane.showMessageDialog(null, "Total a Pagar � :" + aux);
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
				JOptionPane.showMessageDialog(null, "Total a Pagar � :" + aux);
			} else {
				aux = (aux * 1.90);
				double des = (aux * ((1.90 * 5) / 100));
				JOptionPane.showMessageDialog(null,
						"Valor sem desconto :" + aux + " \n Total de desconto de 5% :" + des);
				aux = aux - des;
				JOptionPane.showMessageDialog(null, "Total a Pagar � :" + aux);
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
				JOptionPane.showMessageDialog(null, "Total a Pagar � :" + aux);
			} else {
				aux = (aux * 2.50);
				double des = (aux * ((2.50 * 6) / 100));
				JOptionPane.showMessageDialog(null,
						"Valor sem desconto :" + aux + " \n Total de desconto de 6% :" + des);
				aux = aux - des;
				JOptionPane.showMessageDialog(null, "Total a Pagar � :" + aux);
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
				JOptionPane.showMessageDialog(null, "Total a Pagar � :" + aux);
			} else {
				aux = (aux * 2.50);
				double des = (aux * ((2.50 * 6) / 100));
				JOptionPane.showMessageDialog(null,
						"Valor sem desconto :" + aux + " \n Total de desconto de 6% :" + des);
				aux = aux - des;
				JOptionPane.showMessageDialog(null, "Total a Pagar � :" + aux);
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
	 * Exercicio 22 - .Uma fruteira est� vendendo frutas com a seguinte tabela de
	 * pre�os: At� 5 Kg Acima de 5 Kg Morango R$ 2,50 por Kg R$ 2,20 por Kg Ma�� R$
	 * 1,80 por Kg R$ 1,50 por Kg Se o cliente comprar mais de 8 Kg em frutas ou o
	 * valor total da compra ultrapassar R$ 25,00, receber� ainda um desconto de 10%
	 * sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de
	 * morangos e a quantidade (em Kg) de ma�as adquiridas e escreva o valor a ser
	 * pago pelo cliente.
	 */
	public static double fruta() {
		JOptionPane.showMessageDialog(null,
				"                               Ate 5Kg                       Acima de 5Kg \n"
						+ "Morango           R$2.50 por kg                 R$2.20 por kg \n"
						+ "Ma�a                 R$1.80 por kg                 R$1.50 por kg \n");
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
			JOptionPane.showMessageDialog(null, "Valores informados n�o existem");
			break;
		}
		return som;
	}

	/*
	 * Exercicio 23 - .O Hipermercado Tabajara est� com uma promo��o de carnes que �
	 * imperd�vel. Confira: o At� 5 Kg Acima de 5 Kg o File Duplo R$ 4,90 por Kg R$
	 * 5,80 por Kg o Alcatra R$ 5,90 por Kg R$ 6,80 por Kg o Picanha R$ 6,90 por Kg
	 * R$ 7,80 por Kg Para atender a todos os clientes, cada cliente poder� levar
	 * apenas um dos tipos de carne da promo��o, por�m n�o h� limites para a
	 * quantidade de carne por cliente. Se compra for feita no cart�o Tabajara o
	 * cliente receber� ainda um desconto de 5% sobre o total a compra. Escreva um
	 * programa que pe�a o tipo e a quantidade de carne comprada pelo usu�rio e gere
	 * um cupom fiscal, contendo as informa��es da compra: tipo e quantidade de
	 * carne, pre�o total, tipo de pagamento, valor do desconto e valor a pagar.
	 */
	public static double hipermecado() {
		JOptionPane.showMessageDialog(null,
				"                               Ate 5 kg                    Acima de 5kg \n"
						+ "File Duplo       R$4.90 por kg             R$5.80 por kg \n"
						+ "Alcatra            R$5.90 por kg             R$6.80 por kg \n"
						+ "Picanha          R$6.90 por kg             R$7.80 por kg");
		String t = JOptionPane.showInputDialog("Qual Carne ira querer :");
		String q = JOptionPane.showInputDialog("Quantidade em kg");
		String taba = JOptionPane.showInputDialog("Comprar no Cart�o Tabajara ?");
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
