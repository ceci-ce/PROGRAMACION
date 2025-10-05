package ClaseInterfaces;

public interface Enviable {

/*las interfaces no necesitan un constructor
Una interfaz es como un contrato que dice: “Si una clase implementa esta interfaz, debe tener ciertos métodos.”
No tiene implementación concreta (es decir, no define el comportamiento), solo qué métodos deben existir
Una interfaz solo dice “estas clases deben saber hacer esto”.

Una clase abstracta puede tener código dentro (atributos, métodos implementados o no).
Una interfaz solo define qué se debe hacer, no cómo.
las interfaces en Java no tienen atributos de instancia. Pero sí pueden tener constantes, que son variables estáticas (static) y finales (final).
Porque una interfaz no representa un objeto concreto, sino un comportamiento o contrato que otras clases implementan.
Por eso, las clases que implementan la interfaz (por ejemplo, Email o SMS) son las que deben tener sus propios atributos (direccion, numero, etc.).
*/


    void enviar(String mensaje); //Este metodo no tiene cuerpo → es abstracto por defecto/Todas las clases que implementen esta interfaz deben definir este metodo

    default void confirmar() { //confirmar() tiene ya un comportamiento por defecto que todas las clases heredan automáticamente. Es decir, heredan confirmar() sin tener que escribirlo
        System.out.println("Mensaje enviado correctamente");
    }
}
