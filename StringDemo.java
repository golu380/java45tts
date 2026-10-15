public class StringDemo {

    public static void main(String[] args) {
        System.out.println("hii");

        String s1  = "java";
        String s2 = "java";
        

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2)); // it will only check content

        String s3 = new String("java");
        String s4 = new  String("java");

        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        String s5 = "Java ";
        System.out.println(s5.concat("Programing learning3333"));
        s5 = s5.concat("Programming");
        System.out.println(s5);
        System.out.println(s5.length());
        System.out.println(s5.charAt(3));
        System.out.println(s5.toUpperCase());
        System.out.println(s5.toLowerCase());
        String a = "java";
        String b = "JAvA";
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));

        String message = "I am leanrning java now";
        System.out.println(message.contains("now"));
        System.out.println(message.startsWith("I am"));
        System.out.println(message.endsWith("a now"));

        System.out.println(message.substring(2));
        System.out.println(message.substring(5,9));
        String k = "   amit   ";
        System.out.println(k.trim());
        System.out.println(k);
        System.out.println(message.replace("now", "at this time"));

        String [] words = message.split(" ");

        // for(int i = 0;i<message.length();i++){
        //     System.out.println(message.charAt(i));
        // }
        for(String word: words){
            System.out.println(word);
            for(int i  = 0;i<word.length();i++){
                System.out.println(word.charAt(i));
            }
            
          
        }

    }
    
}
