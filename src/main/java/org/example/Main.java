package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 创建三个角色
        Character slime = new Character("1");
        slime.sethp(50);
        slime.setmp(0);
        slime.setattack(10);
        slime.setdefense(5);
        slime.setspeed(3);
        slime.setluck(2);
        slime.setexp(10);
        slime.setlevel(1);
        slime.setgold(5);
        slime.setmaxHp(50);
        slime.setmaxMp(0);
        slime.setmaxExp(100);
        slime.setmaxLevel(10);
        slime.setmaxGold(100);

        Character fireMage = new Character("2");
        fireMage.sethp(80);
        fireMage.setmp(100);
        fireMage.setattack(12);
        fireMage.setdefense(8);
        fireMage.setspeed(10);
        fireMage.setluck(8);
        fireMage.setexp(20);
        fireMage.setlevel(1);
        fireMage.setgold(20);
        fireMage.setmaxHp(80);
        fireMage.setmaxMp(200);
        fireMage.setmaxExp(150);
        fireMage.setmaxLevel(10);
        fireMage.setmaxGold(200);

        Character stoneGolem = new Character("3");
        stoneGolem.sethp(120);
        stoneGolem.setmp(0);
        stoneGolem.setattack(8);
        stoneGolem.setdefense(20);
        stoneGolem.setspeed(2);
        stoneGolem.setluck(3);
        stoneGolem.setexp(15);
        stoneGolem.setlevel(1);
        stoneGolem.setgold(10);
        stoneGolem.setmaxHp(120);
        stoneGolem.setmaxMp(0);
        stoneGolem.setmaxExp(120);
        stoneGolem.setmaxLevel(10);
        stoneGolem.setmaxGold(150);

        // 存储角色
        Character[] characters = {slime, fireMage, stoneGolem};

        Scanner scanner = new Scanner(System.in);
        System.out.println("查询角色信息");
        System.out.println("可查询的角色：1、2、3");
        System.out.println("请输入名称（输入 exit 退出）：");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("退出。");
                break;
            }

            // 查找匹配的角色
            Character found = null;
            for (Character c : characters) {
                if (c.name.equalsIgnoreCase(input)) {
                    found = c;
                    break;
                }
            }

            if (found == null) {
                System.out.println("未找到角色：" + input + "，请重新输入。");
            } else {
                printCharacterInfo(found);
            }
        }
        scanner.close();
    }

    // 数据展示
    public static void printCharacterInfo(Character c) {
        System.out.println("========== " + c.name + " 的属性 ==========");
        System.out.println("HP: " + c.hp + "/" + c.maxHp);
        System.out.println("MP: " + c.mp + "/" + c.maxMp);
        System.out.println("攻击: " + c.attack);
        System.out.println("防御: " + c.defense);
        System.out.println("速度: " + c.speed);
        System.out.println("幸运: " + c.luck);
        System.out.println("经验: " + c.exp + "/" + c.maxExp);
        System.out.println("等级: " + c.level + "/" + c.maxLevel);
        System.out.println("金币: " + c.gold + "/" + c.maxGold);
        System.out.println("=====================================");
    }
}