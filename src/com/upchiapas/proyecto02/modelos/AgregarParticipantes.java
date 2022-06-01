package com.upchiapas.proyecto02.modelos;
import java.util.Scanner;
import com.upchiapas.proyecto02.modelos.Participante;

public class AgregarParticipantes {
    static Scanner entrada = new Scanner(System.in);


    public void menu(){
        int opcion;
        int opcion2 = 0;
        do {
            System.out.println("1.agregar Participantes");
            System.out.println("2.visualizar Participantes");
            System.out.println("3 salir");
            opcion=entrada.nextInt();
            switch (opcion){
                case 1:
                    agregarParticipantes();
                    break;
                case 2:
                    VisualizarPlantaAlta();
                    break;
                case 3:
                    break;
            }
        }while (opcion!=3);
    }
    Participante objectoPaticipante;
    Participante objectoPaticipant;

    Participante[] arregloParticipante;

   Participante[] plantaBaja;

    public void agregarParticipantes(){

        int folio;
        String nombre;
        String lugar;
        arregloParticipante= new Participante[5];
        plantaBaja = new Participante[3];
        for(int i=0; i<5; i++) {
            System.out.println("Planta Alta: "+(i+1));
            System.out.println("INGRESA EL NOMBRE: ");
            nombre = entrada.next();
            System.out.println("INGRESA LUGAR: ");
            lugar = entrada.next();
            folio = (int) (Math.random() * 1000);
            System.out.println("Folio: " + folio);
            objectoPaticipante = new Participante(nombre, lugar, folio);
            arregloParticipante[i] = objectoPaticipante;
        }
        System.out.println("Planta Alta llena");
        for(int i=0; i<3; i++) {
            System.out.println("Planta Baja: " + (i + 1));
            System.out.println("INGRESA EL NOMBRE: ");
            nombre = entrada.next();
            System.out.println("INGRESA LUGAR: ");
            lugar = entrada.next();
            folio = (int) (Math.random() * 1000);
            System.out.println("Folio: " + folio);
            objectoPaticipant = new Participante(nombre, lugar, folio);
            plantaBaja[i] = objectoPaticipant;
        }
        System.out.println("Planta Baja llena");
    }
    public void VisualizarPlantaAlta(){
        for(int i=0; i < 5; i++){

            System.out.println("Nombre: "+arregloParticipante[i].getNombre()+" "+"Planta Alta: "+(i+1));

        }
        for (int i=0; i <3; i++){
            System.out.println("NombreB: "+arregloParticipante[i].getNombre()+"Planta Baja: "+(i+1));
        }
    }

}
