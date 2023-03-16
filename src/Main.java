import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso();
        curso1.setTitulo("java");
        curso1.setDescricao("Java 17 na DIO");
        curso1.setCargaHoraria(180);

        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso1.setTitulo("javascript");
        curso1.setDescricao("Javascript na DIO");
        curso1.setCargaHoraria(180);

        System.out.println(curso2);

        Mentoria mento1 = new Mentoria();
        mento1.setNome("Java 18");
        mento1.setDescricao("Fazendo upgrade do Java");
        mento1.setData(LocalDate.now());

        System.out.println(mento1);

        

    }
}
