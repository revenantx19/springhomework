package pro.sky.homeworkspring;
import io.micrometer.common.util.StringUtils;
import org.springframework.stereotype.Service;
@Service
public class CalcServiceImpl implements CalcService {

    public String helloDisplay() {
        return "Добро пожаловать в калькулятор.";
    }
    public String plus(int a, int num2) {
        return a + " + " + num2 + " = " + (a + num2);
    }
    public String minus(int a, int b) {
        return a + " - " + b + " = " + (a - b);
    }
    public String multiply(int a, int b) {
        return a + " * " + b + " = " + (a * b);
    }
    public String devide(float a, float b) {
        if (b == 0) {
            return "На ноль делить нельзя";
        } else {
            return a + " / " + b + " = " + (a / b);
        }
    }
}
