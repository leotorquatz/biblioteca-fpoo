package br.senai.sp.jandira.model;

import java.util.Scanner;

public class menu {

    public void menu() {

        Scanner teclado = new Scanner(System.in);
        usuario usuarios = new usuario();
        livros livro = new livros();

        boolean exit = false;

        while (!exit) {
            System.out.println("--------------------------------------------");
            System.out.println("       Biblioteca Virtual Senai Jandira     ");
            System.out.println("--------------------------------------------");
            System.out.println("");
            System.out.println("      Escolhas dentre as opções abaixo:     ");
            System.out.println("");
            System.out.println("--------------------------------------------");
            System.out.println("");
            System.out.println(" 1 - EFETUAR CADASTRO DE LIVROS ");
            System.out.println(" 2 - EFETUAR CADASTRO DE USUÁRIOS ");
            System.out.println(" 3 - EFETUAR EMPRÉSTIMO DE LIVROS ");
            System.out.println(" 4 - EFETUAR CONSULTA DE CATÁLOGO ");
            System.out.println(" 5 - EFETUAR DEVOLUÇÃO DE EMPRÉSTIMOS ");
            System.out.println("");
            System.out.println("-------------------------------------------");

            int useOption = teclado.nextInt();

            switch (useOption){
                case 1:
                    livro.
            }

        }

    }

}