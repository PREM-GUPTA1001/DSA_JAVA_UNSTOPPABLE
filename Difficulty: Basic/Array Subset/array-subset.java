class Solution {
    public boolean isSubset(int a[], int b[]) {
        if(b.length > a.length) return false;
    // hashset k use krke krenge bcz searching krne m O(1) TC:
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int num: a){
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
    
    for(int num: b){
        if(!map.containsKey(num) || map.get(num) == 0 ) return false;
        
        map.put(num, map.get(num) - 1);
    }
    return true;
    }
}
