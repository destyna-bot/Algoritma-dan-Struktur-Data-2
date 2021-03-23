
package Tugas_1;

public class No_2 {
    public static void main(String[] args){
        //membuat matrix A dengan ordo 3x2
        int [][] A = {
            {9, 7},
            {6, 9},
            {11, 8},
        }; 
        //membuat matrix B
        int [][] B = {
            {6, 2},
            {3, 5},
            {8, 7},
        };
        
        if((A.length == B.length) && (A[0].length == B[0].length)) { //panjang baris A=3, panjang baris B=3,panjang kolom A=2, panjang kolom B=2
            int[][] C = new int[A.length][A[0].length]; //membuat matrix C dengan baris=3 dan kolom=2 
            for(int i=0; i<A.length; i++) { //i=0; 0<3 => T; lanjut looping dalam; i++=1;1<3 => lanjut looping dalam smpai batas i++= 3<3 maka looping luar berhenti.
                for(int j=0; j<A[0].length; j++){ //j=0; 0<2 => T; lanjut keperhitungan C, C disini adalah = Pengurangan matrix; j++= 1;1<2=>T; masuk ke C
                    C[i][j] = A[i][j] - B[i][j];  // C[0][0] = A[0][0]-B[0][0];lanjut ke looping dalam => j++;C[0][1] = A[0][1]-B[0][1];dst sampai batas j= 2<2 maka loop dalam berhenti, lanjut ke looping luar
                }
            }
                for(int[] c : C) {
                    for(int q : c) {
                        System.out.print(q+" " );                       
                    }
                    System.out.println();
                }
                  System.out.println(C [1][1]);
            }
        else{
            System.out.println( "Ukuran matrix tidak sama");
        } 
        }
}
      
        
        
        
    

