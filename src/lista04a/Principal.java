package lista04a;

import java.util.ArrayList;

/**
 * Classe criada para execução do sistema.
 *
 * @author jclri
 *
 */
public class Principal {

	/**
	 * Metodo principal de execução.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String[] exercicio = { "Criar livros", "Ponto", "Compromisso", "Pilha de Livros", "Fila de Pacientes", "DVD" };

		boolean repitir = true;

		do {
			int menu = Console.mostrarMenu(exercicio, "Exercicios", null);
			switch (menu) {

			case 1:
				criarLivro();
				break;

			case 2:
				criarPontos();
				break;

			case 3:
				criarCompromissos();
				break;

			case 4:
				criarPilhaDeLivros();
				break;

			case 5:
				criarFilaDePacientes();
				break;

			case 6:
				criarColecaoDeDvd();
				break;

			case -1:
				System.out.println("Saindo...");
				repitir = false;
				break;
			}
		} while (repitir == true);

	}

	/**
	 * Cria uma coleção de dvd.
	 */
	private static void criarColecaoDeDvd() {

		Colecao colecoes = new Colecao();
		String[] exercicio = { "Inserir DVD", "Excluir DVD", "Consultar DVD", "Listar DVDs" };

		boolean repitir = true;

		do {
			int menu = Console.mostrarMenu(exercicio, "lista02", null);
			switch (menu) {

			case 1:
				Dvd dvd = criarDVD();

				colecoes.addDVD(dvd);
				System.out.println("Dvd inserido.");
				break;

			case 2:
				String titulo = Console.recuperaTexto("Informe o Titulo do DVD a ser excluido: ");
				Dvd removido = colecoes.removeDvd(titulo);
				if (removido == null) {
					System.out.println("DVD não existente.");
				} else {
					System.out.println("DVD Removido: ");
					System.out.println(removido);
				}

				break;

			case 3:
				Dvd consultar = consultarDVD(colecoes);
				if (consultar == null) {
					System.out.println("DVD não existente na coleção.");
				} else {
					System.out.println("DVD solicitado: ");
					System.out.println(consultar);
				}

				break;

			case 4:
				String imprimir = colecoes.listarColecao();

				if (imprimir == null) {
					System.out.println("Não existe DVD cadastrado.");
				} else {
					System.out.println(imprimir);
				}

				break;

			case -1:
				System.out.println("Saindo...");
				repitir = false;
				break;
			}
		} while (repitir == true);

	}

	private static Dvd consultarDVD(Colecao colecoes) {

		String tituloApresentar = Console.recuperaTexto("Informe o Titulo do DVD a ser exibido: ");
		ArrayList<Dvd> apresentar = colecoes.getColecao();

		Dvd dvdaux = null;
		for (int i = 0; i < apresentar.size(); i++) {
			dvdaux = apresentar.get(i);
			String tituloAux = dvdaux.getTitulo();
			if (tituloAux.contains(tituloApresentar)) {
				return (dvdaux);

			}
		}

		return null;
	}

	/**
	 * Metodo para excluir um dvd
	 * 
	 */

	private static Dvd criarDVD() {

		String titulo = Console.recuperaTexto("Informe o titulo do DVD: ");
		Integer ano = Console.recuperaInteiroPositivo("Informe o Ano: ");
		Integer duracao = Console.recuperaInteiro("Informe a duração em hrs: ");

		Dvd dvd = new Dvd(titulo, ano, duracao);

		return dvd;

	}

	/**
	 * Criar uma fila de pacientes.
	 */
	private static void criarFilaDePacientes() {

		Fila fila = new Fila();
		String[] opcao = { "Enqueue", "Dequeue", "Listar" };

		boolean repitir = true;

		do {
			int menu = Console.mostrarMenu(opcao, "lista02", null);
			switch (menu) {

			case 1:
				Paciente novo = criarPaciente();
				fila.enqueue(novo);
				System.out.println("Paciente" + novo.getNome() + " entrou na fila");
				break;

			case 2:
				Paciente proximo = fila.dequeue();
				if (proximo == null) {
					System.out.println("Não há pacientes na Fila");
				} else {
					System.out.println("Paciente " + proximo.getNome() + " em atendimento!");
				}
				break;

			case 3:
				System.out.println(fila);
				break;

			case -1:
				System.out.println("Saindo...");
				repitir = false;
				break;
			}
		} while (repitir == true);

	}

	private static Paciente criarPaciente() {
		String codigo = Console.recuperaTexto("Informe o codigo");
		String nome = Console.recuperaTexto("Informe o nome");
		Paciente paciente = new Paciente(codigo, nome);
		return paciente;
	}

	/**
	 * manipula uma pilha de livros.
	 */
	private static void criarPilhaDeLivros() {

		Pilha pilha = new Pilha();

		String[] lista = { "Push – inserir livro ", "Pop – remover livro ", "Peek – visualizar livro ",
				"Lista – listar todos os livros " };

		boolean repitir = true;

		do {
			int menu = Console.mostrarMenu(lista, "Menu", null);
			switch (menu) {

			case 1:
				Livro livro = criarLivros();
				try {
				pilha.push(livro);
				System.out.println("Livro inserido na Pilha");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;

			case 2:
				Livro removido = pilha.pop();
				if (removido == null) {
					System.out.println("Pilha Vazia");
				} else {
					System.out.println("Livro removido: ");
					System.out.println(removido);
				}
				break;

			case 3:
				Livro visualizar = pilha.peek();
				if (visualizar == null) {
					System.out.println("Pilha Vazia");
				} else {
					System.out.println("Livro visualizado: ");
					System.out.println(visualizar);
				}
				break;

			case 4:
				System.out.println(pilha);
				break;

			case -1:
				System.out.println("Saindo...");
				repitir = false;
				break;
			}
		} while (repitir == true);

	}

	private static void criarCompromissos() {
		Paciente p1 = new Paciente("00021", "Fulano da silva");
		Paciente p2 = new Paciente("00071", "Ciclano dos santos");
		p2.addHistorico("Dor de Cabeça");

		Compromisso c1 = new Compromisso(p1, "24/08/2005", "09:00", "Beltrano oliveira");
		Compromisso c2 = new Compromisso(p2, "26/08/2005", "17:00", "João Camargo");

		p1.addHistorico("Ulcera Gastrica");
		p2.addHistorico("Stress");
		p2.addHistorico("Arritimia Cardiaca");

		System.out.println(c1);

		System.out.println(c2);
	}

	private static void criarPontos() {

		Ponto ponto1 = new Ponto();
		Ponto ponto2 = new Ponto(2d, 5d);

		Double distancia = ponto1.distancia(ponto2);
		System.out.println("Distancia P1 a P2 " + distancia);

		Double distancia1 = ponto2.calculaDistancia(7d, 2d);
		System.out.println(distancia1);

		ponto1.setX(10d);
		ponto1.setY(3d);

		distancia = ponto1.distancia(ponto2);
		System.out.println("Nova distancia P1 a P2 " + distancia);
	}

	public static void criarLivro() {

		Livro livro = criarLivros();

		System.out.println(livro);

	}

	public static Livro criarLivros() {

		Livro livro = new Livro();

		String codigo = Console.recuperaTexto("Informe o codigo do livro");
		livro.setCodigo(codigo);
		String titulo = Console.recuperaTexto("Informe o titulo do livro");
		livro.setTitulo(titulo);
		int quantidadeAutores = Console.recuperaInteiro("Quantos autores: ");
		ArrayList<String> autores = new ArrayList<>();
		for (int i = 0; i < quantidadeAutores; i++) {
			String autor = Console.recuperaTexto("Informe o autor" + (i + 1) + ":");
			autores.add(autor);
		}
		livro.setAutores(autores);
		String isnb = Console.recuperaTexto("Informe o ISBN do livro:");
		livro.setIsbn(isnb);
		Integer ano = Console.recuperaInteiro("Informe o ano: ");
		livro.setAno(ano);

		return livro;
	}
}
