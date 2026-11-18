public class Barista
{
    private int coffeePrice;
    private int beanCount;
    private int cashBox;
    private int refund;

    public Barista()
    {
        coffeePrice = 3000;
        beanCount = 1;
        cashBox = 0;
    }

    public Barista(int coffeePrice, int beanCount, int refund)
    {
        this.coffeePrice = coffeePrice;
        this.beanCount = beanCount;
        cashBox = 0;
    }

    public int getCoffeePrice()
    {
        return coffeePrice;
    }

    public boolean checkCoffee()
    {
        if ( beanCount > 0 )
            return true;
        else
        {
            System.out.println("원두가 없어서 주문이 불가능합니다.");
            return false;
        }
    }

    public String makeCoffee(String menuName)
    {
        beanCount = beanCount -1;
        System.out.println("[바리스타] 제조가 완료되었습니다. 현재 원두 : " + beanCount + "개");
        return menuName;
    }

    public int getRefund()
    {
        return refund;
    }

    public String takeOrder(String menuName, int payment)
    {
        System.out.println("[바리스타] 주문을 확인했습니다.");

        if ( checkCoffee() == false )
        {
            System.out.println("지불하신 금액을 환불해드리겠습니다.");
            this.refund = payment;
            return "환불";
        }

        cashBox = cashBox + payment;
        System.out.println("[바리스타] 잔고는 " + cashBox + "원 입니다.");

        String madeCoffee = makeCoffee (menuName);
        return madeCoffee;
    }
}
