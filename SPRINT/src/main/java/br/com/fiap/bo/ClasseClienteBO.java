package br.com.fiap.bo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.beans.ClasseCliente;
import br.com.fiap.conexoes.ConexaoFactory;
import br.com.fiap.model.Cliente;

public class ClasseClienteBO {
    public Connection minhaConexao;

    public ClasseClienteBO() throws ClassNotFoundException, SQLException {
        super();
        this.minhaConexao = new ConexaoFactory().conexao();
    }

    // Insert
    public String inserir(Cliente cliente) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement(
                "INSERT INTO cliente (email, senha, idCliente) VALUES (?,?,?)");
        stmt.setString(1, cliente.getEmail());
        stmt.setString(2, cliente.getSenha());
        stmt.setInt(3, cliente.getIdCliente());
        stmt.execute();
        stmt.close();

        return "Cadastrado com sucesso";
    }

    // Update
    public String atualizar(ClasseCliente cliente) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement(
                "UPDATE cliente SET senha = ? WHERE email = ?");
        stmt.setString(1, cliente.getSenha());
        stmt.setString(2, cliente.getEmail());
        stmt.execute();
        stmt.close();

        return "Atualizado com sucesso";
    }

    // Delete
    public String deletar(String email) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement("DELETE FROM cliente WHERE email = ?");
        stmt.setString(1, email);
        stmt.execute();
        stmt.close();

        return "Deletado com sucesso";
    }

    // Select
    public ArrayList<ClasseCliente> selecionar() throws SQLException {
        ArrayList<ClasseCliente> listaClientes = new ArrayList<>();
        PreparedStatement stmt = minhaConexao.prepareStatement("SELECT * FROM cliente");
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            ClasseCliente cliente = new ClasseCliente();
            cliente.setEmail(rs.getString("email"));
            cliente.setSenha(rs.getString("senha"));
            cliente.setIdCliente(rs.getInt("idCliente"));
            listaClientes.add(cliente);
        }

        rs.close();
        stmt.close();

        return listaClientes;
    }
}
