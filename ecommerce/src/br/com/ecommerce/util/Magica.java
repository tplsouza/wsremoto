package br.com.ecommerce.util;

import javax.swing.JOptionPane;

public class Magica {

	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	public static float f(String msg) {
		return Float.parseFloat(s(msg));
	}
	
	public static int i(String msg) {
		return Integer.parseInt(s(msg));
	}
	
	public static boolean b(String msg) {
		return Boolean.parseBoolean(s(msg));
	}
}
