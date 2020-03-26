package gerenciadorregras;

import acervobd.AcervoUsuario;
import dominioclasses.Usuario;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class RegrasUsuario {
    private AcervoUsuario acervo = new AcervoUsuario();

    public Usuario cadastrar(Usuario usuario) {
        List<Usuario> usuarios = acervo.listar();
        for (Usuario usuarioExiste : usuarios) {
            if (usuario.getNome().equals(usuarioExiste.getNome())) {
                return usuarioExiste;
            }
            if (usuario.getEmail().equals(usuarioExiste.getEmail())) {
                return usuarioExiste;
            }
        }
        return acervo.cadastrar(usuario);
    }


    public List<Usuario> listar (){
        return acervo.listar();
    }

    public Usuario pesquisar (int id){
        if (id >0 ){
            return acervo.pesquisar(id);
        }
        return null;
    }

    public boolean deletar (int id){
        if (id >0){
            return acervo.deletar(id);
        }
        return false;
    }

    public boolean editar (int id, Usuario usuario){
        if (id>0) {
            return acervo.editar(id, usuario);
        }
        return false;
    }

}

//    public static boolean confirmarData (Usuario dataNascimento, int minimumAge){
//        LocalDate today = LocalDate.now();
//        LocalDate aniver = LocalDate.of(dataNascimento);
//
//        };
//    }
//}
//
//

//    LocalDate today = LocalDate.now();
//    LocalDate birthday = LocalDate.of(1960, Month.JANUARY, 1);
//
//    Period p = Period.between(birthday, today);
//    long p2 = ChronoUnit.DAYS.between(birthday, today);
//System.out.println("You are " + p.getYears() + " years, " + p.getMonths() +
//        " months, and " + p.getDays() +
//        " days old. (" + p2 + " days total)");

//    public static void main(String[] args) {
//        DateTime test = new DateTime().minusYears(1).plusDays(1);
//        System.out.println(isUser18Older(test, 1));
//    }
//
//    public static boolean isUser18Older (DateTime dataNascimento, int minimumAge){
//        DateTime minAge = new DateTime();
//        Days days = Days.daysBetween(userDob, minAge.minusYears(minimumAge));
//
//        return days.getDays()>=0 ;
//    }