/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetopresenca;

/**
 *
 * @author Aluno
 */
public class ProjetoPresenca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Quadrado quadrado = new Quadrado(4.2);
//        Retangulo retangulo = new Retangulo(4,2);
//        Circulo circulo = new Circulo(5);
//        Quadrado quadrado2 = new Quadrado(90);
//        Retangulo retangulo2 = new Retangulo(50,20);
        IAreaCalculavel[] vetorArea = new IAreaCalculavel[5];
        vetorArea[0] = new Quadrado(4.2);
        vetorArea[1] = new Retangulo(4, 2);
        vetorArea[2] = new Circulo(5);
        vetorArea[3] = new Quadrado(90);
        vetorArea[4] = new Retangulo(50, 20);
       
        for (var i=0; i<vetorArea.length; i++){
           double area = vetorArea[i].calculaArea();
            System.out.println(area);
        }
    }
    
}
