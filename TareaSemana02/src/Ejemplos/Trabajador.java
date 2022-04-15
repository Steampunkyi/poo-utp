package Ejemplos;

import java.text.DecimalFormat;

public class Trabajador {
    
// Atributos
    String codigo;
    private String nombres;
    private String contrato;
    private String categoria;
    private String afiliacion;
    private int hijo;
    private int unidades;
    private static int contador = 0;

    // Constructor
    Trabajador() {
        contador++;     // Cada vez que se crea un objeto inicia el conteo
        DecimalFormat df = new DecimalFormat("DOC0000");    // Especificamos el formato para un numero
        this.codigo = df.format(contador);
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(String afiliacion) {
        this.afiliacion = afiliacion;
    }

    public int getHijo() {
        return hijo;
    }

    public void setHijo(int hijo) {
        this.hijo = hijo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    
    // Calculo de la Contratacion (Sueldo Bruto)
    double Contratacion() {
        if (categoria.equals("CATEGORIA A") && contrato.equals("CONTRATADO")) {
            return 2320;
        }
        if (categoria.equals("CATEGORIA A") && contrato.equals("ESTABLE")) {
            return 4450;
        }
        if (categoria.equals("CATEGORIA B") && contrato.equals("CONTRATADO")) {
            return 3300;
        }
        if (categoria.equals("CATEGORIA B") && contrato.equals("ESTABLE")) {
            return 3920;
        }
        return 0;
    }
        
    // Calculo del descuento por seguro
    double Descuento() {
        switch(afiliacion) {
            case "AFP":
                return 0.12 * Contratacion();
            default:
                return 0.08 * Contratacion();
        }
    }
    
    // Calculo de pago parcial
    double PagoParcial() {
        return Contratacion() - Descuento();
    }
        
    // Calculo de la Bonificacion
    double Bonificacion() {
        if (unidades <= 180 ) {
            return 0.04 * PagoParcial();
        }
        if (unidades > 180) {
            return 0.08 * PagoParcial(); 
        }
        return 0;
    }
    
    // Calculo de sueldo final
    double SueldoFinal() {
        return PagoParcial() + Bonificacion();
    }
    
    String MostrarDatos() {
        return "\n ********* Trabajador " + contador + " ******"
                + "\nCodigo               : " + codigo
                + "\nNombres              : " + nombres
                + "\nHijos                : " + hijo
                + "\nCategoria            : " + categoria
                + "\nTipo de Contrato     : " + contrato
                + "\nAfiliacion           : " + afiliacion
                + "\nUnidades             : " + unidades
                + "\nSueldo Bruto         : " + Contratacion()
                + "\nPago Parcial         : " + PagoParcial()
                + "\nBonificacion         : " + Bonificacion()
                + "\nDescuento de seguro  : " + Descuento()
                + "\nSueldo Final         : " + SueldoFinal();
    }
} // Fin de la clase
