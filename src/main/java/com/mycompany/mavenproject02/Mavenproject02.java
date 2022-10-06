/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject02;

/**
 *
 * @author USUARIO
 */
public class Mavenproject02 {

    public static void main(String[] args) {
        System.out.println("Hola Mundo!");
        
        var celular1 = new Celular();
        var celular2 = new Celular();
        var celular3 = new Celular();
        var celular4 = new Celular();
        
        celular1.color="negro";
        celular1.marca="Samsung";
        celular1.modelo="Galaxy s8";
        celular1.peso=155;
        System.out.println("El siguiente celular es un " + celular1.marca 
                +" de color "+ celular1.color + " modelo "
                + celular1.modelo + " y pesa "+ celular1.peso + "g");
        celular2.color="blanco";
        celular2.marca="Xiaomi";
        celular2.modelo="redmi note 9";
        celular2.peso=199;
         System.out.println("El siguiente celular es un " + celular2.marca 
                +" de color "+ celular2.color + " modelo "
                + celular2.modelo + " y pesa "+ celular2.peso + "g");
        celular3.color="blanco";
        celular3.marca="iphone";
        celular3.modelo="Xs";
        celular3.peso=177;
         System.out.println("El siguiente celular es un " + celular3.marca 
                +" de color "+ celular3.color + " modelo "
                + celular3.modelo + " y pesa "+ celular3.peso + "g");
        celular4.color="morado";
        celular4.marca="Huawei";
        celular4.modelo="p20 pro";
        celular4.peso=180;
         System.out.println("El siguiente celular es un " + celular4.marca 
                +" de color "+ celular4.color + " modelo "
                + celular4.modelo + " y pesa "+ celular4.peso + "g");
        
        var gato1 = new Gato();
        var gato2 = new Gato();
        var gato3 = new Gato();
        var gato4 = new Gato();
        
        gato1.nombre="Carlos";
        gato1.edad=2;
        gato1.raza="Abisinio";
        gato1.peso=3;   
         System.out.println("Mi gato se llama " + gato1.nombre 
                +" es de raza "+ gato1.raza + " y tiene una edad de "
                + gato1.edad + " años "+ "pesando " + gato1.peso + "kg");
        
        gato2.nombre="Pelusa";
        gato2.edad=3;
        gato2.raza="persa";
        gato2.peso=4; 
        System.out.println("Mi gato se llama " + gato2.nombre 
                +" es de raza "+ gato2.raza + " y tiene una edad de "
                + gato2.edad + " años "+ "pesando " + gato2.peso + "kg");
        
        gato3.nombre="Copo de nieve";
        gato3.edad=3;
        gato3.raza="kohana";
        gato3.peso=5;
        System.out.println("Mi gato se llama " + gato3.nombre 
                +" es de raza "+ gato3.raza + " y tiene una edad de "
                + gato3.edad + " años "+ "pesando " + gato3.peso + "kg");
        
        gato4.nombre="Francisco";
        gato4.edad=5;
        gato4.raza="bambino";
        gato4.peso=4;
        System.out.println("Mi gato se llama " + gato4.nombre 
                +" es de raza "+ gato4.raza + " y tiene una edad de "
                + gato4.edad + " años "+ "pesando " + gato4.peso + "kg");
        
        var mochila1 = new Mochila();
        var mochila2 = new Mochila();
        var mochila3 = new Mochila();
        var mochila4 = new Mochila();
        
        mochila1.marca="Wilson";
        mochila1.color="azul";
        mochila1.modelo="Líneas Azules";
        mochila1.capacidad=25;
        System.out.println("La mochila que uso es " + mochila1.marca 
                +" de color "+ mochila1.color + " modelo "
                + mochila1.modelo + " y tiene la capacidad de llevar "
                + mochila1.capacidad + "kg");
        
        mochila2.marca="Mozioni";
        mochila2.modelo="Kawai Cat";
        mochila2.color="negro";
        mochila2.capacidad=20;
        System.out.println("La mochila que uso es " + mochila2.marca 
                +" de color "+ mochila2.color + " modelo "
                + mochila2.modelo + " y tiene la capacidad de llevar "
                + mochila2.capacidad + "kg");
        
        mochila3.marca="Totto";
        mochila3.modelo="Tropical Fruit";
        mochila3.color="Estampado naranja";
        mochila3.capacidad=23;
        System.out.println("La mochila que uso es " + mochila3.marca 
                +" de color "+ mochila3.color + " modelo "
                + mochila3.modelo + " y tiene la capacidad de llevar "
                + mochila3.capacidad + "kg");
        
        mochila4.marca="Vasari";
        mochila4.modelo="Mirage Gray";
        mochila4.color="negro";
        mochila4.capacidad=25;
        System.out.println("La mochila que uso es " + mochila4.marca 
                +" de color "+ mochila4.color + " modelo "
                + mochila4.modelo + " y tiene la capacidad de llevar "
                + mochila4.capacidad + "kg");
        
        var moto1 = new Moto();
        var moto2 = new Moto();
        var moto3 = new Moto();
        var moto4 = new Moto();
        
        moto1.marca="Aprilia";
        moto1.modelo="RS 125";
        moto1.color="rojo";
        moto1.motor="monocilíndrico de 124,2 cc";
        
        System.out.println("La moto que deseo es " + moto1.marca 
                +" de color "+ moto1.color + " modelo "
                + moto1.modelo + " que tiene un motor "
                + moto1.motor);
        
        moto2.marca="Benelli";
        moto2.modelo="502c";
        moto2.color="negro";
        moto2.motor="bicilíndrico paralelo de 500 cc";
        
        System.out.println("La moto que deseo es " + moto2.marca 
                +" de color "+ moto2.color + " modelo "
                + moto2.modelo + " que tiene un motor "
                + moto2.motor);
        
        moto3.marca="Bimota";
        moto3.modelo="Tesi H2 R";
        moto3.color="rojo";
        moto3.motor="Kawasaki";
        
        System.out.println("La moto que deseo es " + moto3.marca 
                +" de color "+ moto3.color + " modelo "
                + moto3.modelo + " que tiene un motor "
                + moto3.motor);
        
        moto4.marca="BMW";
        moto4.modelo="C600 Sport";
        moto4.color="Azul";
        moto4.motor="bicilíndrico de 647 cc";
        
        System.out.println("La moto que deseo es " + moto4.marca 
                +" de color "+ moto4.color + " modelo "
                + moto4.modelo + " que tiene un motor "
                + moto4.motor);
        
        var perro1 = new Perro();
        var perro2 = new Perro();
        var perro3 = new Perro();
        var perro4 = new Perro();
        
        perro1.nombre="Juan";
        perro1.raza="Bichón maltés";
        perro1.color="naranja";
        perro1.peso=7;
        
        System.out.println("Mi perro se llama " + perro1.nombre 
                +" es de raza "+ perro1.raza + " es de color " + perro1.color
                + " pensado " + perro1.peso + "kg");
        
        perro2.nombre="Max";
        perro2.raza="Manchester terrier";
        perro2.color="blanco";
        perro2.peso=15;
        
        System.out.println("Mi perro se llama " + perro2.nombre 
                +" es de raza "+ perro2.raza + " es de color " + perro2.color
                + " pensado " + perro2.peso + "kg");
        
        perro3.nombre="Coky";
        perro3.raza="Terrier tibetano";
        perro3.color="blanco y negro";
        perro3.peso=9;
        
        System.out.println("Mi perro se llama " + perro3.nombre 
                +" es de raza "+ perro3.raza + " es de color " + perro3.color
                + " pensado " + perro3.peso + "kg");
        
        perro4.nombre="Luna";
        perro4.raza="Lancashire heeler";
        perro4.color="negro y dorado";
        perro4.peso=9;
        
        System.out.println("Mi perro se llama " + perro4.nombre 
                +" es de raza "+ perro4.raza + " es de color " + perro4.color
                + " pensado " + perro4.peso + "kg");
        
        var tablet1 = new Tablet();
        var tablet2 = new Tablet();
        var tablet3 = new Tablet();
        var tablet4 = new Tablet();
        
        tablet1.marca="Samsung";
        tablet1.modelo="Tab S6 10.5";
        tablet1.color="negro";
        tablet1.peso=420;
        
        System.out.println("La tablet que uso es " + tablet1.marca 
                +" de color "+ tablet1.color + " modelo "
                + tablet1.modelo + " y pesa "+ tablet1.peso + "g");
        
        tablet2.marca="Lg";
        tablet2.modelo="G Pad 5";
        tablet2.color="blanco";
        tablet2.peso=498;
        
        System.out.println("La tablet que uso es " + tablet2.marca 
                +" de color "+ tablet2.color + " modelo "
                + tablet2.modelo + " y pesa "+ tablet2.peso + "g");
        
        tablet3.marca="Xiaomi";
        tablet3.modelo="Mi Pad 5";
        tablet3.color="negro mate";
        tablet3.peso=511;
        
        System.out.println("La tablet que uso es " + tablet3.marca 
                +" de color "+ tablet3.color + " modelo "
                + tablet3.modelo + " y pesa "+ tablet3.peso + "g");
        
        tablet4.marca="ipad";
        tablet4.modelo="pro 11";
        tablet4.color="gris";
        tablet4.peso=468;
        
        System.out.println("La tablet que uso es " + tablet4.marca 
                +" de color "+ tablet4.color + " modelo "
                + tablet4.modelo + " y pesa "+ tablet4.peso + "g");        
        
        
        
        
                
                
                
                
        
        
        
        
                
        
        
                
        
                
        
        
        
              
      
        
    
   }
}
