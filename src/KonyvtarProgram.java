public class KonyvtarProgram {

    public static void main(String[] args) {
        Konyvtar konyvtar = new Konyvtar();

        // Könyvek létrehozása és hozzáadása a könyvtárhoz
        Konyv konyv1 = new Konyv("A Gyűrűk Ura", 1954, "Fantasy", 3);
        konyv1.hozzaadIro("J.R.R. Tolkien");
        konyvtar.konyvetHozzaad(konyv1);

        Konyv konyv2 = new Konyv("Háború és béke", 1869, "Történelmi regény", 4);
        konyv2.hozzaadIro("Lev Tolsztoj");
        konyvtar.konyvetHozzaad(konyv2);

        // Olvasók létrehozása és hozzáadása a könyvtárhoz
        Olvaso olvaso1 = new Olvaso("Géza", 12345);
        olvaso1.hozzaadPreferaltMufaj("Fantasy");
        olvaso1.hozzaadPreferaltMufaj("Sci-fi");
        konyvtar.olvasotHozzaad(olvaso1);

        Olvaso olvaso2 = new Olvaso("Klára", 54321);
        olvaso2.hozzaadPreferaltMufaj("Romantikus");
        olvaso2.hozzaadPreferaltMufaj("Dráma");
        konyvtar.olvasotHozzaad(olvaso2);

        // az olvasók preferált műfajai
        System.out.println("Olvasók preferált műfajai:");
        for (Olvaso olvaso : konyvtar.getOlvasok()) {
            System.out.println(olvaso.getNev() + " : " + olvaso.getPreferaltMufajok());
        }

        // olvasók konyveket kölcsönöznek
        olvaso1.kolcsonozKonyvet(konyv1, konyvtar);
        olvaso1.kolcsonozKonyvet(konyv2, konyvtar);

        // Kiírjuk az olvasók kölcsönzött könyveit és a könyvek példányszámát
        System.out.println("Olvasók kölcsönzött könyvei és a könyvek példányszáma:");
        for (Olvaso olvaso : konyvtar.getOlvasok()) {
            System.out.print(olvaso.getNev() + ": ");
            for (Konyv kolcsonzottKonyv : olvaso.getKolcsonzottKonyvek()) {
                System.out.print(kolcsonzottKonyv.getCim() + " ,");
            }
            System.out.println();
        }
        System.out.println("Könyvek példányszáma:");
        for (Konyv konyv : konyvtar.getKonyvek()) {
            System.out.println(konyv.getCim() + ": " + konyv.getPeldanyszam());
        }




    }
}


