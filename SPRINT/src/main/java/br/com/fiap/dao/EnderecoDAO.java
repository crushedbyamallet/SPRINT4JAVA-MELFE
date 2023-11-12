package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.beans.Endereco;
import br.com.fiap.conexoes.ConexaoFactory;

public class EnderecoDAO {
	public Connection minhaConexao;
	
	public EnderecoDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	//Insert
	public String inserir (Endereco endereco) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement
				("insert into clienteendereco values (?,?,?,?,?,?,?)");
		stmt.setInt(1, endereco.getId());
		stmt.setString(2, endereco.getLogradouro());
		stmt.setString(3, endereco.getBairro());
		stmt.setString(4, endereco.getCidade());
		stmt.setString(5, endereco.getEstado());
		stmt.setInt(6, endereco.getNumero());
		stmt.setString(7, endereco.getComplemento());
		stmt.execute();
		stmt.close();
		
		return "Cadastrado com sucesso";
	
	}
	

}