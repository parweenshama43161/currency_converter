import java.util.Scanner;
public class currency_converter
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("===============================");
        System.out.println(" WELCOME TO CURRENCY CONVERTER ");
        System.out.println("===============================");
        System.out.println("Select the conversion;");
        System.out.println("1.USD TO INR");
        System.out.println("2.AED TO INR");
        System.out.println("3.SAR TO INR");
        System.out.println("4.JPY TO INR");
        System.out.println("5.EUR TO INR");
        System.out.println("6.CAD TO INR");
        System.out.println("Enter your choice(1-6):");
        int choice=sc.nextInt();
        if(choice<1||choice>6)
        {
            System.out.println("Invalid choice!Please restart the program and select between 1-6");
            sc.close();
            return;
        }
        System.out.println("Enter the amount to convert:");
        double amount=sc.nextDouble();
        if(amount<0)
        {
          System.out.println("Amount cannot be negative!");
          sc.close();
          return;
        }
        double camount=0.0;
        String tcurrency="";
        String scurrency="";
        
        double usdtoi=94.41;
        double aedtoi=25.89;
        double sartoi=25.17;
        double jpytoi=0.60;
        double eurtoi=106.05;
        double cadtoi=67.26;
        
        switch(choice)
        {
            case 1:
                camount=amount*usdtoi;
                scurrency="USD";
                tcurrency="INR";
                break;
            case 2:
                camount=amount*aedtoi;
                scurrency="AED";
                tcurrency="INR";
                break;
            case 3:
                camount=amount*sartoi;
                scurrency="SAR";
                tcurrency="INR";
                break;
            case 4:
                camount=amount*jpytoi;
                scurrency="JPY";
                tcurrency="INR";
                break;
            case 5:
                camount=amount*eurtoi;
                scurrency="EUR";
                tcurrency="INR";
                break;
            case 6:
                camount=amount*cadtoi;
                scurrency="CAD";
                tcurrency="INR";
                break;
        }
        System.out.println("----------------------------------");
        System.out.printf(" Converted Amount:%.2f%s\n",camount,tcurrency);
        System.out.println("----------------------------------");
        sc.close();
        }
    }