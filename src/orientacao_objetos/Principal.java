package orientacao_objetos;

public class Principal {

	public static void main(String[] args) {
		Livro livro = new Livro();
		
		livro.nome = "B�son Linux";
		livro.descricao = "Livro sobre Linux da B�son!";
		livro.isbn = "97867186617";
		livro.preco = 45.95;
		livro.autor = "F�bio Reis";
		livro.dataPub = "20/04/2017";
		
		livro.dadosLivro();
	}

}
