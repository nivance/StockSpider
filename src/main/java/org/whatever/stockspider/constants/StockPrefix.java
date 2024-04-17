package org.whatever.stockspider.constants;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * 股票代码qmvv
 *
 * @author limingjian
 */
@Slf4j
public enum StockPrefix {

    /**
     * 上海证券交易所 代码前缀
     */
    SZ(Arrays.asList("30", "00"), 0),
    /**
     * 北京证券交易所 代码前缀
     */
    BJ(Arrays.asList("43", "83", "87"), 0),
    /**
     * 深圳证券交易所 代码前缀
     */
    SH(Arrays.asList("60", "68"), 1);

    @Getter
    private List<String> codePrefixs;
    /**
     * 交易所编号(取历史价格数据有用)：
     * 600,601,603,605,688,689=1
     * 430,830,831,832,833,870=0
     * 000,001,002,003,300,301=0
     */
    @Getter
    private int market;

    StockPrefix(List<String> codePrefixs, int market) {
        this.codePrefixs = codePrefixs;
        this.market = market;
    }

//      SZ000999, SZ001238, SZ002116, SZ003038, SZ300380, SZ301539
//      BJ430478, BJ830879, BJ831278, BJ832469, BJ833509, BJ870656
//      SH600968, SH601179, SH603000, SH605001, SH688010, SH689009

    /**
     * 转化成带证券交易所的code
     *
     * @param code
     * @return
     */
    public static String toCodeAfter(String code) {
        Optional<StockPrefix> sp = Arrays.stream(StockPrefix.values()).filter(p -> p.getCodePrefixs().contains(code.substring(0, 2))).findFirst();
        if (sp.isPresent()) {
            return code + "." + sp.get().name();
        }
        return null;
    }

    /**
     * 根据代码取交易所编号
     *
     * @param code
     * @return
     */
    public static int getMarket(String code) {
        Optional<StockPrefix> sp = Arrays.stream(StockPrefix.values()).filter(p -> p.getCodePrefixs().contains(code.substring(0, 2))).findFirst();
        if (sp.isPresent()) {
            return sp.get().getMarket();
        }
        log.error("code={}没有匹配到交易所编号");
        return 0;
    }

}
