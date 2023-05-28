import com.salesianos.Personaje.Personaje;

public class Main {

    public static void main(String[] args) {

        System.out.println("¡Bienvenido al juego!");

        int fuerza = obtenerFuerzaArma();
        int defensa = obtenerDefensaArmadura();
        Personaje personaje = new Personaje(fuerza,defensa);


    }
}