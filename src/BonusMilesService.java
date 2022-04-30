public class BonusMilesService {
    public int calculate (int cost) {
        int amount = 10_000;
        int bonus = amount / 20 * 1;
        System.out.println(bonus);
        return bonus;
    }
}