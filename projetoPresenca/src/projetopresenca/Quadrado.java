/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetopresenca;

/**
 *
 * @author Aluno
 */
public class Quadrado implements IAreaCalculavel {
    double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }
    
    public double getLado() { return lado; }

    public void setLado(double lado) { this.lado = lado; }
        
    @Override
    public double calculaArea() {
        double area =  this.lado*this.lado; 
        return area;
    }
}
