package com.company.test09;

public class Main {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("田中", BloodType.A),
                new Person("小林", BloodType.B),
                new Person("渡辺", BloodType.O),
                new Person("加藤", BloodType.AB)
        };

        Person targetPerson = persons[3];
        BloodType targetBloodType = targetPerson.getBloodType();
        BloodType bestPartnerBloodType = targetBloodType.findBestPartner();

        System.out.println(targetPerson.getName() + "さんは" + targetBloodType + "型です。");
        System.out.println("特徴は" + targetBloodType.getCharacteristic() + "です。");
        System.out.println("相性の良い人は、");
        for (Person person : persons) {
            // BloodType.findBestPartner()の戻り値がnull許容のためnullチェック実施
            if (bestPartnerBloodType != null &&
                    bestPartnerBloodType.equals(person.getBloodType())) {
                System.out.println(person.getName() + "さんです。");
            }
        }
    }
}
