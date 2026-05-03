/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject4;

/**
 *
 * @author DELL
 */
public class WarehouseApp {
    public static void main(String[] args) {
        // إنشاء طرد أصلي
        Package p1 = new Package("شاشات", 25.5);
        
        // استخدام الـ Prototype لنسخ الطرد
        Package p2 = p1.clone(); 
        
        // استخدام الـ Composite لتنظيمهم في رف
        Shelf shelf1 = new Shelf("قسم الإلكترونيات");
        shelf1.addComponent(p1);
        shelf1.addComponent(p2);
        
        // عرض النتائج
        System.out.println("--- نظام إدارة المستودع الذكي ---");
        shelf1.showDetails();
        System.out.println("إجمالي الوزن في الرف: " + shelf1.getWeight() + " كجم");
    }
}