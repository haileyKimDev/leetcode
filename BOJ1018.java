import java.util.Scanner;

public class BOJ1018 {
    public static  int getSolution(int startRow, int startCol, String[] board){
        String[] orgBoard = {"WBWBWBWB","BWBWBWBW"}; //original board
        int whiteSol = 0; //answer
        for(int i = 0 ; i< 8;i++){ //to make a row while loof
            int row = startRow + i; // i add to startRow til 8
            for(int j =0 ; j<8;j++){ // to make a column while loof
                int col = startCol + j; // j add to startCol til 8
                if(board[row].charAt(col) != orgBoard[row%2].charAt(j)) //original broad has only 2 values so we have to make it to check index 0 , index 1
                    whiteSol++; //if original board and board are not same, increase whiteSol
            }
        }
        return Math.min(whiteSol,64 - whiteSol); //8*8
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.nextLine();

        int sol = Integer.MAX_VALUE; //to find minimum
        String[] board = new String[row];
        for (int i = 0 ; i < row-8; i++){ // to find minimum start row point
            for(int j =0 ; j< col-8;j++){ //to find minimun start column point
                int curlSol = getSolution(i,j,board); // find minimun difference
                if(sol > curlSol)
                    sol = curlSol;
            }
        }

        System.out.println(sol);
        sc.close();
    }
}
