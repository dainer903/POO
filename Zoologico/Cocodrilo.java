public class Cocodrilo extends Reptil {
    // Atributos propios de Cocodrilo
    private double longitudBoca; // en metros
    private boolean viveEnAguaDulce;

    // Constructor
    public Cocodrilo(String nombre, int edad, double peso, double altura, String tipoEscamas,
                     boolean esVenenoso, int frecuenciaMuda, double longitudBoca, boolean viveEnAguaDulce) {
        super(nombre, edad, peso, altura, tipoEscamas, esVenenoso, frecuenciaMuda);
        this.longitudBoca = longitudBoca;
        this.viveEnAguaDulce = viveEnAguaDulce;
    }

    // Getters y Setters
    public double getLongitudBoca() {
        return longitudBoca;
    }

    public void setLongitudBoca(double longitudBoca) {
        this.longitudBoca = longitudBoca;
    }

    public boolean isViveEnAguaDulce() {
        return viveEnAguaDulce;
    }

    public void setViveEnAguaDulce(boolean viveEnAguaDulce) {
        this.viveEnAguaDulce = viveEnAguaDulce;
    }

    // Métodos específicos del Cocodrilo
    public void atacar() {
        System.out.println(getNombre() + " ataca con una poderosa mordida de " + longitudBoca + " metros.");
    }

    public void nadar() {
        System.out.println(getNombre() + " está nadando sigilosamente en el agua " + (viveEnAguaDulce ? "dulce." : "salada."));
    }

    public void hacerSonido() {
        System.out.println(getNombre() + " emite un rugido grave y profundo.");
    }
}

