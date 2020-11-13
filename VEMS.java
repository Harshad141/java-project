import java.util.scanner;
public void service() {
     Scanner scan = new Scanner(System.in);
     int z,y;
     String x;
     System.out.println("Date:");                     // use format DDMMYYYY
     z= scan.nextInt();  
     System.out.println("Enter Vehicle's number:");  //enter last 4 digits for the registrered number plate
     y= scan.nextInt();  
     System.out.println("Vehicle varient:")      // Petrol or diesel or cng
     x=scan.nextline();
     int a;


    private final String p;
    System.out.println("Enter vehicle varient"); // petrol or diesel or cng
    p=scan.nextline();
    System.out.println("enter the number of kilometers vehicle travelled since last service:");
    a=scan.nextInt();
    if(p=="petrol")
    {
        if (a <= 4000) {
            System.out.println("No service required, You are good to go");
        } 
        else if (a > 4000 && a < 5000) 
        {
            System.out.println("Service call");
        } 
        else if (a > 5000)
        {
            System.out.println("Service Due, Please visit the nearest service center");
        } 
        else 
        {
            System.out.println("please provide a valid input");
        }
    }
    else if(p=="diesel")
    {
        if(a<=8000)
        {
           System.out.println("No service required, You are good to go");
        }
       else if(a>8000 && a<10000)
       {
           System.out.println("Service call");
        }
       else if(a>10000)
       {
           System.out.println("Service Due, Please visit the nearest service center");
       }
       else if(p=="cng")
       {
        if(a<=14000)
        {
           System.out.println("No service required, You are good to go");
        }
       else if(a>14000 && a<16000)
       {
           System.out.println("Service call");
        }
       else if(a>16000)
       {
           System.out.println("Service Due, Please visit the nearest service center");
        }
       else{
           System.out.println("please provide a valid input");
     }
     }
     else{
           System.out.println("invalid varient")
        }
}
}
private void puc() {
    Scanner scan = new Scanner(System.in);
     int n;
     System.out.println("Date:");     //use format DDMMYYYY
     n= scan.nextInt();  
     int z,y;
     private String x;
     System.out.println("Date on which emission was checked");    //use format DDMMYYYY
     z= scan.nextInt();  
     System.out.println("Enter Vehicle's number:");
     y= scan.nextInt();  
     System.out.println("Vehicle varient:");         // Petrol or diesel or cng
     x=scan.nextline();
                                                                          // PUC check for BSIV vhicles
     int b,c,q;
     System.out.println("Enter vehicle type:");                   //2,3 or 4 wheeler
     q= scan.nextInt();  
     System.out.println(" For PUC check enter the following details");
     System.out.println(" Carbon mono-oxide percentage:");
     c= scan.nextInt();  
     System.out.println(" Hydrocarbons in PPM");
     b= scan.nextInt();
     if(q==2 || q==3)
     {                                                          //for 2 or 3 wheelers (2stroke engines)
       while(x=="petrol")
       {
         if(c<=2.5 && b<=4000)
         {                                       //as per BSIV norms
             System.out.println("PUC certification PASSED");
            }
         else if(c>2.5 && b>4000)
         {
             System.out.println("PUC certification Failed");
            }
         else if(c>2.5 &&  b<4000)
         {
             System.out.println("PUC certification Failed, Please reconfigure vehicle's catalytic converter");
         }
         else if(c<2.5 && b>4000)
         {
             System.out.println("PUC certification Failed, Please reconfigure vehicle's air filter");
         }
         else{
             System.out.println("Invalid data");
            }
         break;
        }
        while(x=="cng")
       {
         if(c<=2.5 && b<=4000)
         {                                       //as per BSIV norms
             System.out.println("PUC certification PASSED");
            }
         else if(c>2.5 && b>4000)
         {
             System.out.println("PUC certification Failed");
            }
         else if(c>2.5 &&  b<4000)
         {
             System.out.println("PUC certification Failed, Please reconfigure vehicle's catalytic converter");
         }
         else if(c<2.5 && b>4000)
         {
             System.out.println("PUC certification Failed, Please reconfigure vehicle's air filter");
         }
         else{
             System.out.println("Invalid data");
            }
         break;
        }
       }
    else if(q==4)
    {                                                            //for 4 wheeler as per BSIV norms
     while(x=="petrol" || "cng")
     {
         if(c<=1.62 && b<=750)
         {
             System.out.println("PUC certification PASSED");
            }
         else if(c>1.62 && b>750)
         {
             System.out.println("PUC certification Failed");
            }
         else if(c>1.62 &&  b<750)
         {
             System.out.println("PUC certification Failed, Please reconfigure vehicle's catalytic converter");
            }
         else if(c<1.62 && b>750)
         {
             System.out.println("PUC certification Failed, Please reconfigure vehicle's air filter");
            }
         else
         {
             System.out.println("INVALID data");
            }
         break;
        }
       }
     else{
         System.out.println("INVALID vehicle type");
     }
     while(x="diesel")
     {
        int d,e;
        System.out.println("for diesel vehicles maximum smoke density is calculated");
        System.out.println("Please provide the necessary details");
        System.out.println(" Enter the Light Absorption Coefficien(1/meter)");
        d= scan.nextInt();  
        System.out.println("Enter Hartridge units");
        e= scan.nextInt();  
        if(d<=1.62 && e<=50)
        {               //as per BSIV norms
            System.out.println("PUC certification passes");
        }
        else if(d>1.62 && e>50)
        {
            System.out.println("PUC certification failed");
        }
        else if (d>1.62 && e<50)
        {
            System.out.println("PUC certification failed");
        }
        else if(d<1.62 && e>50)
        {
            System.out.println("PUC certification failed");
        }
        else
        {
            System.out.println("INVALID data");
        }
        break;
      }
     System.out.println("PUC certification is valid till next 6 months");
 }

 public void tire() {
    Scanner scan = new Scanner(System.in);
     private String s;
     System.out.println("Enter the condtion of tires as per given in the manual");
     //Both edges worn
     //Center treads worn
     //One sided wear
     //Treads worn unevenly with bald spots cups or scallops
     //Erratically spaced bald spots
     //Edges of front tires only worn
     //Saw toothed wearpattern
     //Whining thumping and other weird noises
     //Squealing on curves
     s=scan.nextline();
     if(s=="Both edges worn")
     {
         System.out.println("if" + s + "then the reason is Underinflation so Add more air; check for leaks");
     }
     else if(s== "Center treads worn")
     {
        System.out.println("if" + s + "then the reason is Overinflation so try let air out to manufacturer’s specifications");
        }
     else if(s=="One sided wear")
     {
        System.out.println("if" + s + "then the reason is Poor alignment so try having wheels aligned");
     }   
     else if(s=="Treads worn unevenly with bald spots cups or scallops");
     {
        System.out.println("if" + s + "then the reason is Wheel imbalance and/or poor alignment so try Have wheels balanced and aligned");
     }
     else if(s=="Erratically spaced bald spots")
     {
        System.out.println("if" + s + "then the reason is Wheel imbalance or worn shocks so try Have wheels balanced or replace shocks");
     }
     else if(s== "Edges of front tires only worn")
    {
        System.out.println("if" + s + "then the reason is Taking curves too fast try to Slow Down!");
        }
    else if(s=="Saw toothed wearpattern")
    {
        System.out.println("if" + s + "then the reason is Poor alignment try having wheels aligned");
    }
    else if(s="Whining thumping and other weird noises")
    {
        System.out.println("if" + s + "then the reason is Poor alignment, worn tires or shocks try having wheels aligned or buy new tires or shocks");
    }
    else if(s="Squealing on curves")
    {
        System.out.println("if" + s + "then the reason is Poor alignment or underinflation try to Check wear on treads and act accordingly");
    }
    else
    {
        System.out.println("Your Problem isn't listed, try changing to new tyres");
    }
 }

public class Car
{
 private int yearModel;
 private String make;
 private int speed; 
 public Car(int yearModel, String make)
  {
    this.yearModel = yearModel;
    this.make = make;
  }
 public int getYearModel() 
 {
    return yearModel;
 }
 public String getMake() 
 {
    return make; 
 }
 public int getSpeed() 
 {
   System.out.println("You are going " + speed + " mph");
    return speed;
 }
 public void accelerate() 
 {
     speed += 5;
 }
 public void brake () 
 {
     speed-=5;
 }
}
public void speed() {
    Scanner scan = new Scanner(System.in);
    int rpm;      //vehicle RPM
    int g;        //vehicle gear ratio
    int a;        //vehicle axle ratio
    int t;        //vehicle tire size (inch radius)
    System.out.println("Enter vehicle RPM: /n");
    rpm= scan.nextInt();
    System.out.println("enter vehicle's gear ratio: /n");
    g= scan.nextInt();
    System.out.println("Enter vehicle's axle ratio: /n");
    a= scan.nextInt();
    System.out.println("Enter vehicle's tire size: /n");
    t=scan.nextInt();
    int v= (rpm*3.14*2*t)/(a*g);
    System.out.println("Vehicle's Velocity is:"+ v);
}


public void age()) 
{
    Scanner scan = new Scanner(System.in);
    // present date 
    int current_date; 
    int current_month; 
    int current_year; 

    // birth dd// mm// yyyy 
    int birth_date; 
    int birth_month; 
    int birth_year; 
    int month[] = { 31, 28, 31, 30, 31, 30, 31,31, 30, 31, 30, 31 }; 
    System.out.println("Enter Current date");
    current_date=scan.nextInt();
    System.out.println("Enter Current month");
    current_month=scan.nextInt();
    System.out.println("Enter Current year");
    current_year=scan.nextInt();
    System.out.println("Enter birth date");
    birth_date=scan.nextInt();
    System.out.println("Enter birth month");
    birth_month=scan.nextInt();
    System.out.println("Enter birth year");
    birth_year=scan.nextInt();
      
            // if birth date is greater then current  
            // birth_month, then donot count this month 
            // and add 30 to the date so as to subtract  
            // the date and get the remaining days 
            if (birth_date > current_date) 
            { 
                current_month = current_month - 1; 
                current_date = current_date + month[birth_month - 1]; 
            } 
      
            // if birth month exceeds current month,  
            // then do not count this year and add  
            // 12 to the month so that we can subtract 
            // and find out the difference 
            if (birth_month > current_month) 
            { 
                current_year = current_year - 1; 
                current_month = current_month + 12; 
            } 
      
            // calculate date, month, year 
            int calculated_date = current_date - birth_date; 
            int calculated_month = current_month - birth_month; 
            int calculated_year = current_year - birth_year; 
      
            // print the present age 
            System.out.println("Present Age"); 
            System.out.println("Years: " + calculated_year + " Months: " + calculated_month + " Days: " + calculated_date); 
} 
        




