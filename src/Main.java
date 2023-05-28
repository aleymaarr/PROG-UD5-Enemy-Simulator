import com.salesianos.Enderman.Enderman;
import com.salesianos.MobHostil.MobHostil;
import com.salesianos.Personaje.Personaje;
import com.salesianos.Zombie.Zombie;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("¡Bienvenido al juego!");

        int fuerza = obtenerFuerzaArma();
        int defensa = obtenerDefensaArmadura();

        Personaje personaje = new Personaje(fuerza,defensa);
        MobHostil enemigo = generarEnemigoHostil();

        int turnos = 0;
        Random random = new Random();

        while(personaje.getSalud() > 0 && enemigo.getSalud() > 0){

            int danoPersonaje = personaje.atacar();
            enemigo.recibirAtaque(danoPersonaje);

            if(enemigo.getSalud() <= 0){
                break;
            }

            int accionEnemigo = random.nextInt(2);

            if (accionEnemigo == 0){
                int danoEnemigo = enemigo.atacar();
                personaje.recibirAtaque(danoEnemigo);
            }else{
                enemigo.moverse();
            }

            turnos++;
        }

        if (personaje.getSalud() <= 0){
            System.out.println("¡Has sido derrotado! El enemigo te han vencido en" + turnos + "turnos");
        }else{
            System.out.println("!Has ganado¡ Has derrotado al enemigo en" + turnos + "turnos");
        }
    }

    private static int obtenerFuerzaArma(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué arma llevara el personaje?");
        System.out.println("1. Ninguno");
        System.out.println("2. Espada madera");
        System.out.println("3. Espada de hierro");
        System.out.println("4. Espada de diamanate");
        int opcion = scanner.nextInt();

        int fuerza = 1;
        switch (opcion){
            case 2:
                fuerza = 2;
                break;
            case 3:
                fuerza = 3;
                break;
            case 4:
                fuerza = 5;
                break;
        }
        return fuerza;
    }

    private static int obtenerDefensaArmadura() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué armadura llevará el personaje?");
        System.out.println("1. Ninguna");
        System.out.println("2. Armadura de cuero");
        System.out.println("3. Armadura de hierro");
        System.out.println("4. Armadura de diamante");
        int opcion = scanner.nextInt();

        int defensa = 0;
        switch (opcion) {
            case 2:
                defensa = 1;
                break;
            case 3:
                defensa = 2;
                break;
            case 4:
                defensa = 3;
                break;
        }
        return defensa;
    }


    private static MobHostil generarEnemigoHostil() {
        Random random = new Random();
        int opcionEnemigo = random.nextInt(2);

        if (opcionEnemigo == 0) {
            return new Zombie();
        } else {
            return new Enderman();
        }
    }
}

