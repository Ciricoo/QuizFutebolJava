import java.util.Scanner;

public class QuizDeFutebol {

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    int pontos = 0;

    System.out.println("Bem-vindo ao Quiz de Futebol!");
    System.out.println("Responda as 10 perguntas abaixo para testar seus conhecimentos.");
    System.out.println("-----------------------------------------");

    System.out.println("1) Qual o nome do jogador que detém o recorde de gols marcados em Copas do Mundo?");
    System.out.println("a) Lionel Messi");
    System.out.println("b) Cristiano Ronaldo");
    System.out.println("c) Pelé");
    System.out.println("d) Neymar");
    System.out.print("Resposta: ");
    String resposta1 = input.nextLine();
    if (resposta1.equalsIgnoreCase("c")) {
        System.out.println("Resposta correta!");
        pontos++;
    } else {
        System.out.println("Resposta incorreta!");
    }
    System.out.println("-----------------------------------------");

    System.out.println("2) Qual time é conhecido como 'O Mais Querido'?");
    System.out.println("a) Flamengo");
    System.out.println("b) Corinthians");
    System.out.println("c) São Paulo");
    System.out.println("d) Palmeiras");
    System.out.print("Resposta: ");
    String resposta2 = input.nextLine();
    if (resposta2.equalsIgnoreCase("a")) {
        System.out.println("Resposta correta!");
        pontos++;
    } else {
        System.out.println("Resposta incorreta!");
    }
    System.out.println("-----------------------------------------");

    System.out.println("3) Qual jogador é conhecido como 'O Fenômeno'?");
    System.out.println("a) Ronaldinho Gaúcho");
    System.out.println("b) Kaká");
    System.out.println("c) Ronaldo");
    System.out.println("d) Adriano");
    System.out.print("Resposta: ");
    String resposta3 = input.nextLine();
    if (resposta3.equalsIgnoreCase("c")) {
        System.out.println("Resposta correta!");
        pontos++;
    } else {
        System.out.println("Resposta incorreta!");
    }
    System.out.println("-----------------------------------------");

    System.out.println("4) Qual país foi o campeão da Copa do Mundo de 2018?");
    System.out.println("a) Brasil");
    System.out.println("b) Alemanha");
    System.out.println("c) França");
    System.out.println("d) Espanha");
    System.out.print("Resposta: ");
    String resposta4 = input.nextLine();
    if (resposta4.equalsIgnoreCase("c")) {
        System.out.println("Resposta correta!");
        pontos++;
    } else {
        System.out.println("Resposta incorreta!");
    }
    System.out.println("-----------------------------------------");

    System.out.println("5) Qual o nome do estádio do Maracanã antes de sua reforma em 2010?");
    System.out.println("a) Estádio Jornalista Mário Filho");
    System.out.println("b) Estádio Municipal");
    System.out.println("c) Estádio Mário de Andrade");
    System.out.println("d) Estádio João Havelange");
    System.out.print("Resposta: ");
    String resposta5 = input.nextLine();
    if (resposta5.equalsIgnoreCase("a")) {
        System.out.println("Resposta correta!");
        pontos++;
    } else {
        System.out.println("Resposta incorreta!");
    }
        System.out.println("-----------------------------------------");

        System.out.println("6) Qual é o nome do melhor jogador do mundo em 2021?");
        System.out.println("a) Lionel Messi");
        System.out.println("b) Cristiano Ronaldo");
        System.out.println("c) Robert Lewandowski");
        System.out.print("Resposta: ");
        String resposta6 = input.nextLine();
        if (resposta6.equalsIgnoreCase("c")) {
            pontos++;
            System.out.println("Correto!\n");
        } else {
            System.out.println("Incorreto.\n");
        }
        System.out.println("-----------------------------------------");

        System.out.println("7) Qual é o país com mais títulos de Copa do Mundo?");
        System.out.println("a) Brasil");
        System.out.println("b) Alemanha");
        System.out.println("c) Itália");
        System.out.print("Resposta: ");
        String resposta7 = input.nextLine();
        if (resposta7.equalsIgnoreCase("a")) {
            pontos++;
            System.out.println("Correto!\n");
        } else {
            System.out.println("Incorreto.\n");
        }
        System.out.println("-----------------------------------------");

        System.out.println("8) Qual é o único time a ter ganhado a Tríplice Coroa na Inglaterra?");
        System.out.println("a) Manchester United");
        System.out.println("b) Chelsea");
        System.out.println("c) Manchester City");
        System.out.print("Resposta: ");
        String resposta8 = input.nextLine();
        if (resposta8.equalsIgnoreCase("c")) {
            pontos++;
            System.out.println("Correto!\n");
        } else {
            System.out.println("Incorreto.\n");
        }
        System.out.println("-----------------------------------------");

        System.out.println("9) Qual é o time com mais títulos da Liga dos Campeões da UEFA?");
        System.out.println("a) Real Madrid");
        System.out.println("b) Barcelona");
        System.out.println("c) Bayern Munich");
        System.out.print("Resposta: ");
        String resposta9 = input.nextLine();
        if (resposta9.equalsIgnoreCase("a")) {
            pontos++;
            System.out.println("Correto!\n");
        } else {
            System.out.println("Incorreto.\n");
        }
        System.out.println("-----------------------------------------");

        System.out.println("10) Qual é o único jogador a ter ganhado a Bola de Ouro da FIFA por três anos consecutivos?");
        System.out.println("a) Lionel Messi");
        System.out.println("b) Cristiano Ronaldo");
        System.out.println("c) Michel Platini");
        System.out.print("Resposta: ");
        String resposta10 = input.nextLine();
        if (resposta10.equalsIgnoreCase("c")) {
            pontos++;
            System.out.println("Correto!\n");
        } else {
            System.out.println("Incorreto.\n");
        }
        System.out.println("-----------------------------------------");

        System.out.println("A sua pontuação final foi:" + pontos);
    }
}
