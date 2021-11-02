import java.io.*;;
public class Sentence1 {
    String sen,smll,newsen="";
    int smlen=Integer.MAX_VALUE;
    void accept()throws IOException {
        BufferedReader br=new
                BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the String:: ");
        sen=br.readLine();
        sen.trim();
        if (sen.charAt(sen.length()-1)!='.'){
            System.out.println("Sentence does not contain a '.' Try again!");
            accept();
        }
        else sen=sen.substring(0,sen.length()-1);
    }
    void smallest(String s){
        if(s.length()==smlen){
            smll+=", "+s;
        }
        else if(s.length()<smlen){
            smll=s;
            smlen=s.length();
        }
    }
    void reverse(String s){
        newsen+=" ";
        for(int i=s.length()-1;i>=0;i--){
            newsen+=s.charAt(i);
        }
    }
    void compute(){
        int i=0,j;
        for(j=0;j<=sen.length();j++){
            if (j==sen.length()||sen.charAt(j)==' '){
                smallest(sen.substring(i,j));
                reverse(sen.substring(i,j));
                i=j+1;
            }
        }
        System.out.println();
        System.out.println("Smallest words is/are :: \n"+smll);
        System.out.println("Sentence after reversing the words is:"+newsen+".");
    }

    public static void main(String[] args)throws IOException {
        Sentence1 sc=new Sentence1();
        sc.accept();
        sc.compute();
    }
}