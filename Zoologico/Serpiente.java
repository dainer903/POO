public class Serpiente extends Reptil {
    private boolean constrictora; // true si mata por constricción
    private String colorPiel;

    public Serpiente(String nombre, int edad, double peso, double altura, String tipoEscamas,
                     boolean esVenenoso, int frecuenciaMuda, boolean constrictora, String colorPiel) {
        super(nombre, edad, peso, altura, tipoEscamas, esVenenoso, frecuenciaMuda);
        this.constrictora = constrictora;
        this.colorPiel = colorPiel;
    }

    public boolean isConstrictora() {
        return constrictora;
    }

    public void setConstrictora(boolean constrictora) {
        this.constrictora = constrictora;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    // Método específico de Serpiente
    public void enroscarse() {
        System.out.println(getNombre() + " se está enroscando para descansar.");
    }

    public void atacar() {
        if (esVenenoso) {
            System.out.println(getNombre() + " ataca con veneno.");
        } else if (constrictora) {
            System.out.println(getNombre() + " ataca enrollándose a su presa.");
        } else {
            System.out.println(getNombre() + " intenta huir, no es peligrosa.");
        }
    }
}