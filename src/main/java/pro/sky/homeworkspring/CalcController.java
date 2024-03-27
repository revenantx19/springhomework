package pro.sky.homeworkspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
    private final CalcService calcService;
    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }
    @GetMapping(path = "/calculator")
    public String helloDisplay() {
        return calcService.helloDisplay();
    }
    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calcService.plus(num1, num2);
    }
    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calcService.minus(num1, num2);
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calcService.multiply(num1, num2);
    }
    @GetMapping(path = "/calculator/devide")
    public String devide(@RequestParam("num1") float num1, @RequestParam("num2") float num2) {
        return calcService.devide(num1, num2);
    }
}
