package aplicação;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

import entidades.Client;
import entidades.Order;
import entidades.OrderItem;
import entidades.OrderStatus;
import entidades.Product;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Client cli = new Client();

		System.out.println("Enter Cliente Data: ");
		System.out.println("nome: ");
		cli.setNome(sc.nextLine());
		System.out.println("Email: ");
		cli.setEmail(sc.nextLine());
		System.out.println("Birth Date: ");
		cli.setBirthDate(LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt()));

		System.out.println("Enter order Data: ");
		System.out.print("Status: ");
		sc.nextLine();
		String status = sc.nextLine();
		Order ord = new Order(LocalDateTime.now(), OrderStatus.valueOf(status));

		System.out.println("how many items to this order? ");
		int adicionar = sc.nextInt();
		for (int i = 0; i < adicionar; i++) {
			System.out.println("Item " + (i + 1) + " : ");
			System.out.println("Product name: ");
			String nome = sc.next();
			System.out.println("Product price: ");
			double price = sc.nextDouble();
			System.out.println("Quantity: ");
			int quantity = sc.nextInt();

			ord.addItem(new OrderItem(quantity, price, new Product(nome, price)));
			
		}
		System.out.println(ord.toString());
		System.out.println(cli.toString());
		System.out.println("Order Items: ");

		ord.imprimirItems();
		System.out.printf("Total: " + ord.Total());
		

		sc.close();
	}

}
