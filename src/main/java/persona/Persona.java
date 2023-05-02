/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author victo
 */
public class Persona implements Indice{
    private String nombre;
    private String apellido;
    private String DNI;
    private double altura;
    private double peso;

    public Persona(String nombre, String apellido, String DNI, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    

    @Override
    public double IndiceBroca(double peso, double altura) {
        double ib1 = (altura -100) + (altura - 100)*0.1;
        double ib2 = (altura -100) - (altura - 100)*0.1;
        if (peso<ib2) {
            System.out.println("Tiene menos peso del que debería segun el indice de broca");
        }
        if (peso>ib2 && peso<ib1){
            System.out.println("Tiene el peso adecuado segun el indice de broca");
        }
        if (peso>ib1) {
            System.out.println("Tiene mas peso del que deberia segun el indice de broca");
        }
        return ib1;
    }

    @Override
    public double imc(double peso, double altura) {
        double imc;
        imc=peso/(altura*altura);
        
        if (imc<18.5){
            System.out.println("Su imc es "+imc+", asi que se considera de bajo peso");
        }else if (imc>18.5 && imc<24.9) {
            System.out.println("Su imc es "+imc+", asi que se considera normal");
        }else if (25.0>imc && imc<30.0) {
            System.out.println("Su imc es "+imc+", asi que se considera como sobrepeso");
        }else if (30.0>imc) {
            System.out.println("Su imc es "+imc+", asi que se considera como obesidad");
        }
        return imc;
    }
}

   