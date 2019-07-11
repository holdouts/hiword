import jdk.nashorn.internal.codegen.types.BooleanType;

public class HeroStory {
    //整数类型
    public  void  IntegerType(){
        System.out.println("我是byte类型,我的范围是:{-128}~{127},长度:8位");
        System.out.println("我是short类型,我的范围是:{-32768}~{32767},长度:16位");
        System.out.println("我是int类型,我的范围是:比上面的家伙大,长度:32位");
        System.out.println("我是long类型,我的范围是最大的,长度是64位的");

        //如果试图将大于该类型的范围插入数值,会发生什么?
        byte a=1;
    }
    //字符类型
    public  void  CharTypes(){
        System.out.println("只要是用英文单引号包含的单个字符就是char类型,我和short类型的长度一样都是16位");
    }
    //浮点类型
    public  void FloatingPointTypes(){
        System.out.println("我是float类型,长度为32位,使用我的时候记住要在值的后面加上f哦,有的人叫我单精度");
        System.out.println("我是double类型,我比float大32位,我是64位的,使用我的时候可以不用加后缀,有的人叫我双精度");
    }
    //布尔类型
    public void BooleanType(){
        System.out.println("我是最简单的,不是true就是false   或者不是0就是1  不是真就是假,切记我赋值只能用true和false赋值,但是我存在计算机内的值是0或1");
    }
    //字符串类型
    public void StringType(){
        System.out.println("介绍一下自己,我不属于基本数据类型,我是由多个字符组成的,所以我叫字符串,小名:串串");
    }
    //作业
    public  void  homework(){
        //写一句.在我的IDEA中关键字是由橙色标记的,可以看到string并不是橙色,所以string不是基本数据类型
        float a=3.14f;
        double b=2.769343;
        short c=365;
        byte d=12;
        char e='吃';
        boolean f=true;
        String g="不可描述";
    }
}
class  literals{
    public void  IntegerLiterals(){
        int decVal=26;
        int hexVal=0x1a;
        int oxVal=032;
        int binVal=0b11010;
        System.out.println("以L结尾的字面值表示Long类型,比如 long a="+26l);
        System.out.println("默认就是int类型,"+decVal);
        System.out.println("16进制,"+hexVal);
        System.out.println("8进制,"+oxVal);
        System.out.println("2进制,"+binVal);
    }
    public  void  FloatingLiterals(){
        float f1=123.4f;
        double f2=123.4;
        double f3=123.4e-4;
        System.out.println("以F结尾的字面值表示float类型"+f1);
        System.out.println("默认的是double类型"+f2);
        System.out.println("科学计数表示double,e2表示10的二次方"+f3);
    }
    public  void  CharLiterals(){
        String name="亚索";
        char a='Y';
        System.out.println("介绍转义字符\t(制表符)\r(回车符)\r(换行)\"(双引号)\'(单引号)\\(反斜杠)");
    }
    public  void  homework(){
        byte a=123;
        short b=1;
        int c=4;
        long d=5L;
        float e=6f;
        double f=7;
        char g='8';
        String l="stop";
    }
}
class TypeConversion{
    //类型转换介绍
    public  void  TypeConversionRes(){
        //转换的规则:从小到大自动转,从大到小强制转,  这里的大和小分别值的是长度   这种规则限用与同等数据类型,比如:byte,short,int等
        //还有一种转换就是不同数据类型之间的转换,不同数据类型之间,比如  数值类型与字符类型之间,布尔类型与数值类型中的0和1  这种情况下必须强制转换
        char a='C';
        short b=70;

        a=(char) b;
        //为什么打印的是其他字符呢?  因为在转换的是后计算机将你的数字转换成ASCII码的表上对应着,所以是字符
        System.out.println(a);
    }
    public  void ButtonConversionHigh(){
        long a=500l;
        int b=50;
        a=b;
    }
    public  void  HighConversionButton(){
        byte a=5;
        int i1=10;
        int i2=20;
        a=(byte) i1;
        System.out.println(a);
        a=(byte)i2;
        System.out.println(a);
        System.out.println(Integer.toBinaryString(a));
        //to
    }
    public  void  homework(){
        short a=1;
        short b=3;
        int c=(short) (a+b);
        System.out.println("强制转换的值:"+c);
    }
}
