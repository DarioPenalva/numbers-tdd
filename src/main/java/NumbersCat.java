public class NumbersCat {
    /*
                                                            ⠀⠀⠀⠀⠀⠀⢀⣠⣤⣴⣶⣶⠿⠿⠿⠿⠿⠿⢶⣶⣦⣤⣄⡀⠀⠀⠀⠀⠀⠀
                                                            ⠀⠀⠀⢀⣴⣾⠿⠛⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠿⣷⣦⡀⠀⠀⠀
                                                            ⠀⢀⣴⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣦⡀⠀
                                                            ⢠⣿⠋⠀⠀Yes, I refactor even when  ⠙⣿⡄
                                                            ⣾⡏⠀⠀⠀it is fairly clear to       ⢸⣷
                                                            ⣿⡇⠀⠀⠀understand, so what?        ⢸⣿
                                                            ⠸⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⢠⣿⠇
                                                            ⠀⠙⢿⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⡿⠋⠀
                                                            ⠀⠀⠀⠙⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣶⠿⠋⠀⠀⠀
                                                            ⠀⠀⠀⢰⣿⠀⠀⠀⠀⠀⢀⣶⣦⣤⣤⣤⣤⣴⣶⣶⠿⠿⠛⠉⠀⠀⠀⠀⠀⠀
                                                            ⠀⠀⣠⣿⠃⠀⢀⣠⣤⣾⠟⠋⠈⠉⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                                                            ⠀⠀⢿⣷⡾⠿⠟⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⡦⠤⣤⣤⣤⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣾⡿⢧⡵⠚⡛⠛⢶⡞⠮⣝⠲⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⡿⢟⡴⣿⡿⠿⣿⡿⡼⣷⣭⣳⡳⣌⠹⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⡿⢁⣿⣴⡿⢟⣿⡳⣿⣿⣦⣠⡿⣻⣿⠀⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⡟⢡⣾⢃⣟⣤⣿⣿⠉⠛⠻⠿⠧⣿⣿⣿⣷⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢾⣷⣿⣿⣿⡾⢋⣼⠃⠀⠀⠀⡇⠀⠀⠀⢸⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣾⣷⠏⠁⣠⠤⠤⣄⣇⠀⢀⠀⢘⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⣿⣿⠇⠀⠘⠿⣿⣿⣷⣾⠇⠘⣶⣶⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⢿⣧⣽⣿⠀⠀⣀⠀⠀⠀⢸⣿⠀⠹⠿⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣦⣦⣯⡿⢷⣄⣿⠀⠀⢠⣾⣿⣿⡆⠀⣣⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⢯⣼⣰⣿⢿⣷⣾⣿⣿⡋⣥⣃⣰⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠿⣛⡳⢿⣼⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⠀⣀⣀⣀⣤⣴⣶⣶⣶⣶⣤⣾⣿⡇⠈⠻⣿⣿⣹⢿⣿⠇⡐⠲⠮⣽⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⣀⣤⣶⣿⣿⣿⣿⢿⣿⣿⣿⣻⣿⣿⣯⣽⣿⣿⣿⠿⠛⢿⣿⠃⠀⠀⢻⣿⣿⣾⣿⣇⢳⡖⣧⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⢀⣼⣿⣿⠟⠿⣿⣿⣿⣿⡿⠿⢿⣯⣿⣟⣿⣿⣿⣿⠁⠀⠀⠀⣿⡆⠀⠀⠀⣿⡟⠉⠉⠟⠛⠊⠯⢯⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⢠⣾⣿⠟⠁⠀⣾⣿⠋⠀⠀⠀⠀⠀⠀⠉⠙⠻⢿⣿⣿⣇⠀⠀⠀⢸⡇⠀⠀⣸⡟⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⢀⣿⣟⠁⠀⠀⢲⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⣿⣖⠀⠀⠀⣿⡄⣰⣿⠁⠀⢀⣤⠶⣂⡶⠀⠀⠀⠀⠈⠳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⣼⣿⠀⠀⠀⠀⠀⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣄⣀⣰⣿⣿⣿⠁⢀⡴⣟⣁⣴⣿⣡⠤⢤⣀⠀⠀⠀⠘⢆⠀⠀⠀⠀⠀⠀⠀⠀
⠻⣿⣆⠀⠀⠀⠀⠏⢿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⠿⠟⠛⠋⠀⠀⠀⠀⠈⠳⢄⠀⠀⠀⠙⠢⣄⠀⠀⠀⠀⠀
⠀⠹⣿⡀⠀⠀⠀⠠⢈⣻⣦⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⣄⠀⠀⠀⠈⢣⡀⠀⠀⠀
⠀⠀⢸⣷⠀⠀⠀⣖⣾⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⡀⠀⠀⠀⠳⡄⠀⠀
⠀⠀⢸⡿⠃⡆⣶⣿⡿⢉⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢧⠀⠀⠀⠀⢹⡀⠀
⣀⣴⠟⠁⠀⢗⣾⣿⠁⢺⢸⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⠀⠀⠀⠀⠀⡇⠀
⡏⠀⠀⢠⣶⠟⠉⢿⣤⣋⣿⣗⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡏⠀⠀⠀⠀⢀⡇⠀
⣅⣀⣾⡿⠋⠀⠀⠀⢻⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⢠⠀⠀⢸⠃⠀⠀⠀⠀⡼⠀⠀
⠿⠛⠉⠀⠀⠀⠀⠀⠀⠻⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⣴⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠟⢹⣶⡟⠀⠀⠈⠶⣄⠀⠀⢰⠃⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⢿⣿⣿⣷⣶⣤⣤⣾⣿⣿⣿⣿⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠞⢁⣴⣿⣿⡇⠀⠀⠀⠀⠈⣦⠀⠈⢧⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣆⠙⠻⣿⣾⣿⣿⣿⣿⣿⣿⢷⣽⣿⣦⣄⡀⠀⠀⠀⠀⢀⠞⠁⣴⡾⣿⠏⣿⠀⠀⠀⠀⠀⠀⠘⣇⠀⠀⣧⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣟⢿⣦⣴⣿⠿⠛⠛⠛⠻⣿⡿⠿⠿⠿⣿⣿⣿⣷⣶⣤⣤⣯⣴⢿⡏⢹⡏⠀⢿⡇⠀⠀⠀⠀⠀⠀⡼⠀⠀⢹⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡀⢹⣿⢁⣠⣤⣄⡀⠀⣿⠀⠀⠀⠀⠈⠙⢿⣿⡛⠛⢉⣩⠞⠉⢀⣼⡇⠀⠀⣿⡀⠀⠀⠀⠀⡼⠁⠀⢀⣾⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣯⠳⢼⡿⠋⠉⠉⠉⠛⢷⣿⡶⠿⣶⣤⣤⣤⣾⣿⡅⠀⠟⠁⡰⢶⠃⠸⣿⣀⣀⣻⣧⠀⠀⠀⣴⠃⠀⠀⢰⠃⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⢿⣆⢸⡇⠀⠀⠀⠀⠀⣨⣿⠁⠀⠀⠀⠀⠀⠀⠘⡇⠀⣴⠋⣠⢼⠀⠀⠹⣿⣿⡀⠻⣦⡀⠀⠻⡄⠀⠀⠈⢳⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⡀⠻⣦⣿⣿⡷⠶⠾⠿⣻⣿⠛⠛⠒⠶⠶⠶⠶⢾⡇⠀⡤⠞⠁⡼⠀⠀⠀⢹⣿⣷⠾⣿⣿⠀⠀⢹⡄⠀⠀⣈⡇
    */

    public static String say (long n){
        long divisor;
        String xifra;
        String xifres;

        if (n < 0) {
            return "Menys " + say(-n).toLowerCase();
        }
        if (n >= 0 && n <= 90) {
            String numero = trobaNumeroBaix(n);
            if (!numero.equals("")) return numero;
        }

        if (n > 20 && n < 100) {
            long unitat = n % 10;
            long desena = 10 * (n / 10);
            if (n < 30) {
                return say(desena) + "-i-" + say(unitat).toLowerCase();
            }
            return say(desena) + "-" + say(unitat).toLowerCase();
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

    private static String trobaNumeroBaix(long n) {
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
            case 60: return "Seixanta";
            case 70: return "Setanta";
            case 80: return "Vuitanta";
            case 90: return "Noranta";
        }
        return "";
    }

    private static String calculaNombre (long n, long divisor, String xifra, String xifres){
            String nombre;
            long centena = n / divisor;
            long resto = n % divisor;

            if (centena == 1) {
                nombre = xifra;
            } else {
                nombre = say(centena) + xifres;
            }
            if (resto != 0) {
                nombre += " " + say(resto).toLowerCase();
            }
            return nombre;
        }
    }


