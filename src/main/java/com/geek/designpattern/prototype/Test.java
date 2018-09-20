package com.geek.designpattern.prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        System.out.println("初始化mail"+mail);
//        for (int i=0 ;i<=10;i++){
//            mail.setName("姓名"+i);
//            mail.setEmailAddress("姓名"+i+"@imooc.com");
//            mail.setContent("恭喜您。此次活动中奖了！");
//            MailUtil.sendMail(mail);
//        }
        for (int i=0 ;i<=10;i++){
            Mail mailTmp = (Mail) mail.clone();
            mailTmp.setName("姓名"+i);
            mailTmp.setEmailAddress("姓名"+i+"@imooc.com");
            mailTmp.setContent("恭喜您。此次活动中奖了！");
            MailUtil.sendMail(mailTmp);
            System.out.println("克隆的mailtype"+mailTmp);

        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
