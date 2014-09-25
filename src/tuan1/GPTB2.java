package tuan1;

import java.util.Scanner;

public class GPTB2 {
	private double a;
	private double b;
	private double c;
	private double x1;
	private double x2;
	private static int  flag;
	public GPTB2(double a,double b,double c) {
        this.a=a;
        this.b=b;
        this.c=c;
        double delta;
        Scanner scan = new Scanner(System.in);
        String menu = "";
        
            
            delta = (b * b) - (4 * a * c);

            
                if (delta > 0) {
                	flag=1;
                    System.out.println("Pt co 2 nghiem phan biet.");
                    x1 = (Math.round((((-b) - Math.sqrt(delta)) / (2 * a))*1000))/1000.0;
                    x2 = (Math.round((((-b) + Math.sqrt(delta)) / (2 * a))*1000))/1000.0;
                    System.out.println("x1 = " + x1);
                    System.out.println("x2 = " + x2);
                } else if(delta==0) {
                	flag=0;
                    System.out.println("pt co 2 nghiem kep.");
                    x1 = x1 = (-b) / (2 * a);
                    System.out.println("x1 = x2 = " + x1);
                }
            else {
            	flag=-1;
                System.out.println("pt da cho vo nghiem.");
            }

           }
       
	public double getX1(){
		return x1;
	}
	public double getX2(){
		return x2;
	}
	
	public int getFlag(){
		return flag;
	}
}
