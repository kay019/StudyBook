package study.algorithm.leetCode.Problems.Q2236_RootEqualsSumofChildren;

public class Q2236_RootEqualsSumofChildren {

    public String defangIPaddr(String address) {
        char[] string = address.toCharArray();
        String result = "";
        for(int i = 0; i <= string.length - 1; i++){
            if(Character.compare('.', string[i]) == 0){
                result += "[.]";
            } else {
                result += string[i];
            }
        }
        return result;
    }

    public String defangIPaddr(String address) {
        return address.replace("." , "[.]");
    }

    public String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();
        for (char c : address.toCharArray()){
            str.append((c == '.')? "[.]" : c );
        }
        return str.toString();
    }

 }

