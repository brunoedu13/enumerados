package aplication;

import Entities.Client;
import Entities.Order;
import Entities.OrderItem;
import Entities.Product;
import jdk.swing.interop.SwingInterOpUtils;
import Enum.OrderStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
	// write your code here


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Entrando com dados do cliente
        System.out.println("Enter cliente data: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String dateBirth = sc.nextLine();
        //convertendo datas
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        Date y1 = sdf1.parse(dateBirth);
        ///////////////////////////////////////////////////////////////////
        Client client = new Client(nome,email,y1);
        // Dados do Pedido;
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = sc.next();
        System.out.print("How many items to this order? ");
        Integer n = sc.nextInt();
        Order order = new Order(new Date(), OrderStatus.valueOf(status), client);

        for(int i = 0 ; i < n; i++){

            System.out.println("Enter #"+i +1 + " item data:");
            System.out.print("Product Name: ");
            String productName = sc.next();
            System.out.print("Product price: ");
            Double price = sc.nextDouble();
            System.out.print("quantity: ");
            Integer quantity = sc.nextInt();
            Product product;
            OrderItem orderItem = new OrderItem(quantity,price, product = new Product(productName,price));
            order.addItem(orderItem);

        }













        sc.close();




    }
}
