import java.util.Scanner;
public class eveod 
{
    static char toss(int k)
    {
        double y=Math.random();
        y=y*10;
        int a=(int)y;
        if(a>6)
        a=a%6;
        System.out.println(a+"(c)");
        if((a+k)%2==0)
        return ('E');
        else
        return('O');
    }
     
    public static void main(String args[])
    {
        int batsum=0,bat,bowl,bowl1,bat1,batsum1=0,batsum2=0,batsum3=0,batsum4=0,batsum5=0,batsum6=0,batsum7=0;
    String str;
        Scanner sc=new Scanner(System.in);
        Scanner bc=new Scanner(System.in);
        System.out.println("TOSS:- \n Enter 'E' for Even  \n Enter 'O' for Odd");
        char tos=sc.nextLine().charAt(0);
        System.out.println("Enter the No.between 0 to 6 for the TOSS.");
        int n=sc.nextInt();
        char ch=toss(n);
        if(ch==tos)
        {
        System.out.println("Congrats! You won the toss \n Type 'BAT' for Batting \n Type 'BOWL' for Bowling");
        
         str=bc.nextLine();
        
        if(str.equals("BAT"))
        {

        do
        {
            System.out.println("Enter the No.between 0 to 6");
             bat=sc.nextInt();
            double comp=Math.random();
            comp=comp*10;
             bowl=(int)comp;
            if(bowl>6)
            bowl=bowl%6;
            System.out.println(bat+"\n"+bowl+"(c)");
            if(bat!=bowl)
             batsum=batsum+bat;
        }while(bat!=bowl);
        System.out.println("YOUR TOTAL= "+batsum);
        System.out.println("Your Bowling  ");
        do
        {
            System.out.println("Enter the No.between 0 to 6");
             bowl1=sc.nextInt();
            double comp1=Math.random();
            comp1=comp1*10;
             bat=(int)comp1;
            if(bat>6)
            bat=bat%6;
            System.out.println(bowl1+"\n"+bat+"(c)");
            if(bat!=bowl1)
             batsum1=batsum1+bat;
             else
             break;
        }while(batsum1<= batsum);
        System.out.println("Computer's Total=  "+batsum1);
        if(batsum1>=batsum)
        System.out.println("YOU LOST");
        else
        System.out.println("YOU WON");
        }
        else if(str.equals("BOWL"))
        {
            System.out.println("Your Bowling  ");
        do
        {
            System.out.println("Enter the No.between 0 Oto 6");
             bowl=sc.nextInt();
            double comp=Math.random();
            comp=comp*10;
             bat=(int)comp;
            if(bat>6)
            bat=bat%6;
            System.out.println(bowl+"\n"+bat+"(c)");
            if(bat!=bowl)
             batsum2=batsum2+bat;
            }while(bat!=bowl);
            System.out.println("Computer's Total=  "+batsum2);
            System.out.println("Your Batting ");
            do
           {
            System.out.println("Enter the No.between 0 to 6");
             bat=sc.nextInt();
            double comp=Math.random();
            comp=comp*10;
             bowl=(int)comp;
            if(bowl>6)
            bowl=bowl%6;
            System.out.println(bat+"\n"+bowl+"(c)");
            if(bat!=bowl)
             batsum3=batsum3+bat;
            else 
             break;
        }while(batsum3<=batsum2);
        System.out.println("YOUR TOTAL= "+batsum3);
        if(batsum2>=batsum3)
        System.out.println("YOU LOST");
        else
        System.out.println("YOU WON");
        
            
        }   
            
            
    } 
    else 
    {
        System.out.println("Sorry!!..You Lost the toss..!!");
        double tell=Math.random();
        if(tell>0.5)
        {
            System.out.println("Computer chose Batting");
            System.out.println("Your Bowling");
            do
        {
            System.out.println("Enter the No.between 0 to 6");
             bowl=sc.nextInt();
            double comp=Math.random();
            comp=comp*10;
             bat=(int)comp;
            if(bat>6)
            bat=bat%6;
            System.out.println(bat+"\n"+bowl+"(c)");
            if(bat!=bowl)
             batsum4=batsum4+bat;
            }while(bat!=bowl);
            System.out.println("Computer's Total=  "+batsum4);
            System.out.println("Your Batting ");
            do
           {
            System.out.println("Enter the No.between 0 to 6");
             bat=sc.nextInt();
            double comp=Math.random();
            comp=comp*10;
             bowl=(int)comp;
            if(bowl>6)
            bowl=bowl%6;
            System.out.println(bat+"\n"+bowl+"(c)");
            if(bat!=bowl)
             batsum5=batsum5+bat;
            else 
             break;
        }while(batsum5<=batsum4);
        System.out.println("YOUR TOTAL= "+batsum5);
        if(batsum4>=batsum5)
        System.out.println("YOU LOST");
        else
        System.out.println("YOU WON");

        }
        else
        {
            
            System.out.println("Computer Chose Bowling");
            System.out.println("your Batting");
            do
        {
            System.out.println("Enter the No.between 0 to 6");
             bat=sc.nextInt();
            double comp=Math.random();
            comp=comp*10;
             bowl=(int)comp;
            if(bowl>6)
            bowl=bowl%6;
            System.out.println(bowl+"\n"+bat+"(c)");
            if(bat!=bowl)
             batsum6=batsum6+bat;
        }while(bat!=bowl);
        System.out.println("YOUR TOTAL= "+batsum6);
        System.out.println("Your Bowling  ");
        do
        {
            System.out.println("Enter the No.between 0 to 6");
             bowl1=sc.nextInt();
            double comp1=Math.random();
            comp1=comp1*10;
             bat=(int)comp1;
            if(bat>6)
            bat=bat%6;
            System.out.println(bat+"\n"+bowl1+"(c)");
            if(bat!=bowl1)
             batsum7=batsum7+bat;
             else
             break;
        }while(batsum7<= batsum6);
        System.out.println("Computer's Total=  "+batsum7);
        if(batsum7>=batsum6)
        System.out.println("YOU LOST");
        else
        System.out.println("YOU WON");
        sc.close();
        bc.close();

        }
        }    
    }
   
}


