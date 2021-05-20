package caixaeletronico;

import java.util.Scanner;

public class Caixav1 {

    public static void main(String[] args) throws InterruptedException {
        long cpf = 00000000000L, dados;
        int secret = 123456, senha, loop = 0, menu, conta = 5000, dep, saq;

        Metodo2 m = new Metodo2();

        Scanner ler;
        ler = new Scanner(System.in);

        System.out.println("===== NetBank =====");
        System.out.println("Seja bem vindo ao NetBank, para entrar basta digitar seu CPF");
        System.out.print("Digite seu CPF aqui: ");
        dados = ler.nextLong();

        if (dados == cpf) {
            System.out.println("Olá ${user}, por gentileza digite sua senha abaixo");
            System.out.print("Digite sua senha:");
            senha = ler.nextInt();

            if (senha == secret) {
                System.out.println("Bem vindo ${user}, Veja abaixo o painel interativo do NetBank");
                m.Menu();
                menu = ler.nextInt();

                loop:
                while (menu < 10) {
                    switch (menu) {
                        case 1:
                            System.out.println("===== Saldo =====");
                            System.out.println("Seu saldo atual é de: " + conta);
                            System.out.println("Estou te redirecionando de volta para o menu principal");
                            Thread.sleep(3000);
                            System.out.println(new String(new char[50]).replace("\0", "\r\n"));
                            m.Menu();
                            break;
                        case 2:
                            System.out.println("===== Depósito =====");
                            System.out.print("Digite o valor que deseja depositar: ");
                            dep = ler.nextInt();
                            conta = conta + dep;
                            System.out.println("Seu saldo atual depois do depósito é de: " + conta);
                            System.out.println("Estou te redirecionando de volta para o menu principal");
                            Thread.sleep(3000);
                            System.out.println(new String(new char[50]).replace("\0", "\r\n"));
                            m.Menu();
                            break;
                        case 3:
                            System.out.println("===== Saque =====");
                            System.out.print("Digite o valor que deseja sacar: ");
                            saq = ler.nextInt();
                            conta = conta - saq;
                            System.out.println("Seu saldo atual depois do saque é de: " + conta);
                            System.out.println("Estou te redirecionando de volta para o menu principal");
                            Thread.sleep(3000);
                            System.out.println(new String(new char[50]).replace("\0", "\r\n"));
                            m.Menu();
                            break;
                        case 4:
                            System.out.println("===== Transferência =====");
                            System.out.print("Digite o número da agência que deseja fazer a transferencia:");
                            System.out.println("Digite o número da conta: ");
                            System.out.println("Digite o valor da transferência: ");

                            break;
                        case 5:
                            System.out.println("===== Extrato =====");
                            break;
                        case 0:
                            System.out.println("Voce acaba de encerrar sua sessao");
                            Thread.sleep(5000);
                            System.out.println(new String(new char[50]).replace("\0", "\r\n"));
                            break loop;
                        default:
                            System.out.println("Ops, você não selecionou uma operação válida");
                            m.Menu();
                            break;

                    }
                    menu = ler.nextInt();
                }
            } else {

                for (int i = 0; i < 2; i++) {
                    System.out.println("Você digitou sua senha errada, porém você tem mais " + (2 - i) + " chances.");
                    System.out.print("Digite sua senha:");
                    senha = ler.nextInt();

                    if (senha != secret) {
                        loop++;
                    } else if (senha == secret) {
                        System.out.println("Bem vindo ${user},, Veja abaixo o painel interativo do NetBank");
                        m.Menu();
                        menu = ler.nextInt();

                        loop:
                        while (menu < 10) {
                            switch (menu) {
                                case 1:
                                    System.out.println("===== Saldo =====");
                                    System.out.println("Seu saldo atual é de: " + conta);
                                    System.out.println("Estou te redirecionando de volta para o menu principal");
                                    Thread.sleep(3000);
                                    System.out.println(new String(new char[50]).replace("\0", "\r\n"));
                                    m.Menu();
                                    break;
                                case 2:
                                    System.out.println("===== Depósito =====");
                                    System.out.print("Digite o valor que deseja depositar: ");
                                    dep = ler.nextInt();
                                    conta = conta + dep;
                                    System.out.println("Seu saldo atual depois do depósito é de: " + conta);
                                    System.out.println("Estou te redirecionando de volta para o menu principal");
                                    Thread.sleep(3000);
                                    System.out.println(new String(new char[50]).replace("\0", "\r\n"));
                                    m.Menu();
                                    break;
                                case 3:
                                    System.out.println("===== Saque =====");
                                    System.out.print("Digite o valor que deseja sacar: ");
                                    saq = ler.nextInt();
                                    conta = conta - saq;
                                    System.out.println("Seu saldo atual depois do saque é de: " + conta);
                                    System.out.println("Estou te redirecionando de volta para o menu principal");
                                    Thread.sleep(3000);
                                    System.out.println(new String(new char[50]).replace("\0", "\r\n"));
                                    m.Menu();
                                    break;
                                case 4:
                                    System.out.println("===== Transferência =====");
                                    System.out.print("Digite o número da agência que deseja fazer a transferencia:");
                                    System.out.println("Digite o número da conta: ");
                                    System.out.println("Digite o valor da transferência: ");

                                    break;
                                case 5:
                                    System.out.println("===== Extrato =====");
                                    break;
                                case 0:
                                    System.out.println("Voce acaba de encerrar sua sessao");
                                    Thread.sleep(5000);
                                    System.out.println(new String(new char[50]).replace("\0", "\r\n"));
                                    break loop;
                                default:
                                    System.out.println("Ops, você não selecionou uma operação válida");
                                    m.Menu();
                                    break;

                            }
                            menu = ler.nextInt();
                        }
                    }
                    if (loop == 2) {
                        System.out.println("Você errou sua senha muitas vezes, por esse motivo bloqeuamos sua conta");
                        break;
                    }
                }
            }
        } else {
            System.out.println("Acesso Negado, CPF não cadastrado!");
        }
    }
}
