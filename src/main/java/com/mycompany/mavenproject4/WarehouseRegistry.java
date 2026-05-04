/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4;

/**
 *
 * @author smg
 */

import java.util.ArrayList;
import java.util.List;
public class WarehouseRegistry {
    private static WarehouseRegistry instance;
    private List<WarehouseComponent> allComponents;

    private WarehouseRegistry() {
        allComponents = new ArrayList<>();
    }

    public static synchronized WarehouseRegistry getInstance() {
        if (instance == null) {
            instance = new WarehouseRegistry();
        }
        return instance;
    }

    public void addComponent(WarehouseComponent component) {
        allComponents.add(component);
    }

    public void displayAllInventory() {
        System.out.println("--- Centralized Warehouse Inventory (Singleton) ---");
        for (WarehouseComponent comp : allComponents) {
            comp.showDetails();
        }
    }
}
