package com.eddie;


import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrewjeffrey on 17/06/15.
 */
public class LeadsTableModel extends AbstractTableModel {


    public enum HEADING {
        TIME("Time"),
        NAME("Name"),
        TOWNCITY("Town/City"),
        TEL_NO("Tel no."),
        TYPE("Type"),
        SOURCE("Source"),
        APPT("Appt"),
        COMMENTS("Comments"),
        M("M"),
        SE("S/E");

        private final String value;

        HEADING(final String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }


    private List<LiveChat> chatRows = new ArrayList<LiveChat>();

    @Override
    public String getColumnName(int column) {
        return HEADING.values()[column].toString();
    }

    @Override
    public int getRowCount() {
        return chatRows.size();
    }

    @Override
    public int getColumnCount() {
        return HEADING.values().length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        LiveChat chat = chatRows.get(rowIndex);
        HEADING heading =  HEADING.values()[columnIndex];

        switch (heading) {
            case NAME:
                return chat.getName();
            case TIME:
                return chat.getTime();
            case TOWNCITY:
                return chat.getTownCity();
            case TEL_NO:
                return chat.getTelephoneNumber();
            case TYPE:
                return chat.getType();
            case SOURCE:
                return chat.getSource();
            case APPT:
                return chat.getAppointment();
            case COMMENTS:
                return chat.getComments();
            case M:
                return chat.getM();
            case SE:
                return chat.getSe();
            default:
                throw new RuntimeException("No case found for heading");

        }
    }

    public List<LiveChat> getChatRows() {
        return chatRows;
    }

    public void setChatRows(List<LiveChat> chatRows) {
        this.chatRows = chatRows;
        this.fireTableDataChanged();
    }
}
