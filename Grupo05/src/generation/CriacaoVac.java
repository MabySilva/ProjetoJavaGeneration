package generation;


import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CriacaoVac extends Controlador {
	
	
	
	
	ImageIcon image = new ImageIcon("src/Imagens/lab.png");
	
	String Criacao = "Existem alguns métodos de criação das vacinas. \nPrimeiramente o vírus precisa ser identificado em estudos laboratoriais para avaliar qual o melhor método. \r\n"
					  + "Os cientistas podem utilizar partes do vírus, componentes criados em engenharia genética, \nvírus e bactérias causadores de outras doenças ou até materiais genéticos humanos. \n "
					  + "\nEscolha um método de produção:\n\n";
	
	Object op[] = {"Próximo>"};
	
	Object options[] = {"Vírus desativado ou enfraquecido\n", "Unidade de proteína do vírus", "\nDNA e RNA", "\n\nPartículas semelhantes", "Outros vírus e bactérias","Próximo>"};
	
	

	
		public void criacaoVac_() {
			
			
		
		
			int resposta = JOptionPane.showOptionDialog(null, 
				Criacao, 							  	
				"Como as vacinas são criadas?",		  	
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.PLAIN_MESSAGE,
				image,								  	
				options,                              		
				null);	
		

		
		
		switch (resposta) {
		case 0:  JOptionPane.showMessageDialog(null, 
				"Há duas formas de utilizar esse método:\r\n\n"
				+ "*Alguns cientistas enfraquecem o vírus com um processo de mutação para que haja \nmenos riscos de causar doenças ao ser inserido no organismo. \r\n\n"
				+ "*Outros desativam totalmente o vírus com procedimentos químicos ou calor \ndesta forma,\r"
				+ " o vírus não causa doenças. \n\nPara o procedimento ser seguro, passa por mais fases de testes do que outros tipos de vacinas.", 
				"Vírus desativado ou enfraquecido:", 
				1);
			criacaoVac_();
		break;
			
		
		case 1:  JOptionPane.showMessageDialog(null,
				"Considerada a forma mais segura, nesta metodologia é usada a 'casca' \r"
				+ "sem o material genético do \nvírus para estimular uma resposta do sistema imunológico. \n"
				+ "Há casos ainda em que cientistas usam a proteína spike, que tem papel na entrada do vírus na célula. \r\n"
				+ "Geralmente, essa parte é misturada com outras substâncias para ter mais eficácia.", 
				"Unidade de proteína do vírus:", 
				1);
			criacaoVac_();
		break;
		
		
		case 2: JOptionPane.showMessageDialog(null, 
				"Esse tipo de tecnologia ainda não possui eficácia comprovada, pois nunca foi utilizada em vacinas licenciadas. \r\n"
				+ "No entanto, como envolvem apenas o material genético e não o vírus, é fácil de produzir. \r\n"
				+ "O objetivo dela é fazer com que as células do corpo humano produzam cópias de proteínas do vírus. \r\n"
				+ "Para isto, o material genético do patogênico é inserido em um anel sintético de DNA ou em uma fita fabricada de RNA e \r\n"
				+ "depois é colocado no organismo humano.", 
				"DNA e RNA:", 
				1);
			criacaoVac_();
		break;
		
		
		case 3: JOptionPane.showMessageDialog(null, 
				"São criadas em laboratório para imitarem a estrutura \ndo vírus e aumentarem a resposta \r"
				+ "do sistema imunológico.", 
				"Partículas semelhantes:", 
				1);
			criacaoVac_();	
		break;
		
		
		case 4: JOptionPane.showMessageDialog(null, 
				"Algumas vacinas são criadas a partir de vírus e bactérias inofensivos no lugar \ndo vírus \r"
				+ "que se quer combater. \nA ideia é inserir uma quantidade segura para estimular o organismo a criar \nanticorpos e se \r"
				+ "proteger do vírus que causa a doença.", 
				"Outros vírus e bactérias", 
				1);
			criacaoVac_();
		break;
		
		case 5: escolhaVacinas();
		break;
		}
		
	
	}
}
