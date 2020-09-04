package com.ln.entity;

import java.util.ArrayList;
import java.util.List;

public class Phone {
    private Integer id;
    private String brand;
    private String type;
    private Integer time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Phone(Integer id, String brand, String type, Integer time) {
        this.id = id;
        this.brand = brand;
        this.type = type;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", time=" + time +
                '}';
    }

    public static void main(String[] args) {
        List<Phone> list = new ArrayList<Phone>();
        Phone p1 = new Phone(1, "苹果", "IOS", 22);
        Phone p2 = new Phone(2, "华为", "android", 23);
        Phone p3 = new Phone(3, "VIVO", "android", 22);
        System.out.println("AAA");
        //A.添加三个手机对象
        list.add(p1);
        list.add(p2);
        list.add(p3);
        System.out.println("BBB");
        //B.遍历输出
        for (Phone phone : list) {
            System.out.println(phone);
        }
        System.out.println("CCC");
        //C.根据品牌查出苹果
        for (Phone phone : list) {
            if ("苹果".equals(phone.getBrand())){
                System.out.println(phone);
            }
        }
        System.out.println("DDD");
        //D.删除
        for (int i = 0;i<list.size();i++){
            if ("苹果".equals(list.get(i).getBrand())){
                list.remove(i);
            }
        }
        for (Phone phone : list) {
            System.out.println(phone);
        }
    }
}
