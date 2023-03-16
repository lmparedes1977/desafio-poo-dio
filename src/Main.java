import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso();
        curso1.setTitulo("java");
        curso1.setDescricao("Java 17 na DIO");
        curso1.setCargaHoraria(10);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("javascript");
        curso2.setDescricao("Javascript na DIO");
        curso2.setCargaHoraria(8);

        Mentoria mento1 = new Mentoria();
        mento1.setTitulo("mentoria Java 18");
        mento1.setDescricao("Fazendo upgrade do Java");
        mento1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setTitulo("Java Developer");
        bootcamp.setDescricao("Curso para aprender Java bem.");
        bootcamp.getConteudos().add(curso1);            
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mento1);

        Dev dev1 = new Dev();
        dev1.setNome("Leozão");
        
        Dev dev2 = new Dev();
        dev2.setNome("Profe Camila");

        dev1.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);


        System.out.println("\nLeozão Conteúdos inscritos " + dev1.getConteudosInscritos()); 
        System.out.println("\nProfe Camila Conteúdos Concluidos " + dev2.getConteudosInscritos());

        System.out.println("\nLeozão Conteúdos inscritos " + dev1.getConteudosConcluidos()); 
        System.out.println("\nProfe Camila Conteúdos Concluidos " + dev2.getConteudosConcluidos());

        dev1.progredir();
        dev2.progredir();
        dev1.progredir();
        dev1.progredir();
        dev2.progredir();

        System.out.println("\nLeozão Conteúdos inscritos " + dev1.getConteudosInscritos()); 
        System.out.println("\nLeozão Conteúdos Concluidos " + dev1.getConteudosConcluidos());

        System.out.println("\nProfe Conteúdos inscritos " + dev2.getConteudosInscritos()); 
        System.out.println("\nProfe Conteúdos Concluidos " + dev2.getConteudosConcluidos());

        System.out.println(dev1.calcularXpTotal()); 
        System.out.println(dev2.calcularXpTotal());  

    }
}
