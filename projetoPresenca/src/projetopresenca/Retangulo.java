/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetopresenca;

/**
 *
 * @author Aluno
 */
public class Retangulo implements IAreaCalculavel {

    double base;
    double altura; 
    
    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    };
    
    public double getBase() { return base; }

    public void setBase(double lado) { this.base = base; }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double calculaArea() {
       double area = this.base*this.altura;
       return area;
    }
    
}
