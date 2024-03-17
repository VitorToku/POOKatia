package empregados;

import java.util.Scanner;

public class TesteEmpregados {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String nome, matricula;
        int numeroProjetos;
        float[] valorPorProjeto;
        float horasTrabalhadas, valorPorHora;

        // Cadastro do Analista
        System.out.println("Cadastrando novo analista: ");

        System.out.print("Digite o nome do analista: ");
        nome = scan.nextLine();

        System.out.print("Digite a matrícula do analista: ");
        matricula = scan.nextLine();
        
        System.out.print("Quantos projetos o analista possui? ");
        numeroProjetos = scan.nextInt();

        valorPorProjeto = new float[numeroProjetos];

        for(int i=0; i< numeroProjetos; i++){
            System.out.print("Digite o valor do projeto Nº " + (i + 1) + " : ");
            valorPorProjeto[i] = scan.nextFloat();
        }

        Empregado analista = new Analista(nome, matricula, valorPorProjeto);

        //Função criada para evitar extender muito o código
        dadosEmpregado(analista);
        
        // Cadastro do Programador
        scan.nextLine();
        System.out.println("\nCadastrando novo Programador: ");

        System.out.print("Digite o nome do programador: ");
        nome = scan.nextLine();

        System.out.print("Digite a matrícula do programador: ");
        matricula = scan.nextLine();

        System.out.print("Digite a quantidade de horas trabalhadas pelo programador: ");
        horasTrabalhadas = scan.nextFloat();

        System.out.print("Digite o valor da hora do programador: ");
        valorPorHora = scan.nextFloat();

        Empregado programador = new Programador(nome, matricula, horasTrabalhadas, valorPorHora);

        dadosEmpregado(programador);
    }

    public static void dadosEmpregado(Empregado empregado){
        System.out.println("--------------------------------\nDados do "+
        empregado.getClass().getSimpleName() +": \nNome: " + empregado.getNome() +
        "\nMatrícula: " + empregado.getMatricula() +
        "\nSalário: " + empregado.calculaSalario() +
        "\n--------------------------------"                                            
        );
    }
}
