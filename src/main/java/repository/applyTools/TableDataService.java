package repository.applyTools;

import java.util.Arrays;
import java.util.List;

public class TableDataService {

    private MusicModelRow[] tableRows;

    private void generateTableRows() {
        tableRows = new MusicModelRow[10];
        tableRows[6] = new MusicModelRow(7,"There Goes Rhymin' Simon","Paul Simon","Pop Rock");
        tableRows[7] = new MusicModelRow(8,"The Yes Album","Yes","Progressive Rock");
        tableRows[9] = new MusicModelRow(10,"Teaser and the Firecat","Cat Stevens","Folk Rock");
        tableRows[4] = new MusicModelRow(5,"Tapestry","Carole King","Soft Rock");
        tableRows[3] = new MusicModelRow(4,"Take Five","Dave Brubeck","Jazz");
        tableRows[2] = new MusicModelRow(3,"Sweet Baby James","James Taylor","Folk Rock");
        tableRows[5] = new MusicModelRow(6,"Songs in the Key of Life","Stevie Wonder","Soul");
        tableRows[0] = new MusicModelRow(1,"Led Zeppelin IV","Led Zeppelin","Rock");
        tableRows[1] = new MusicModelRow(2,"Kind of Blue","Miles Davis","Jazz");
        tableRows[8] = new MusicModelRow(9,"Best of Blue Note","Various Artists","Jazz");
    }

    public List<MusicModelRow> getTableRows() {
        if(tableRows== null) {
         generateTableRows();
        }
        return List.of(tableRows);
    }

    @Override
    public String toString() {
        return Arrays.toString(tableRows);
    }
}
