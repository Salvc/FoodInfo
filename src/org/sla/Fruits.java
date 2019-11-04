package org.sla;

class Fruits extends Food {

    private int potassium;
    private int fiber;
    private int protein;
    private int sugar;
    private int calcium;
    private int iron;

    private int vitaminA;
    private int vitaminC;

    public Fruits(String name, String servingSize, int calories,  int fat, int sodium, int carbs, int potassium, int fiber, int protein, int sugar, int calcium, int iron, int vitaminA, int vitaminC){

        super(name,servingSize,calories,fat,sodium,carbs);

        this.potassium = potassium;
        this.fiber = fiber;
        this.protein = protein;
        this.sugar = sugar;
        this.calcium = calcium;
        this.iron = iron;

        this.vitaminA = vitaminA;
        this.vitaminC = vitaminC;

    }

    public int getPotassium() {
        return potassium;
    }

    public void setPotassium(int potassium) {
        this.potassium = potassium;
    }

    public int getFiber() {
        return fiber;
    }

    public void setFiber(int fiber) {
        this.fiber = fiber;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getCalcium() {
        return calcium;
    }

    public void setCalcium(int calcium) {
        this.calcium = calcium;
    }

    public int getIron() {
        return iron;
    }

    public void setIron(int iron) {
        this.iron = iron;
    }

    public int getVitaminA() {
        return vitaminA;
    }

    public void setVitaminA(int vitaminA) {
        this.vitaminA = vitaminA;
    }

    public int getVitaminC() {
        return vitaminC;
    }

    public void setVitaminC(int vitaminC) {
        this.vitaminC = vitaminC;
    }
}
