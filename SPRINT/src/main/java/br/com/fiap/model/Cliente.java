package br.com.fiap.model;

public class Cliente {

    private String email;
    private String senha;
    private int idCliente;

    public Cliente() {
        super();
    }

    public Cliente(String email, String senha, int idCliente) {
        super();
        this.email = email;
        this.senha = senha;
        this.idCliente = idCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Cliente [email=" + email + ", senha=" + senha + ", idCliente=" + idCliente + "]";
    }
}
