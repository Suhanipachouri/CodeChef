class Solution{
        
    static int search(int arr[], int N, int X)
    {
        
        // Your code here
        for(int i =0;i<N;i++){
            if(X==arr[i]){
                return i;
            }
        }
        return -1;
    }
    
}
