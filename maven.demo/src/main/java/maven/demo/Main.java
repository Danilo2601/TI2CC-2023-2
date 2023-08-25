package maven.demo;


public class Main {
	public static void main(String [] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();
		
		int x = 0;
		int codigo;
		String nome, categoria, publisher;
		
		Jogo jogo = new Jogo();
		
		while(x != 5) {
			
			x = MyIO.readInt("\n\nInsira a opcao do que deseja fazer: \n1)Listar jogos "
					+ "\n2)Inserir novo jogo \n3)Excluir jogo \n4)Atualizar jogo \n5)Sair \nResposta: ");
			
			
			
			switch(x){
			case 5:
				System.out.println("Programa encerrado");
				dao.close();
				break;
			
			case 2: 
				codigo = MyIO.readInt("Codigo do novo jogo: ");
				nome = MyIO.readLine("Nome do novo jogo: ");
				categoria = MyIO.readLine("Categoria do novo jogo: ");
				publisher = MyIO.readLine("Publisher do novo jogo: ");
				
				jogo.setCodigo(codigo);
				jogo.setNome(nome);
				jogo.setCategoria(categoria); 
				jogo.setPublisher(publisher);
				
				
				if(dao.inserirJogo(jogo) == true) {
					System.out.println("Jogo inserido com sucesso ->" + jogo.toString());
				}
				
				break;
			
			case 1: 
				
				System.out.println("------ Jogos ------");
				Jogo[] jogos = dao.getJogos();
				for(int i = 0; i < jogos.length; i++) {
					System.out.println(jogos[i].toString());
				}
				
				break;
			
			case 3: 
				codigo =  MyIO.readInt("Qual o codigo do jogo que sera excluido: ");
				dao.excluirJogo(codigo);
				
				break;
				
			case 4: 
				codigo = MyIO.readInt("Qual o codigo do jogo a ser atualizado? ");
				nome = MyIO.readLine("Novo nome para o jogo: ");
				categoria = MyIO.readLine("Nova categoria para o jogo: ");
				publisher = MyIO.readLine("Nova publisher para o jogo: ");
				jogo.setCodigo(codigo);
				jogo.setNome(nome);
				jogo.setCategoria(categoria); 
				jogo.setPublisher(publisher);
				
				dao.atualizarJogo(jogo);
				
				break;
			default: 
				System.out.println("Comando invalido, tente novamente.");
			}
			
			
		}
	}
}
