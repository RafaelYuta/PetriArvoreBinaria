public class Main {
    public static void main(String[] args) {
        Arvore arvoreBinaria = new Arvore();
        arvoreBinaria.inserir(80);
        arvoreBinaria.inserir(72);
        arvoreBinaria.inserir(87);
        arvoreBinaria.inserir(37);
        arvoreBinaria.inserir(-3);
        arvoreBinaria.inserir(12);
        arvoreBinaria.deletarNo(37);

        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
    }
}
