public class removeDuplicate_string {
    public static boolean [] map = new boolean[26];
    public static void removeDuplicate(String str,int idx,String newString)
    {
        if(idx==str.length())
        {
            System.out.println(newString);
            return;
        }
        char currchar=str.charAt(idx);
        if(map[currchar-'a'])
        {
            removeDuplicate(str, idx+1, newString);
        }
        else{
            newString +=currchar;
            map[currchar-'a']=true;
            removeDuplicate(str, idx+1, newString);
        }
    }
    public static void main(String[]args)
    {
        String str="abcdbbhsdjbjaabnjndjjan";
        removeDuplicate(str, 0, "");
    }
    
}
