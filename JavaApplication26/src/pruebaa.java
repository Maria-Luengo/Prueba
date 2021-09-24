
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria333
 */
public class pruebaa {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String nombre, apellido;
        System.out.println("Introduce tu nombre: ");
        nombre=sn.nextLine();
        System.out.println("Introduece tu apellido: ");
        apellido= sn.next();
        System.out.println("Hola "+nombre+" " + apellido+"!");
        
    }
}
