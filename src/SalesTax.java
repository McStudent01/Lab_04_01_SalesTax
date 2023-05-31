public class SalesTax
{
    public static void main(String[] args)
    {
        double itemPrice = 100;
        double TAX_RATE = .05;
        double salesTax = itemPrice * TAX_RATE;
        System.out.println("Your item price today is " +itemPrice + "and the sales tax is " +salesTax + ".");

    }
}