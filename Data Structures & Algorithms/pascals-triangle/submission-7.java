class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<numRows; i++){
            List<Integer> cycleList = new ArrayList();

            cycleList.add(1);
            result.add(cycleList);

            for(int j=1; j<=i; j++){ 
                
                if(j==i){
                    cycleList.add(1);
                }else{
                List<Integer> previous = result.get(i-1);

                int first = previous.get(j-1);

                int second = previous.get(j);

                cycleList.add(first+second);

                }
            }
    
        }
        return result;
    }
}