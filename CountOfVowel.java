

public class CountOfVowel {

    public int vowel(String chars1){
        int count =0;
        chars1= chars1.toLowerCase();
        for (int i=0;i<chars1.length();i++)
        {
            if(chars1.charAt(i)=='a' || chars1.charAt(i)=='e' || chars1.charAt(i)=='i' || chars1.charAt(i)=='o' || chars1.charAt(i)=='u')
                {
                    count++;
                }
        }
        return count;        
    }
    public static void main(String[] args) {
        CountOfVowel obj = new CountOfVowel();
        System.out.println("Number of vowel:"+ obj.vowel("SayanBAnerjee"));
    }
}