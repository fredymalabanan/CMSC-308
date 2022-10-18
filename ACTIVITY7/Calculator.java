import java.util.Scanner;

class calculator {  
  public static void main(String [] args) 
  {
       
    Scanner scan = new Scanner(System.in);

   System.out.println("CALCULATOR MENU" );
   System.out.println("1. Addition");
   System.out.println("2. Subraction");
   System.out.println("3. Multiplication");
   System.out.println("4. Division");
   System.out.println("5. Modulo");
   System.out.println("6. Exponent");
   
   
    int x, addends1, addends2;
    System.out.println("Choose Operation: ");
    x= scan.nextInt();
    
    System.out.println("Enter the First addends: ");
    addends1= scan.nextInt();
    System.out.println("Enter the Second addends: ");
    addends2= scan.nextInt();
    
    switch (x)
    {
    case 1:
       x = addends1 + addends2;
       System.out.println("The sum of " + addends1 + " and " + addends2 + " is "  + x );
       break;
    case 2:
       x = addends1 - addends2;
       System.out.println("The difference of " + addends1 + " and " + addends2 + " is "  + x );
       break;
    case 3:
       x = addends1 * addends2;
       System.out.println("The product of " + addends1 + " and " + addends2 + " is "  + x );
       break;
    case 4:
       x = addends1 / addends2;
       System.out.println("The quotient of " + addends1 + " and " + addends2 + " is "  + x );
       break;
    case 5:
       x = addends1 % addends2;
       System.out.println("The modulos of " + addends1 + " and " + addends2 + " is "  + x );
       break;
    case 6:
      long exponent = (long) Math.pow(addends1 , addends2);
       System.out.println("The exponent of " + addends1 + " and " + addends2 + " is "  + x );
       break;
     
   
          }
           scan.close();
     }  

}
