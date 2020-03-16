/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron;

/**
 *
 * @author Administrador
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Consola consolas[] = new Consola[100];
        System.out.println("realizamos pedido de 50 nintendo switch");
        int i = 0;
        FabricaConsolas fabrica = new FabricaConsolas();
        while (i < 50) {
            consolas[i]= fabrica.fabricar("switch");
            i++;
        }
        System.out.println("realizamos pedido de 25 xbox");
        while (i < 75) {
            consolas[i]= fabrica.fabricar("xbox");
            i++;
        }
         System.out.println("realizamos pedido de 25 xbox");
        while (i < 75) {
            consolas[i]= fabrica.fabricar("xbox");
            i++;
        }
         System.out.println("realizamos pedido de 25 play");
        while (i < 100) {
            consolas[i]= fabrica.fabricar("play");
            i++;
        }
     System.out.println("probamos todas las consolas encendiendolas ");
     i=0;
     while (i < 100) {
            System.out.println(consolas[i].encender());
            i++;
        }
    }
    

}
