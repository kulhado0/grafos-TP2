package n_ponderado;


public class Main {
	public static void main(String[] args)
    {
        
        Grafo<String> grafo = new Grafo<String>();
        grafo.adicionarVertice("Jo�o");
        grafo.adicionarVertice("Andr�");
        grafo.adicionarVertice("Lucas");
        grafo.adicionarVertice("Diogo");
        
        grafo.adicionarAresta("Andr�");
        grafo.adicionarAresta("Lucas");
        grafo.adicionarAresta("Diogo");
        grafo.adicionarAresta("Jo�o");
        
    }
}
