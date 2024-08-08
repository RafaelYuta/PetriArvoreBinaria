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
        if(this.raiz == null){
            return;
        } else {
            No atual = this.raiz;
            No pai = null;
            while (atual.getValor() != valor) {
                if (valor < atual.getValor()){
                    pai = atual;
                    atual = atual.getEsq();
                } else {
                    pai = atual;
                    atual = atual.getDir();
                }
            }
            if(atual.getEsq() == null && atual.getDir() == null){
                deletarNoFolha(pai, valor);
            }
            if(atual.getEsq() != null && atual.getDir() != null){
                deletarNoDoisFilhos(pai, atual);
            }
            else{
                deletarNoUmFilho(pai, atual, valor);
            }
        }
    }

    public void deletarNoFolha(No pai, int valor){
        if (pai == null) {
            this.raiz = null;
        } else {
            if (valor < pai.getValor()) {
                pai.setEsq(null);
            } else {
                pai.setDir(null);
            }
        }
    }

    public void deletarNoUmFilho(No pai, No atual, int valor){
        if (pai == null) {
            if (atual.getEsq() != null) {
                this.raiz = atual.getEsq();
            } else {
                this.raiz = atual.getDir();
            }
            atual = null;
        } else {
            if (atual.getValor() < pai.getValor()) {
                if (atual.getEsq() != null) {
                    pai.setEsq(atual.getEsq());
                } else {
                    pai.setEsq(atual.getDir());
                }
            }
            if (atual.getValor() > pai.getValor()) {
                if (atual.getEsq() != null) {
                    pai.setDir(atual.getEsq());
                } else {
                    pai.setDir(atual.getDir());
                }
            }
        }

    }

    public void deletarNoDoisFilhos(No pai, No atual){
        No paiFixo = pai;
        if (pai == null) {
            pai = atual;
            paiFixo = pai;
            atual = atual.getEsq();
            while (atual.getDir() != null) {
                pai = atual;
                atual = atual.getDir();
            }
            if (atual.getDir() == null && atual.getEsq() == null) {
                paiFixo.setValor(atual.getValor());
                pai.setDir(null);
            } else {
                paiFixo.setValor(atual.getValor());
                paiFixo.setEsq(atual.getEsq());
            }
        } else {
            if (pai.getValor() < atual.getValor()) {
                atual = atual.getEsq();
                while (atual.getDir() != null) {
                    pai = atual;
                    atual = atual.getDir();
                }
                paiFixo = paiFixo.getDir();
                paiFixo.setValor(atual.getValor());
                pai.setDir(null);
            } else {
                atual = atual.getEsq();
                while (atual.getDir() != null) {
                    pai = atual;
                    atual = atual.getDir();
                }
                paiFixo = paiFixo.getEsq();
                paiFixo.setValor(atual.getValor());
                pai.setDir(null);
            }
        }
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
