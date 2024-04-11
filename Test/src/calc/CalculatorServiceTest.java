package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorServiceTest {
    
    private Calculator calculator;
    private CalculatorService service;
    
    @BeforeEach
    public void setUp() {
        //テスト前にCalculatorとCalculatorServiceをセットアップ
        calculator = new Calculator();
        service = new CalculatorService(calculator);
    }

    @Test
    void testAddAndReport() {
     // CalculatorのaddメソッドとCalculatorServiceのaddAndReportメソッドが正しく連携するかテスト
        assertEquals("Result: 5", service.addAndReport(2, 3));
    }

    @Test
    void testSubstractAndReport() {
        // CalculatorのsubtractメソッドとCalculatorServiceのsubtractAndReportメソッドが正しく連携するかテスト
        assertEquals("Result: 1", service.substractAndReport(3, 2));
    }

}
