package gerenciamento;

public class Aeroporto {
    String prefixo;
    String nome;
    ArrayList<Aviao> listadeavioes;
    ArrayList<Aeroporto> aeroportosChegada;
    ArrayList<Aeroporto> aeroportosSaida;

    public Aeroporto(){
        prefixo = "";
        nome = "";
        listadeavioes = new ArrayList();
        aeroportosChegada = new ArrayList();
        aeroportosSaida = new ArrayList();
    }

    public void decolar(Aviao aviao){
        listadeavioes.remove(Aviao);
    }

    public void aterrisar(Aviao aviao){
        listadeavioes.add(Aviao);
    }

    public void listaravioes(){
        listadeavioes
    }
}
