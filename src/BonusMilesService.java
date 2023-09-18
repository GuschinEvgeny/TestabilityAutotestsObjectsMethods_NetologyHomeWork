public class BonusMilesService {
    public int calculate(int price) {
        byte bonusMile = 20;
        int result = price / bonusMile;
        return result;
    }
}
