public class NumbersCat {
    public static String say ( long n){
        if (n < 0) {
            return "Menys " + say(-n).toLowerCase();
        }
        switch (Integer.parseInt(String.valueOf(n))) {
            case 0: return "Zero";
            case 1: return "Un";
            case 2: return "Dos";
            case 3: return "Tres";
            case 4: return "Quatre";
            case 5: return "Cinc";
            case 6: return "Sis";
            case 7: return "Set";
            case 8: return "Vuit";
            case 9: return "Nou";
            case 10: return "Deu";
            case 11: return "Onze";
            case 12: return "Dotze";
            case 13: return "Tretze";
            case 14: return "Catorze";
            case 15: return "Quinze";
            case 16: return "Setze";
            case 17: return "Disset";
            case 18: return "Divuit";
            case 19: return "Dinou";
            case 20: return "Vint";
            case 30: return "Trenta";
            case 40: return "Quaranta";
            case 50: return "Cinquanta";
            case 60: return"Seixanta";
            case 70: return "Setanta";
            case 80: return "Vuitanta";
            case 90: return "Noranta";
        }

        int unitat;
        int decena;
        int divisor;
        String xifra;
        String xifres;

        if (n > 20 && n < 100) {
            unitat = (int) n % 10;
            decena = 10 * ((int) n / 10);
            if (n < 30) {
                return say(decena) + "-i-" + say(unitat).toLowerCase();
            }
            return say(decena) + "-" + say(unitat).toLowerCase();
        }

        if (n >= 100 && n < 1_000) {
            divisor = 100;
            xifra = "Cent";
            xifres = "-cents";
            return calculaNombre(n, divisor, xifra, xifres);
        } else if (n > 999) {
            divisor = 1_000;
            xifra = "Mil";
            xifres = " mil";
            return calculaNombre(n, divisor, xifra, xifres);
        } else if (n > 9_999) {
            divisor = 10_000;
            xifra = "Mil";
            xifres = " mil";
            return calculaNombre(n, divisor, xifra, xifres);
        } else if (n > 99_999) {
            divisor = 100_000;
            xifra = "Mil";
            xifres = " mil";
            return calculaNombre(n, divisor, xifra, xifres);
        }
        return "";
    }
    private static String calculaNombre (long n, int divisor, String xifra, String xifres){
            String nombre;
            int centena = (int) (n / divisor);
            int resto = (int) (n % divisor);
            String espai = " ";

            if (centena == 1) {
                nombre = xifra;
            } else {
                nombre = say(centena) + xifres;
            }
            if (resto != 0) {
                nombre += espai + say(resto).toLowerCase();
            }
            return nombre;
        }
    }


