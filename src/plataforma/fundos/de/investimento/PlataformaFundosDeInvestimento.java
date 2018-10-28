package plataforma.fundos.de.investimento;

import java.util.Scanner;

public class PlataformaFundosDeInvestimento {

    public static void main(String[] args) {
        Utils.ClearConsole();
        
        OperacoesFIUser operacoesUser = new OperacoesFIUser();
        OperacoesFIAdmin operacoesAdmin = new OperacoesFIAdmin(operacoesUser);
        
        // MENU GERAL
        // Controlar comandos de usuário
        Scanner in = new Scanner(System.in);
        boolean quit = false;
        int menuItem;

        do {

            // print menu
            System.out.println("\n"
                    + "1. Login de usuário\n"
                    + "2. Login de administrador\n"
                    + "0. Sair");

            System.out.print("Escolha uma opção do menu: ");

            menuItem = in.nextInt();

            Utils.ClearConsole();
            switch (menuItem) {

                case 1:

                    // MENU USUÁRIO
                    // Controlar comandos de usuário
                    Scanner inUser = new Scanner(System.in);
                    boolean quitUser = false;
                    int menuItemUser;

                    do {

                        // print menu
                        System.out.println("\n"
                                + "1. Comprar fundo\n"
                                + "2. Vender fundo\n"
                                + "3. Ver ordens pendentes\n"
                                + "4. Ver ordens concluídas\n"
                                + "0. Voltar");

                        System.out.print("Escolha uma opção do menu: ");

                        menuItemUser = inUser.nextInt();

                        Utils.ClearConsole();
                        switch (menuItemUser) {

                            case 1:
                                
                                System.out.println("Insira o valor do montante para compra:");                                
                                float montanteCompra = inUser.nextFloat();

                                operacoesUser.comprar(montanteCompra);
                                
                                Utils.ClearConsole();
                                
                                System.out.println("Operação de compra efetuada!");
                                
                                break;

                            case 2:

                                System.out.println("Insira o valor do montante para venda:");                                
                                float montanteVenda = inUser.nextFloat();
                                
                                operacoesUser.vender(montanteVenda);
                                
                                Utils.ClearConsole();
                                
                                System.out.println("Operação de compra efetuada!");
                                
                                break;

                            case 3:

                                System.out.println("Ordens Pendentes:");
                                
                                String pendentes2 = operacoesAdmin.imprimirOrdensPendentes();
                                
                                if (!pendentes2.isEmpty()) {
                                    System.out.println(pendentes2);
                                }
                                else {
                                    System.out.println("Nenhuma ordem pendente!");
                                }
                                
                                break;

                            case 4:

                                System.out.println("Ordens Concluídas:");
                                
                                String concluidas = operacoesAdmin.imprimirOrdensConcluidas();
                                
                                if (!concluidas.isEmpty()) {
                                    System.out.println(concluidas);
                                }
                                else {
                                    System.out.println("Nenhuma ordem concluída!");
                                }
                                
                                break;

                            case 0:

                                quitUser = true;

                                break;

                            default:

                                System.out.println("Opção inválida.");

                        }

                    } while (!quitUser);

                    System.out.println("Usuário deslogado!");

                    // ***MENU USUÁRIO***
                    break;

                case 2:

                    // MENU ADMINISTRADOR
                    // Controlar comandos de usuário
                    Scanner inAdmin = new Scanner(System.in);
                    boolean quitAdmin = false;
                    int menuItemAdmin;

                    do {

                        // print menu
                        System.out.println("\n"
                                + "1. Processar ordens\n"
                                + "2. Ver ordens pendentes\n"
                                + "3. Ver ordens concluídas\n"
                                + "0. Voltar");

                        System.out.print("Escolha uma opção do menu: ");

                        menuItemAdmin = inAdmin.nextInt();

                        Utils.ClearConsole();
                        switch (menuItemAdmin) {

                            case 1:

                                System.out.println("Processando ordens...");
                                
                                String pendentes1 = operacoesAdmin.imprimirOrdensPendentes();
                                
                                if (!pendentes1.isEmpty()) {
                                    System.out.println(pendentes1);
                                    operacoesAdmin.processarOrdensPendentes();
                                    System.out.println("As ordens pendentes foram processadas!");
                                }
                                else {
                                    System.out.println("Nenhuma ordem pendente!");
                                }
                                
                                break;

                            case 2:

                                System.out.println("Ordens Pendentes:");
                                
                                String pendentes2 = operacoesAdmin.imprimirOrdensPendentes();
                                
                                if (!pendentes2.isEmpty()) {
                                    System.out.println(pendentes2);
                                }
                                else {
                                    System.out.println("Nenhuma ordem pendente!");
                                }
                                
                                break;

                            case 3:

                                System.out.println("Ordens Concluídas:");
                                
                                String concluidas = operacoesAdmin.imprimirOrdensConcluidas();
                                
                                if (!concluidas.isEmpty()) {
                                    System.out.println(concluidas);
                                }
                                else {
                                    System.out.println("Nenhuma ordem concluída!");
                                }
                                
                                break;

                            case 0:

                                quitAdmin = true;

                                break;

                            default:

                                System.out.println("Opção inválida.");

                        }

                    } while (!quitAdmin);

                    System.out.println("Administrador deslogado!");

                    // ***MENU ADMINISTRADOR***
                    break;

                case 0:

                    quit = true;

                    break;

                default:

                    System.out.println("Opção inválida.");

            }

        } while (!quit);

        System.out.println("Obrigado por usar nosso sistema!");

        // ***MENU GERAL***
    }

}
