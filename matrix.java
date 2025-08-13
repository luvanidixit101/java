/*
OUTPUT:
Enter Number of Rows: 2
Enter Number of columns: 2
Enter Element of matrix 1: 
Matrix 1[0][ 0]: 1
Matrix 1[0][ 1]: 2
Matrix 1[1][ 0]: 3
Matrix 1[1][ 1]: 4
Enter Element of matrix 2: 
Matrix 2[0][ 0]: 4
Matrix 2[0][ 1]: 3
Matrix 2[1][ 0]: 2
Matrix 2[1][ 1]: 1
Display of the Addition of the matrix: 
 5 5
 5 5

 */
import java.util.Scanner;
public class matrix
{ 
    int row,col;
    int [][] matrix1;
    int [][] matrix2;
    int [][] result ;
    
    Scanner sc = new Scanner(System.in);
    public void input_matrix()
    {
        boolean check = false;
        while(!check)
        {
           
       
        try
        {
            System.out.print("Enter Number of Rows: ");
            row  = sc.nextInt();
            
            System.out.print("Enter Number of columns: ");
            col  = sc.nextInt();
            
            matrix1 = new int[row][col];
            matrix2 = new int[row][col];
            result = new int[row][col];
            
            System.out.println("Enter Element of matrix 1: ");
            for(int i=0; i < row; i++)
            {
                for(int j=0; j < col; j++)
                {
                    System.out.print("Matrix 1["+ i + "]"+ "[ "+ j + "]: ");
                    matrix1[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter Element of matrix 2: ");
            for(int i=0; i < row; i++)
            {
                for(int j=0; j < col; j++)
                {
                    System.out.print("Matrix 2["+ i + "]"+ "[ "+ j + "]: ");
                    matrix2[i][j] = sc.nextInt();
                    
                }
            }
            check = true;

        }
        catch(Exception e)
        {
            System.out.println("ERROR!!! Please Enter Only Number");
            sc.nextLine();
        }
        }

        
    }
    public void add_matrix()
    {
        for(int i=0; i < row; i++)
        {
            for(int j=0; j < col; j++)
            {
                result[i][j] = matrix1[i][j] + matrix2[i][j];                
            }
        }
        
        System.out.println();
        System.out.println("Display of the Addition of the matrix: ");
        for(int i=0; i < row; i++)
        {
            for(int j=0; j < col; j++)
            {
                System.out.print(" "+result[i][j]);
            }
            System.out.println();
        }
        System.out.println();


    }
    public void sub_matrix()
    {
        for(int i=0; i < row; i++)
        {
            for(int j=0; j < col; j++)
            {
                result[i][j] = matrix1[i][j] - matrix2[i][j];                
            }
        }

        System.out.println();
        System.out.println("Display of the Subtraction of the matrix: ");
        for(int i=0; i < row; i++)
        {
            for(int j=0; j < col; j++)
            {
                System.out.print(" "+result[i][j]);
            }
            System.out.println();
        }
        System.out.println();

    }
    public void mul_matrix()
    {
        for(int i=0; i < row; i++)
        {
            for(int j=0; j < col; j++)
            {
                for(int k=0; k < col; k++)
                {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];                
                }
            }
        }

        System.out.println();
        System.out.println("Display of the Multiplication of the matrix: ");
        for(int i=0; i < row; i++)
        {
            for(int j=0; j < col; j++)
            {
                System.out.print(" "+result[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        matrix m = new matrix();
        m.input_matrix();
        m.add_matrix();
        m.sub_matrix();
        m.mul_matrix();
        m.sc.close();
        
    }
}
