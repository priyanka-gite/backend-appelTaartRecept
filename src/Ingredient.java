public class Ingredient {
    private String name;
    private int amount;
    private String unit;

    public Ingredient() {
    }
    public Ingredient(String name, int amount, String unit) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
    }
    public String getName(){
        return this.name;
    }
    public int getAmount(){
        return this.amount;
    }
    public String getUnit(){
        return this.unit;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public void setUnit(String unit){
        this.unit =unit;
    }
}

