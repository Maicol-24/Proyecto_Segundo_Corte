public class Zoologico {
    public static void main(String[] args) {
        // Se usa el constructor completo porque se conocen todos los datos del animal.
        Animal animal1 = new Animal("Rex", 6, 28.5, true);

        // Se usa el constructor de nombre y edad porque el peso se estima inicialmente.
        Animal animal2 = new Animal("Luna", 3);

        // Se usa el constructor completo de Perro para registrar todos sus datos.
        Perro perro1 = new Perro("Max", 4, 18.0, true, "Labrador", 8, true, 'G');

        // Se usa el constructor de Perro con nombre, edad, raza y tamano conocidos.
        Perro perro2 = new Perro("Nala", 2, "Beagle", 'M');

        // Se usa el constructor de Perro con peso porque es el dato disponible en la adopcion.
        Perro perro3 = new Perro("Toby", 11.5, "Criollo", false);

        // Se usa el constructor completo de Gato para conservar el registro detallado.
        Gato gato1 = new Gato("Michi", 5, 4.2, true, "Atigrado", 7, 9.5, true);

        // Se usa el constructor de Gato con edad porque aun no se mide el peso exacto.
        Gato gato2 = new Gato("Simba", 1, "Naranja", true);

        // Se usa el constructor de Ave con peso y envergadura medidos en el rescate.
        Ave ave1 = new Ave("Aguila", 4.8, "Planeador", 210);

        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(perro1);
        System.out.println(perro2);
        System.out.println(perro3);
        System.out.println(gato1);
        System.out.println(gato2);
        System.out.println(ave1);
    }
}