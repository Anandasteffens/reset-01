public class Calculo {
    double poderFinalAtaque (double poder, double ataque) {return poder * ataque;}

    double danoFinal (double poderFinalAtaque, double defesaAlvo) {return poderFinalAtaque-defesaAlvo;}

    double vidaFinal (double vida, double danoFinal) {return vida-danoFinal;}

    double manaFinal (double mana, double custoMana) {return mana-custoMana;}

    double feFinal (double fe, double custoFe) {return fe-custoFe;}
}
