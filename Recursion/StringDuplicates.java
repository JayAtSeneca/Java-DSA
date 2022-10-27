public class StringDuplicates {
    public static void removeDuplicates(String str, int index, StringBuilder newString, boolean map[]){
        // base case
        if(index == str.length()){
            System.out.println(newString);
            return;
        }
        // recursive function
        char currChar = str.charAt(index);
        if(map[currChar - 'a'] == true){
            // calling recursive function
            removeDuplicates(str, index + 1, newString, map);
        }
        else{
            map[currChar - 'a'] = true;
            removeDuplicates(str, index + 1, newString.append(currChar), map);
        }

    }
    public static void main(String[] args) {
        // test case only chars from 'a' to 'z'
        String str="appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
