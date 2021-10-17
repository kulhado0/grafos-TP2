package n_ponderado;

public class Aresta<TIPO>{
    private Vertice<TIPO> trajeto;

    public Aresta(Vertice<TIPO>trajeto){
        this.trajeto=trajeto;
    }

    public Vertice<TIPO> gettrajeto(){
        return trajeto;
    }

    public void settrajeto(Vertice<TIPO> trajeto){
        this.trajeto=trajeto;
    }

}