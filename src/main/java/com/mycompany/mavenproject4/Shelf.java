/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4;

/**
 *
 * @author DELL
 */

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;

/**
 * النمط: Composite (الحاوية)
 */
public class Shelf implements WarehouseComponent {
    private String shelfName;
    private List<WarehouseComponent> items = new ArrayList<>();

    public Shelf(String name) {
        this.shelfName = name;
    }

    public void addComponent(WarehouseComponent component) {
        items.add(component);
    }

    @Override
    public void showDetails() {
        System.out.println("الرف المجمع: " + shelfName);
        for (WarehouseComponent item : items) {
            item.showDetails();
        }
    }

    @Override
    public double getWeight() {
        double total = 0;
        for (WarehouseComponent item : items) {
            total += item.getWeight();
        }
        return total;
    }
}