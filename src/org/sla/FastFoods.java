package org.sla;
import java.util.ArrayList;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

class FastFoods extends Food{

    static private ArrayList<FastFoods> fastFoods;

     private int transFat;
     private int saturatedFat;
     private String chainName;

     public FastFoods(String name, String servingSize, int calories, int fat, int sodium, int carbs, int transFat, int saturatedFat, String chainName){
         super(name,servingSize,calories,fat,sodium,carbs);

         this.transFat = transFat;
         this.saturatedFat = saturatedFat;
         this.chainName = chainName;

     }

     public int getTransFat() {
         return transFat;
     }

     public void setTransFat(int transFat) {
         this.transFat = transFat;
     }

     public int getSaturatedFat() {
         return saturatedFat;
     }

     public void setSaturatedFat(int saturatedFat) {
         this.saturatedFat = saturatedFat;
     }

     public String getChainName() {
         return chainName;
     }

     public void setChainName(String chainName) {
         this.chainName = chainName;
     }



    static void readFastFoods(){
     if (fastFoods != null){
       return;
     }
    fastFoods = new ArrayList<FastFoods>();

     try {
         File FastFoodsDataFile = new File("res/FastFoods");
         Scanner scanner = new Scanner(FastFoodsDataFile);


         int ranking = 1;
         while (scanner.hasNextLine()) {
             String str = scanner.nextLine();
             Scanner lineScanner = new Scanner(str);
             lineScanner.useDelimiter("#");

             String chainName = lineScanner.next();
             String name = lineScanner.next();
             String servingSize = lineScanner.next();
             int calories = lineScanner.nextInt();
             int fat = (int)lineScanner.nextDouble();
             int saturatedFat = (int)lineScanner.nextDouble();

             int transFat = (int)lineScanner.nextDouble();
             int carbs = lineScanner.nextInt();
             int sodium = lineScanner.nextInt();

             FastFoods newFastFoods = new FastFoods(name,  servingSize,  calories,  fat,  sodium,
              carbs,  transFat,  saturatedFat,  chainName);
             fastFoods.add(newFastFoods);
         }
     } catch(Exception ex) {
             ex.printStackTrace();
     }

    }

    public String m(int a){

         if(a == -1){
             return ("Unknown");
         }else {
             return "" + a;
         }



    }

    public void describe() {
         System.out.println( this.getChainName() + " has the serving of " + this.getServingSize() +" " + this.getName() + " has " + m(this.getCalories()) + " calories, "
                 + m((int)this.getTotalFat()) + " grams of fat, and " + m(this.getCarbs()) + " grams of carbs. As well as, " +  m(this.getTransFat()) + " grams of trans fat and " + m(this.getSaturatedFat())
                 + " grams of saturated fat.");
    }

    static void describeFastFoods() {

    if (fastFoods == null) {
            readFastFoods();
        }

        for (int i = 0; i < fastFoods.size(); i++) {
            fastFoods.get(i).describe();
        }

    }






}