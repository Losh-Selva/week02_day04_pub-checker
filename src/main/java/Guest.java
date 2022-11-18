public class Guest {

    private String name;
    private int age;
    private double wallet;
    private Integer sobreity;
    private char currency;
    private boolean bannedStatus;
    private String favouriteDrink;


    public Guest(String name, int age, double wallet,Integer sobreity, char currency, boolean bannedStatus, String favouriteDrink ){
        this.name = name;
        this.age = age;
        this.wallet = wallet;
        this.sobreity = sobreity;
        this.currency = currency;
        this.bannedStatus = bannedStatus;
        this.favouriteDrink = favouriteDrink;
    }
    //    GETTERS & SETTERS
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public double getWallet() {
        return wallet;
    }
    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
    public Integer getSobreity(){
        return sobreity;
    }
    public void setSobreity(Integer sobreity) {
        this.sobreity = sobreity;
    }
    public char getCurrency(){
        return currency;
    }
    public void setCurrency(char currency){
        this.currency = currency;
    }

    public boolean getBannedStatus(){
        return bannedStatus;
    }
    public void setBannedStatus(boolean bannedStatus){
        this.bannedStatus = bannedStatus;
    }
    public String getFavouriteDrink(){
        return favouriteDrink;
    }
    public void setFavouriteDrink(String favouriteDrink){
        this.favouriteDrink = favouriteDrink;
    }
}
