public class largestNumber {
    public static void main(String[] args)
    {
        int nyumberArray[]={12,34,56,34,632,23,12,98,56,45};
        int max=nyumberArray[0];
        for (int i=0;i<nyumberArray.length;i++)
        {
            if(max<nyumberArray[i])
            {
                max=nyumberArray[i];
            }
        }
        System.out.print(max);
    }
}
