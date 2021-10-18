package generation;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Janssen extends Controlador{


    String Janssen = "Do grupo Johnson & Johnson, a vacina do laboratório Janssen é aplicada em apenas uma dose,"
            + "\n mas ainda não está disponível no Brasil. Assim como o imunizante da Astrazeneca,"
            + "\n também se utiliza da tecnologia de vetor viral, baseado em um tipo específico de adenovírus"
            + "\n que foi geneticamente modificado para não se replicar em humanos.  "; 


    Object option[] = {"Efeitos Adversos", "Fabricante", "Voltar"};

    ImageIcon image = new ImageIcon("src/Imagens/Janssen.png");

    public void intro() {

        int resposta = JOptionPane.showOptionDialog(null, 
                Janssen,
                " Johnson & Johnson",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                image,
                option,
                null);


        switch (resposta) {
	        case 0:  JOptionPane.showMessageDialog(null, "reações no local da aplicação: dor, vermelhidão na pele e inchaço;\r\n"
	                + "\r\n"
	                + "efeitos colaterais gerais: dor de cabeça, sensação de muito cansaço, dores musculares, náusea, febre.");
	        	intro();
	        	break;
	        case 1:  JOptionPane.showMessageDialog(null, " Johnson & Johnson\nhttps://www.janssen.com/brasil/");
	        	intro();
	        	break;
	        case 2:	 escolhaVacinas();
	        	break;
        }
    }
}