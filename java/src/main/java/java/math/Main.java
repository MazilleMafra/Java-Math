package java.math;

import java.util.Scanner;
import java.lang.Math;


public class Main{

    public static void menu() {

        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------");
        System.out.println("        |Menu|        ");
        System.out.println("----------------------");
        System.out.println("Ecolha a opção abaixo:");
        System.out.println();
        System.out.println("[1] Bhaskara");
        System.out.println("[2] Teorema de Pitágoras");
        System.out.println("[3] Juros");
        System.out.println("[4] Trignometria do Triângulo Retangulo");
        System.out.println("[5] Área do Quadrado");
        
        //resultado do número escolhido.
        int escolher = sc.nextInt();
        //vai direcionar para a função selecionada.
        switch (escolher) {
            case 1:
                bhaskara();
                break;
            case 2:
                teoremaDePitagoras();
                //para parar de ler quando encontrar a opção selecionada.
                break;
            case 3:
                juros();
                break;
            case 4:
                trignometria();
                break;
            case 5:
                areaDoQuadrado();
                break;
            default:
                //mensagem caso você não escolha uma opção na lista.
                System.out.println("opções em desenvolvimento");
                break;
        }

        sc.close();

    }

    //função principal do código.
    public static void main(String[] args) {
        //para chamar a função menu, já que essa é a inicial.
        menu();
        
    }
    //função bhaskara.
    public static void bhaskara() {


        //scanner para entrada de dados.
        Scanner sc = new Scanner(System.in);


        //menu da fórmula de bhaskara.
        System.out.println("==============================================");
        System.out.println("           FÓRMULA DE BHASKARA");
        System.out.println("==============================================");
        System.out.println();
        

        //variaveis declaradas.
        int a, b, c, delta, x1, x2;

        System.out.println("Digite os valores de A, B e C respectivamente.");

        //fazer as atribuições das variaveis.
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        

        //já entrega o valor do delta.
        delta = (int) (Math.pow(b, 2)-4*a*c);

        if (delta < 0){
            System.err.println("O valor de delta está negativo");
        } else{
            System.out.println("O valor de Delta é = " + delta);

            //deu certo aqui.
            x1 = (int) (-b + Math.sqrt(delta))/(2*a);
            x2 = (int) (-b - Math.sqrt(delta))/(2*a);
            System.out.println("O valor de X1 é " + x1 + ", e o valor de X2 é " + x2 + ".");
        }  
            //resolvido
        //está retornando ao menu sem clicar antes.
        System.out.println("Retornar  ao menu [7]");

        int retorno = sc.nextInt();

        switch (retorno) {
            case 7:
                main(null);
                break;
        
            default:
                System.err.println("Você precisa selecionar o número '7' para voltar ao menu.");
                break;
        } 
        
        sc.close();
        
    }
    //função pitágoras
    public static void teoremaDePitagoras(){

        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------");
        System.out.println("Teorema de Pitágoras");
        System.out.println("--------------------");
        System.out.println();
        System.out.println();
        System.out.println("O que você deseja calcular?");
        System.out.println();
        System.out.println("[1] Hipotenusa");
        System.out.println("[2] Cateto Oposto");
        System.out.println("[3] Cateto Adjacente");

        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:

                System.out.println("Qual o valor do Cateto Oposto?");
                int catetoO = sc.nextInt();

                System.out.println("Qual o valor do Cateto Adjacente?");
                int catetoA = sc.nextInt();

                double hipotenusa;

                hipotenusa = Math.hypot(catetoA, catetoO);

                System.out.printf("O valor da Hipotenusa é de %.2f %n", hipotenusa);
                System.out.println("---------------------------------");
                System.out.println("Pressione [7] para voltar.");

                int escolha2 = sc.nextInt();

                switch (escolha2) {
                    case 7:
                        main(null);
                        break;
                    default:
                        segredo();
                        break;
                }
                
                break;
            case 2:
                System.out.println("Qual o valor do Cateto Adjacente?");
                int catetoA1 = sc.nextInt();

                System.out.println("Qual o valor da Hipotenusa?");
                int hipotenusa1 =sc.nextInt();

                double CatetoO1;

                CatetoO1 = Math.sqrt(Math.pow(catetoA1, 2) - Math.pow(hipotenusa1, 2));

                System.out.printf("O valor do Cateto Oposto é de %.2f.%n", CatetoO1);
                System.out.println("------------------------------------");
                System.out.println("Digite [7] para voltar.");

                int escolha3 = sc.nextInt();

                switch (escolha3) {
                    case 7:
                        main(null);
                        break;
                    default:
                        segredo();
                        break;
                }
                break;
            case 3:

                System.out.println("Qual o valor do Cateto Oposto");
                int catetoO2 = sc.nextInt();

                System.out.println("Qual o valor da Hipotenusa?");
                int hipotenusa2 = sc.nextInt();

                double chibataDeLeao = Math.pow(catetoO2, 2) - Math.pow(hipotenusa2, 2);

                if (chibataDeLeao < 0){
                       double catetoA2 = Math.sqrt(chibataDeLeao);
                       System.out.printf("O valor do Cateto Adjacnete é de %.2f.%n", catetoA2);
                    
                }else {
                    System.out.println("Não trabalhamos com valores negativos");
                }
                
                System.out.println("------------------------------------");
                System.out.println("Digite [7] para voltar");

                int escolha4 = sc.nextInt();

                switch (escolha4) {
                    case 7:
                        main(null);
                        break;
                    default:
                        segredo();
                        break;
                }
                break;
            default:
                System.out.println("Opção errada.");
                System.out.println("[1] Voltar para o Teorema de Pitágoras.");
                System.out.println("[2] Voltar para o Menu.");
                
                int escolha1 = sc.nextInt();

                switch (escolha1) {
                    case 1:
                        teoremaDePitagoras();
                        break;
                    case 2:
                        main(null);
                    default:
                        if (escolha1 > 2){
                            segredo();
                        }
                        break;
                }
                break;
        }

        sc.close();

    }

    public static void segredo(){
        System.out.println("----------------");
        System.out.println("Tu é analfabeto?");
        System.out.println("----------------");
        menu();
    }

    public static void juros(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual juros você deseja calcular?");
        System.out.println("--------------------------------");
        System.out.println("[1] Juros Simples");
        System.out.println("[2] Juros Compostos");

        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                
            System.out.println("-------------");
            System.out.println("Juros Simples");
            System.out.println("-------------");

            double juros, c, i, n, montante;

            System.out.println("Digite o valor do Capital:");
            c = sc.nextDouble();

            //a porcentagem tem que vim em número com virgula. 2% --> 0,02.
            System.out.println("Digite o valor da Taxa de Juros:");
            i = sc.nextDouble();

            System.out.println("Digite quanto Tempo vai ser:");
            n = sc.nextDouble();

            juros = c * i * n;

            System.out.printf("O valor do juros é de R$ %.2f.%n", juros);

            montante = c + juros;

            System.out.printf("O valor total do Montante será de R$ %.2f.%n", montante);
            System.out.println("-------------------------------------------");

            System.out.println("[7] Retornar ao Menu");

            int retorno = sc.nextInt();

            switch (retorno) {
                case 7:
                    main(null);
                    break;
            
                default:
                System.out.println("----------------------------------------");
                System.out.println("Alternativa errada, você voltará ao menu");
                System.out.println("----------------------------------------");
                main(null);
                    break;
                }
            break;
            case 2:

            System.out.println("---------------");
            System.out.println("Juros compostos");
            System.out.println("---------------");

            double Montante, C, i2, t;

            System.out.println("Digite o valor do Capital inicial:");
            C = sc.nextDouble();
    
            System.out.println("Digite o valor da Taxa de Juros (em decimais):");
            i2 = sc.nextDouble();
    
            System.out.println("Digite o valor do Tempo Total (em número de períodos):");
            t = sc.nextDouble();
    
            Montante = C * Math.pow((1 + i2), t);
    
            System.out.printf("O valor do montante será de %.2f.%n", Montante);
            System.out.println("----------------------------------");
            System.out.println();

            System.out.println("[7] Para voltar para o inicio");

            int voltar = sc.nextInt();

            switch (voltar) {
                case 7:
                    main(null);
                    break;
                default:
                segredo();
                    break;
                }
                break;   
            default:
                System.out.println("----------------------------------------");
                System.out.println("Alternativa errada, você voltará ao menu");
                System.out.println("----------------------------------------");
                main(null);
                break;
        }

        sc.close();
    }
    public static void trignometria(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o ângulo do triângulo:");

        double angulo = sc.nextDouble();

        if (angulo > 365.0){
            System.out.println("O ângulo excedeu o limite de 365°");
        } else if (angulo <= 0){
            System.out.println("O ângulo é menor que o permitido");            
        } else {
            System.out.println("Qual você deseja calcular?");
            System.out.println("--------------------------");
            System.out.println("Seno [1]");
            System.out.println("Cosseno [2]");
            System.out.println("Tangente [3]");

            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    double anguloRad1 = Math.toRadians(angulo);
                    double seno = Math.sin(anguloRad1);

                    System.out.printf("O seno de %.2f é de %.1f graus.", angulo, seno);
                    break;
                case 2:
                    double anguloRad = Math.toRadians(angulo);
                    double cosseno = Math.cos(anguloRad);

                System.out.printf(" O cosseno de %.2f é de %.1f graus.", angulo, cosseno);
                    break;
                case 3:
                    //ocorre um erro quando um angulo se aproxima dos 90 graus.
                    double anguloRad2 = Math.toRadians(angulo);
                    double tangente = Math.tan(anguloRad2);

                    System.out.printf("A tangente de %.2f é de %.1f graus", angulo, tangente);
                    break;
                default:
                    System.out.println("A alternativa está errada, será redirecionado a Trignomêtria.");
                    trignometria();
                    break;
            }
        }


        sc.close();

    }

    public static void areaDoQuadrado(){

        Scanner sc = new Scanner(System.in);

        float h, b , A;

        System.out.println("Digite a altura do quadrado:");
        h = sc.nextFloat();

        System.out.println("Digite o tamanho da base:");
        b = sc.nextFloat();

        A = h * b;

        System.out.println(" O valor da área é de " + A);

        System.out.println("---------------------------");
        System.out.println("Pressione [7] para retornar ao menu");

        int escolher = sc.nextInt();

        switch (escolher) {
            case 7:
                menu();
                break;
            default:
                System.out.println("Opção errada, será redirecionado ao menu de qualquer forma");
                menu();
                break;
        }
        sc.close();
    }
}