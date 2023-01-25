import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumbersCatTest {
    /*
    1. Zero
    2. Unitats
    3. Negatius
    4. Decenes
        4.1 30 - 99
        4.2 20 - 29
        4.3 10 - 19
     */

    @Test
    public void donat_0_retorna_Zero() {
        assertEquals("Zero", NumbersCat.say(0L));
    }

    @Test
    public void donat_1_retorna_Un() {
        assertEquals("Un", NumbersCat.say(1L));
    }

    @Test
    public void donat_2_retorna_Dos() {
        assertEquals("Dos", NumbersCat.say(2L));

    }

    @Test
    public void donat_9_retorna_Nou() {
        assertEquals("Nou", NumbersCat.say(9L));

    }

    @Test
    public void donat_menys_5_retorna_Menys_cinc() {
        assertEquals("Menys cinc", NumbersCat.say(-5L));

    }

    @Test
    public void donat_30_retorna_Trenta() {

        assertEquals("Trenta", NumbersCat.say(30L));
    }

    @Test
    public void donat_31_retorna_Trenta_un() {

        assertEquals("Trenta-un", NumbersCat.say(31L));
    }

    @Test
    public void donat_41_retorna_Quaranta_un() {

        assertEquals("Quaranta-un", NumbersCat.say(41L));
    }

    @Test
    public void donat_99_retorna_Noranta_nou() {

        assertEquals("Noranta-nou", NumbersCat.say(99L));
    }

    @Test
    public void donat_20_retorna_Vint() {

        assertEquals("Vint", NumbersCat.say(20L));
    }

    @Test
    public void donat_21_retorna_Vint_i_un() {

        assertEquals("Vint-i-un", NumbersCat.say(21L));
    }

    @Test
    public void donat_100_retorna_Cent() {

        assertEquals("Cent", NumbersCat.say(100L));
    }

    @Test
    public void donat_999_retorna_Nou_cents_noranta_nou() {
        assertEquals("Nou-cents noranta-nou", NumbersCat.say(999L));
    }

    @Test
    public void donat_1000_retorna_Mil() {
        assertEquals("Mil", NumbersCat.say(1000L));
    }

    @Test
    public void donat_1057_retorna_Mil_cinquanta_set() {
        assertEquals("Mil cinquanta-set", NumbersCat.say(1057L));
    }

    @Test
    public void donat_9999_retorna_Cinc_mil_nou() {
        assertEquals("Cinc mil nou", NumbersCat.say(5009L));
    }

    @Test
    public void donat_9999_retorna_Nou_mil_nou_cents_noranta_nou() {
        assertEquals("Nou mil nou-cents noranta-nou", NumbersCat.say(9_999L));
    }

    @Test
    public void donat_10_000_retorna_Deu_Mil() {
        assertEquals("Deu mil", NumbersCat.say(10_000L));
    }

    @Test
    public void donat_50_000_retorna_Cinquanta_Mil() {
        assertEquals("Cinquanta mil", NumbersCat.say(50_000L));
    }

    @Test
    public void donat_100_000_retorna_Cent_Mil() {
        assertEquals("Cent mil", NumbersCat.say(100_000L));
    }

    @Test
    public void donat_150_000_Cent_Cinquanta_Mil() {
        assertEquals("Cent cinquanta mil", NumbersCat.say(150_000L));
    }

    @Test
    public void donat_550_780_Cinc_Cents_cinquanta_mil_set_Cent_vuitanta_vuit() {
        assertEquals("Cinc-cents cinquanta mil set-cents vuitanta-vuit", NumbersCat.say(550_788L));
    }

    @Test
    public void donat_999_999_Nou_cents_noranta_nou_Mil_nou_Cent_noranta_nou() {
        assertEquals("Nou-cents noranta-nou mil nou-cents noranta-nou", NumbersCat.say(999_999L));
    }
}
