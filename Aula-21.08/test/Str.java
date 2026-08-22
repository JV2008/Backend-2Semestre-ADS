package test;

public class Str {
    public static void main(String[] args) throws Exception {
        String str1 = "Hello";
        String str2 = "hello";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();


        if(str1.equals(str2)) {
            System.out.println(str1);
        } else {
            System.out.println("diferente");
        }

        System.out.println(str1.charAt(2));
        System.out.println(str1.lastIndexOf('l'));
        System.out.println(str1.replace('l' ,'1'));



        String cpf = "478.099.076-00";
        
        System.out.println(cpf.replace("." , ""));
        System.out.println(cpf.replaceAll("[.\\-]" , ""));
        
        String s = "s3n@1";
        
        System.out.println(s.replaceAll("[^a-zA-Z0-9]" , ""));
    }
}