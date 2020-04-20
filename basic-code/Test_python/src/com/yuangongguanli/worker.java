package com.yuangongguanli;

public class worker {

    private String workid;
    private String name ;
    private int gz;
    private String sex;

    public void show_menu(){
        System.out.println("*********************************************");
        System.out.println("员工管理系统 v1.0\n" +
                "1:添加员工信息\n" +
                "2:删除员工信息\n" +
                "3:修改员工信息\n" +
                "4:显示所有信息\n" +
                "5:退出员工系统");
        System.out.println("*********************************************");
    }

    public void worker_add(String name,int gz,String sex){
        this.name = name;
        this.workid = workid;
        this.gz = gz;
        this.sex = sex;
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGz() {
        return gz;
    }

    public void setGz(int gz) {
        this.gz = gz;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "工号:" + workid + "\t" +
                "姓名:" + name + "\t" +
                "工资:" + gz + '\t' +
                "性别:" + sex;
    }
}
