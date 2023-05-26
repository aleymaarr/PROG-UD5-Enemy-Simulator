# PROG-UD5-Enemy-Simulator

# Documentación del la de la aplicación "Enemy Simulator"

### Necesidad

* El objetivo de este proyecto es desarrollar un juego de combate en el que el usuario pueda controlar un personaje y enfrentarse a diferentes enemigos. 

* El juego busca brindar una experiencia interactiva y desafiante, donde el jugador pueda elegir estratégicamente el equipamiento de su personaje y participar en combates emocionantes.

### Principio de Segregación de Interfaces

* El principio de segregación de interfaces establece que "los clientes no deben ser forzados a depender de interfaces que no utilizan". 

* En el contexto de este proyecto, esto significa que las interfaces deben ser diseñadas de manera cohesiva y centradas en los requerimientos específicos de cada componente del juego.

* Al seguir este principio, se logra una mayor modularidad y flexibilidad en el sistema, evitando acoplamientos innecesarios y permitiendo una fácil extensibilidad.

* La práctica implementada en este proyecto cumple con el principio de segregación de interfaces al definir interfaces específicas y coherentes para cada tipo de entidad del juego: Personaje, MobHostil y MobPacifico.

* Cada una de estas interfaces contiene métodos y atributos que son relevantes y necesarios para su respectivo tipo de entidad.

* Además, se ha utilizado herencia y polimorfismo para extender y especializar las interfaces base, como Daño y Combate, en las interfaces más específicas, permitiendo que cada entidad implemente solo los métodos necesarios para su funcionamiento. 

* Por ejemplo, la interfaz Combate se extiende de la interfaz Daño y agrega el método atacar(). 

* Esto evita que las entidades implementen métodos innecesarios y reduce la dependencia de interfaces que no utilizan.

* Esta práctica de segregación de interfaces brinda beneficios significativos en términos de mantenibilidad, reusabilidad y claridad en el diseño del juego. 

* Permite una fácil incorporación de nuevas entidades y acciones específicas, ya que cada componente tiene interfaces específicas y coherentes que definen su comportamiento único. 

* Además, al reducir la dependencia de interfaces innecesarias, se mejora la flexibilidad y facilita futuras modificaciones y ampliaciones del juego.

* En conclusión, la implementación de interfaces cohesivas y especializadas en este proyecto cumple con el principio de segregación de interfaces, brindando un diseño modular y flexible, y permitiendo una fácil extensibilidad del juego. 

* Esto proporciona una base sólida para el desarrollo y la evolución continua del juego de combate.





