package com.salesianos.Oveja;

import com.salesianos.MobPacifico.MobPacifico;

public class Oveja extends MobPacifico {
    public Oveja() {
        super(5);
    }

    @Override
    public void moverse() {
        System.out.println("La Oveja se mueve por el campo.");
    }
}
