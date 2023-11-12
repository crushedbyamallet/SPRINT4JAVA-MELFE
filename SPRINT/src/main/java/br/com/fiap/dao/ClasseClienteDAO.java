package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.beans.ClasseCliente;
import br.com.fiap.conexoes.ConexaoFactory;

public class ClasseClienteDAO {
	public Connection minhaConexao;
	
	public ClasseClienteDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	//Insert
	public String inserir (ClasseCliente classeCliente) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement
				("insert into cliente values (?,?,?)");
		stmt.setString(1, classeCliente.getEmail());
		stmt.setString(2, classeCliente.getSenha());
		stmt.setInt(3, classeCliente.getIdCliente());
		stmt.execute();
		stmt.close();
		
		return "Cadastrado com sucesso";
	
	}
	
	

}