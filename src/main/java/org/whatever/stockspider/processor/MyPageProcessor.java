package org.whatever.stockspider.processor;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * @author Aaron
 * @date 2020/12/20
 */
public abstract class MyPageProcessor implements PageProcessor {

    private Site site;

    public MyPageProcessor() {
        site = Site.me().setRetryTimes(3).setSleepTime(1000).setTimeOut(10000);
        site.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3");
    }

    @Override
    public abstract void process(Page page);

    @Override
    public Site getSite() {
        return this.site;
    }
}
