public class Practise {
    public static void main(String[] args) {
        Server two = new Server();
        Guest one = new Guest("Kanye West", 45, 400_000_000, 70, '£', false, "Pino Colada");


        System.out.println(two.canServeGuest(one));

    }
}
