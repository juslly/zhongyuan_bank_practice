package com.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List bestCharge(){

        List<String> inputs = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        String strInput = in.nextLine();
        String[] strTranslator = strInput.trim().split(",");
        int i = strTranslator.length;
        int j =0;

        while((i - j) > 0){
            inputs.add(strTranslator[j]);
            j++;
        }
        return inputs;
    }

    public static float sale(float sumPrice){

        if (sumPrice >= 30) {
            sumPrice = sumPrice - 6;
        }
        return sumPrice;
    }
    public static class Adder {
        public double add(int a, double b) {
            return a + b;
        }

        public double add(double a, int b) {
            return a + b;
        }
    }
    public static void main(String[] args) {

        Adder a = new Adder();
        double d = a.add(2.0, 3);
        System.out.println(d);

    }
//
//	  Food item1 = new Food("ITEM0001","黄焖鸡",23);
//	  Food item2 = new Food("ITEM0002","肉夹馍",6);
//	  Food item3 = new Food("ITEM0003","凉皮",10);
//	  Food item4 = new Food("ITEM0004","炒面",16);
//      Food item5 = new Food("ITEM0005","米线",20);
//
//      List<String> getInput = new ArrayList<String>();
//      getInput = bestCharge();
//      StringBuffer buf = new StringBuffer();
//
//      System.out.println("============= 订餐明细 =============");
//      float sum = 0;
//      float sumSale1 = 0;
//        for (String item:getInput
//             ) {
//            float price = 0;
//            float salePrice = 0;
//            String food = (item.split(" x ")[0]).substring(1);
//            String num = (item.split(" x ")[1]);
//            num = num.substring(0,num.length()-1);
//            int number = Integer.parseInt(num);
//
//            if (food.equals(item1.getItemId())) {
//                price = item1.getItemprice();
//                salePrice = price / 2;
//                buf.append(item1.getItemName());
//                System.out.println(item1.getItemName()+ "*"+ num +"="+ (price * number));
//            }else if (food.equals(item2.getItemId())) {
//                price = item2.getItemprice();
//                salePrice = price;
//                System.out.println(item2.getItemName()+ "*"+ num +"="+ (price * number));
//            }else if (food.equals(item3.getItemId())) {
//                price = item3.getItemprice();
//                salePrice = price / 2;
//                buf.append(item3.getItemName());
//                System.out.println(item3.getItemName()+ "*"+ num +"="+ (price * number));
//            }else if (food.equals(item4.getItemId())) {
//                price = item4.getItemprice();
//                salePrice = price;
//                System.out.println(item4.getItemName()+ "*"+ num +"="+ (price * number));
//            }else if (food.equals(item5.getItemId())) {
//                price = item5.getItemprice();
//                salePrice = price;
//                System.out.println(item5.getItemName()+ "*"+ num +"="+ (price * number));
//            }
//
//            System.out.println();
//
//            sum = sum + price * number;
//            sumSale1 = sumSale1 +salePrice * number;
//
//
//        }
//
//        float sumSale2 = sale(sum);
//
//
//        System.out.println("-------------------------------");
//
//        if (sumSale1 > sumSale2) {
//
//            System.out.println("使用优惠:\n"+"满30减6,省" + (sum - sumSale2)+"元\n"+"------------------------------\n"
//            +"总计："+ sumSale2 + "元");
//
//        } else {
//            if (buf.length() > 0) {
//
//                System.out.println("使用优惠:\n"+"指定菜品半价("+ buf +"),省" + (sum - sumSale1)+"元\n"+"------------------------------\n"
//                        +"总计："+ sumSale1 + "元");
//            }else {
//                System.out.println("总计："+ sumSale1 + "元");
//            }
//
//        }
//
//
//    }
}
