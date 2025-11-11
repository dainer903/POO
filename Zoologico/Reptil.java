public class Reptil extends Animal {
    protected String tipoEscamas;
    protected boolean esVenenoso;
    protected int frecuenciaMuda; // en días

    public Reptil(String nombre, int edad, double peso, double altura, String tipoEscamas, boolean esVenenoso, int frecuenciaMuda) {
        super(nombre, edad, peso, altura);
        this.tipoEscamas = tipoEscamas;
        this.esVenenoso = esVenenoso;
        this.frecuenciaMuda = frecuenciaMuda;
    }

    public String getTipoEscamas() {
        return tipoEscamas;
    }

    public boolean isEsVenenoso() {
        return esVenenoso;
    }

    public int getFrecuenciaMuda() {
        return frecuenciaMuda;
    }

    public void mudarPiel() {
        System.out.println( getNombre() + " muda su piel cada " + frecuenciaMuda + " días.");
    
    }

}