package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos da galera!");
        } else if (classificavel.getClassificacao() >= 2){
            System.out.println("Filme bem avaliado na nossa plataforma!");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
