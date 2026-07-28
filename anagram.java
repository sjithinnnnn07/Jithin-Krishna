 public class Main{
     public static void main(String[]args){
     String str="silent";
     String str1="listen";
     char[]arr=str.toCharArray();
     char[]arr1=str1.toCharArray();
     if(arr.length !=arr1.length){
         System.out.println("Not an anagram");
         return;
     }
     
     System.out.println("Anagram");

     }
 }     
     
     
