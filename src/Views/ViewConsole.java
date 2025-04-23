package Views;

import java.util.Scanner;

import Models.Book;

public class ViewConsole {
    Scanner scanner =new Scanner(System.in);
    public void ViewConsole(){
        
    }
    public void Mesage(String mesage){
        System.out.println(mesage);
        
    }
    public void imprimirLibros(Book[] book){
        for(int i=0; i<book.length;i++){
            System.out.println(" | "+book[i]);

        }
    }
    public void LeerNombre(){
        Mesage("ingrese el nombre a buscar: ");
        String nombre = scanner.next();
    }

}
