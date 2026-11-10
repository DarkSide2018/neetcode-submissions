class Solution {
    public int[] addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int i = num.length -1;

        while(i>=0 || k>0){
            if(i>=0) k+=num[i--];
            list.add(k%10);

            k/=10;
        }

        Collections.reverse(list);

        int[] result = new int[list.size()];

        for(int j=0; j<list.size(); j++){
            result[j] = list.get(j);
        }
        return result;
    }
}
