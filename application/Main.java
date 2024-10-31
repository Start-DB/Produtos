package application;

import java.util.Scanner;

import entidades.Products;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quatidade de produtos: ");
        int n = sc.nextInt();
        Products[] vect = new Products[n];

        for(int i = 0; i<vect.length; i++){
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            vect[i] = new Products(nome,preco);
        }

        double sum = 0.0;
        for(int i=0; i<vect.length; i++){
            sum += vect[i].getPreco();
        }
        double media = sum / vect.length;

        System.out.printf("A media dos precos é: %.2f\n",media);

        sc.close();
    }
}
    
