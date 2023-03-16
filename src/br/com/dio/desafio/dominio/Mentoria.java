package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
   
    private LocalDate data;
   
    /**
     * @return LocalDate return the data
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    public String toString(){
        return "titulo=" + getTitulo() + "; descricao=" + getDescricao() + "; data=" + this.data;
    }

    @Override
    public Double calcularXp() {
        return XP_PADRAO + 20d;
    }

}
