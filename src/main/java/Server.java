import java.util.ArrayList;

public class Server {
    private ArrayList<String> drinks = new ArrayList<>();
   int height;
    public boolean canServeGuest(Guest guest){

        drinks.add("Pina Colada");
        drinks.add("Sex On The Beach");
        drinks.add("Strawberry Daquiri");
        drinks.add("Martini");


        if(guest.getAge() < 18 ){
            return false;
        }


        if (guest.getWallet() < 5){
            return false;
        }
        if (guest.getSobreity() < 50){
            return false;
        }
        if (guest.getCurrency() != '£'){
            return false;
        }
        if (guest.getBannedStatus() == true){
            return false;}
        for (int i =0; i< drinks.size(); i++){
            if (drinks.get(i) == guest.getFavouriteDrink()){
                return true;}
            else {
                return false;
            }
        }
        return true;

        }

    }

