import com.salesianos.MobHostil.MobHostil;
import com.salesianos.Personaje.Personaje;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("¡Bienvenido al juego!");

        int fuerza = obtenerFuerzaArma();
        int defensa = obtenerDefensaArmadura();

        Personaje personaje = new Personaje(fuerza,defensa);
        MobHostil enemigo = generarEnemigoHostil();

        int turnos = 0;
        Random random = new Random();


    }
}