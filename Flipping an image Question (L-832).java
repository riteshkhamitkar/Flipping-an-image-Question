class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int n = A.length;
        for(int i =0; i<n;i++){
            int left =0, right = n-1;
            
            while(left <= right){
                int temp = A[i][left];
                A[i][left]=A[i][right];
                A[i][right]= temp;
                left++;
                right--;
            }
        }
        for(int i=0; i <n;i++){
            for(int j =0; j<n;j++){
                if(A[i][j]==1){
                    A[i][j]=0;
                }else{
                    A[i][j]=1;
                }
            }
        }
        return A;
    }
}