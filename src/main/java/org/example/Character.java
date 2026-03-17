package org.example;

public class Character {
    public String name;
    public int HP;//角色当前生命值
    public int MP;//角色当前法力值
    public int Attack;//角色攻击力
    public int Defense;//角色防御力
    public int Max_HP;//角色生命值上限
    public int Max_MP;//角色法力值上限
    public int Money;//角色金钱
    public int Level;//角色当前等级
    public int Max_Level;//角色最大等级
    public int Speed;//角色速度
    public int EXP;//角色当前经验值
    public int Max_EXP;//角色经验值上限
    public int Luck;//角色幸运

    public Character(String name) {this.name = name;}//选择角色的名字
    public void SetHP(int HP) {
        this.HP = HP;
    }//设置角色当前生命值
    public void SetMP(int MP) {
        this.MP = MP;
    }//设置角色当前法力值
    public void SetAttack(int Attack) {
        this.Attack = Attack;
    }//设置角色攻击力
    public void SetDefense(int Defense) {
        this.Defense = Defense;
    }//设置角色防御力
    public void SetSpeed(int Speed) {
        this.Speed = Speed;
    }//设置角色速度
    public void SetLuck(int Luck) {
        this.Luck = Luck;
    }//设置角色幸运
    public void SetEXP(int EXP) {
        this.EXP = EXP;
    }//设置角色当前经验
    public void SetLevel(int Level) {
        this.Level = Level;
    }//设置角色当前等级
    public void SetMoney(int Money) {
        this.Money = Money;
    }//设置角色金钱
    public void SetMaxHP(int Max_HP) {
        this.Max_HP = Max_HP;
    }//设置角色最大生命值
    public void SetMaxMP(int Max_MP) {
        this.Max_MP = Max_MP;
    }//设置角色最大法力值
    public void SetmaxEXP(int Max_EXP) {
        this.Max_EXP = Max_EXP;
    }//设置角色升级所需经验
    public void SetMaxLevel(int Max_Level) {
        this.Max_Level = Max_Level;
    }//设置角色最大等级
    public void printCharacter() {
        System.out.println(this);
    }


    //经验升级速率可调节参数
    public class LevelUP {
        private double LevelUpA;//控制增长速度
        private double LevelUpB;//调整基础经验
        private double LevelUpC;//偏移量
    }
    //本来想写个等级公式给自己上难度的发现写不明白呜呜（
}
