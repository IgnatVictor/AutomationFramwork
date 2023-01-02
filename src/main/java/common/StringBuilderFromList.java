package common;

import repository.applyTools.MusicModelRow;

import java.util.ArrayList;
import java.util.List;

public class StringBuilderFromList {

    public List<String> transformTableOfRowsIntoListOfStrings(List<MusicModelRow> tableRows) {
        List<String> stringListOfTableRows= new ArrayList<>();
        for(int i=0; i< tableRows.size() ; i++ ) {
            stringListOfTableRows.add(tableRows.get(i).toString());
        }
        return  stringListOfTableRows;
    }
}
