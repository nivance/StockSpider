package com.whatever.stockspider.util;

import java.math.BigDecimal;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;
import org.whatever.stockspider.util.CommonUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommonUtilTest {

    @Test
    public void test() {
        String key = "10派0.53元(含税,扣税后0.477元)";
        Map<String, BigDecimal> resultMap = CommonUtil.extractNumbers(key);
        key = "10转15.001185派1.500118元(含税,扣税后1.350106元)";
        resultMap = CommonUtil.extractNumbers(key);
        key = "10派2.16元(含税,扣税后1.944元)";
        resultMap = CommonUtil.extractNumbers(key);
        key = "10派1.514985元(含税,扣税后1.363486元)";
        resultMap = CommonUtil.extractNumbers(key);
        key = "10转5.00派0.22元(含税,扣税后0.198元)";
        resultMap = CommonUtil.extractNumbers(key);
        key = "10转8.125392派0.629717元(含税,扣税后0.566745元)";
        resultMap = CommonUtil.extractNumbers(key);
        log.info("{}", resultMap);
    }

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
