class main{
    public static void main(String[] args){
         int[][] mat = {
            {5, 1, 9, 11},
            {2, 4, 8, 10},
            {13, 3, 6, 7},
            {15, 14, 12, 16}
        };
        
        int m = mat.length;
        int n = mat[0].length;
        int[][] r = new int[m][n];

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                r[j][i] = mat[i][j];
            }
        }
        
        for(int i = 0; i < m; i++){
            int left = 0; 
            int right = n - 1;
            while(left < right){
                int temp = r[i][left];
                r[i][left] = r[i][right];
                r[i][right] = temp;
                left++;
                right--;
            }
        }
        
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                System.out.print(r[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}