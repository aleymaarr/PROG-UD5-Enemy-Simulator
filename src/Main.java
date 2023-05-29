import com.salesianos.Enderman.Enderman;
import com.salesianos.MobHostil.MobHostil;
import com.salesianos.Personaje.Personaje;
import com.salesianos.Zombie.Zombie;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("¡Bienvenido a la simulación de combate!");

        int opcionArma;
        do {
            System.out.println("¿Qué arma llevará el personaje?");
            System.out.println("1. Ninguna");
            System.out.println("2. Espada de madera");
            System.out.println("3. Espada de hierro");
            System.out.println("4. Espada de diamante");
            opcionArma = scanner.nextInt();
        } while (opcionArma < 1 || opcionArma > 4);


        int fuerzaPersonaje;
        switch (opcionArma) {
            case 1:
                fuerzaPersonaje = 1;
                break;
            case 2:
                fuerzaPersonaje = 2;
                break;
            case 3:
                fuerzaPersonaje = 3;
                break;
            case 4:
                fuerzaPersonaje = 5;
                break;
            default:
                fuerzaPersonaje = 1;
                break;
        }


        int opcionArmadura;
        do {
            System.out.println("¿Qué armadura llevará el personaje?");
            System.out.println("1. Ninguna");
            System.out.println("2. De cuero");
            System.out.println("3. De hierro");
            System.out.println("4. De diamante");
            opcionArmadura = scanner.nextInt();
        } while (opcionArmadura < 1 || opcionArmadura > 4);


        int defensaPersonaje;
        switch (opcionArmadura) {
            case 1:
                defensaPersonaje = 0;
                break;
            case 2:
                defensaPersonaje = 1;
                break;
            case 3:
                defensaPersonaje = 2;
                break;
            case 4:
                defensaPersonaje = 3;
                break;
            default:
                defensaPersonaje = 0;
                break;
        }


        Personaje personaje = new Personaje(defensaPersonaje, fuerzaPersonaje);
        MobHostil mob;

        if (random.nextBoolean()) {
            mob = new Zombie();
        } else {
            mob = new Enderman();
        }

        int turnos = 1;
        while (personaje.getSalud() > 0 && mob.getSalud() > 0) {
            System.out.println("Turno " + turnos);
            System.out.println("El personaje ataca al enemigo.");
            mob.recibirAtaque(personaje.atacar());

            if (random.nextBoolean()) {
                System.out.println("El " + mob.getNombre() + " ataca al personaje.");
                personaje.recibirAtaque(mob.atacar());
            } else {
                System.out.println("El enemigo se mueve.");
                mob.moverse();
            }
            turnos++;
        }

        System.out.println("¡Combate finalizado!");
        System.out.println("Turnos totales: " + (turnos - 1));
        if (personaje.getSalud() > 0) {
            System.out.println("¡El personaje ha salido victorioso!");
        } else {
            System.out.println("¡El enemigo ha salido victorioso!");
        }
    }
    }

