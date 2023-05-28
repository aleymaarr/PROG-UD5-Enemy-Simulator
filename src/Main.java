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
}
