package n_ponderado;
import java.util.ArrayList;

public class Vertice<TIPO>{
    private TIPO dado;
    private ArrayList<Aresta<TIPO>> arestasEntrada;
    private ArrayList<Aresta<TIPO>> arestasSaida;

    public Vertice(TIPO valor){
        this.dado=valor;
        this.arestasEntrada = new ArrayList<Aresta<TIPO>>();
        this.arestasSaida = new ArrayList<Aresta<TIPO>>();
    }

    public TIPO getDado(){
        return dado;
    }

    public void setDado(TIPO dado){
        this.dado=dado;
    }

    public void AdicionarArestaEntrada(Aresta<TIPO> aresta){
        this.arestasEntrada.add(aresta);
    }

    public void AdicionarArestaSaida(Aresta<TIPO> aresta){
        this.arestasSaida.add(aresta);
    }

}