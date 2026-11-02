package de.emesit.easi18n.vaadin;

import java.util.List;

import de.emesit.easi18n.annotation.TranslationBG;
import de.emesit.easi18n.annotation.TranslationCZ;
import de.emesit.easi18n.annotation.TranslationDE;
import de.emesit.easi18n.annotation.TranslationDK;
import de.emesit.easi18n.annotation.TranslationEE;
import de.emesit.easi18n.annotation.TranslationEN;
import de.emesit.easi18n.annotation.TranslationES;
import de.emesit.easi18n.annotation.TranslationFI;
import de.emesit.easi18n.annotation.TranslationGR;
import de.emesit.easi18n.annotation.TranslationHR;
import de.emesit.easi18n.annotation.TranslationHU;
import de.emesit.easi18n.annotation.TranslationIS;
import de.emesit.easi18n.annotation.TranslationIT;
import de.emesit.easi18n.annotation.TranslationLT;
import de.emesit.easi18n.annotation.TranslationLV;
import de.emesit.easi18n.annotation.TranslationNL;
import de.emesit.easi18n.annotation.TranslationNO;
import de.emesit.easi18n.annotation.TranslationPL;
import de.emesit.easi18n.annotation.TranslationPT;
import de.emesit.easi18n.annotation.TranslationRO;
import de.emesit.easi18n.annotation.TranslationRU;
import de.emesit.easi18n.annotation.TranslationSE;
import de.emesit.easi18n.annotation.TranslationSI;
import de.emesit.easi18n.annotation.TranslationSK;
import de.emesit.easi18n.annotation.TranslationTR;
import de.emesit.easi18n.annotation.TranslationUA;
import de.emesit.easi18n.annotation.TranslationZH;
import de.emesit.easi18n.internal.I18nBase;

public interface I18nVaadin extends I18nBase {
    /*
    private List<String> monthNames;
    private List<String> weekdays;
    private List<String> weekdaysShort;
    private List<String> dateFormats;
    private int firstDayOfWeek;
    private String today;
    private String cancel;
    private String dialogAccessibleName;
    private LocalDate referenceDate;
    private String badInputErrorMessage;
    private String requiredErrorMessage;
    private String minErrorMessage;
    private String maxErrorMessage;
    private String disabledDateErrorMessage;
*/
    
    @TranslationDE("Januar, Februar, März, April, Mai, Juni, Juli, August, September, Oktober, November, Dezember")
    @TranslationEN("January, February, March, April, May, June, July, August, September, October, November, December")
    @TranslationES("Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre, Diciembre")
    List<String> monthNames();

    @TranslationDE("Sonntag, Montag, Dienstag, Mittwoch, Donnerstag, Freitag, Samstag")
    @TranslationEN("Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday")
    @TranslationES("Domingo, Lunes, Martes, Miércoles, Jueves, Viernes, Sábado")
    List<String> weekdays();

    @TranslationDE("So, Mo, Di, Mi, Do, Fr, Sa")
    @TranslationEN("Su, Mo, Tu, We, Th, Fr, Sa")
    @TranslationES("Do, Lu, Ma, Mi, Ju, Vi, Sá")
    List<String> weekdaysShort();

    @TranslationDE("Heute")
    @TranslationEN("Today")
    @TranslationES("Hoy")
    String today();

    @TranslationDE("Abbrechen")
    @TranslationEN("Cancel")
    @TranslationES("Cancelar")
    String cancel();
    
    
    
    @TranslationDE("Sprache")
    @TranslationEN("Language")
    @TranslationES("Idioma")
    @TranslationIT("Lingua")
    @TranslationPT("Idioma")
    @TranslationPL("Język")
    @TranslationNL("Taal")
    @TranslationTR("Dil")
    @TranslationRU("Язык")
    @TranslationUA("Мова")
    @TranslationSE("Språk")
    @TranslationDK("Sprog")
    @TranslationNO("Språk")
    @TranslationFI("Kieli")
    @TranslationCZ("Jazyk")
    @TranslationSK("Jazyk")
    @TranslationHU("Nyelv")
    @TranslationRO("Limbă")
    @TranslationBG("Език")
    @TranslationHR("Jezik")
    @TranslationSI("Jezik")
    @TranslationGR("Γλώσσα")
    @TranslationEE("Keel")
    @TranslationLV("Valoda")
    @TranslationLT("Kalba")
    @TranslationIS("Tungumál")
    @TranslationZH("语言")
    String lblAppLanguage();
}
