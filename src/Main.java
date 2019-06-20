public class Main
{
    public static void main(String[] args)
    {
        //array of 10 numbers
        int[] ansu= new int[]{25,35,50,250,350,450,850,150,750,95};

        //assignment of arrays
        int smallest= ansu[0];
        int largest= ansu[0];

        for(int i=1; i<ansu.length; i++)
        {
            if(ansu[i]>largest)
                largest=ansu[i];
            else if (ansu[i]<smallest)
                smallest=ansu[i];

        }

        System.out.println("Largest Number is : " + largest);
        System.out.println("Smallest Number is : " + smallest);
    }
}
