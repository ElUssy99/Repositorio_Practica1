package GitHab_Ej;

import javax.swing.*;

public class OptionPane_Saludar {
	
	JFrame f = new JFrame();
	
	OptionPane_Saludar(){
		JOptionPane.showMessageDialog(f, "Hola, bienvenido a GitHab");
	}
	
	public static void main(String[] args) {
		new OptionPane_Saludar();
	}
}
