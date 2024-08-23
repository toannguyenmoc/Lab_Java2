/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_8;

/**
 *
 * @author ToanNM_PC09504
 */
public class ProductManager {
    public static void main(String[] args) {
        Product p1 = new Product("iPhone 9", 1000.0);
        Product p2 = new Product("SamSung Start", 3000.0);
        
        productDAO dao = new productDAO();
        dao.add(p1);
        dao.add(p2);
        dao.store("D:/temp/prod.dat");
        
        productDAO dao2 = new productDAO();
        dao2.load("D:/temp/prod.dat");
        Product p = dao2.find("iPhone9");
        System.out.println(">Name: "+p.name);
        System.out.println(">Price: "+p.price);
    }
}
