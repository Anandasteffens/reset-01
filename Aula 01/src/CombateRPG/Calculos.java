package CombateRPG;


public class Calculos {

    int poderFinalAtaque (int poder, int ataque) {return poder * ataque;}

    int danoFinal (int poderFinalAtaque, int defesaAlvo) {return poderFinalAtaque-defesaAlvo;}

    int vidaFinal (int vida, int danoFinal) {return vida-danoFinal;}

    int manaFinal (int mana, int custoMana) {return mana-custoMana;}

    int feFinal (int fe, int custoFe) {return fe-custoFe;}

}



