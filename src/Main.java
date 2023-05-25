import com.salesianos.Enderman.Enderman;
import com.salesianos.Oveja.Oveja;
import com.salesianos.Zombie.Zombie;

public class Main {

    public static void main(String[] args) {

        Zombie zombie = new Zombie();
        zombie.moverse();

        Enderman enderman = new Enderman();
        enderman.moverse();

        Oveja oveja = new Oveja();
        oveja.moverse();


    }
}
