package es.jcyl.formacion.solid;

public class GenerarInforme {

    private final Informe informe;

    // Inyección de dependencia a través del constructor
    public GenerarInforme(Informe informe) {
        this.informe = informe;
    }

    public void informe() {
        System.out.println("Generando informe");
        informe.generar();
    }
}
