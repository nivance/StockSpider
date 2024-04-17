package org.whatever.stockspider.constants;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import lombok.Getter;

/**
 * 股票代码qmvv
 *
 * @author limingjian
 */

public enum StockPrefix {

    /**
     * 上海证券交易所 代码前缀
     */
    SZ(Arrays.asList("30", "00")),
    /**
     * 北京证券交易所 代码前缀
     */
    BJ(Arrays.asList("43", "83", "87")),
    /**
     * 深圳证券交易所 代码前缀
     */
    SH(Arrays.asList("60", "68"));

    @Getter
    private List<String> codePrefixs;

    StockPrefix(List<String> codePrefixs) {
        this.codePrefixs = codePrefixs;
    }

//      SZ300380, SZ301539
//      SZ000999, SZ001238, SZ002116, SZ003038
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


}
