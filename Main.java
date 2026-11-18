public class Main
{
    public static void main()
    {
        Barista barista = new Barista(3000, 1, 0);
        barista.checkCoffee();

        Customer customer = new Customer("진철", 10000, false);
        customer.order(barista, "아메리카노");

        System.out.println("----------");
        System.out.println("시나리오 2 : 아메리카노 한 잔 더");
        customer.order(barista, "아메리카노");
    }
}