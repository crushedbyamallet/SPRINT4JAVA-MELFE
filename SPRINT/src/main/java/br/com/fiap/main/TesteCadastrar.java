package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.ClasseCliente;
import br.com.fiap.dao.ClasseClienteDAO;

public class TesteCadastrar {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro (String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ClasseClienteDAO dao = new ClasseClienteDAO();
		
		ClasseCliente objClasseCliente = new ClasseCliente();
		
		objClasseCliente.setEmail(texto("Email"));
		objClasseCliente.setSenha(texto("Senha"));
		objClasseCliente.setIdCliente(inteiro("ID"));
	
		
		System.out.println(dao.inserir(objClasseCliente));
		
}

}
