public class Main {
    public static void main(String[] args) {
        Arvore arvoreBinaria = new Arvore();
        arvoreBinaria.inserir(50);
        
        arvoreBinaria.deletarNo(37);

        arvoreBinaria.posOrdem(arvoreBinaria.getRaiz());
    }
}
