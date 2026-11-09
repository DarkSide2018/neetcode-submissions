class Solution {
    
    public boolean isHappy(int n) {
        return isHappy(n,new HashSet<>());
    }

    private boolean isHappy(int n, Set<Integer> seen){
        if(n==1) return true;

        if(!seen.add(n)) return false;

        int total = 0;

        while(n>0){
            int d = n%10;
            total += d*d;

            n /= 10;
        }
        return isHappy(total,seen);
    }
}
