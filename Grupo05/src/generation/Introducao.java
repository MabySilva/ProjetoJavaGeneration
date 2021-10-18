package generation;

import javax.swing.ImageIcon;

import javax.swing.JOptionPane;

public class Introducao {
   
	String mensagem = "\n"
			+"As vacinas são o meio mais seguro e eficaz de nos protegermos contra certas doenças infecciosas,"
			+ "\n"				
			+ "e são obtidas a partir de partículas do próprio agente agressor, sempre na forma atenuada (enfraquecida) ou inativada (morta).\n"	
			+ "Quando nosso organismo é atacado por um vírus ou bactéria, nosso sistema imunológico — de defesa — dispara uma reação em cadeia"
			+ "\n"	
			+ "com o objetivo de frear a ação desses agentes estranhos. Infelizmente, nem sempre essa ‘operação’ é bem-sucedida e, quando isso ocorre, ficamos doentes.\r\n"
			+ "O que as vacinas fazem é se passarem por agentes infecciosos de forma a estimular a produção de nossas defesas, por meio de anticorpos específicos contra o “inimigo”."
			+ "\nAssim, elas ensinam o nosso organismo a se defender de forma eficaz. Aí, quando o ataque de verdade acontece, a defesa é reativada por meio da memória do sistema imunológico "
			+ "\nÉ isso que vai fazer com que a ação inimiga seja muito limitada ou, como acontece na maioria das vezes, totalmente eliminada, antes que a doença se instale.";

	Object options[] = {"Próximo>"};
	
	ImageIcon image = new ImageIcon("src/Imagens/vaccine.png");

	
	public int intro() {
		
		int resposta = JOptionPane.showOptionDialog(null, 
				mensagem, 							  //Mensagem
				"Vamos falar sobre vacinas?",		  //T�tulo
				JOptionPane.YES_NO_CANCEL_OPTION,	
				JOptionPane.PLAIN_MESSAGE,
				image,								  //Icone
				options,  							  //Um vetor de op��es para cada bot�o
				null);								  //Op��o de bot�o default
		
		
		return resposta;
	}
}
