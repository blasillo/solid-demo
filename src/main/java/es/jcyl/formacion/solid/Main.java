package es.jcyl.formacion.solid;

public class Main {
    public static void main(String[] args) {


        // Usar informe PDF
        Informe pdf = new InformePDF();
        GenerarInforme generadorPDF = new GenerarInforme(pdf);
        generadorPDF.informe();

        // Usar informe Excel
        Informe excel = new InformeExcel();
        GenerarInforme generadorExcel = new GenerarInforme(excel);
        generadorExcel.informe();
    }
}