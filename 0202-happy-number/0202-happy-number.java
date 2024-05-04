class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while(set.add(n)){
            
            int total = 0 ;
            while(n>0){
                total += (n%10) * (n%10);
                n/= 10;
            }

            if(total == 1)
            return true;
            else
             n = total;
        }

        return false;
    }
}