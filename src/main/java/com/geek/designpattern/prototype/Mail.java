package com.geek.designpattern.prototype;

/**
 * 发送邮件存储原始邮件的记录
 */
public class Mail implements Cloneable {

    private String name ;
    private String emailAddress ;
    private String content ;

    public Mail(){
        System.out.println("MAil class constuct!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", content='" + content + '\'' +
                '}'+super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone mail  object!");
        return super.clone();
    }
}
