package exercicios2;

import javax.swing.JOptionPane;

public class Exercicios2 {

	public static void main(String[] args) {
		
		try {
		
		String x = JOptionPane.showInputDialog("Qual Exercicio sera realizado ?");
		int r = (Integer.valueOf(x));
		
		switch (r) {
		case 1:JOptionPane.showMessageDialog(null,"Exercicio 1 \n \n "+"O Maior numero é :"+Codigos2.maiorNumero()); break;
		
		case 2:JOptionPane.showMessageDialog(null,"Exercicio 2 \n \n "+"O Maior numero é :"+Codigos2.positivoNegativo()); break;
		
		case 3:JOptionPane.showMessageDialog(null,"Exercicio 3 \n \n "+"O Maior numero é :"+Codigos2.mf()); break;
		
		case 4:Codigos2.vc(); break;
		
		case 5:JOptionPane.showMessageDialog(null, Codigos2.media()); break;
		
		case 6:JOptionPane.showMessageDialog(null,"Exercicio 6 \n \n "+"O Maior numero é :"+Codigos2.maior()); break;
		
		case 7:JOptionPane.showMessageDialog(null,"Exercicio 7 \n \n "+"O Maior numero é :"+Codigos2.maior()+"\n \n"+
		"O Menor numero é :"+Codigos2.menor()); break;
		
		
		case 8:JOptionPane.showMessageDialog(null,"Exercicio 8 \n \n "+Codigos2.comprar()); break;
		
		case 9:JOptionPane.showMessageDialog(null,"Exercicio 9 \n \n "+Codigos2.dec()); break;
		
		case 10:Codigos2.turno(); break;
		
		case 11:Codigos2.aumentoS(); break;
		
		case 12:Codigos2.folhaPagamento(); break;
		
		case 13:Codigos2.diaSemana(); break;
		
		case 14:Codigos2.mediaNota(); break;
		
		case 15:Codigos2.triangulo(); break;
		
		case 16:Codigos2.eq(); break;
		
		case 17:Codigos2.ano(); break;
		
		case 18:Codigos2.parImpar(); break;
		
		case 19:Codigos2.posNeg(); break;
		
		case 20:Codigos2.interr(); break;
		
		case 21:Codigos2.combustivel(); break;
		
		case 22:Codigos2.fruta(); break;
		
		case 23:Codigos2.hipermecado(); break;
		
		default: JOptionPane.showMessageDialog(null, "Informação invalida");
			break;
		}
		
	}catch (Exception e) {
		e.printStackTrace();
		JOptionPane.showMessageDialog(null, "Erro ao processar o arquivo");
	}
	}
}

