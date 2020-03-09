package CombateRPG;

public class Calculos {

    int poderFinalAtaqueEspada (int poderEspada, int ataqueAtacante) {return poderEspada*ataqueAtacante;}
    int poderFinalAtaqueArco (int poderArco, int ataqueAtacante) {return poderArco*ataqueAtacante;}
    int poderFinalAtaqueMagia (int poderMagia, int ataqueAtacante) {return poderMagia*ataqueAtacante;}
    int poderFinalAtaqueFe (int poderFe, int ataqueAtacante) {return poderFe*ataqueAtacante;}
    int danoFinal (int poderFinalAtaque, int defesaAlvo) {return poderFinalAtaque*defesaAlvo;}
}
