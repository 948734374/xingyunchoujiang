package xingyunchoujiang;

import java.util.Scanner;
import java.util.regex.MatchResult;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class Lucky {
  static String[] user = new String[7];                                  //�������飬�������û�����ż��������
  private static String username, password;                              //�û���������
  private static int m = 1, z = 0;

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n;                                                             //case
      String op;
      while (true) {
      
      System.out.println("******��ӭ�������˴��̳齱******");
      System.out.println("*         1.ע��                                             ");
      System.out.println("*         2.��½                                             ");
      System.out.println("*         3.�齱                                             ");

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
        System.out.println("������������ԣ�");
        break;

      }
      System.out.println("����ô����y/n��");
      op = input.next();
      if (op == "n")
        break;
      }
    }
  public static void zhuCe() {
        
    System.out.println("����д����ע����Ϣ��");
    System.out.print("�û���:");
    Scanner input = new Scanner(System.in);
    username = input.next();
    System.out.print("����:");
    password = input.next();
    if (z <6) {
    
        z = m * 2;                                                        //z��ʾ�����±�
        
  
      user[z] = password;
      user[(z - 1)] = username;
      int randum = (int) (Math.random() * 10);                                 //�����������Ա����
      System.out.print("���Ļ�Ա�����ǣ�");
      System.out.println(randum);
      m=m+1; 
    } else
      System.out.println("�����������޷�ע��");

    
                                                                      //ÿ��һ����m��1.z��2
  }

  public static void dengLu() {
    System.out.println("�������û��������룺");
    System.out.print("�û�����");
    Scanner input = new Scanner(System.in);
    username = input.next();
    System.out.print("���������룺");
    password = input.next();
    loop:for (m = 1; m <= 3; m++) {
      z = m * 2;
      
      int q = 0;
          for (q = 0; q < 2; q++) {                                             //������Ρ�����ֹͣ
        if (username.equals(user[z-1])) {                                   
          if (password.equals(user[(z)])){
            System.out.println("��ӭ�����𾴵��û�");
            break loop ;
            
            }
          else
            System.out.println("�������������");
          break ;
        }
        System.out.println("�û�δע�ᣬ����ע��");
        break;
      }
      
    }
    //input.close();
  }

  public static void chouJiang() {
    int num = 0, l = 0;
    int array[];
    array = new int[5];                                                      //�������鱣�������������
    System.out.print("���������Ŀ��ţ�");
    Scanner input1 = new Scanner(System.in);
    num = input1.nextInt();
    for (l = 0; l < 5; l++) 
      array[l] = (int) (Math.random() * 10);                                  
    for (l = 0; l < 5; l++)                                                   //ѭ���ȶԻ�Ա��������������
    if (num == array[l]) 
    System.out.println("��ϲ������ô󽱣�");
    System.out.println("���ź�����û���н������´����ԡ�");
    System.out.println("���յ�����������:");
    for (l = 0; l < 5; l++) 
      System.out.println(array[l]);}}