class Solution {
    public int maxNumberOfBalloons(String text) {

        String b = "balloon";

        int n = text.length();

        Map<Character,Integer> countValue = new HashMap<Character,Integer>();

        for(int i = 0; i<n; i++){
            Character c = text.charAt(i);
            if(b.contains(String.valueOf(c))){

                countValue.put(c,countValue.getOrDefault(c,0)+1);
            }
        }
        if(countValue.size() <5){
            return 0;
        }
        return countValue.entrySet()
        .stream()
        .map(e->{
            if(e.getKey() == 'l' || e.getKey() == 'o'){

                return e.getValue()/2;
            }else{
                return e.getValue();
            } 
            }
            )
        .mapToInt(i->i)
        .min().orElse(0);
    }
}