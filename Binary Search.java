class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            // Check if x is present at mid
            if (arr[m] == k)
                return m;
 
            // If x greater, ignore left half
            if (arr[m] < k)
                l = m + 1;
 
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
 
        // If we reach here, then element was
        // not present
        return -1;
        
    }
}
