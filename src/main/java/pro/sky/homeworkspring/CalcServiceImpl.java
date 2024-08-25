package pro.sky.homeworkspring;
import org.springframework.stereotype.Service;
@Service
public class CalcServiceImpl implements CalcService {

    public int plus(int num1, int num2) {
        return num1 + num2;
    }
    public int minus(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public float devide(float a, float b) {
        return a / b;
    }
}
