package xingyunchoujiang;

import java.util.Scanner;
import java.util.regex.MatchResult;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class Lucky {
  static String[] user = new String[7];                                  //定义数组，奇数存用户名。偶数存密码
  private static String username, password;                              //用户名，密码
  private static int m = 1, z = 0;

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n;                                                             //case
      String op;
      while (true) {
      
      System.out.println("******欢迎进入幸运大富翁抽奖******");
      System.out.println("*         1.注册                                             ");
      System.out.println("*         2.登陆                                             ");
      System.out.println("*         3.抽奖                                             ");

      n = input.nextInt();
      switch (n) {
      case 1:
        zhuCe();
        break;

      case 2:
        dengLu();
        break;
      case 3:
        chouJiang();
        break;
      default:
        System.out.println("输入错误，请重试！");
        break;

      }
      System.out.println("继续么？（y/n）");
      op = input.next();
      if (op == "n")
        break;
      }
    }
  public static void zhuCe() {
        
    System.out.println("请填写个人注册信息：");
    System.out.print("用户名:");
    Scanner input = new Scanner(System.in);
    username = input.next();
    System.out.print("密码:");
    password = input.next();
    if (z <6) {
    
        z = m * 2;                                                        //z表示数组下标
        
  
      user[z] = password;
      user[(z - 1)] = username;
      int randum = (int) (Math.random() * 10);                                 //随机数产生会员卡号
      System.out.print("您的会员卡号是：");
      System.out.println(randum);
      m=m+1; 
    } else
      System.out.println("名额已满，无法注册");

    
                                                                      //每存一个，m加1.z加2
  }

  public static void dengLu() {
    System.out.println("请输入用户名和密码：");
    System.out.print("用户名：");
    Scanner input = new Scanner(System.in);
    username = input.next();
    System.out.print("请输入密码：");
    password = input.next();
    loop:for (m = 1; m <= 3; m++) {
      z = m * 2;
      
      int q = 0;
          for (q = 0; q < 2; q++) {                                             //输错三次。程序停止
        if (username.equals(user[z-1])) {                                   
          if (password.equals(user[(z)])){
            System.out.println("欢迎您，尊敬的用户");
            break loop ;
            
            }
          else
            System.out.println("密码错误，请重试");
          break ;
        }
        System.out.println("用户未注册，请先注册");
        break;
      }
      
    }
    //input.close();
  }

  public static void chouJiang() {
    int num = 0, l = 0;
    int array[];
    array = new int[5];                                                      //定义数组保存今日幸运数字
    System.out.print("请输入您的卡号：");
    Scanner input1 = new Scanner(System.in);
    num = input1.nextInt();
    for (l = 0; l < 5; l++) 
      array[l] = (int) (Math.random() * 10);                                  
    for (l = 0; l < 5; l++)                                                   //循环比对会员卡号与幸运数字
    if (num == array[l]) 
    System.out.println("恭喜您，获得大奖！");
    System.out.println("很遗憾，您没有中奖，请下次再试。");
    System.out.println("今日的幸运数字是:");
    for (l = 0; l < 5; l++) 
      System.out.println(array[l]);}}