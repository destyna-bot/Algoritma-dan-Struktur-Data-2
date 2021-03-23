
package Tugas_1;

public class No_1 {
    public static void main(String[] args){
    // membuat matrix dengan ordo 3x3
    int matrix[][] = new int[3][3];
    matrix[0][0] = 34;
    matrix[0][1] = 56;
    matrix[0][2] = 41;
    matrix[1][0] = 45;
    matrix[1][1] = 36;
    matrix[1][2] = 37;
    matrix[2][0] = 51;
    matrix[2][1] = 32;
    matrix[2][2] = 46;
    
    
    for (int i = 0; i < matrix.length; i++) {            // looping luar;matrix.length=baris;
            for (int j = 0; j<matrix[0].length; j++) {   //looping dalam:matrix[0].length=kolom 
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); //untuk enter
            
            }
        System.out.println();
}
}
