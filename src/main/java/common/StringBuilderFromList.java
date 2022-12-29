package common;

import repository.applyTools.MusicModelRow;

import java.util.List;

public class StringBuilderFromList {

    public String stringTransformerTableRows(List<MusicModelRow> tableRows) {
        StringBuilder tableRowsString = new java.lang.StringBuilder();
        for (int i = 0; i < tableRows.size(); i++) {
            if (i < 9) {
                tableRowsString.append(tableRows.get(i).toString()).append('\n');
            }
            if (i == 9) {
                tableRowsString.append(tableRows.get(i).toString().trim());
            }
        }
        return tableRowsString.toString();
    }
}
