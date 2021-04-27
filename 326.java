class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
        
        while (n > 1) {
            if (n % 3 != 0) return false;
            if (n /3 == 1 && n % 3 == 0) return true;
            n /= 3;
        }
        return false;
    }
}

class Solution {
    public boolean isPowerOfThree(int n) {
        return n > 0 && (n == 1 || (n % 3== 0 && isPowerOfThree(n/3)));
    }
}

class Solution {
    public boolean isPowerOfThree(int n) {
        int[] all = new int[]{1, 3,9,27, 81, 243, 729, 2187, 6561, 19683, 59049, 177147, 531441, 1594323, 4782969, 14348907, 43046721, 129140163, 387420489, 1162261467};
        
        return Arrays.binarySearch(all, n) >= 0;
    }
}

class Solution {
    public boolean isPowerOfThree(int n) {
        HashSet<Integer> res = new HashSet<>(Arrays.asList(1, 3, 9, 27, 81, 243, 729, 2187, 6561, 19683, 59049, 177147, 531441, 1594323, 4782969, 14348907, 43046721, 129140163, 387420489, 1162261467));
        return res.contains(n);
    }
}

class Solution {
    public boolean isPowerOfThree(int n) {
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }
}
