package SextaclaseProgramador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aaron
 */
public class Compugrama {
    public void inyeccion1(int n) {

        for (int j = 1; j <= n; j++) {

            for (int i = 1; i <= n; i++) {
                if (j==1 || j==2){
                    System.out.print("0\t");
                } else {
                    
                    if(i==1 || i==n)
                    System.out.print(" \t");
                    else
                        if((j-1)==i)
                            System.out.print("0\t");
                        else
                            System.out.print(" \t");
                }
                
            }
            System.out.println();

        }
    }

    public void rectangulolleno(int n) {

        for (int j = 0; j < n; j++) {

            for (int i = 0; i < n; i++) {
                System.out.print("i\t");

            }
            System.out.println();

        }
    }
    public void rectangulo(int n) {

        for (int j = 1; j <= n; j++) {

            for (int i = 1; i <= n; i++) {
                if (j==1 || j==n){
                    System.out.print("o\t");
                } else {
                    
                    if(i==1 || i==n)
                    System.out.print("o\t");
                    else
                    System.out.print(" \t");
                }
                
            }
            System.out.println();

        }
    }
    public void rectangulobackslash(int n) {

        for (int j = 1; j <= n; j++) {

            for (int i = 1; i <= n; i++) {
                if (j==1 || j==n){
                    System.out.print("G\t");
                } else {
                    
                    if(i==1 || i==n)
                    System.out.print("G\t");
                    else
                        if(i==j)
                            System.out.print("G\t");
                        else
                            System.out.print(" \t");
                }
                
            }
            System.out.println();

        }
    }
    public void rectanguloslash(int n) {

        for (int j = 1; j <= n; j++) {

            for (int i = 1; i <= n; i++) {
                if (j==1 || j==n){
                    System.out.print("7\t");
                } else {
                    
                    if(i==1 || i==n)
                    System.out.print("7\t");
                    else
                        if(i==(n-j))
                            System.out.print("7\t");
                        else
                            System.out.print(" \t");
                }
                
            }
            System.out.println();

        }
    }
public void rectanguloX(int n) {

        for (int j = 1; j <= n; j++) {

            for (int i = 1; i <= n; i++) {
                if (j==1 || j==n){
                    System.out.print("7w7\t");
                } else {
                    
                    if(i==1 || i==n)
                    System.out.print("7w7\t");
                    else
                        if(j==i || i==(n-j))
                            System.out.print("7w7\t");
                        else
                            System.out.print(" \t");
                }
                
            }
            System.out.println();

        }
    }
public void rectanguloBandera(int n) {

        for (int j = 1; j <= n; j++) {

            for (int i = 1; i <= n; i++) {
                if (j==1 || j==n){
                    System.out.print("O-O\t");
                } else {
                    
                    if(i==1 || i==n)
                    System.out.print("T.T\t");
                    else
                        if(n-6==i || n-6==j || (j==i || i==(n-j)) )
                            System.out.print("XP\t");
                        else
                            System.out.print(" \t");
                }
                
            }
            System.out.println();

        }
    }
public void rectanguloCRUZ(int n) {

        for (int j = 1; j <= n; j++) {

            for (int i = 1; i <= n; i++) {
                if (j==1 || j==n){
                    System.out.print("A\t");
                } else {
                    
                    if(i==1 || i==n)
                    System.out.print("A\t");
                    else
                        if(n-6==i || n-6==j )
                            System.out.print("A\t");
                        else
                            System.out.print(" \t");
                }
                
            }
            System.out.println();

        }
    }
public void rectanguloraro(int n) {

        for (int j = 1; j <= n; j++) {

            for (int i = 1; i <= n; i++) {
                if (j==1 || j==n){
                    System.out.print("Bv\t");
                } else {
                    
                    if(i==1 || i==n)
                    System.out.print("Bv\t");
                    else
                        if( n-2==i)
                            System.out.print("v\t");
                                
                        else
                                if(j==i){
                                System.out.print("B\t");
                                }
                                else
                                    if( n-7==j ){
                                    System.out.print("'.'\t");
                                    }
                                    else
                                    System.out.print(" \t");
                }
                
            }
            System.out.println();

        }
    }
public void rectanguloA(int n) {

        for (int j = 1; j <= n; j++) {

            for (int i = 1; i <= n; i++) {
                if (j==1 || j==n){
                    System.out.print("A\t");
                } else {
                    
                    if(i==1 || i==n)
                    System.out.print("A\t");
                    else
                        if(n-6==i||j==i )
                            System.out.print("A\t");
                        else
                            System.out.print(" \t");
                }
                
            }
            System.out.println();

        }
    }

    public void inyeccion(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
