package com.yuangongguanli;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class main {

    public static void main(String[] args){

        //创建容器存储员工
        ArrayList<worker> workers = new ArrayList<worker>();
        HashMap<Object, Object> hashMap = new HashMap<>();

        while(true){
            //系统界面
            System.out.println("*********************************************");
            System.out.println("员工管理系统 v1.0\n" +
                    "1:添加员工信息\n" +
                    "2:删除员工信息\n" +
                    "3:修改员工信息\n" +
                    "4:显示所有信息\n" +
                    "5:退出员工系统");
            System.out.println("*********************************************");

            System.out.println("请输入您的操作:");
            Scanner sc = new Scanner(System.in);
            int chose_num = sc.nextInt();
            //添加员工信息
            if (chose_num == 1){
                while (true) {
                    System.out.println("请输入员工编号:");
                    String input_bh = sc.next();
                    if (input_bh.equals("quit")){
                        break;
                    }
                    boolean flag = is_exist(workers, input_bh);
                    if (flag){
                        System.out.println("请输入员工姓名:");
                        String input_name = sc.next();
                        System.out.println("请输入员工工资:");
                        int input_gz = sc.nextInt();
                        System.out.println("请输入员工性别:");
                        String input_sex = sc.next();
                        worker wor = new worker();
                        wor.setWorkid(input_bh);
                        wor.worker_add(input_name,input_gz,input_sex);
                        workers.add(wor);
                        System.out.println("员工添加成功!(输入'b'返回主页面)");
                        sc.next();
                        break;
                    }else {
                        System.out.println("错误!已存在员工编号");
                    }


                }
            }
            //删除员工信息
            if (chose_num == 2){
                while (true) {
                    System.out.println("请输入要删除的员工编号:");
                    String input_bh = sc.next();
                    boolean flag = is_exist(workers, input_bh);
                    if (input_bh.equals("quit")){
                        break;
                    }
                    if (flag){
                        System.out.println("错误!不存在的员工编号");
                    }else {
                        for (int i = 0; i < workers.size() ; i++) {
                            if (workers.get(i).getWorkid().equals(input_bh)){
                                workers.remove(i);
                                break;
                            }
                        }
                        System.out.println("员工删除成功!(输入'b'返回主页面)");
                        sc.next();
                        break;
                    }

                }
            }


            //修改员工信息
            if (chose_num == 3){
                while (true){
                    System.out.println("请输入要修改的员工编号:");
                    String input_bh = sc.next();
                    boolean flag = is_exist(workers,input_bh);
                    if (input_bh.equals("quit")){
                        break;
                    }
                    if (flag){
                        System.out.println("错误!不存在的员工编号");
                    }else {
                        for (int i = 0; i < workers.size() ; i++) {
                            worker wor = workers.get(i);
                            if (wor.getWorkid().equals(input_bh)){
                                System.out.println("姓名是["+wor.getName()+"]\t请输入新的姓名(不修改请输入n):");
                                String new_name = sc.next();
                                System.out.println("工资是["+wor.getGz()+"]\t请输入新的工资(不修改请输入0):");
                                int new_gz = sc.nextInt();
                                System.out.println("性别是["+wor.getSex()+"]\t请输入新的性别(不修改请输入n):");
                                String new_sex = sc.next();
                                if (new_name.equals("n")){
                                    new_name = wor.getName();
                                }
                                if (new_gz == 0){
                                    new_gz = wor.getGz();
                                }
                                if (new_sex.equals("n")){
                                    new_sex = wor.getSex();
                                }
                                wor.worker_add(new_name,new_gz,new_sex);
                                System.out.println("员工信息修改成功!(输入'b'返回主页面)");
                                sc.next();
                                break;
                            }
                        }
                        break;
                    }
                }

            }
            //显示所有信息
            if (chose_num == 4){
                for (worker w:workers
                     ) {
                    System.out.println(w.toString());
                }
                System.out.println("输入'b'返回主页面");
                sc.next();
            }
            //退出系统
            if(chose_num == 5){
                System.out.println("感谢使用本系统!再见");
                break;
            }
        }


    }

    // 创建一个判断输入值是否已存在的方法
    public static boolean is_exist(ArrayList<worker> arrayList,String input_bh){
        boolean flag = true;
        for (worker w:arrayList
        ) {
            String id = w.getWorkid();
            if (input_bh.equals(id)){
                flag = false;
                break;
            }
        }
        return flag;
    }


}
