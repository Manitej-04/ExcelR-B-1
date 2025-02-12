
class FirstVowel{
    void firstChar(String s){
        char first = s.charAt(0);
        if(first=='a'||first=='A'||first=='e'||first=='E'||first=='i'||first=='I'||first=='o'||first=='O'||first=='u'||first=='u'){
            System.out.println("First Char is a vowel i.e: "+first);
        } else{
            System.out.println("First Char is a consonant i.e: "+first);
        }  
    }
}
public class Demo083{
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        String s = "Asia";
        FirstVowel v  =new FirstVowel();
        v.firstChar(s);
    }
}