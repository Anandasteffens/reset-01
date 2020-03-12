package CombateRPG;


public class Calculos {
/*
    int poderFinalAtaqueEspada (int poderEspada, int ataqueAtacante) {return poderEspada*ataqueAtacante;}
    int poderFinalAtaqueMartelo (int poderMartelo, int ataqueAtacante) {return poderMartelo*ataqueAtacante;}
    int poderFinalAtaqueMagia (int poderMagia, int ataqueAtacante) {return poderMagia*ataqueAtacante;}
    int poderFinalAtaqueFe (int poderFe, int ataqueAtacante) {return poderFe*ataqueAtacante;}
    int danoFinal (int poderFinalAtaque, int defesaAlvo) {return poderFinalAtaque*defesaAlvo;}
    */

    int poderFinalAtaque (int poder, int ataque) {return poder * ataque;}

    int danoFinal (int poderFinalAtaque, int defesaAlvo) {return poderFinalAtaque-defesaAlvo;}

    int vidaFinal (int vida, int danoFinal) {return vida-danoFinal;}

    int manaFinal (int mana, int custoMana) {return mana-custoMana;}

    int feFinal (int fe, int custoFe) {return fe-custoFe;}

}



