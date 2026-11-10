class Solution {
    public String destCity(List<List<String>> paths) {

        Set<String> starts = new HashSet();
        Set<String> ends = new HashSet();

        for(List<String> path: paths){
            starts.add(path.get(0));
            ends.add(path.get(1));
        }

        for(String end: ends){
           if(!starts.contains(end)){
                return end;
           }
        }
        return "";
    }
}
