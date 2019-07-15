import com.sun.org.apache.xpath.internal.operations.Variable;
import jdk.nashorn.internal.codegen.types.BooleanType;
import org.omg.CORBA.PUBLIC_MEMBER;
import javax.swing.text.html.HTMLDocument;
import java.io.Console;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


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

    public final  void  finalRes(final int a){
        System.out.println(a);
        System.out.println("我是一个普通块");
    }
    static {
        System.out.println("我是一个静态块");
    }
}
class TheOperator{
    public  void  BeyondInt(){
        int a=5;
        long b=4;
        int c=(int)(a+b);
        System.out.println("这里要表达的意思a为int类型,b为long类型时,计算的结果是long类型,类型向高位自动转换,所以需要强制转换为int类型 所以c的值为:"+c);
    }
    public  void  belowInt(){
        byte a=1;
        byte b=2;
        byte c=(byte) (a+b);
        int d=a+b;
        System.out.println("当两个整数类型相加的时候以int类型为区分,当有比int类型大的时候类型转换为long,当比int类型小的时候则按照默认的类型,就是int,所以整数类型相加向大看齐");
    }
    public  void  modulus(){
        int i=1;
        int j=++i + i++ + ++i + ++i + i++;
        System.out.println(j);
    }
    public  void  BMI(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入身高(m):");
        float height=scanner.nextFloat();
        System.out.println("请输入体重(kg):");
        float weight=scanner.nextFloat();
        double BMI=weight/(height*height);
        if (BMI<18.5){
            System.out.println("您的体重过轻:"+BMI);
        }else if(BMI>=18.5&&BMI<24){
            System.out.println("您的体重是正常范围:"+BMI);
        }else if (BMI>=24&&BMI<27){
            System.out.println("您的体重过重:"+BMI);
        }
        else if (BMI>=24&BMI<30){
            System.out.println("您的体重轻度肥胖:"+BMI);
        }
        else if (BMI>=30&&BMI<35){
            System.out.println("您的体重中度肥胖:"+BMI);
        }else{
            System.out.println("您的体重重度肥胖:"+BMI);
        }
        int years=scanner.nextInt();
        System.out.println("请输入年份:");
        if ((years%4==0&&years%100!=0)||(years%400==0)){
            System.out.println(years+"年是闰年");
        }else{
            System.out.println(years+"年不是闰年");
        }


    }
    public  void  LogicalOperationSymbol(){
        //& and  &&
        int a=2;
        //短路与
        System.out.println("&表示无论第一个运算是true或者false,第二个运算都会被执行"+(a==1&a++==2));
        System.out.println(a);
        //长路与
        int b=2;
        System.out.println("&&表示第一个运算为false就不需要第二个了,简单来说就是必须都为true"+(b==1&&b==2));
        System.out.println(b);

        boolean i=true;
        boolean j=false;
        //i与j的值不同返回true
        System.out.println(i^j);
        //i是true,j的非false即是true  所以是相同的  返回false
        System.out.println(i^!j);
    }
    public void Scanner(){
        Scanner s=new Scanner(System.in);
        float i=s.nextFloat();
        System.out.println("读取的浮点数是:"+i);
        //获取控制台的字符串
        String h=s.nextLine();
        String a=s.nextLine();
        System.out.println("读取的字符串是:"+a);

    }
    public  void  BreakFor(){
        boolean breakout=false;
        for (int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.println(i+":"+j);
                if (0==j%2){
                    breakout=true;
                    break;
                }
            }
            if (breakout){
                break;
            }
        }
    }
    /*
    *使用标签退出外部循环,
     */
    public void  BreakFor2(){
        outloop:
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.println(i+":"+j);
                if(0==j%2)
                    break outloop; //如果是双数，结束外部循环
            }
        }
    }
    public  void  Array(){
        int[] a=new int[5];
        for (int i=0;i<5;i++){
            a[i]=(int)(Math.random()*100);
        }
        int min=100;
        for (int t=0;t<a.length;t++){
            if (min>a[t]){
                min=a[t];
            }
        }
        for (int e=0;e<5;e++){
            System.out.println(a[e]);
        }
        System.out.println("最小值是:"+min);
           Arrays.sort(a);
        System.out.println("最小值是:"+a[0]);
    }
    public  void  ReverseArray(){
        int a[]=new int[10];
        for (int i=0;i<10;i++){
            a[i]=(int)(Math.random()*100);
            System.out.println(a[i]);
        }
        System.out.println("----------------");
        int q=a.length;
        for (int e=0;e<q/2;e++){
            //  1:为什么要除2,因为镜像反转是将首尾值都反转,所以会考虑到有中间值的情况
            //  2:首先将首尾值相加赋值给首或者尾  都可以,看个人习惯
            //  3:然后用总值减去尾值便是当前的尾值  这里已经开始替换了
            //  4:此时用总值减去尾值就是首值
            a[e]+=a[q-1-e];
            a[q-1-e]=a[e]-a[q-1-e];
            a[e]-=a[q-1-e];
        }
        for (int t=0;t<a.length;t++){
            System.out.println(a[t]);
        }
    }
}
class  ComprehensivePractice{

    /**
     * 黄金分割点
     */
    public void  GoldenMean(){

       for (int i=1;i<=20;i++){
           for (int j=20;j>=1;j--){
                if (i%2==0&&j%2==0){
                    continue;
                }else{
                   // double t=(j/i)>0.618f?(j/i-0.618f);
                }
           }
       }
    }
    /*
    *水仙花
     */
    public  void  Daffodils(){

    }

    public void  Strong(){
        int[] arr={-15,-20,-78,-12,-1,-26,-69};
        int[] drr={1,2,3,4,6,7,8,9,10,11,123,145,164};
        int[] crr=new int[(arr.length+drr.length)-1];
        System.arraycopy(arr,0,crr,0,arr.length);
        int t=crr.length-(crr.length-arr.length);
        System.arraycopy(drr,0,crr,t-1,drr.length);
        for (int e:crr){
            System.out.println(e);
        }
        //copy数组
       int[] er= Arrays.copyOfRange(arr,0,3);
        //转换为字符串





        int max=-1;
        for(int each:arr){
          if (each>max){
              max=each;
          }
        }
     System.out.println(max);
    }


}
class  SortingAlgorithm{
    /*
    *选择排序
    * 思路:  用第一个数与第二个比较,如果比第二个大则位置互换,如果比第二个小则不动,进行下一次的比较
     */
    public void   SelectionSort(){
        int[] arr={15,20,78,12,1,26,69};
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for (int e=0;e<arr.length;e++){
            System.out.println(arr[e]);
        }
    }
    /*
    *冒泡排序
    *
     */
    public void   BubbleSort(){
        int[] arr={15,20,78,12,1,26,69};
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int e=0;e<arr.length;e++){
            System.out.println(arr[e]);
        }
    }
}
