package generation;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Prevencao {
	
	
	ImageIcon image = new ImageIcon("src/Imagens/prevencao.png");
	ImageIcon imagem = new ImageIcon("src/Imagens/aglomeracao.png");
	ImageIcon imagem1 = new ImageIcon("src/Imagens/Mascara.png");
	ImageIcon imagem2 = new ImageIcon("src/Imagens/cobrir.png");
	ImageIcon imagem3 = new ImageIcon("src/Imagens/limpeza.png");
	ImageIcon imagem4 = new ImageIcon("src/Imagens/Sintomas.png");
	ImageIcon imagem5 = new ImageIcon("src/Imagens/ContraCovid.png");
	
	
	String Criacao = "A melhor maneira de se prevenir dessa doença é evitar a exposição à ela. \r\n"
			+ "E como isso pode ser feito?";
	
	Object op[] = {"Próximo >"};
	
	
	
	public void prevencao() {
		
			JOptionPane.showOptionDialog(null, 
				Criacao, 							  	
				"Prevenção contra o Coronavírus",		  	
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.PLAIN_MESSAGE,
				imagem5,								  	
				op,                              		
				null);	
		
		
		JOptionPane.showOptionDialog(null, 
				"Lave as mãos frequentemente com água e sabão, se água e sabão não estiverem disponíveis, use álcool 70%. \nCubra todas as áreas de suas mãos e esfregue-as até sentir \r"
				+ "que elas estão secas. \nEvite tocar nos olhos, nariz e na boca com as mãos não higienizadas.", 							  	
				"Prevenção contra o Coronavírus",		  	
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.PLAIN_MESSAGE,
				image,								  	
				op,                              		
				null);	
		
		
		JOptionPane.showOptionDialog(null, "Evite contato próximo, mesmo dentro de sua casa. \n"
				+ "Ao sair de casa, mantenha distância (2m) de outras pessoas;\r\n"
				+ "lembre-se de que algumas pessoas sem sintomas podem transmitir o vírus.", 
				"Prevenção contra o Coronavírus", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.PLAIN_MESSAGE, 
				imagem, 
				op, 
				null);
		
		
		JOptionPane.showOptionDialog(null, 
				"Use máscaras;\r\n"
				+ "cubra toda a boca e o nariz, todos devem usar quando tiverem que sair em público;\r\n"
				+ "mesmo com o uso das máscaras, continue mantendo cerca de 2 metros entre você e os outros.\r\n", 
				"Prevenção contra o Coronavírus", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.PLAIN_MESSAGE, 
				imagem1, 
				op, 
				null);
		
		
		JOptionPane.showOptionDialog(null, 
				"Cubra tosses e espirros;\r\n"
				+ "Se você não estiver de máscaras, cubra a boca e o nariz com um lenço de papel quando tossir ou espirrar, ou use a parte interna do cotovelo;\r\n"
				+ "lembre-se de lavar imediatamente as mãos.", 
				"Prevenção contra o Coronavírus" , 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.PLAIN_MESSAGE, 
				imagem2, 
				op, 
				null);
		
		
		JOptionPane.showOptionDialog(null, 
				"Limpe e desinfete diariamente as superfícies tocadas com frequência.\r\n"
				+ "Use detergente ou sabão e água antes da desinfecção, em seguida, use um desinfetante doméstico.", 
				"Prevenção contra o Coronavírus", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.PLAIN_MESSAGE, 
				imagem3,
				op, 
				null);
		
		JOptionPane.showOptionDialog(null, 
				"Cuide da sua saúde! Esteja alerta para os sintomas. \nObserve febre, tosse, falta de ar, especialmente se você estiver executando tarefas fora de casa;\r\n"
				+ "meça sua temperatura e se os sintomas persistirem procure orientações médicas.", 
				"Prevenção contra o Coronavírus", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.PLAIN_MESSAGE, 
				imagem4, 
				op, 
				null);
	

	}
}
