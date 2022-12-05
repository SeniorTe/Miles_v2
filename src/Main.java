public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 15_000;
        int miles = service.calculate(price);
        System.out.println("Количество накопленных миль за вашу покупку - " + miles);
    }
}