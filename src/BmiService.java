public class BmiService {
        public int calculate (int bodyweight, double bodyheight) {
            double bmi = bodyweight / (bodyheight * bodyheight);
            return (int) bmi;
        }
    }

