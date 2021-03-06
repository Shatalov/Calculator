package calculator.function;

import java.math.BigDecimal;

public class PiFunction extends AbstractFunction {

    public PiFunction(Integer minParamNumb, Integer maxParamNumb) {
        super(minParamNumb, maxParamNumb);
    }

    @Override
    public BigDecimal calculate(BigDecimal... params) {

        checkNumbOfParams(params);

        return BigDecimal.valueOf(Math.PI);
    }
}
