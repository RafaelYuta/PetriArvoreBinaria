public class Main {
    public static void main(String[] args) {
        Arvore arvoreBinaria = new Arvore();
        arvoreBinaria.inserir(20);
        arvoreBinaria.inserir(17);
        arvoreBinaria.inserir(16);
        arvoreBinaria.inserir(22);
        
        arvoreBinaria.deletarNo(20);

        arvoreBinaria.posOrdem(arvoreBinaria.getRaiz());
    }
}
