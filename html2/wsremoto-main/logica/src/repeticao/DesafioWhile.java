package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {

		short ano = Short.parseShort(JOptionPane.showInputDialog("Digite Ano:"));

		while (ano<=1900 || ano >=2002)  {
			ano = Short.parseShort(JOptionPane.showInputDialog("Digite um ano entre 1900 e 2002 "));
		}

		byte mes = Byte.parseByte(JOptionPane.showInputDialog("Digite Mês:"));
		while (mes<1 || mes >12) {
			mes = Byte.parseByte(JOptionPane.showInputDialog("Digite um mês valido "));
		}

		byte dia = Byte.parseByte(JOptionPane.showInputDialog("Digite Mês:"));
		if (mes==2) {
			while (dia<1 || dia >29) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Digite um dia valido "));
			}

		}else if (mes==4 || mes==6 || mes==9 || mes==12) {
			while (dia<1 || dia >30) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Digite um dia valido "));
			}
		}else {
			while (dia<1 || dia >31) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Digite um dia valido "));
			}
		}
		System.out.println("A data digitada foi:" + dia + "/" + mes + "/" + ano);
	}

}
