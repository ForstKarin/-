package org.example;

import java.util.Scanner;

import static org.example.Character.*;

public class Main {
    public static void main(String[] args) {
        Character Character1 = new Character("Smile");
        Character1.SetLevel(2);
        Character1.SetEXP(100);
        Character1.SetHP(15);
        Character1.SetMP(5);
        Character1.SetMaxHP(15);
        Character1.SetMaxMP(5);
        Character1.SetMaxLevel(10);
        Character1.SetmaxEXP(200);
        Character1.SetSpeed(3);
        Character1.SetAttack(2);
        Character1.SetDefense(5);
        Character1.SetMoney(0);

        Character Character2 = new Character("FireMage");
        Character2.SetLevel(8);
        Character2.SetEXP(100);
        Character2.SetHP(10);
        Character2.SetMP(20);
        Character2.SetMaxHP(10);
        Character2.SetMaxMP(20);
        Character2.SetMaxLevel(80);
        Character2.SetmaxEXP(150);
        Character2.SetSpeed(5);
        Character2.SetAttack(4);
        Character2.SetDefense(1);
        Character2.SetMoney(50);

        Character Character3 = new Character("StoneGolem");
        Character3.SetLevel(5);
        Character3.SetEXP(50);
        Character3.SetHP(25);
        Character3.SetMP(10);
        Character3.SetMaxHP(25);
        Character3.SetMaxMP(10);
        Character3.SetMaxLevel(50);
        Character3.SetmaxEXP(120);
        Character3.SetSpeed(1);
        Character3.SetAttack(8);
        Character3.SetDefense(8);
        Character3.SetMoney(0);

        Character QianXue = new Character("QianXue");
        QianXue.SetLevel(100);
        QianXue.SetEXP(999999);
        QianXue.SetHP(2147483647);
        QianXue.SetMP(2147483647);
        QianXue.SetMaxHP(2147483647);
        QianXue.SetMaxMP(2147483647);
        QianXue.SetMaxLevel(100);
        QianXue.SetmaxEXP(999999);
        QianXue.SetSpeed(2147483647);
        QianXue.SetAttack(2147483647);
        QianXue.SetDefense(2147483647);
        QianXue.SetMoney(2147483647);

        //角色数据库
        Character[] Characters = {Character1, Character2, Character3, QianXue};

        Scanner Scanner = new Scanner(System.in);
        System.out.println("在此查询角色信息！");
        System.out.println("史莱姆（Smile）、火魔法师(FireMage)、石像(StoneGolem)");
        System.out.println("请输入角色名称（输入Q退出）：");


    while (true) {
        System.out.print(">> ");
        String input = Scanner.nextLine().trim();
        if (input.equalsIgnoreCase("Q")) {
            System.out.println("退出程序。");
            break;
        }
        Character found = null;
        for (Character c : Characters) {
            if (c.name.equalsIgnoreCase(input)) {
                found = c;
                break;
            }
        }
        if (found == null) {
            System.out.println("未找到角色：" + input + "，请重新输入。");
        }
        else {
            CharacterInfo(found);
        }
    }
        Scanner.close();
    }

    public static void CharacterInfo(Character c) {
        System.out.println("============== " + c.name + " ================");
        System.out.println("HP: " + c.HP + "/" + c.Max_MP);
        System.out.println("MP: " + c.MP + "/" + c.Max_MP);
        System.out.println("攻击: " + c.Attack);
        System.out.println("防御: " + c.Defense);
        System.out.println("速度: " + c.Speed);
        System.out.println("幸运: " + c.Luck);
        System.out.println("经验: " + c.EXP + "/" + c.Max_EXP);
        System.out.println("等级: " + c.Level + "/" + c.Max_Level);
        System.out.println("金币: " + c.Money);
        System.out.println("=====================================");
    }
}
