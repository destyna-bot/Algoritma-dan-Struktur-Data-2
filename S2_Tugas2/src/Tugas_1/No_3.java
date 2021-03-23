
package Tugas_1;

public class No_3 {
    public static void main(String[] args){
        //membuat matrix A dengan ordo 2x3
        int [][] A = {
            {9, 7, 5},
            {6, 9, 6},
            
        }; 
        //membuat matrix B dengan ordo 3x2
        int [][] B = {
            {6, 2},
            {3, 5},
            {8, 7},
        };
        
        if(A[0].length == B.length){ //untuk perkalian gunakan panjang kolom A = panjang baris B
            int[][] C = new int[A.length][B[0].length]; //dibuat array C dengan ukuran baris sama dengan baris A dan ukuran kolom sama dengan kolom B
            for(int i=0; i<A.length; i++) { // Baris A = 2; i<2;0<2=>T lanjut looping dalam
                for(int j=0; j<B[0].length; j++){ //Kolom B = 2; j<2 => T lanjut looping dalam lagi
                    for(int k=0; k<A[0].length; k++){ //Kolom A=3;k<3=>T lanjut ke proses C, k++=1; 1<3 T; lanjut proses c; k=2;k<3 T; sampai k+3<3 F, kembali ke perulangan luar
                        C[i][j] += A[i][k] * B[k][j]; //C[0][0] += A[0][0] * B[0][0]; K=1,C[0][0] += A[0][1] * B[1][0];K=2,C[0][0] += A[0][2] * B[2][0];
                        
                    }
                }
            }
            for(int[] c : C) {
                    for(int q : c) {
                        System.out.print(q+" " );                       
                    }
                    System.out.println();
            }
            System.out.println(C [1][1]);
        
        
            System.out.println( "Desty Nurul Anitsa");
        }
    }
}
