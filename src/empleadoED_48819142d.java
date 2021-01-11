
import java.util.*;
/**
 * Ejercicio práctico examen EVAL 1 ED
 * 
 * @author MARIAN BAENA DNI 48819142D
 * @version 1.0
 */
public class EmpleadoED_48819142D {

    static final double FACTOR_HORA_EXTRA = 1.2;
    private String nombreCompleto, dni;
    private double salarioBasePorHora = 10.56;
    /**
     * Constructor con tres parámetros
     * 
     * @param nombreCompleto nombre completo en mayúsculas
     * @param dni documento nacional de indentidad con letra y sin espacios 
    */
    public EmpleadoED_48819142D(String nombreCompleto, String dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
    }
    /**
     * Calcula el salario bruto mensual en función del salrio base por hora y las horas extras
     * El precio por hora d ela hora extra se detrmina con la constante FACTOR_HORA_EXTRA
     * 
     * @param horasExtra
     * @return 
     */
    public double getSalarioEsteMes(int horasExtra) {
        double cantidadExtra, salarioFinal;
        cantidadExtra = horasExtra * this.salarioBasePorHora * FACTOR_HORA_EXTRA;
        salarioFinal = this.salarioBasePorHora * 40 * 4 + cantidadExtra;
        salarioFinal = (double) Math.round(salarioFinal * 100d) / 100d;
        return salarioFinal;
    }

    // Este método no lo comentaremos con JavaDoc
    public static void main(String[] args) {
        // !!!! MODIFICA TU NOMBRE Y TU DNI EN LA SIGUIENTE LÍNEA        
        EmpleadoED_48819142D emp = new EmpleadoED_48819142D("MARIAN BAENA", "48819142D");
        int horasExtra = 2;
        System.out.println("El salario de " + emp.nombreCompleto + " este mes será de " + emp.getSalarioEsteMes(horasExtra)
                + " euros, al hacer " + horasExtra + " horas extra.");
    }
}
 