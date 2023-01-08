
/*A.Develop a program to do the following task on matrices. The Matrix class has methods
for each of the following:
i. get the number of rows
ii. get the number of columns
iii. set the elements of the matrix at given position (i, j)
iv. adding two matrices. If the matrices are not addable, "Matrices cannot be added"
will be displayed.
v. main method for creating objects of matrices class and invoke the methods.
 */
public class Matrix {
    private int rows, columns;
    private int [][] matrix;
    Matrix(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        this.matrix = new int[rows][columns];
    }

    int getRows(){
        return this.rows;
    }
    int getColumns(){
        return this.columns;
    }
    void setElement(int ele, int i, int j){
        this.matrix[i][j] = ele;
    }

    void add(Matrix matrix2){
        if(this.rows == matrix2.rows && this.columns == matrix2.columns){
          for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.matrix[i][j] = this.matrix[i][j] + matrix2.matrix[i][j];
            }            
          }
        }
        else System.out.println("Cannot add arrays.");
    }
    public static void main(String[] args) {
        
    }
}
