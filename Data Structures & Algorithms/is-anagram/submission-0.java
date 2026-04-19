class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> mapS=getMap(s);
        HashMap<Character,Integer> mapT=getMap(t);
        return mapS.equals(mapT);
    }
    public HashMap<Character,Integer> getMap(String str){
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        char[] ch=str.toCharArray();
        for(Character c:ch){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        return map;
    }
}
