import java.util.Scanner;

public class arraySearch {

    public static void main(String[] args)
    {
        String strArray[]={"Apple","Orange","Mango","Strawberry","Lemon"};
        Scanner text=new Scanner(System.in);
        System.out.print("Enter Text : ");
        String fruit=text.next();
        System.out.print(indexOfOccurent(strArray,fruit));
    }
    public static int indexOfOccurent(String[] array,String fruit)
    {

        for(int i=0;i< array.length;i++){
            if(array[i].equals(fruit))
            {
                return i;
            }

        }
        return -1;
    }
}
