package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Bike;
import br.com.fiap.beans.ClasseCliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Feedback;
import br.com.fiap.beans.Fotos;
import br.com.fiap.beans.Modificacao;
import br.com.fiap.beans.NotaFiscal;
import br.com.fiap.beans.Videos;
import br.com.fiap.beans.Vistoria;

public class TesteMain {


	static String texto (String texto) {
	return JOptionPane.showInputDialog(texto);
	}
	
	
	static int inteiro (String inteiro) {
		return Integer.parseInt(JOptionPane.showInputDialog(inteiro));
	}
	
	
	static double decimal (String decimal) {
		 return Double.parseDouble(JOptionPane.showInputDialog(decimal));
	}
	
	
	public static void main(String[] args) {
		
	//String email, String senha
	ClasseCliente objClasseCliente = new ClasseCliente(texto("Digite seu email"),
			texto("Digite sua senha"),
			inteiro("Digite o ID"));
	
	//int id, String logradouro, String bairro, String cidade, String estado, int numero, String complemento
	Endereco objEndereco = new Endereco(inteiro("Digite o ID"),
			texto("Digite o logradouro"),
			texto("Digite o bairro"),
			texto("Digite a cidade"),
			texto("Digite o estado"),
			inteiro("Digite o número"),
			texto("Digite o complemento"));
	
	//int preco, String Serie, String marca
	double precoDaBicicleta;

    do {
        precoDaBicicleta = decimal("Digite o preço da bike");

        // Verifica se o preço está dentro do intervalo especificado
        if (precoDaBicicleta <= 2000 || precoDaBicicleta >= 200000) {
            JOptionPane.showMessageDialog(null, "O preço da bicicleta está fora do valor coberto pela Porto Seguro. Certifique que o valor inserido está correto");
        }
    } while (precoDaBicicleta <= 2000 || precoDaBicicleta >= 200000);

    // Agora que o preço está dentro do intervalo, cria uma instância da classe Bike
    Bike objBike = new Bike(inteiro("Digite o ID da bicicleta"),
    		decimal("Digite o preço da bicicleta"),
    		texto("Digite o número de série"), 
    		texto("Digite a marca"), 
    		texto("É uma bicicleta eletrica?"));
    

	
	//Fotos fotos, Videos videos, String dataVistoria
	Vistoria objVistoria = new Vistoria(texto("Digite a data da vistoria"));
	
	
	//String fotosBike, String fotosNf, String fotosNumerosSerie
	Fotos objFotos = new Fotos(texto("Envie fotos da bike"),
			texto("Envie fotos da nota fiscal"),
			texto("Envie fotos do número de serie"));
	
	
	//String videosBike, String videosNf, String videosNumerosSerie
	Videos objVideos = new Videos(texto("Envie vídeos da bike"),
			texto("Envie vídeos da nota fiscal"),
			texto("Envie vídeos do número de serie"));
	
	
	//String cpf, String dataEmissao, double valorTotal, String nomeComprador
	NotaFiscal objNotaFiscal = new NotaFiscal(texto("Digite seu CPF"),
			texto("Digite a data de emissão da nota fiscal"),
			decimal("Digite o valor total"),
			texto("Digite o nome do comprador"));
	
	//String tipoModificacao, String data, String pecaModificada, String fotoPeca, String fotoNfPeca
	Modificacao objModificacao = null;
	int resposta = JOptionPane.showConfirmDialog(
            null,
            "Deseja inserir informações de modificação?",
            "Confirmação",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );

        if (resposta == JOptionPane.YES_OPTION) {
            String tipoModificacao = JOptionPane.showInputDialog("Digite o tipo de modificação:");
            String dataModificacao = JOptionPane.showInputDialog("Digite a data da modificação:");
            String pecaModificada = JOptionPane.showInputDialog("Digite o nome da peça modificada:");
            String fotoPeca = JOptionPane.showInputDialog("Envie fotos da peça modificada:");
            String fotoNfPeca = JOptionPane.showInputDialog("Envie a foto da Nota Fiscal da peça:");
            
            objModificacao = new Modificacao(
                tipoModificacao,
                dataModificacao,
                pecaModificada,
                fotoPeca,
                fotoNfPeca
            );
        }
        
	//String depoimento, String dataFeedback, String nomeResponsavel
	Feedback objFeedback = new Feedback(texto("Deixe um feedback para nós"),
			texto("Data do feedback"),
			texto("Nome do reponsável pelo feedback"));
	
	System.out.println("MELFE Solution");
	System.out.println("Email: " + objClasseCliente.getEmail() +
	        "\nSenha: " + objClasseCliente.getSenha() +
	        "\nDigite o ID: " + objClasseCliente.getIdCliente()+
	        "\nDigite o ID: " + objEndereco.getId()+
	        "\nDigite o logradouro: " + objEndereco.getLogradouro() +
	        "\nDigite o bairro: " + objEndereco.getBairro() +
	        "\nDigite a cidade: " + objEndereco.getCidade() +
	        "\nDigite o estado: " + objEndereco.getEstado() +
	        "\nDigite o número: " + objEndereco.getNumero() +
	        "\nDigite o complemento: " + objEndereco.getComplemento() +
	        "\nDigite o ID da bicicleta: " + objBike.getIdBike()+
	        "\nDigite o preço da bike: " + objBike.getPreco() +
	        "\nDigite o número de série: " + objBike.getnSerie() +
	        "\nDigite a marca: " + objBike.getMarca() +
	        "\nDigite se é uma bicicleta elétrica: " + objBike.getEletrica() +
	        "\nDigite a data da vistoria: " + objVistoria.getDataVistoria() +
	        "\nEnvie fotos da bike: " + objFotos.getFotosBike() +
	        "\nEnvie fotos da nota fiscal: " + objFotos.getFotosNf() +
	        "\nEnvie fotos do número de série: " + objFotos.getFotosNumerosSerie() +
	        "\nEnvie vídeos da bike: " + objVideos.getVideosBike() +
	        "\nEnvie vídeos da nota fiscal: " + objVideos.getVideosNf() +
	        "\nEnvie vídeos do número de série: " + objVideos.getVideosNumerosSerie() +
	        "\nDigite seu CPF: " + objNotaFiscal.getCpf() +
	        "\nDigite a data de emissão da nota fiscal: " + objNotaFiscal.getDataEmissao() +
	        "\nDigite o valor total: " + objNotaFiscal.getValorTotal() +
	        "\nDigite o nome do comprador: " + objNotaFiscal.getNomeComprador() +
	        "\nDeixe um feedback para nós: " + objFeedback.getDepoimento() +
	        "\nData do feedback: " + objFeedback.getDataFeedback() +
	        "\nNome do responsável pelo feedback: " + objFeedback.getNomeResponsavel());

	if (resposta == JOptionPane.YES_OPTION) {
        System.out.println("\nQual o tipo de modificação? " + objModificacao.getTipoModificacao() +
            "\nQual a data de modificação? " + objModificacao.getData() +
            "\nQual peça foi modificada? " + objModificacao.getPecaModificada() +
            "\nEnvie foto da peça: " + objModificacao.getFotoPeca() +
            "\nEnvie foto da nota fiscal da peça: " + objModificacao.getFotoNfPeca());
    } else {
        System.out.println("\nNenhuma modificação inserida.");
    }
	}
}
