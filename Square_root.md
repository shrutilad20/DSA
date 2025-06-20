public static int sqrt(int x) {
 int low = 1, high = x, ans = 0;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (mid <= x / mid) {  // Avoids overflow
            ans = mid;
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return ans;
}
