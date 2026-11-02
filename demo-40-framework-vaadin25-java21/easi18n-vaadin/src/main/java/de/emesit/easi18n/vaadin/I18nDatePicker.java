package de.emesit.easi18n.vaadin;

import java.util.List;

import com.vaadin.flow.component.datepicker.DatePicker;

public class I18nDatePicker extends DatePicker {
    private static final long serialVersionUID = 1L;
    
    private I18nVaadin i18nVaadin;
    DatePicker.DatePickerI18n datePickerI18n = new DatePicker.DatePickerI18n();

    public I18nDatePicker(I18nVaadin i18nVaadin) {
        this.i18nVaadin = i18nVaadin;
        
        updateI18n();
    }
    
    public void updateI18n() {
        List<String> monthNames = i18nVaadin.monthNames();
        if ( ! monthNames.isEmpty()) {
            datePickerI18n.setMonthNames(monthNames);
        }
        
        List<String> weekdays = i18nVaadin.weekdays();
        if ( ! weekdays.isEmpty()) {
            datePickerI18n.setWeekdays(weekdays);
        }
        
        List<String> weekdaysShort = i18nVaadin.weekdaysShort();
        if ( ! weekdaysShort.isEmpty()) {
            datePickerI18n.setWeekdaysShort(weekdaysShort);
        }
        
        String today = i18nVaadin.today();
        if ( ! today.isEmpty()) {
            datePickerI18n.setToday(today);
        }
        
        String cancel = i18nVaadin.cancel();
        if ( ! cancel.isEmpty()) {
            datePickerI18n.setCancel(cancel);
        }
        
        super.setI18n(datePickerI18n);
    }
}
