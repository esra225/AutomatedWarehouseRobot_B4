/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.mavenproject4; // تأكدي أن هذا الاسم يطابق اسم الباكج عندك

/**
 * النمط: Composite (الواجهة المشتركة)
 * الغرض: توحيد التعامل مع الطرود الفردية والأرفف.
 */
public interface WarehouseComponent {
    void showDetails(); // لعرض الاسم والتفاصيل
    double getWeight();  // لحساب الوزن
}