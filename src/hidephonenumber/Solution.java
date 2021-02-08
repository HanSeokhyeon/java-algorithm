package hidephonenumber;

class Solution {
    public String solution(String phone_number) {
        String star = new String(new char[phone_number.length()-4]).replace("\0", "*");
        return star+phone_number.substring(phone_number.length()-4, phone_number.length());
    }
}
