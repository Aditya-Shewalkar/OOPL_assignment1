package com.company;


class Complex{
    double real,img;
    Complex(){

    };
    Complex(int real,int img){
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
        Complex complex1=new Complex(5,3);
        Complex complex2=new Complex(2,2);
        Complex add=complex1.Complex_add(complex2);
        System.out.println("Addition: "+"Real= "+add.real+" Imaginary= "+add.img);
        Complex sub=complex1.Complex_sub(complex2);
        System.out.println("Subtraction: "+"Real= "+sub.real+" Imaginary= "+sub.img);
        Complex multiply=complex1.Complex_multiply(complex2);
        System.out.println("Multiplication: "+"Real= "+multiply.real+" Imaginary= "+multiply.img);
        Complex divide=complex1.Complex_div(complex2);
        System.out.println("Division: "+"Real= "+divide.real+" Imaginary= "+divide.img);
    }
}
