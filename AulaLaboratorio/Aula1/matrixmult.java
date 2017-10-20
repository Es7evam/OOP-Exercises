/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package matrixmult;
import java.util.Scanner;

/**
 *
 * @author ICMC
 */
public class matrixmult {
    public static void main(String[] args) {
        String nome;
        System.out.println("Digite o tamanho da primeira matriz"); 
        Scanner sc = new Scanner(System.in);
        int l, c;
        l = sc.nextInt();
        c = sc.nextInt();
        int [][] m1 = new int[l][c];
        
        System.out.println("Digite a primeira matriz");
        for(int i=0;i<l;i++){
            for(int j=0;j<c;j++){
                m1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Digite o tamanho da segunda matriz"); 
        int l2, c2;
        l2 = sc.nextInt();
        c2 = sc.nextInt();
        
        int[][] m2 = new int[l2][c2];
        System.out.println("Digite a segunda matriz"); 
        for(int i=0;i<l2;i++){
            for(int j=0;j<c2;j++){
                m2[i][j] = sc.nextInt();
            }
        }
        
        int[][] m3 = new int[l][c2];
        System.out.println("A matriz resultante é");
        for(int i=0;i<l;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c;k++){
                    m3[i][j] += (m1[i][k] * m2[k][j]);
                }
            }
        }
        
        for(int i=0;i<l;i++){
            for(int j=0;j<c2;j++)
                System.out.print(m3[i][j] + " ");
            
            System.out.println();
        
        }
        
        
        
    }
    
}
