class Solution {
    public double myPow(double x, int n) {

        long exp = n;

        if (exp < 0) {
            x = 1 / x;
            exp = -exp;
        }

        double ans = 1.0;

        while (exp > 0) {

            // If power is odd
            if (exp%2!=0) {
                ans *= x;
            }

            // Square the base
            x *= x;

            // Divide power by 2
            exp /= 2;
        }

        return ans;
    }
}