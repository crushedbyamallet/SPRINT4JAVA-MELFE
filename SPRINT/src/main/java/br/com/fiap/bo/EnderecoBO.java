package br.com.fiap.bo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.beans.Endereco;
import br.com.fiap.conexoes.ConexaoFactory;

public class EnderecoBO {
    public Connection minhaConexao;

    public EnderecoBO() throws ClassNotFoundException, SQLException {
        super();
        this.minhaConexao = new ConexaoFactory().conexao();
    }

    // Insert
    public String inserir(Endereco endereco) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement(
                "INSERT INTO clienteendereco (id, logradouro, bairro, cidade, estado, numero, complemento) VALUES (?,?,?,?,?,?,?)");
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

    // Update
    public String atualizar(Endereco endereco) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement(
                "UPDATE clienteendereco SET logradouro = ?, bairro = ?, cidade = ?, estado = ?, numero = ?, complemento = ? WHERE id = ?");
        stmt.setString(1, endereco.getLogradouro());
        stmt.setString(2, endereco.getBairro());
        stmt.setString(3, endereco.getCidade());
        stmt.setString(4, endereco.getEstado());
        stmt.setInt(5, endereco.getNumero());
        stmt.setString(6, endereco.getComplemento());
        stmt.setInt(7, endereco.getId());
        stmt.execute();
        stmt.close();

        return "Atualizado com sucesso";
    }

    // Delete
    public String deletar(int idEndereco) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement("DELETE FROM clienteendereco WHERE id = ?");
        stmt.setInt(1, idEndereco);
        stmt.execute();
        stmt.close();

        return "Deletado com sucesso";
    }

    // Select
    public ArrayList<Endereco> selecionar() throws SQLException {
        ArrayList<Endereco> listaEnderecos = new ArrayList<>();
        PreparedStatement stmt = minhaConexao.prepareStatement("SELECT * FROM clienteendereco");
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Endereco endereco = new Endereco();
            endereco.setId(rs.getInt("id"));
            endereco.setLogradouro(rs.getString("logradouro"));
            endereco.setBairro(rs.getString("bairro"));
            endereco.setCidade(rs.getString("cidade"));
            endereco.setEstado(rs.getString("estado"));
            endereco.setNumero(rs.getInt("numero"));
            endereco.setComplemento(rs.getString("complemento"));
            listaEnderecos.add(endereco);
        }

        rs.close();
        stmt.close();

        return listaEnderecos;
    }
}
