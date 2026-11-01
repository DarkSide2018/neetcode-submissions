class Solution {
    public boolean isPathCrossing(String path) {

        int x =0;
        int y = 0;
        boolean cross = false;
        char[] pathArr = path.toCharArray();
        Set<String> visited = new HashSet<>();
        visited.add("0,0");
        for(char c : pathArr){

            if(c == 'N'){
                y++;
            }else if(c=='E'){
                x++;
            }else if(c=='S'){
                y--;
            }else if(c=='W'){
                x--;
            }
            String key = x+","+y;

            if(!visited.add(key)){
                return true;
            }
        }
        return false;
    }
}