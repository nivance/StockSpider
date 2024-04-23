import java.math.BigDecimal;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;
import org.whatever.stockspider.util.CommonUtil;

public class CommonUtilTest {

    @Test
    public void test1() {
        String key = "10送3.50转5.00派3.00元(含税,扣税后2.40元)";
        Map<String, BigDecimal> resultMap = CommonUtil.extractNumbers(key);
        assert resultMap.keySet().size() == 5;
        Assert.isTrue(resultMap.containsKey("股"));
        Assert.isTrue(resultMap.containsKey("送"));
        Assert.isTrue(resultMap.containsKey("转"));
        Assert.isTrue(resultMap.containsKey("派"));
        Assert.isTrue(resultMap.containsKey("税后"));
    }

    @Test
    public void test11() {
        String key = "10送3.50转5.00派3.00元(含税)";
        Map<String, BigDecimal> resultMap = CommonUtil.extractNumbers(key);
        assert resultMap.keySet().size() == 4;
        Assert.isTrue(resultMap.containsKey("股"));
        Assert.isTrue(resultMap.containsKey("送"));
        Assert.isTrue(resultMap.containsKey("转"));
        Assert.isTrue(resultMap.containsKey("派"));
        Assert.isTrue(!resultMap.containsKey("税后"));
    }

    @Test
    public void test2() {
        String key = "10派3.00元(含税,扣税后2.40元)";
        Map<String, BigDecimal> resultMap = CommonUtil.extractNumbers(key);
        assert resultMap.keySet().size() == 3;
        Assert.isTrue(resultMap.containsKey("股"));
        Assert.isTrue(resultMap.containsKey("派"));
        Assert.isTrue(resultMap.containsKey("税后"));
    }

    @Test
    public void test21() {
        String key = "10派3.00元(含税)";
        Map<String, BigDecimal> resultMap = CommonUtil.extractNumbers(key);
        assert resultMap.keySet().size() == 2;
        Assert.isTrue(resultMap.containsKey("股"));
        Assert.isTrue(resultMap.containsKey("派"));
    }

    @Test
    public void test3() {
        String key = "10转2.00派1.53元(含税,扣税后1.377元)";
        Map<String, BigDecimal> resultMap = CommonUtil.extractNumbers(key);
        assert resultMap.keySet().size() == 4;
        Assert.isTrue(resultMap.containsKey("股"));
        Assert.isTrue(resultMap.containsKey("转"));
        Assert.isTrue(resultMap.containsKey("派"));
        Assert.isTrue(resultMap.containsKey("税后"));
    }

    @Test
    public void test31() {
        String key = "10送2.00派3.00元(含税)";
        Map<String, BigDecimal> resultMap = CommonUtil.extractNumbers(key);
        assert resultMap.keySet().size() == 3;
        Assert.isTrue(resultMap.containsKey("股"));
        Assert.isTrue(resultMap.containsKey("送"));
        Assert.isTrue(resultMap.containsKey("派"));
        Assert.isTrue(!resultMap.containsKey("税后"));
    }

    @Test
    public void test4() {
        String key = "10送3.00派5.00元(含税)";
        Map<String, BigDecimal> resultMap = CommonUtil.extractNumbers(key);
        assert resultMap.keySet().size() == 3;
        Assert.isTrue(resultMap.containsKey("股"));
        Assert.isTrue(resultMap.containsKey("送"));
        Assert.isTrue(resultMap.containsKey("派"));
    }

    @Test
    public void test41() {
        String key = "10送3.00派5.00元(含税,扣税后2.40元)";
        Map<String, BigDecimal> resultMap = CommonUtil.extractNumbers(key);
        assert resultMap.keySet().size() == 4;
        Assert.isTrue(resultMap.containsKey("股"));
        Assert.isTrue(resultMap.containsKey("送"));
        Assert.isTrue(resultMap.containsKey("派"));
        Assert.isTrue(resultMap.containsKey("税后"));
    }

}
