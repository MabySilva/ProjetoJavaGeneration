package generation;

import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Controlador {
	
	public static void main(String[] args) {
		
		Introducao i = new Introducao();
		Pfizer p = new Pfizer();
		Janssen j = new Janssen();
		Covid c = new Covid();
		CriacaoVac cri = new CriacaoVac();
		Prevencao pre = new Prevencao();

		int resposta = 0; 
		//Ordem das coisas

		c.covidMensagem();
		pre.prevencao();
	    cri.criacaoVac_();
		escolhaVacinas();
								      	 												   	

	}
	
	public static void escolhaVacinas() {
		Object[] options = {"Pfizer","CoronaVac", "AstraZeneca", "Janssen", "Sair"};
		Introducao i = new Introducao();
		Pfizer p = new Pfizer();
		Janssen j = new Janssen();
	    Fabricantes fab = new Fabricantes();
		
		ImageIcon image = new ImageIcon("src/Imagens/vaccine.png");
		ImageIcon qr = new ImageIcon("src/Imagens/qr-code.png");
		
	 	int resposta = JOptionPane.showOptionDialog(null,
	 		"Conheça um pouco mais sobre os fabricantes das vacinas distribuídas no Brasil. \n\nSobre qual fabricante você quer saber?\n\n",     
			"Vamos falar sobre vacinas?",             
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.PLAIN_MESSAGE,
			image,								      
			options,                                  
			null);	
	 	 
			switch (resposta) {
			case 0: 
				p.intro();
				break; 	
			case 1: 
				fab.coronaVac();
				break;
			case 2:
				fab.astrazeneca();
				break;
			case 3:
				j.intro();
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "","Créditos", JOptionPane.PLAIN_MESSAGE, qr);
				System.out.println(resposta);
				break;
			case -1:
				JOptionPane.showMessageDialog(null, "","Créditos", JOptionPane.PLAIN_MESSAGE, qr);
				break;
			}
	}
}


