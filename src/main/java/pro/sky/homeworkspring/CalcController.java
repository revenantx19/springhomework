package pro.sky.homeworkspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalcController {
    private final CalcService calcService;
    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }
    @GetMapping()
    public String helloDisplay() {
        return "Добро пожаловать в калькулятор.";
    }
    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " + " + num2 + " = " + calcService.plus(num1, num2);
    }
    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " - " + num2 + " = " + calcService.minus(num1, num2);
    }
    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " * " + num2 + " = " + calcService.multiply(num1, num2);
    }
    @GetMapping(path = "/devide")
    public String devide(@RequestParam("num1") float num1, @RequestParam("num2") float num2) {
        if (num2 == 0) {
            return "На ноль делить нельзя";
        } else {
            return num1 + " / " + num2 + " = " +  calcService.devide(num1, num2);
        }
    }
}
