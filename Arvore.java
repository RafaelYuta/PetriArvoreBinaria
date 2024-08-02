import org.w3c.dom.Node;

public class Arvore {
    private No raiz;

    public Arvore() {
        this.raiz = null;
    }

    public No inserir(int valor) {
        No novoNo = new No(valor);
        if (this.raiz == null) {
            this.raiz = novoNo;
        } else {
            No atual = this.raiz;
            No pai = null;
            while (atual != null) {
                if (novoNo.getValor() < atual.getValor()) {
                    pai = atual;
                    atual = atual.getEsq();
                } else {
                    pai = atual;
                    atual = atual.getDir();
                }
            }
            if (novoNo.getValor() < pai.getValor()) {
                pai.setEsq(novoNo);
            } else {
                pai.setDir(novoNo);
            }
        }
        return novoNo;
    }

    public void deletarNo(int valor){
        No noDeletar = new No(valor);
        if(this.raiz == null){
            return;
        } else {
            No atual = this.raiz;
            No pai = null;
            while (atual != noDeletar) {
                if (noDeletar.getValor() < atual.getValor()){
                    pai = atual;
                    atual = atual.getEsq();
                } else {
                    pai = atual;
                    atual = atual.getDir();
                }
            }
            if(atual.getEsq() == null && atual.getDir() == null){
                deletarNoFolha(pai, atual);
            }
            if(atual.getEsq() != null && atual.getDir() != null){
                deletarNoDoisFilhos(pai, atual);
            }
            else{
                deletarNoUmFilho(pai, atual);
            }
        }
    }

    public void deletarNoFolha(No pai, No atual){
        if(pai == null){
            atual = null;
        } else {
            if (atual.getValor() < pai.getValor()){
                pai.setEsq(null);
            }
            if(atual.getValor() > pai.getValor()){
                pai.setDir(null);
            }
        }
    }

    public void deletarNoUmFilho(No pai, No atual){
        
    }

    public void deletarNoDoisFilhos(No pai, No atual){
        
    }

    public void preOrdem(No no) {
        if(no == null) {
            return;
        }
        System.out.println(no.getValor());
        preOrdem(no.getEsq());
        preOrdem(no.getDir());
    }

    public void emOrdem(No no) {
        if(no == null) {
            return;
        }
        emOrdem(no.getEsq());
        System.out.println(no.getValor());
        emOrdem(no.getDir());
    }

    public void posOrdem(No no) {
        if(no == null) {
            return;
        }
        posOrdem(no.getEsq());
        posOrdem(no.getDir());
        System.out.println(no.getValor());
    }

    public No getRaiz() {
        return this.raiz;
    }
}
