class Solution {
    public boolean isPalindrome(String s) {
        
        String s2 = "";
        int i = 0;
        
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }

        String cleaned = sb.toString();
        int left = 0;
        int right = cleaned.length()-1;

        while(left <= right){
            if(cleaned.charAt(left) != cleaned.charAt(right)){
                return false;
            }
            left++; right--;
        }
        return true;
    }
}
