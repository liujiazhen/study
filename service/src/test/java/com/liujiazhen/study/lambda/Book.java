package com.liujiazhen.study.lambda;

import java.time.LocalDate;

/**
 * Copyright © 2019 LiuJiazhen
 * <p>
 * description:
 *
 * @author LiuJiazhen
 * @version v1.0.0
 * @date 2019/4/27 18:37
 * <p>
 * Modification History
 * Date     Author      Version     Description
 * ---------------------------------------------------------*
 * 2019/4/27      LJZ     v1.0.0      create
 */
public class Book {
    private int id;
    private String name;
    private Double pirce;
    private String type;
    private LocalDate localDate;

    public Book(int id, String name, Double pirce, String type, LocalDate localDate) {
        this.id = id;
        this.name = name;
        this.pirce = pirce;
        this.type = type;
        this.localDate = localDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPirce() {
        return pirce;
    }

    public void setPirce(Double pirce) {
        this.pirce = pirce;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pirce=" + pirce +
                ", type='" + type + '\'' +
                ", localDate=" + localDate +
                '}';
    }
}
