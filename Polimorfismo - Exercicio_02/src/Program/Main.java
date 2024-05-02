package Program;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


import Entities.ImportedProduct;

import Entities.Product;
import Entities.UsedProduct;

public class Main {

    public static void main(String[] args) throws ParseException {
        // Configura o idioma padrão para entrada de dados como US para suporte ao formato de números com ponto decimal
        Locale.setDefault(Locale.US);
        
        // Cria um objeto Scanner para capturar entrada do teclado
        Scanner sc = new Scanner(System.in);
        
        // Cria uma lista para armazenar os produtos
        List<Product> list = new ArrayList<>();
        
        // Solicita ao usuário que insira o número de produtos a serem registrados
        System.out.print("Entre com o numero de produtos: ");
        int n = sc.nextInt();
        
        // Loop para iterar sobre cada produto a ser registrado
        for (int i = 1; i <= n; i++) {
            System.out.println("Datos do produto #" + i + ":");
            System.out.print("Comum, usado, importado (c/u/i)? ");
            // Captura o tipo do produto (comum, usado ou importado)
            char type = sc.next().charAt(0);
            
            // Captura o nome do produto
            System.out.print("Nome: ");
            sc.nextLine(); // Consumir a quebra de linha pendente
            String name = sc.nextLine();
            
            // Captura o preço do produto
            System.out.print("Preco: ");
            double price = sc.nextDouble();
            
            // Verifica o tipo de produto e adiciona à lista o produto correspondente
            if (type == 'c') {


				// Metodo para instaciar o funcionario terceirizado
				Product product = new Product(name, price);

				// Metodo para adicionar na Lista
				list.add(product);
            	
            	                
            } else if (type == 'u') {
                // Se o produto for usado, captura a data de fabricação
                System.out.print("Data de fabricacao (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                
                 // Metodo para instaciar o funcionario terceirizado
				UsedProduct usedProduct = new UsedProduct(name, price, date);

				// Metodo para adicionar na Lista
				list.add(usedProduct);
                
               
            } else {
                // Se o produto for importado, captura a taxa de importação
                System.out.print("Taxa de importacao: ");
                double customsFee = sc.nextDouble();
                
               // Metodo para instaciar o funcionario terceirizado
				ImportedProduct importedProduct = new ImportedProduct(name, price, customsFee);

				// Metodo para adicionar na Lista
				list.add(importedProduct);
              
            }
        }

        // Imprime as etiquetas de preço de todos os produtos registrados
        System.out.println();
        System.out.println("ETIQUETAS DE PRECO:");
        for (Product prod : list) {
            System.out.println(prod.priceTag());
        }
        
        // Fecha o scanner para liberar recursos
        sc.close();
    }
}
