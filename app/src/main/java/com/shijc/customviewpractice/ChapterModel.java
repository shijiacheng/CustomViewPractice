package com.shijc.customviewpractice;

/**
 * @author shijiacheng
 * @version V1.0
 * @Package com.shijc.customviewpractice
 * @Description: 章节的model
 * @date 2018/9/18 16:12
 */
public class ChapterModel {

    public ChapterModel(int chapterId,int resId, String chapterName,String articleUrl) {
        this.chapterId = chapterId;
        this.resId = resId;
        this.chapterName = chapterName;
        this.articleUrl = articleUrl;
    }

    private int resId;
    private String chapterName;
    private int chapterId;
    private String articleUrl;

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public int getChapterId() {
        return chapterId;
    }

    public void setChapterId(int chapterId) {
        this.chapterId = chapterId;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
    }
}
