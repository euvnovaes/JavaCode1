
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Hello World! \nBem vindo ao Hora de Codar 1 - Java!");

        System.out.println("\nEscolha o exercício que deseja (1 a 25): ");
        int exercicio = entrada.nextInt();

        switch (exercicio){
            case 1:
                exerc1();
                break;
            case 2:
                exerc2();
                break;
            case 3:
                exerc2();
                break;
            case 4:
                exerc4();
                break;
            case 5:
                exerc5();
                break;
            case 6:
                exerc6();
                break;
            case 7:
                exerc7();
                break;
            case 8:
                exerc8();
                break;
            case 9:
                exerc9();
                break;
            case 10:
                exerc10();
                break;
            case 11:
                exerc11();
                break;
            case 12:
                exerc12();
                break;
            case 13:
                exerc13();
                break;
            case 14:
                exerc14();
                break;
            case 15:
                exerc15();
                break;
            case 16:
                exerc16();
                break;
            case 17:
                 exerc17();
                 break;
            case 18:
                exerc18();
                break;
            case 19:
                exerc19();
                break;
            case 20:
                exerc20();
                break;
            case 21:
                exerc21();
                break;
            case 22:
                exerc22();
                break;
            case 23:
                exerc23();
                break;
            case 24:
                exerc24();
                break;
            case 25:
                exerc25();
                break;
            default:
                System.out.println("Digite um número de 1 a 25.");
        }
        /* 6.1 Faça um programa para ler 4 valores (considere que não serão informados valores iguais) e escrever o maior deles. */

//        System.out.println("Digite o primeiro valor");
//        double valor1 = entrada.nextDouble();
//
//        System.out.println("Digite o segundo valor");
//        double valor2 = entrada.nextDouble();
//
//        System.out.println("Digite o terceiro valor");
//        double valor3 = entrada.nextDouble();
//
//        System.out.println("Digite o quarto valor");
//        double valor4 = entrada.nextDouble();
//
//        if(valor1 > valor2 && valor1 > valor3 && valor1 > valor4)
//            System.out.println("O maior valor digitado é: " + valor1);
//        else if(valor2 > valor3 && valor2 > valor4)
//            System.out.println("O maior valor digitado é: " + valor2);
//        else if(valor3 > valor4)
//            System.out.println("O maior valor digitado é: " + valor3);
//        else
//            System.out.println("O maior valor digitado é: " + valor4);


        /* 7.1 Faça um programa que leia 5  valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores. */

//        int v1, v2, v3, v4, v5, m1, m2, soma;
//
//        System.out.println("Digite o primeiro valor: ");
//        v1 = entrada.nextInt();
//
//        System.out.println("Digite o segundo valor: ");
//        v2 = entrada.nextInt();
//
//        System.out.println("Digite o terceiro valor: ");
//        v3 = entrada.nextInt();
//
//        System.out.println("Digite o quarto valor: ");
//        v4 = entrada.nextInt();
//
//        System.out.println("Digite o quinto valor: ");
//        v5 = entrada.nextInt();
//
//        m1 = v1;
//        m2 = v2;
//
//        if (v3 > m1){
//            m2 = m1;
//            m1 = v3;
//        } else if (v3 > m2) {
//            m2 = v3;
//        }
//
//        if (v4 > m1){
//            m2 = m1;
//            m1 = v4;
//        } else if (v4 > m2) {
//            m2 = v4;
//        }
//
//        if (v5 > m1){
//            m2 = m1;
//            m1 = v5;
//        } else if (v5 > m2) {
//            m2 = v5;
//        }
//
//        soma = m1 + m2;
//
//        System.out.println("A soma dos dois valores maiores é: " + soma);
    }

    public static void exerc1() {
        /* 1. Escreva um programa em Java e crie uma variável chamada "Planeta" e atribua-a um valor "Plutão".
        Exiba o valor para o usuário.*/

        String planeta = "Plutão";
        System.out.println("O planeta é: " + planeta);
    }

    public static void exerc2(){
        Scanner entrada = new Scanner(System.in);
        /* 2. Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]". */
        /* 3. Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário.
        Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".*/

        System.out.println("Informe seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Informe sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("Olá " + nome + ", sua idade é " + idade + " anos");
    }

    public static void exerc4(){
        Scanner entrada = new Scanner(System.in);
        /* 4. Considerando a figura abaixo, escreva um programa para cada forma que calcule e exiba em tela cada uma de suas respectivas áreas.
         O usuário irá informar os valores de cada variável. Crie um arquivo para cada fórmula e poste os  arquivos no GitHub. Link do repositório abaixo. */

        //RETÂNGULO
        System.out.println("\nRETÂNGULO");
        System.out.print("Digite a largura do retângulo: ");
        double largura = entrada.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = entrada.nextDouble();
        double arear = largura * altura;
        System.out.println("A área do retângulo é: " + arear);

        //QUADRADO
        System.out.println("\nQUADRADO");
        System.out.println("Informe o lado do quadrado: ");
        double lado = entrada.nextDouble();
        double areaq = lado * lado;
        System.out.println("A area do quadrado é: " + areaq);

        //LOSANGO
        System.out.println("\nLOSANGO");
        System.out.println("Informe a diagonal maior: ");
        double dMaior = entrada.nextDouble();
        System.out.println("Informe a diagonal menor: ");
        double dMenor = entrada.nextDouble();
        double areal = (dMaior * dMenor) / 2;
        System.out.println("A area do losango é: " + areal);

        //PARALELOGRAMA
        System.out.println("\nPARALELOGRAMA");
        System.out.println("Calculo da área do paralelogramo");
        System.out.print("informe a base: ");
        double baseParalelogramo = entrada.nextDouble();
        System.out.print("informe a altura: ");
        double alturaParalelogramo = entrada.nextDouble();
        double areaParalelogramo = baseParalelogramo * alturaParalelogramo;
        System.out.println("A área do paralelogramo é: " + areaParalelogramo);

        //TRIANGULO
        System.out.println("\nTRIANGULO");
        System.out.println("Cálculo da área do triângulo");
        System.out.print("informe a base: ");
        double baseTriangulo = entrada.nextDouble();
        System.out.print("informe a altura: ");
        double alturaTriangulo= entrada.nextDouble();
        double areaTriangulo = (baseTriangulo * alturaTriangulo) /2;
        System.out.println("A área do triangulo é: " + areaTriangulo);

        //CIRCULO
        System.out.println("\nCIRCULO");
        System.out.println("Calculo da área do círculo");
        System.out.print("informe o raio: ");
        double raio = entrada.nextDouble();
        double areaCirculo = Math.PI * Math.pow(raio, 2);
        System.out.println("á area do circulo é: " + areaCirculo);
    }

    public static void exerc5(){
        Scanner entrada = new Scanner(System.in);
        /* 5. Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou neutro. */

        System.out.println("Insira um valor qualquer: ");
        double valor = entrada.nextDouble();
        if (valor > 0)
            System.out.println("O valor informado é positivo");
        else if (valor < 0)
            System.out.println("O valor informado é negativo");
        else
            System.out.println("O valor informado é neutro");
    }

    public static void exerc6(){
        Scanner entrada = new Scanner(System.in);
        /* 6. Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles. */

        System.out.println("Digite três valores distintos: ");
        double v1 = entrada.nextDouble();
        double v2 = entrada.nextDouble();
        double v3 = entrada.nextDouble();

        double maior = Math.max(v1, Math.max(v2, v3));

        System.out.println("O maior valor é: " + maior);
    }

    public static void exerc7(){
        Scanner entrada = new Scanner(System.in);
        /* 7. Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores. */

        System.out.println("Escreva três valores distintos: ");
        double v1 = entrada.nextDouble();
        double v2 = entrada.nextDouble();
        double v3 = entrada.nextDouble();

        double menor = Math.min(v1, Math.min(v2, v3));

        double soma = (v1 + v2 + v3) - menor;

        System.out.println("A soma dos dois maiores é: " + soma);
    }

    public static void exerc8() {
        Scanner entrada = new Scanner(System.in);
        /* 8. Faça um programa para ler 2 valores informados pelo usuário e se o segundo valor informado for neutro, deve ser lido um novo valor - ou seja, para o segundo valor não pode ser aceito o valor zero nem um valor negativo. O programa deve imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido. */

        System.out.println("Digite o primeiro número: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = entrada.nextInt();

        while (num2 <= 0) {
                System.out.println("Insira um valor positivo para o segundo número.");
                num2 = entrada.nextInt();
        }

        int result = num1 / num2;

        System.out.println("O resultado da divisão entre " + num1 + " e " + num2 + " é: " + result);
    }

    public static void exerc9(){
        Scanner entrada = new Scanner(System.in);
        /* 9. Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba os números informados e escreva a média aritmética desses valores lidos. */

        double soma = 0;
        int cont = 0;

        System.out.println("Insira dez números: ");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "º número: ");
            double num = entrada.nextDouble();

            soma += num;

            cont++;
        }

        double media = soma / cont;

        System.out.println("\nMédia aritmética: " + media);
    }

    public static void exerc10(){
        Scanner entrada = new Scanner(System.in);
        /* 10. Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever a média do semestre e a seguinte mensagem: PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas informadas). */

        boolean retorno = true;

        System.out.println("\nRelatório do aluno");

        System.out.println("Digite a nota da primeira avaliação: ");
        double nota1 = entrada.nextDouble();

        while (retorno) {
            if (nota1 > 10 || nota1 < 0) {
                System.out.println("Digite uma nota entre 0 e 10!");
                nota1 = entrada.nextDouble();
            }
            else
                retorno = !retorno;
        }

        System.out.println("Digite a nota da segunda avaliação: ");
        double nota2 = entrada.nextDouble();

        while (!retorno) {
            if (nota2 > 10 || nota2 < 0) {
                System.out.println("Digite uma nota entre 0 e 10!");
                nota2 = entrada.nextDouble();
            }
            else
                retorno = !retorno;
        }

        System.out.println("Digite a nota da terceira avaliação: ");
        double nota3 = entrada.nextDouble();

        while (retorno) {
            if (nota3 > 10 || nota3 < 0) {
                System.out.println("Digite uma nota entre 0 e 10!");
                nota3 = entrada.nextDouble();
            }
            else
                retorno = !retorno;
        }

        System.out.println("Digite a nota da quarta avaliação: ");
        double nota4 = entrada.nextDouble();

        while (!retorno) {
            if (nota4 > 10 || nota4 < 0) {
                System.out.println("Digite uma nota entre 0 e 10!");
                nota4 = entrada.nextDouble();
            }
            else
                retorno = !retorno;
        }

        double soma = nota1 + nota2 + nota3 + nota4;
        double media = soma / 4;

        if (media > 6)
            System.out.println("\nParabéns! Aluno aprovado. \nSua média do semestre foi: " + media);
        else
            System.out.println("\nUma pena! Aluno reprovado. \nSua média do semestre foi: " + media);
    }

    public static void exerc11(){
        Scanner entrada = new Scanner(System.in);
        /* 11. Crie uma bomba relógio (usando somente código - para deixar claro!) cuja contagem regressiva vá de 30 a 0. Escreva a contagem em tela e no final da repetição escreva "EXPLOSÃO". */

        int cont = 30;
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            cont = i;
        }

        if (cont == 0)
            System.out.println("BOOOOMMM");
    }

    public static void exerc12(){
        Scanner entrada = new Scanner(System.in);
        /* 12. Escreva um algoritmo para imprimir os números de 1 (inclusive) a 10 (inclusive) em ordem decrescente. */

        for (int i = 10; i > 0; i--){
            System.out.println(i);
        }
    }

    public static void exerc13(){
        Scanner entrada = new Scanner(System.in);
        /* 13. Faça um algoritmo que calcule e escreva a média aritmética dos dois números inteiros informados pelo usuário e todos os números inteiros entre eles. Considere que o primeiro sempre será menor que o segundo. */

        int soma = 0;
        int cont = 0;

        System.out.println("Insira um número inteiro: ");
        int num1 = entrada.nextInt();

        System.out.println("Insira outro número inteiro: ");
        int num2 = entrada.nextInt();

        while (num2 < num1) {
            System.out.println("O primeiro número deve ser menor que o segundo.");
            System.out.println("Insira um número inteiro: ");
            num1 = entrada.nextInt();

            System.out.println("Insira outro número inteiro: ");
            num2 = entrada.nextInt();
        }

        for (int i = num1; i <= num2; i++) {
            soma += i;
            cont++;
        }

        double media = soma / cont;
        System.out.println("A média dos números entre " + num1 + " e " + num2 + " é: " + media);
    }

    public static void exerc14(){
        Scanner entrada = new Scanner(System.in);
        /* 14. Escreva um programa para ler 6 notas de um aluno, calcular e imprimir a média final. Considere que a nota de aprovação é 6,5. Logo após escrever a mensagem "Calcular a média de outro aluno Sim/Não?" e solicitar um resposta. Se a resposta for "S", o programa deve ser executado novamente, caso contrário deve ser encerrado exibindo a quantidade de alunos aprovados. */

        System.out.println("Vamos calcular as médias dos alunos! \nDigite notas entre 0 e 10.");

        int alunosAprovados = 0;
        String resposta;

        do {

            double notas = 0;
            double soma = 0;

            for (int i = 1; i <= 6; i++) {
                System.out.println("\n" + i + "º nota: ");
                notas = entrada.nextDouble();
                if (notas < 0 || notas > 10) {
                    System.out.println("Insira notas entre 0 e 10");
                    continue;
                }
                soma += notas;
            }

            double media = soma / 6;

            if (media >= 6.5) {
                System.out.println("\nAluno aprovado! \nSua média foi de: " + media);
                alunosAprovados++;
            } else
                System.out.println("\nAluno reprovado! \nSua média foi de: " + media);

            System.out.println("\nDeseja calcular a nota de outro aluno? (S/N)");
            resposta = entrada.next().toUpperCase();

            if (!resposta.equals("S") && !resposta.equals("N")) {
                System.out.println("Resposta inválida. Digite 'S' ou 'N'.");
                resposta = entrada.next().toUpperCase();
            }

        }
        while (resposta.equals("S"));

        System.out.println("Total de alunos aprovados: " + alunosAprovados);
    }

    public static void exerc15(){
        Scanner entrada = new Scanner(System.in);
                /* 15. Anacleto tem 1,50 metro e cresce 2 centímetros por ano, enquanto Felisberto tem 1,1O metro e cresce 3 centímetros por ano.
            Construa um programa que calcule e imprima quantos anos serão necessários para que Felisberto seja maior que Anacleto. */

        double anacleto = 1.50;
        double felisberto = 1.10;

        int anos = 0;

        while (felisberto <= anacleto){
            anacleto += 0.02;
            felisberto += 0.03;
            anos++;
        }

        System.out.println("\nFelisberto será maior que Anacleto em " + anos + " anos.");
    }

    public static void exerc16(){
        Scanner entrada = new Scanner(System.in);
                /* 16. Escreva um programa para ler:
            o número total de eleitores de um município.
           Agora o programa deve receber a quantidade (percentual):
            o número de votos brancos;
            o número de votos válidos;
            o número de votos nulos.
           Por fim, o programa vai calcular e escrever a quantidade de votos que cada categoria (brancos, nulos e válidos) representa em relação ao totalde eleitores. */

        System.out.println("\nVamos calcular os votos! \nDigite o total de eleitores: ");
        int totalEleitores = entrada.nextInt();

        System.out.println("Digite o percentual de votos brancos");
        double pBrancos = entrada.nextDouble();

        System.out.println("Digite o percentual de votos válidos: ");
        double pValidos = entrada.nextDouble();

        System.out.println("Digite o percentual de votos nulos: ");
        double pNulos = entrada.nextDouble();


        double vBrancos = totalEleitores * (pBrancos / 100);
        double vValidos = totalEleitores * (pValidos / 100);
        double vNulos = totalEleitores * (pNulos / 100);

        System.out.println("\nQuantidade de votos de cada categoria: ");

        System.out.println("Votos brancos: " + vBrancos);
        System.out.println("Votos válidos: " + vValidos);
        System.out.println("Votos nulos: " + vNulos);
    }

    public static void exerc17(){
        Scanner entrada = new Scanner(System.in);
        /* 17. O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
        Supondo que o percentual do distribuidor seja de 28% e os impostos de 45% sobre o valor da fábrica, escreva um programa para ler o custo de fábrica de um carro,
        calcular e escrever o custo final ao consumidor. */

        double fabrica, distribuidora, custoFinal;

        System.out.println("Informe o valor do carro na fabrica: ");
        fabrica = entrada.nextDouble();

        System.out.println("Informe o valor do carro na distribuidora: ");
        distribuidora = entrada.nextDouble();

        fabrica += fabrica + 0.28;
        distribuidora = distribuidora + 1.45;

        custoFinal = fabrica + distribuidora;

        System.out.println("O consumidor final pagará R$ " + custoFinal);
    }

    public static void exerc18(){
        Scanner entrada = new Scanner(System.in);
                /* 18. Desenvolva um programa para uma revendedora de carros usados que calcula o salário final de seus funcionários vendedores. O algoritmo deve receber como entrada o número de carros vendidos,
        o valor total das vendas, o salário fixo mensal do vendedor e a comissão fixa por carro vendido. O salário final do vendedor é calculado somando o salário fixo mensal, a comissão fixa por carro vendido e 5% do valor total das vendas realizadas pelo vendedor.
        Considere que o salário inicial é de R$ 5.000,00. O Programa deve exibir e detalhar cada venda, a comissão e o percentual e exibir o valor final. */

        double salarioFixo = 5000.00;
        System.out.println("Informe o número de carros vendidos: ");
        int carrosVendidos = entrada.nextInt();

        System.out.println("Informe o valor total das vendas: ");
        double valorTotalVendas = entrada.nextDouble();

        System.out.println("Informe a comissão fixa por carro vendido: ");
        double comissaoFixaPorCarro = entrada.nextDouble();

        double comissaoTotalPorCarros = carrosVendidos * comissaoFixaPorCarro;
        double comissaoPercentualSobreVendas = valorTotalVendas * 0.05;
        double salarioFinal = salarioFixo + comissaoTotalPorCarros + comissaoPercentualSobreVendas;


        System.out.println("Detalhes do salário do vendedor:");
        System.out.println("Salário fixo mensal: R$ " + salarioFixo);
        System.out.println("Número de carros vendidos: " + carrosVendidos);
        System.out.println("Comissão fixa por carro vendido: R$ " + comissaoFixaPorCarro);
        System.out.println("Comissão total por carros vendidos: R$ " + comissaoTotalPorCarros);
        System.out.println("5% do valor total das vendas: R$ " + comissaoPercentualSobreVendas);
        System.out.println("Salário final do vendedor: R$ " + salarioFinal);
    }

    public static void exerc19(){
        Scanner entrada = new Scanner(System.in);
                /* 19. Crie um programa para ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam ou não um triângulo.
        Obs: para formar um triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados. */

        System.out.println("Digite o primeiro numero: ");
        double num1 = entrada.nextDouble();entrada.nextLine();

        System.out.println("Digite o segundo numero: ");
        double num2 = entrada.nextDouble();entrada.nextLine();

        System.out.println("Digite o terceiro numero: ");
        double num3 = entrada.nextDouble();entrada.nextLine();

        if (num1 < (num2 + num3) && num2 < (num1 + num3) && num3 < (num2 + num1)){
            System.out.println("Foi possível formar um triângulo! ");
            return;
        }
        System.out.println("Não foi possível formar um triângulo! ");
    }

    public static void exerc20(){
        Scanner entrada = new Scanner(System.in);
        /* 20. Faça um programa para ler:
            O nome do produto,
            A quantidade adquirida do produto,
            O preço unitário do produto.
        Agora o programa deve calcular e escrever:
            O valor da venda (valor da venda = quantidade adquirida * preço unitário),
            O percentual de desconto,
            O valor fixo de imposto que é 20%.
            O total a pagar (total a pagar = valor da venda - desconto).
        Sabendo-se que:
            Se quantidade <= 5 o desconto será de 2%
            Se quantidade > 5 e quantidade <=10 o desconto será de 3%
            Se quantidade > 10 o desconto será de 5%
        No fim, escreva um recibo que detalhe a compra como uma nota fiscal. */

        System.out.println("Digite o nome do produto: ");
        String nomeProduto = entrada.nextLine();

        System.out.println("Digite a quantidade adquirida: ");
        int quantidade = entrada.nextInt();

        System.out.println("Digite o preço unitário: ");
        double precoUnitario = entrada.nextDouble();

        double valorVenda = quantidade * precoUnitario;

        double descontoPercentual;
        if (quantidade <= 5) {
            descontoPercentual = 2;
        } else if (quantidade <= 10) {
            descontoPercentual = 3;
        } else {
            descontoPercentual = 5;
        }

        double valorDesconto = valorVenda * (descontoPercentual / 100);
        double valorTotal = valorVenda - valorDesconto;

        double valorImposto = valorVenda * 0.2;

        System.out.println("\n=========================================");
        System.out.println("          Nota Fiscal Eletrônica          ");
        System.out.println("=========================================");
        System.out.println("Nome do Produto: " + nomeProduto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço Unitário: R$ " + precoUnitario);
        System.out.println("-----------------------------------------");
        System.out.println("Valor da Venda: R$ " + String.format("%.2f", valorVenda));
        System.out.println("Desconto (" + descontoPercentual + "%): R$ " + String.format("%.2f", valorDesconto));
        System.out.println("Imposto (20%): R$ " + String.format("%.2f", valorImposto));
        System.out.println("-----------------------------------------");
        System.out.println("Total a Pagar: R$ " + String.format("%.2f", valorTotal));
        System.out.println("=========================================");
    }

    public static void exerc21(){
        Scanner entrada = new Scanner(System.in);
        /* 21. Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para estar em condições, um dos seguintes requisitos deve ser satisfeito:
                - Ter no mínimo 65 anos de idade.
                - Ter trabalhado no mínimo 30 anos.
                - Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
            Com base nas informações acima, faça um algoritmo que leia: o número do empregado (código), o ano de seu nascimento e o ano de seu ingresso na empresa. O programa deverá escrever a idade e o tempo de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou 'Não requerer'. */

        System.out.println("Digite o código do empregado: ");
        int codigo_empregado = entrada.nextInt();

        System.out.println("Digite o ano de nascimento: ");
        int nascimento_empregado = entrada.nextInt();

        System.out.println("Digite o ano que o empregado entrou na empresa: ");
        int ano_empregado = entrada.nextInt();

        int idade = 2024 - nascimento_empregado;
        int tempo_serviço = 2024 - ano_empregado;

        System.out.println("O empregado " + codigo_empregado + " tem " + idade + " anos de idade e possui " + tempo_serviço + " anos de contribuição na empresa.");

        if (idade >= 65 || tempo_serviço >= 30)
            System.out.println("Requerer aposentadoria.");
        else if (idade >= 60 && tempo_serviço >= 25)
            System.out.println("Requerer aposentadoria");
        else
            System.out.println("Não requerer.");
    }

    public static void exerc22(){
        Scanner entrada = new Scanner(System.in);
        /* 22.  Escreva um algoritmo que imprima as seguintes seqüências de números:
            (1, 1 2 3 4 5 6 7 8 9 10)
            (2, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
            (3, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30)
        E assim sucessivamente, até que o primeiro número (antes da vírgula), também chegue a 20. */

        for (int num1 = 1; num1 <= 20; num1++) {
            System.out.print(num1 + ", ");

            for (int numeroAtual = num1 + 1; numeroAtual <= num1 + 10; numeroAtual++) {
                System.out.print(numeroAtual + " ");
            }

            System.out.println();
        }
    }

    public static void exerc23(){
        Scanner entrada = new Scanner(System.in);
                /* 23. Escreva um algoritmo que imprima as seguintes seqüências de números:
            (1, 1 2 3 4 5 6 7 8 9 10)
            (2, 1 2 3 4 5 6 7 8 9 10)
            (3, 1 2 3 4 5 6 7 8 9 10)
         E assim sucessivamente, até que o primeiro número (antes da vírgula), também chegue a 20. */

        for (int i = 1; i <= 20 ; i++) {
            System.out.print("(" + i + ", ");
            for (int j = 1; j <= 10; j++) {
                System.out.print(j);
                if (j == 10) {
                    System.out.print(")");
                    System.out.println();
                }
            }
        }
    }

    public static void exerc24(){
        Scanner entrada = new Scanner(System.in);
        /* 24. A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
        Escreva um programa que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas(considere que o mês possua 4 semanas exatas) */

        System.out.println("Informe quantas horas você trabalhou esse mês");
        int horasTrabalhadas = entrada.nextInt();

        System.out.println("Informe seu salário por hora");
        double salarioHora = entrada.nextDouble();

        if (horasTrabalhadas < 160) {
            throw new RuntimeException("Um trabalhador não pode ter menos que 160 horas por mês");
        }

        int horasNormais = 160;
        int horasExtras = horasTrabalhadas - horasNormais;

        double salarioHoraExtra = salarioHora * 1.5;
        double valorHorasExtras = horasExtras * salarioHoraExtra;

        double salarioTotal = (horasNormais * salarioHora) + valorHorasExtras;

        System.out.println("Seu salário deve ser de " + salarioTotal);
    }

    public static void exerc25(){
        Scanner entrada = new Scanner(System.in);
                /* 25. Escreva um programa que para ler doze números informados pelo usuário e que serão armazenados em um vetor/array.
        No fim o programa deve dar duas saídas:
        1) o programa deve processar os dados invertendo a posição dos elementos trocando o primeiro elemento com o último, o segundo com penúltimo etc.
        2) o programa deve processar os dados invertendo a posição dos elementos trocando, mas separando os dados por tipo.
        Exemplo:
        Usuário informa: A, 1, B, 2, C, 3 D, 4, E, 5, F, 6
        Saída 1:  6, F, 5, E, 4, D, 3, 2, B, 1
        Saída 2:  6, 5, 4, 3, 2, 1 - F, E, D, C, A, B */

        String[] array = new String[12];

        System.out.println("Informe doze elementos (letras ou números):");
        for (int i = 0; i < 12; i++) {
            array[i] = entrada.next();
        }

        // Saída 1: Inversão simples
        String[] invertidoSimples = new String[12];
        for (int i = 0; i < 12; i++) {
            invertidoSimples[i] = array[11 - i];
        }
        System.out.println("Saída 1: Inversão simples");
        for (String elemento : invertidoSimples) {
            System.out.print(elemento + " ");
        }
        System.out.println();

        String[] numeros = new String[12];
        String[] letras = new String[12];
        int numCount = 0;
        int letraCount = 0;

        for (String elemento : array) {
            if (Character.isDigit(elemento.charAt(0))) {
                numeros[numCount++] = elemento;
            } else {
                letras[letraCount++] = elemento;
            }
        }

        String[] numerosInvertidos = new String[numCount];
        for (int i = 0; i < numCount; i++) {
            numerosInvertidos[i] = numeros[numCount - 1 - i];
        }

        String[] letrasInvertidas = new String[letraCount];
        for (int i = 0; i < letraCount; i++) {
            letrasInvertidas[i] = letras[letraCount - 1 - i];
        }
        System.out.println("Saída 2: Inversão separada por tipo");
        for (String numero : numerosInvertidos) {
            System.out.print(numero + " ");
        }
        System.out.print(" - ");
        for (String letra : letrasInvertidas) {
            System.out.print(letra + " ");
        }
        System.out.println();
    }
}