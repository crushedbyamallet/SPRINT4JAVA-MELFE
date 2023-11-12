package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.beans.Bike;
import br.com.fiap.conexoes.ConexaoFactory;

public class BikeDAO {
	public Connection minhaConexao;
	
	public BikeDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	//Insert
	public String inserir (Bike bike) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement
				("insert into clienteendereco values (?,?,?,?,?)");
		stmt.setInt(1, bike.getIdBike());
		stmt.setDouble(2, bike.getPreco());
		stmt.setString(3, bike.getnSerie());
		stmt.setString(4, bike.getMarca());
		stmt.setString(5, bike.getEletrica());
		stmt.execute();
		stmt.close();
		
		return "Cadastrado com sucesso";
	
	}
	
	

}