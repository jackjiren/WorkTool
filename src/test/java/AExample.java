
public class AExample{
        public static void main(String[ ] args){
            String s, s1="";
            char c;
            s=args[0];
            for( int i=0; i<s.length(); i++){
                    c=s.charAt(i);
                if(c>='a'&&c<='z')
                s1=s1+Character.toUpperCase(c);
                if(c>='A'&&c<='Z')
                s1=s1+Character.toLowerCase(c);
            }
            System.out.println(s1);
        }

    }
