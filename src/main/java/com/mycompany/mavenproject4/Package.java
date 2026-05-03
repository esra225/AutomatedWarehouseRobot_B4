/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4;

/**
 *
 * @author DELL
 */

/**
 * النمط: Composite (العنصر الأصغر) + Prototype (النسخ)
 */
public class Package implements WarehouseComponent, Cloneable {
    private String name;
    private double weight;

    public Package(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public void showDetails() {
        System.out.println("  - طرد: " + name + " | الوزن: " + weight + " كجم");
    }

    @Override
    public double getWeight() {
        return weight;
    }

    // تطبيق نمط الـ Prototype لنسخ الطرد
    @Override
    public Package clone() {
        try {
            return (Package) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}