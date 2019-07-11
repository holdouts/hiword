import java.lang.reflect.Type;

public class HiWorld {
    public  static void  main(String[] args){
        Hero garen=new Hero();
        garen.name="盖伦";
        garen.hp=616.28f;
        garen.armor=27.563f;
        garen.moveSpeed=350;


        Hero teemo=new Hero();
        teemo.name="提莫";
        teemo.hp=383f;
        teemo.armor=14f;
        teemo.moveSpeed=330;

        HeroStory one=new HeroStory();
        one.IntegerType();
        literals two=new literals();
        two.IntegerLiterals();
        two.FloatingLiterals();
        two.CharLiterals();
        TypeConversion three=new TypeConversion();
        three.TypeConversionRes();
        three.HighConversionButton();
        three.homework();
        //打印
        garen.keng(garen.name);
        garen.ChaoShen();

        teemo.getArmor(20f);
    }
}
class Hero{
    String name;  //姓名
    float hp;   //血量
    float armor;    //护甲
    int moveSpeed;  //移动速度
    //队友操作
    void  keng(String name){
        System.out.println(name+"坑队友!");
    }
    //获取新的护甲值
    float getArmor(float newArmor){
        return  armor;
    }
    //超神
    void  ChaoShen(){
        System.out.println("超神了!");
    }
    //获取当前血量
    float getHp(){
        return  hp;
    }
    //回血
    void recovery(float blood){
        hp=hp+blood;
    }
}


