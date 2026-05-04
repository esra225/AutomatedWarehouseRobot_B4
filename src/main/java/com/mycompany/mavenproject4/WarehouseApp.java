/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject4;


public class WarehouseApp {
    public static void main(String[] args) {
        // 1. Singleton: Access the central registry
        WarehouseRegistry registry = WarehouseRegistry.getInstance();

        // 2. Prototype: Create a package and clone it
        Package originalPkg = new Package("LED Screens", 25.5);
        Package clonedPkg = originalPkg.clone();
        
        // 3. Composite: Organize them into a shelf
        Shelf electronicsShelf = new Shelf("Electronics Section");
        electronicsShelf.addComponent(originalPkg);
        electronicsShelf.addComponent(clonedPkg);
        
        // 4. Store in the Singleton
        registry.addComponent(electronicsShelf);
        
        // 5. Execution
        System.out.println("--- Automated Warehouse Robot System ---");
        registry.displayAllInventory();
        System.out.println("Total Calculated Weight: " + electronicsShelf.getWeight() + " kg");
    }
}