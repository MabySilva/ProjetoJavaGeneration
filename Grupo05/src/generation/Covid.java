package generation;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Covid {

	String mensagem = "Olá, vamos falar sobre o Covid-19?\n"
			+ "A pandemia da doença causada pelo novo coronavírus em 2019, COVID-19, "			
			+ "tem impactado sobremaneira o cenário mundial, agravando as taxas de morbidade\n"
			+ "e mortalidade.\n"	
			+ "Diante desse cenário, é urgente a necessidade de capacitar e qualificar profissionais da área de saúde no enfrentamento dessa doença."
			+ "\n"	
			+ "A pandemia da doença causada pelo novo coronavírus 2019 (COVID-19) tornou-se um dos grandes desafios do século XXI.\n"
			+ "Atualmente, acomete mais de 100 países e territórios nos cinco continentes. Seus impactos ainda são inestimáveis, mas afetam direta e/ou indiretamente\n"
			+ "a saúde e a economia da população mundial. "
			+ "\nPor conta disso, é extremamente importante que tenhamos cuidado ao sair de casa, temos que nos cuidar, sempre que possível\n"
			+ "lave as mãos, passe álcool em gel, e vacine-se, para assim, isso acabar o mais rápido possível!. "
			+ "\nE falando em vacinas, vamos entender um pouco mais sobre elas?";

	Object options[] = {"Próximo>"};
	
	ImageIcon image = new ImageIcon("src/Imagens/icon.jpg");

	
	public void covidMensagem() {
		
		int respostaCovid = JOptionPane.showOptionDialog(null, 
				mensagem, 							
				"Vamos falar sobre vacinas?",		 
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.PLAIN_MESSAGE,
				image,								 
				options,                             
				null);								  
		
	
	}
	
	
}