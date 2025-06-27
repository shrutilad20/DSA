// User function Template for Java
class Solution {
    public void transpose(int n, int arr[][]) {
        int temp=0;
        for (int i = 0; i < n; i++)
        {
                
                    for (int j = 0; j < i; j++) {
                         temp=arr[i][j];
                        arr[i][j]=arr[j][i];
                        arr[j][i]=temp;
                        
                        
                    }}}}
                 
