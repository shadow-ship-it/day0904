package com.ln.entity;

import lombok.Data;

@Data
public class Player {
    private Long pid;
    private String pname;
    private Integer page;
    private String pbirthday;
    private Long sid;
    private Long tid;
    //学校
    private School school = new School();
    //球队
    private Team team = new Team();
}
