package ejemplosesion01;

public class Jefe {
    //atributos
    String nombres;
    String sexo;
    String dni;
    String cargo;
    String area;
    int aniosant; //años de antiguedad
    
    //constructor
    Jefe(String n, String s, String d, String c, String a, int aa){
        //actualizando los atributos de la clase con los parametros del constructor
        this.nombres = n;
        this.sexo = s;
        this.dni = d;
        this.cargo = c;
        this.area = a;
        this.aniosant = aa;
    }
    //metodos propios
    //** funcion que calcula y retorna el sueldo base en relacion a su cargo y area
    double CalcularSueldoBase(){
        if(cargo.equals("GERENTE") && area.equals("CONTABILIDAD")) return 6000;
        if(cargo.equals("GERENTE") && area.equals("PLANIFICACION")) return 7000;
        if(cargo.equals("SUBGERENTE") && area.equals("CONTABILIDAD")) return 5000;
        if(cargo.equals("SUBGERENTE") && area.equals("PLANIFICACION")) return 6000;
        return 0;
    }
    //** funcion que calcula y retorna el monto de movilidad en vase a su cargo
    double CalcularMovilidad(){
        switch(cargo){
            case "GERENTE": return 700;
            case "SUBGERENTE": return 400;
            default: return 0;
        }
    }
    //** funcion que calcula y retorna el monto de bonificacion en base a los años de antiguedad
    double CalcularBonificacion(){
        if(aniosant<=7) return 0.05*CalcularSueldoBase();
        else return 0.04*this.CalcularSueldoBase();
    }
}//fin de la clase
