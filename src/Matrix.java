
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

    Matrix add( Matrix m2){

        if(this.rows == m2.rows && this.columns == m2.columns){
            
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < this.columns; j++) {
                    this.matrix[i][j] = this.matrix[i][j] + m2.matrix[i][j];
                }            
            }
            return this;
        }
        else System.out.println("Cannot add arrays.");
        return null;
    }
    public static void main(String[] args) {
        Matrix m1 = new Matrix(3, 3);
        Matrix m2 = new Matrix(3, 3);
        
        m1.setElement(1, 0, 0);
        m1.setElement(1, 0, 1);
        m1.setElement(1, 0, 2);
        m1.setElement(1, 1, 0);
        m1.setElement(1, 1, 1);
        m1.setElement(1, 1, 2);
        m1.setElement(1, 2, 0);
        m1.setElement(1, 2, 1);
        m1.setElement(1, 2, 2);
        m2.setElement(1, 0, 0);
        m2.setElement(1, 0, 1);
        m2.setElement(1, 0, 2);
        m2.setElement(1, 1, 0);
        m2.setElement(1, 1, 1);
        m2.setElement(1, 1, 2);
        m2.setElement(1, 2, 0);
        m2.setElement(1, 2, 1);
        m2.setElement(1, 2, 2);
        
        m1.add(m2);
        //System.out.println(m1.columns);
    }
}
