package org.sla;

 class FastFoods extends Food{

     private int transFat;
     private int saturatedFat;
     private String chainName;
     private String foodType;

     public FastFoods(String name, String servingSize, int calories, int fat, int sodium, int carbs, int transFat, int saturatedFat, String chainName, String foodType){
         super(name,servingSize,calories,fat,sodium,carbs);

         this.transFat = transFat;
         this.saturatedFat = saturatedFat;
         this.chainName = chainName;
         this.foodType = foodType;

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

     public String getFoodType() {
         return foodType;
     }

     public void setFoodType(String foodType) {
         this.foodType = foodType;
     }
 }
