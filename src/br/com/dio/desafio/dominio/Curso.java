package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
   
    private int cargaHoraria;
    
    
    /**
     * @return int return the cargaHoraria
     */
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * @param cargaHoraria the cargaHoraria to set
     */
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String toString(){
        return "titulo=" + getTitulo() + "; descricao=" + getDescricao() + "; carca horária=" + this.cargaHoraria;
    }

    @Override
    public Double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }


}
