public class Zoologico {
    public static void main(String[] args) {
        // Crear Perro y Gato
        Perro perro1 = new Perro("Matias", 4, 20.5, 0.9, 60, "Husky");
        Gato gato1 = new Gato("Bigotes", 4, 5.0, 0.3, 65, 9);

        // Usar métodos de Perro
        perro1.comer();
        perro1.hacerSonido();
        perro1.amamantar();
        perro1.jugar();
        System.out.println("Raza del perro: " + perro1.getRaza());

        // Usar métodos de Gato
        gato1.comer();
        gato1.hacerSonido();
        gato1.amamantar();
        gato1.ronronear();
        System.out.println("Habilidad de caza del gato: " + gato1.getHabilidadCaza());

        //crear Cocodrilo
        Cocodrilo cocodrilo1 = new Cocodrilo("Rocky", 15, 450, 1.2, "rugosas", false, 60, 1.5, true);

        //usar métodos del cocodrilo
        cocodrilo1.comer();
        cocodrilo1.hacerSonido();
        cocodrilo1.nadar();
        cocodrilo1.atacar();

    
    
    
        
        

        //crear Serpiente
        Serpiente serpiente1 = new Serpiente("Vibora", 2, 0.3, 0.15, "liso", false, 30, true, "verde");

        //usar métodos de serpiente
        serpiente1.comer();
        serpiente1.hacerSonido();
        serpiente1.enroscarse();
        serpiente1.atacar();


    }
}
