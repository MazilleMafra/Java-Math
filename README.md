# Java-Math
Version 1.0
# Decrição do Java-Math
Meu primeiro projeto criado para testar minhas habilidades em Java. O projeto consiste em resultados de fórmulas matemáticas encontradas no pacote [Java.Math](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html) a fim de auxiliar nos cálculos, o pacote foi usado de inspiração para o nome desse projeto.
# Funcionalidade do Java-Math
Agora que dei uma breve descrição desse projeto, nada mais justo que eu mostrar como ele funciona.
## Menu
Como todo projeto, um menu sempre é bom e faz toda a diferença. Veja um exemplo dele abaixo:


`

        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------");
        System.out.println("        |Menu|        ");
        System.out.println("----------------------");
        System.out.println("Ecolha a opção abaixo:");
        System.out.println();
        System.out.println("[1] Bhaskara");
        System.out.println("[2] Teorema de Pitágoras");
        System.out.println("[3] Juros");
        System.out.println("[4] Trignometria do Triângulo Retangulo");```

Um menu relativamente simples para te levar ao seu destino de preferência, nele usamos um switch-case para direcionar o usuário para o local selecionado. Vamos destrinchar mais sobre.
### Switch-Case
A estrutura do switch-case nesse menu também é bem simples e será mostrada logo abaixo:

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
            default:
                //mensagem caso você não escolha uma opção na lista.
                System.out.println("opções em desenvolvimento");
                break;
                
Nesse código temos o `int escolher` onde 
