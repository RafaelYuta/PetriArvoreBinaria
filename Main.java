public class Main {
    public static void main(String[] args) {
        Arvore arvoreBinaria = new Arvore();
        arvoreBinaria.inserir(80);
        arvoreBinaria.inserir(72);
        arvoreBinaria.inserir(87);
        arvoreBinaria.inserir(37);
        arvoreBinaria.inserir(-3);
        arvoreBinaria.inserir(12);
        arvoreBinaria.inserir(85);
        arvoreBinaria.inserir(86);
        arvoreBinaria.inserir(88);
        arvoreBinaria.inserir(75);
        arvoreBinaria.inserir(39);
        arvoreBinaria.deletarNo(37);

        arvoreBinaria.posOrdem(arvoreBinaria.getRaiz());
    }
}
