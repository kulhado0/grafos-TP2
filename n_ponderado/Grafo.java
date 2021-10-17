package n_ponderado;
import java.util.ArrayList;

public class Grafo<TIPO>{
    private ArrayList<Vertice<TIPO>> vertices;
    private ArrayList<Aresta<TIPO>> arestas;

    public Grafo(){
        this.arestas= new ArrayList<Aresta<TIPO>>();
        this.vertices= new ArrayList<Vertice<TIPO>>();
    }

    public void adicionarVertice(TIPO dado){
        Vertice<TIPO> novoVertice = new Vertice<TIPO>(dado); 
        this.vertices.add(novoVertice);
    }

    public void adicionarAresta(TIPO dadoFim){
        Vertice<TIPO> trajeto =this.getVertice(dadoFim);
        Aresta<TIPO> aresta = new Aresta<>(trajeto);
        trajeto.AdicionarArestaEntrada(aresta);
        this.arestas.add(aresta);
    }

    public Vertice<TIPO> getVertice(TIPO dado){
        Vertice<TIPO> vertice=null;
        for(int i=0;i<this.vertices.size();i++)
        {
            if(this.vertices.get(i).getDado().equals(dado))
            {
                vertice=this.vertices.get(i);
                break;
            }
        }
        return vertice;
    }
    
}