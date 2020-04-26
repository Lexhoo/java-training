public class MatrixTraining {

    /**
     * @param lines   height of the matrix, eg: 3
     * @param columns width of the matrix, eg: 2
     * @return an empty int matrix of lines and columns size,
     * eg: {{0, 0}, {0, 0}, {0, 0}}
     */
    public int[][] emptyIntMatrix(int lines, int columns) {
	
        return new int[lines][columns];
    }

    /**
     * @param lines   height of the matrix, eg: 2
     * @param columns width of the matrix, eg: 3
     * @return an empty string matrix of lines and columns size,
     * eg: {{null, null, null}, {null, null, null}}
     */
    public String[][] emptyStringMatrix(int lines, int columns) {

        return new String[lines][columns];
    }

    /**
     * @param a first array
     * @param b second array
     * @param c third array
     * @return an int matrix with a, b and c arrays
     */
    public int[][] intMatrix(int[] a, int[] b, int[] c) {
	int[][] matrice = new int[3][a.length];
	 for(int i=0; i<a.length; i++){
	   matrice[0][i] = a[i];
	   matrice[1][i] = b[i];
           matrice[2][i] = c[i];
	}
	return matrice;   
    }

    /**
     * @param a first array
     * @param b second array
     * @param c third array
     * @return a String matrix with a, b and c arrays
     */
    public String[][] stringMatrix(String[] a, String[] b, String[] c) {
	String[][] matrice = new String[3][a.length];
	 for(int i=0; i<a.length; i++){
	   matrice[0][i] = a[i];
	   matrice[1][i] = b[i];
           matrice[2][i] = c[i];
	}
	return matrice;
    }

    /**
     * @param matrix, eg: {{3, 4}, {6, 7}, {5, 8}}
     * @return number of matrix lines, eg: 3
     */
    public int height(int[][] matrix) {
	
        return matrix.length;
    }

    /**
     * @param matrix, eg: {{3, 4}, {6, 7}, {5, 8}}
     * @return number of matrix columns, eg: 2
     */
    public int width(int[][] matrix) {
	
        return matrix[0].length;
    
    }

    /**
     * @param matrix, eg: {{3, 4, 5}, {6, 7, 8}}
     * @param line,   eg: 1
     * @param column, eg: 0
     * @return value in matrix at line and column, eg: 6
     */
    public int valueAtPosition(int[][] matrix, int line, int column) {

        return matrix[line][column];
    }

    /**
     * @param matrix, eg: {{1, 2, 3}, {8, 5, 6}}
     * @param value,  eg: 4
     * @param line,   eg: 1
     * @param column, eg: 0
     * @return the matrix with the value replaced at line and column,
     * eg: {{1, 2, 3}, {4, 5, 6}}
     */
    public int[][] replace(int[][] matrix, int value, int line, int column) {
	matrix[line][column] = value;
        return matrix;
    }

    /**
     * @param matrix, eg: {{1, 2, 3}, {4, 5, 6}}
     * @return sum of matrix values, eg: 21
     */
    public int sum(int[][] matrix) {
	int sum1 = 0;
	for(int sousMat[] : matrix){
	   for(int tab : sousMat){
		sum1 += tab;
       }
      }
        return sum1;
    }

    /**
     * @param matrix, eg: {{1, 2, 3}, {4, 5, 6}}
     * @param search, eg: 5
     * @return if matrix contains searched value, eg: true
     */
    public boolean contains(int[][] matrix, int search) {
	boolean isVrai = false;
	for(int sousMat[] : matrix){
	   for(int tab : sousMat){
	   if(tab == search){
		isVrai = true;
         }
       }
      }
	return isVrai;
    }

    /**
     * @param matrix, eg: {{1, 2, 3}, {4, 5, 6}}
     * @return how many even numbers are in matrix, eg: 3
     */
    public int countEvens(int[][] matrix) {
	  int sum1 = 0;
	for(int sousMat[] : matrix){
	   for(int tab : sousMat){
	      if(tab %2 == 0){
	   sum1 +=1;
	 }
	}
      }
        return sum1;
    }

    /**
     * @param matrix, eg: {{'d', 'b', 'a'}, {'a', 'd', 'a'}}
     * @param search, eg: 'a'
     * @return the number of character occurrences in matrix, eg: 3
     */
    public int occurrences(char[][] matrix, char search) {
	int sum1 = 0;
	for(char sousMat[] : matrix){
	   for(char tab : sousMat){
	     if(tab == search){
		sum1 +=1;
      }
    }
  }
        return sum1;
    
 }
}

