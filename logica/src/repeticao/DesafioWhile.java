package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {

		int ano = Integer.parseInt(JOptionPane.showInputDialog("insira ano"));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("insira mes"));
		int dia = Integer.parseInt(JOptionPane.showInputDialog("insira dia"));



		while (ano>=2002 || ano<=1900 ) {
			ano= Integer.parseInt(JOptionPane.showInputDialog("insira ano entre 1900 e 2002"));}
		while (mes<1 || mes > 12) {
			mes = Integer.parseInt(JOptionPane.showInputDialog("insira mes entre 1 e 12"));}

		if (mes == 2) {
			while (dia < 1 || dia > 28) {
				dia = Integer.parseInt(JOptionPane.showInputDialog("insira dia entre 1 e 28"));
			}}

		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			while (dia < 1 || dia > 31) {
				dia = Integer.parseInt(JOptionPane.showInputDialog("insira dia entre 1 e 31"));
			}}
		else {
			while (dia < 1 || dia > 30) {
				dia = Integer.parseInt(JOptionPane.showInputDialog("insira dia entre 1 e 30"));
			}

		}
		System.out.println("Data: "+dia+"/"+mes+"/"+ano);

	}
}

