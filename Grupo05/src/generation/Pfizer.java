package generation;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Pfizer extends Controlador{
	
	
	String pfizer = "\nO imunizante da farmacêutica Pfizer em parceria com o laboratório BioNTech "
			+ "\nse baseia na tecnologia de RNA mensageiro, ou mRNA. "
			+ "\nO RNA mensageiro sintético dá as instruções ao organismo para a"
			+ "\nprodução de proteínas encontradas na superfície do novo coronavírus, "
			+ "\nque estimulam a resposta do sistema imune."
			+ "\nFonte: Butantan Oficial "; 
	
	
	Object option[] = {"Efeitos Adversos", "Fabricante", "Voltar"};
			
	ImageIcon image = new ImageIcon("src/Imagens/Pfizer.png");
	
	public void intro() {
		
		int resposta = JOptionPane.showOptionDialog(null, 
				pfizer,                               //Mensagem
				"Pfizer - Biontech",                  //T�tulo
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.PLAIN_MESSAGE,
				image,								  //Icone
				option,                               //Um vetor de op��es para cada bot�o
				null);								  //Op��o de bot�o default
		
		
		switch (resposta) {
			case 0:  JOptionPane.showMessageDialog(null, "Locais: Dor, Edema e Rubor no local da aplicão."
					+ "\nSistêmicos: Fadiga, Febre, Calafrios, Cefaléia, Náusea, Artralgia, Mialgia, Diarreia."
					+ "\nFonte: TeleSaude Rio Grande do Sul - UFGRS");  // como colocar titulo em cada caixinha do OptionPane? 
			                                                            // Nao consigo incluir a imagem png.
				intro();
				break;
			
			case 1:  JOptionPane.showMessageDialog(null, "BioNTech, Fosun Pharma, Pfizer\nhttps://www.pfizer.com.br/");
				intro();
				break;
			case 2: 
				escolhaVacinas();
				break;
			
		
		
		}
	}
}



