public class Simulacao {

    public static void main(String[] args) {

        /*
        * Heróis:
         *   Ramza Beoulve é um guerreiro e usa uma espada longa
         *   Ovelia Beoulve é uma clériga e usa arma espiritual e lâmina flamejante
         *   Lugaid Vandroiy é um druida e usa relâmpagos
         * Vilões:
         *   Dycedarg Beoulve é um feiticeiro e usa míssel mágico e raio congelante
         *   Goffard Gaffgarion é um mago e usa bola de fogo
         *   Wiegraf Folles é um bárbaro e usa um machado
        * Roteiro:
        *   Dycedarg ataca Ramza com um míssel mágico
        *   Ovelia ataca Dycedarg com sua arma espiritual
        *   Vandroy ataca os 3 vilões com relâmpagos
        *   Gaffgarion ataca os 3 heróis com uma bola de fogo
        *   Wiegraf ataca Ovelia com seu machado
        *   Ramza faz 2 ataques rápidos contra Wiegraf
        *   Dycedarg ataca Ramza com raio congelante
        *   Ovelia ataca Wiegraf com lâmina flamejante
        *   Vandroy ataca os 3 vilões com relâmpagos
        *   Ramza faz 2 ataques rápidos contra Wiegraf
        * */

        Arma espadaLonga = new Arma("Espada Longa", 12);
        Arma machadoGuerra = new Arma("Machado de Guerra", 20);

        Magia misselMagico = new Magia("Míssel Mágico", 10, 1);
        Magia raioCongelante = new Magia("Raio Congelante", 15, 2);
        Magia bolaFogo = new Magia("Bola de Fogo", 15, 3);

        PoderDivino armaEspiritual = new PoderDivino("Arma Espiritual", 5, 1);
        PoderDivino relampagos = new PoderDivino("Relâmpagos", 25, 5);
        PoderDivino laminaFlamejante = new PoderDivino("Lâmina Flamejante", 30, 3);

        // heróis
        Guerreiro ramza = new Guerreiro("Ramza", 100, 1.5, 15);
        Clerigo ovelia = new Clerigo("Ovelia", 35, 4.5, 0, 100);
        Druida vandroy = new Druida("Vandroy", 75, 2.5, 5, 50);

        // vilões
        Feiticeiro dycedarg = new Feiticeiro("Dycedarg", 55, 3.0, 3, 150);
        Mago gaffgarion = new Mago("Gaffgarion", 50, 2.5, 2, 50);
        Barbaro wiegraf = new Barbaro("Wiegraf", 150, 2.5, 2);

        // combate
        dycedarg.atacar(ramza, misselMagico);
        ovelia.atacar(dycedarg, armaEspiritual);
        vandroy.atacar(dycedarg, relampagos);
        vandroy.atacar(gaffgarion, relampagos);
        vandroy.atacar(wiegraf, relampagos);
        gaffgarion.atacar(ramza, bolaFogo);
        gaffgarion.atacar(ovelia, bolaFogo);
        gaffgarion.atacar(vandroy, bolaFogo);
        wiegraf.atacar(ovelia, machadoGuerra);
        ramza.atacar(wiegraf, espadaLonga);
        ramza.atacar(wiegraf, espadaLonga);
        dycedarg.atacar(ramza, raioCongelante);
        ovelia.atacar(wiegraf, laminaFlamejante);
        vandroy.atacar(dycedarg, relampagos);
        vandroy.atacar(gaffgarion, relampagos);
        vandroy.atacar(wiegraf, relampagos);
        ramza.atacar(wiegraf, espadaLonga);
        ramza.atacar(wiegraf, espadaLonga);

        ramza.imprimirEstado();
        ovelia.imprimirEstado();
        vandroy.imprimirEstado();
        dycedarg.imprimirEstado();
        gaffgarion.imprimirEstado();
        wiegraf.imprimirEstado();
    }
}
