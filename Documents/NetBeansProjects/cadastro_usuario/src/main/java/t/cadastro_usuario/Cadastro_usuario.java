package t.cadastro_usuario;

import java.util.Scanner;

public class Cadastro_usuario {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, pwd, senha = 0, vs;
        String user, login = null;

        //titulo do site ou um botão para cadastro
        System.out.println("¨¨¨ CADASTRO ¨¨¨ \n");

        //menu
        do {
            System.out.println("1 - Login");
            System.out.println("2 - Cadastre-se");
            n1 = input.nextInt();

            switch (n1) {

                case 1:
                    System.out.println("Email: ");
                    user = input.next();
                    System.out.println("Senha: ");
                    pwd = input.nextInt();
                    if (user == login && pwd == senha) {

                        System.out.println("Login efetuado com sucesso!");

                    } else {
                        System.out.println("EMAIL E/OU SENHA INCORRETO");
                    }
                    break;
                case 2:
                    System.out.println("Digite seu e-mail: ");
                    login = input.next();
                    System.out.println("Digite a senha:(Só pode conter numero)");
                    senha = input.nextInt();
                    System.out.println("Digite a senha novamente: ");
                    vs = input.nextInt();
                    if (senha == vs) {
                        System.out.println("Cadastro-se com sucesso!!!");
                        
                    } else {
                        System.out.println("Senhas esta diferentes");
                    }
                    
            }

        } while (n1 != 1 && n1 != 2);

    }
}
