public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bodyweight  = 98;
        double bodyheight  = 1.87;
        int bmi = service.calculate(bodyweight, bodyheight);
        System.out.println("Индекс массы тела " + bmi + " кг/м2");
    }
}
