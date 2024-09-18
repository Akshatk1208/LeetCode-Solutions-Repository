class Solution {
    public int numberOfSpecialChars(String word) {
        int count=0;
        HashSet<Character> set=new HashSet<>();
        for(char c:word.toCharArray())
        {
            set.add(c);
        }
        for(char x:set)
        {
            if (Character.isLetter(x) && set.contains(Character.toLowerCase(x)) && set.contains(Character.toUpperCase(x)))
            count++;
        }
        return count/2;
    }
}