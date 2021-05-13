package daily.Study;

import java.util.HashSet;
import java.util.Random;
//import java.util.Scanner;

/**
 * program: New_work
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Jgaivna
 * Date:2021-05-12 22
 * Time:20
 */
public class Suij {
    public static void main(String[] args) {
        String[] name ={
                 "曾汕彬","何玉","罗贤凯","张奕","阮梦"
                ,"方莹洁","曾子涵","梅嘉炜","张虎诚","余崇武"
                ,"徐鸿起","刘芬","黄建军","林自怡","邹献振"
                ,"吴家峻","宁萍兰","吴梦雪","卢志伟","甘毛毛"
                ,"杨兴晨","涂逸晖","管彩虹","黄岩奇","涂丽婷"
                ,"吴英枰","吴斌","邹舒蕊","方胜","邓少聪"
                ,"项康乐","邹子轩","李远道","余星霖","卢文祥"
                ,"邹鹏","卢小燕","杨晨雨","罗武","任佳"
                ,"肖海军","孙其光","彭兰骏","周坤","刘泰瑜 "
                ,"杨瑞","洪维怡","周欣悦","李建民","胥熊辉"
                ,"魏百川","罗琪","黄靖海","邹自添","邓雨婷"
                ,"洪虹","洪婷婷","邹华翼","熊吴友","伍豪辉"
                ,"熊德康","邱思思","黄海英","陈赖琪","廖婵"
                ,"黄为建"};
        int[] e ={99,100,101,102,103};
        Random r =new Random();
        int k=People();
        if (k==0){
            System.exit(0);
        }
            System.out.println("这次抽到的人分别是");
        do {
            for (int i = 0; i < k; i++) {
                int n = r.nextInt(65);
                e[i] = n;
            }
        } while (!cheakIsRepeat(e));
        for (int i = 0; i < 3; i++) {
            System.out.println(name[e[i]]);
        }

        /* for (int i = 0; i < 66; i++) {
            System.out.println(name[i]);
        }//遍历所有人的名字
        */
    }
    public static int People(){
        //Scanner s=new Scanner(System.in);
        //System.out.println("要抽几个人？");
        int a=0;
        try {
        //    a = s.nextInt();
            a=3;
        }catch (Throwable InputMismatchException){
            System.out.println("不要带小数点啊QAQ");
        }
        return a;
    }
    public static boolean cheakIsRepeat(int[] array) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            hashSet.add(array[i]);
        }
        return hashSet.size() == array.length;
    }
}
