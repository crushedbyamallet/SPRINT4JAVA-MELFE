package br.com.fiap.bo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.beans.Bike;
import br.com.fiap.conexoes.ConexaoFactory;

public class BikeBO {
    public Connection minhaConexao;

    public BikeBO() throws ClassNotFoundException, SQLException {
        super();
        this.minhaConexao = new ConexaoFactory().conexao();
    }

    // Insert
    public String inserir(Bike bike) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement(
                "INSERT INTO tabela_bikes (id, preco, nSerie, marca, eletrica) VALUES (?,?,?,?,?)");
        stmt.setInt(1, bike.getIdBike());
        stmt.setDouble(2, bike.getPreco());
        stmt.setString(3, bike.getnSerie());
        stmt.setString(4, bike.getMarca());
        stmt.setString(5, bike.getEletrica());
        stmt.execute();
        stmt.close();

        return "Cadastrado com sucesso";
    }

    // Update
    public String atualizar(Bike bike) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement(
                "UPDATE tabela_bikes SET preco = ?, nSerie = ?, marca = ?, eletrica = ? WHERE id = ?");
        stmt.setDouble(1, bike.getPreco());
        stmt.setString(2, bike.getnSerie());
        stmt.setString(3, bike.getMarca());
        stmt.setString(4, bike.getEletrica());
        stmt.setInt(5, bike.getIdBike());
        stmt.execute();
        stmt.close();

        return "Atualizado com sucesso";
    }

    // Delete
    public String deletar(int idBike) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement("DELETE FROM tabela_bikes WHERE id = ?");
        stmt.setInt(1, idBike);
        stmt.execute();
        stmt.close();

        return "Deletado com sucesso";
    }

	public ArrayList<Bike> selecionarBo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
