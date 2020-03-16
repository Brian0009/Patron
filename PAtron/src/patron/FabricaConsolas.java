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
public class FabricaConsolas {

    private NintendoSwitch nintendo;
    private XboxOne xbox;
    private PS4 play;

    public FabricaConsolas() {
        nintendo = new NintendoSwitch();
        xbox = new XboxOne();
        play = new PS4();
        nintendo.setColor("black");
        nintendo.setDescripcion("una bonita consola hibrida");
        nintendo.setNombre("SW");
        xbox.setColor("white");
        xbox.setDescripcion("una consola con graficos envidiables");
        xbox.setNombre("x1");
        play.setColor("blue");
        play.setDescripcion("la consola de sony mas divertida");
        play.setNombre("PS-4");
    }

    public Consola fabricar(String nombreConsola) {
        if ("switch".equals(nombreConsola)) {
            return (Consola) nintendo.clone();
        } else if ("xbox".equals(nombreConsola)) {
            return (Consola) xbox.clone();
        } else if ("play".equals(nombreConsola)) {
            return (Consola) play.clone();
        }

        return null;
    } // method retrieveAnimal

}
