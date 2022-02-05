package cn.edu.sict.chapter05;

public class Lc0202_t504_movieBean {
    int imgSrc;
    String score;
    String name;

    //构造方法：当创建movieBean对象时，给三个成员变量赋初值
    public Lc0202_t504_movieBean(int imgSrc, String score, String name) {
        this.imgSrc = imgSrc;
        this.score = score;
        this.name = name;
    }
    //创建getter和setter
    public int getImgSrc() {
        return imgSrc;
    }
    public void setImgSrc(int imgSrc) {
        this.imgSrc = imgSrc;
    }
    public String getScore() {
        return score;
    }
    public void setScore(String score) {
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
