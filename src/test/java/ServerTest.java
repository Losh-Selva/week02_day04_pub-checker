import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ServerTest {

    Server server;
    Guest guest;
    Guest guestTwo;
    Guest guestThree;
    Guest guestFour;
    Guest guestFive;
    Guest guestSix;

    @BeforeEach
    public void setUp() {
        server = new Server();
        guest = new Guest("Kanye West", 10, 400_000_000, 70, '£', false, "Martini");
        guestTwo = new Guest("Taylor Swift", 45, 2, 70, '£', false, "Martini");
        guestThree = new Guest("Kim Kardashian", 45, 400_000_000, 20, '£', false, "Martini");
        guestFour = new Guest("Pete Davidson", 45, 4_000_000, 20, '$', false, "Martini");
        guestFive = new Guest("Jay Z", 45, 40_000_000, 70, '£', true, "Martini");
        guestSix = new Guest("Jay Z", 45, 40_000_000, 70, '£', true, "Pornstar Martini");
    }


    // TODO: test that guest can only get served if over 18
    @Test
    public void checkAge() {
        boolean result = server.canServeGuest(guest);
        assertThat(result).isEqualTo(false);

    }

    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)
    @Test
    public void checkWallet() {
        boolean result = server.canServeGuest(guestTwo);
        assertThat(result).isEqualTo(false);

    }

    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)
    @Test
    public void checkSobriety() {
        boolean result = server.canServeGuest(guestThree);
        assertThat(result).isEqualTo(false);

    }

    // TODO: test that guest can only get served if guest is not banned from the pub
    @Test
    public void checkBannedStatus() {
        boolean result = server.canServeGuest(guestFive);
        assertThat(result).isEqualTo(false);

    }

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)
    @Test
    public void checkCurrency() {
        boolean result = server.canServeGuest(guestFour);
        assertThat(result).isEqualTo(false);

    }

    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)

    @Test
    public void checkDrinks() {
        boolean result = server.canServeGuest(guestSix);
        assertThat(result).isEqualTo(false);


    }
}
