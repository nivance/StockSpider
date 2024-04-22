package org.whatever.stockspider.spider;

/**
 * 爬虫接口
 *
 * @author limingjian
 */
public interface Spiderable {

    void run(boolean retry);

    /**
     * 获取要爬取的链接
     *
     * @return
     */
    String[] getUrls(boolean retry);
}
