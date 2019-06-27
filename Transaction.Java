class Transaction
{
public static void main(String[] args)
{
double amtBal= 5000.00;
double amtWithDraw = 2000.00;
int pin=1234;

if( pin == 1234)
{
  System.out.println("You have entered correct PIN");
  if (amtBal>=amtWithDraw && amtWithDraw >= 0)
{
  System.out.println("Please collect your Money\nThe money Balance="+(amtBal-amtWithDraw));
}
else
{
  System.out.println("Insufficient Balance\n The amount Balance =" + amtBal);
}
}
  else
  {
    System.out.println("incorrect Pin");
  }
}
}
