package generation;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Fabricantes extends Controlador{
	
	
			
		
		
		
		ImageIcon butantan = new ImageIcon("src/Imagens/butantan.png");
		ImageIcon astrazeneca = new ImageIcon("src/Imagens/astrazeneca.png");
		
		String mensagem = "Conheça um pouco mais sobre os fabricantes das vacinas distribuídas no Brasil. \n\nSobre qual fabricante você quer saber?\n\n";
		
		Object ope[] = {"Efeitos Adversos", "Fabricante", "Voltar"};
		
		public void coronaVac() {
			
			int resposta = JOptionPane.showOptionDialog(null, 
					"No Brasil, a empresa privada chinesa Sinovac ganhou destaque devido ao acordo com o governo do estado de São Paulo para a produção da vacina Coronavac no país, \r"
					+ "pelo Instituto Butantan.\r\n"
					+ "A Sinovac Biotech é uma das principais biofarmacêuticas chinesas, e foi fundada em 1993 em Pequim, na China, tendo 910 funcionários e é responsável por cerca de 20% \r\n"
					+ "do mercado chinês de vacinas, produzindo 20 milhões de doses por ano.\r\n"
					+ "A empresa foi a primeira a desenvolver e conseguir registro de uma vacina contra o vírus H1N1, em 2009.\r\n"
					+ "No caso da covid-19, a tecnologia usada é o próprio coronavírus “morto”. Por estar inativado, ele não causa doença, mas gera uma resposta do sistema imune. \r\n"
					+ "Essa tecnologia, dominada pelo Instituto Butantan, é a mais antiga na fabricação de vacinas no mundo. ",
					"CoronaVac", 
					JOptionPane.YES_NO_CANCEL_OPTION, 
					JOptionPane.PLAIN_MESSAGE, 
					butantan, 
					ope, 
					null);
			
	        switch (resposta) {
		        case 0:  JOptionPane.showMessageDialog(null, "reações no local da aplicação: dor, vermelhidão na pele e inchaço;\r\n"
		                + "\r\n"
		                + "efeitos colaterais gerais: dor de cabeça, sensação de muito cansaço, dores musculares, náusea, febre.");
		        	coronaVac();
		        	break;
		        case 1:  JOptionPane.showMessageDialog(null, "Instituto Butantan\nhttps://butantan.gov.br/");
		        	coronaVac();
		        	break;
		        case 2:	 escolhaVacinas();
		        	break;
	        }
		}
		
		
		public void astrazeneca() {
			
			int resposta = JOptionPane.showOptionDialog(null, 
					"A AstraZeneca foi fundada em 1999, depois de uma fusão entre a sueca Astra e a britânica Zeneca. \r\n"
					+ "Com sede em Cambridge, na Inglaterra, tem mais de 70 mil funcionários e investe, principalmente, em medicamentos para tratamentos de câncer, doenças cardiovasculares, renais e respiratórias.\r\n"
					+ "Seu imunizante é produzido no Brasil pela Fiocruz (Fundação Oswaldo Cruz), depois de um acordo de encomenda tecnológica firmado com o governo federal por R$ 1,99 bilhão.", 
					"AstraZeneca",
					JOptionPane.YES_NO_CANCEL_OPTION, 
					JOptionPane.PLAIN_MESSAGE, 
					astrazeneca, 
					ope, 
					null);
			
	        switch (resposta) {
	        case 0:  JOptionPane.showMessageDialog(null, "Sensibilidade no local da injeção, dor de cabeça e fadiga, Dor no corpo e mal-estar\r\n"
	                + "Febre e calafrios e Dor nas articulações e náusea");
	        	astrazeneca();
	        	break;
	        case 1:  JOptionPane.showMessageDialog(null, "AstraZeneca\nhttps://www.astrazeneca.com.br/");
	        	astrazeneca();
	        	break;
	        case 2:	 escolhaVacinas();
	        	break;
        }
			
		}
		
		public void fabricantes (){
			
			
				
		int resposta = JOptionPane.showOptionDialog(null, 
				mensagem, 
				"Fabricantes das Vacinas", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.PLAIN_MESSAGE, 
				null, 
				ope, 
				null);
			
			
			
			switch(resposta) {
			
			case 0: 
				JOptionPane.showMessageDialog(null, 
						"A AstraZeneca foi fundada em 1999, depois de uma fusão entre a sueca Astra e a britânica Zeneca. \r\n"
						+ "Com sede em Cambridge, na Inglaterra, tem mais de 70 mil funcionários e investe, principalmente, em medicamentos para tratamentos de câncer, doenças cardiovasculares, renais e respiratórias.\r\n"
						+ "Seu imunizante é produzido no Brasil pela Fiocruz (Fundação Oswaldo Cruz), depois de um acordo de encomenda tecnológica firmado com o governo federal por R$ 1,99 bilhão.", 
						"AstraZeneca",
						1);
		
				break;
				
			case 1:
				JOptionPane.showMessageDialog(null, 
						"No Brasil, a empresa privada chinesa Sinovac ganhou destaque devido ao acordo com o governo do estado de São Paulo para a produção da vacina Coronavac no país, \r"
						+ "pelo Instituto Butantan.\r\n"
						+ "A Sinovac Biotech é uma das principais biofarmacêuticas chinesas, e foi fundada em 1993 em Pequim, na China, tendo 910 funcionários e é responsável por cerca de 20% \r\n"
						+ "do mercado chinês de vacinas, produzindo 20 milhões de doses por ano.\r\n"
						+ "A empresa foi a primeira a desenvolver e conseguir registro de uma vacina contra o vírus H1N1, em 2009.\r\n"
						+ "No caso da covid-19, a tecnologia usada é o próprio coronavírus “morto”. Por estar inativado, ele não causa doença, mas gera uma resposta do sistema imune. \r\n"
						+ "Essa tecnologia, dominada pelo Instituto Butantan, é a mais antiga na fabricação de vacinas no mundo. ",
						"CoronaVac", 
						1);
	
				break;
				
			case 2:
				JOptionPane.showMessageDialog(null, "A Janssen-Cilag (chamada assim na maioria dos países), é uma companhia farmacêutica da Bélgica, fundada em 1935.\r\n"
						+ "Atualmente ela é o braço farmacêutico da multinacional Johnson & Johnson.\r\n"
						+ "O imunizante utiliza a tecnologia de vetor viral, um vírus enfraquecido que transporta os genes virais para dentro das células, estimulando a resposta imunológica. \r\n"
						+ "A vacina Janssen já foi autorizada em 44 países e faz parte da lista de 7 imunizantes aprovados para uso pela OMS, \r\n"
						+ "é aplicada em dose única, diferentemente de todas as outras vacinas aplicadas nos países ocidentais.", 
						"Janssen", 
						1);
				;
				
				break;
				
			case 3: 
				JOptionPane.showMessageDialog(null, "A multinacional Pfizer que tem sede em Nova York, foi fundada em 1849 nos Estados Unidos pelo imigrante alemão Charles Pfizer, em parceria com um primo.  \r\n"
						+ "Foi a primeira a divulgar, em 9 de novembro, uma taxa de eficácia superior a 90% obtida na fase 3 de testes com sua vacina contra o novo coronavírus. \r\n"
						+ "O produto é desenvolvido em parceria com a empresa alemã de biotecnologia BioNTech.\r\n"
						+ "O laboratório investiu numa vacina genética, baseada no RNA mensageiro.  \r\n"
						+ "Um de seus mais conhecidos produtos é o Viagra, remédio para disfunção erétil aprovado em 1998.\r\n"
						+ "A Pfizer tem mais de 88 mil funcionários em todo o mundo. \r\n"
						+ "Já a BioNTech, bem menor e com uma história muito mais recente do que a parceira, foi fundada em 2008 por um casal de médicos com o foco em tratamentos para o câncer. \r\n"
						+ "Ela tem 1.800 funcionários e já vinha trabalhando desde 2018 com a Pfizer numa vacina contra a gripe.", 
						"Pfizer", 
						1);
				;
			
				break;
			
			}		
		}
}