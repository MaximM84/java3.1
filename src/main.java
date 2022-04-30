public class main {
    public static void main(String[] args) {
        int amount = 10_000;
        int bonus = amount / 20 * 1;
        System.out.println(bonus);
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}