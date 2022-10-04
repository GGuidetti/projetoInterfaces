/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetopresenca;

/**
 *
 * @author Aluno
 */
public class Circulo implements IAreaCalculavel  {
    double raio;
    
    public Circulo (double raio){
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double calculaArea() {
        double area = Math.PI * Math.pow(this.raio, 2);
        return area;
    }
    
}
