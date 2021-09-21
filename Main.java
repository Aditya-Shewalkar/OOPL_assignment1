package com.company;

import java.util.Scanner;

class Complex{
    double real,img;
    Complex(){

    };
    Complex(double real,double img){
        this.real=real;
        this.img=img;
    }
    public Complex Complex_add(Complex c){
        Complex temp=new Complex();
        temp.real=this.real+c.real;
        temp.img=this.img+c.img;
        return temp;
    }
    public Complex Complex_sub(Complex c){
        Complex temp=new Complex();
        temp.real=this.real-c.real;
        temp.img=this.img-c.img;
        return temp;
    }
    public Complex Complex_multiply(Complex c){
        Complex temp=new Complex();
        temp.real=(this.real*c.real)+(-1*this.img*c.img);
        temp.img=(this.real*c.img)+(c.real*this.img);
        return temp;
    }
    public Complex Complex_div(Complex c){
        Complex temp=new Complex();
        temp.real=((this.real*c.real)+(this.img*c.img))/(Math.pow(c.real,2)+Math.pow(c.img,2));
        temp.img=((this.img*c.real)-(this.real*c.img))/(Math.pow(c.real,2)+Math.pow(c.img,2));
        return temp;
    }
};


public class Main {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter real part of first number");
        double r1 = s1.nextDouble();
        System.out.println("enter imaginary part of first number");
        double i1 = s1.nextDouble();
        System.out.println("enter real part of first number");
        double r2 = s1.nextDouble();
        System.out.println("enter imaginary part of second number");
        double i2 = s1.nextDouble();
        Complex complex1 = new Complex(r1, i1);
        Complex complex2 = new Complex(r2, i2);
        while (true) {
            System.out.println("1.Addition" + "\n" + "2.Subtraction" + "\n" + "3.Multiplication" + "\n" + "4.Division" + "\n");
            int n;
            n=s1.nextInt();
            switch (n) {
                case 1:
                    Complex add = complex1.Complex_add(complex2);
                    System.out.println("Addition: " + "Real= " + add.real + " Imaginary= " + add.img);
                    break;
                case 2:
                    Complex sub = complex1.Complex_sub(complex2);
                    System.out.println("Subtraction: " + "Real= " + sub.real + " Imaginary= " + sub.img);
                    break;
                case 3:
                    Complex multiply = complex1.Complex_multiply(complex2);
                    System.out.println("Multiplication: " + "Real= " + multiply.real + " Imaginary= " + multiply.img);
                    break;
                case 4:
                    Complex divide = complex1.Complex_div(complex2);
                    System.out.println("Division: " + "Real= " + divide.real + " Imaginary= " + divide.img);
                    break;
                default:
                    break;
            }
        }
    }
}
