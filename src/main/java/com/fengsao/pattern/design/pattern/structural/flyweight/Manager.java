package com.fengsao.pattern.design.pattern.structural.flyweight;

/**
 * Created by geekq
 */
public class Manager implements Employee {
    @Override
    public void report() {
        System.out.println(reportContent);
    }
    private String title = "部门经理";
    private String department;
    private String reportContent;

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public Manager(String department) {
        this.department = department;
    }


}
