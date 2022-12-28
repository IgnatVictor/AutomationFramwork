package repository;

import repository.applyTools.MusicModelRow;
import repository.applyTools.TableDataService;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ApplyToolsRepositoryApplication {

    private TableDataService tableDataService;


    public ApplyToolsRepositoryApplication() {
        tableDataService = new TableDataService();
    }

    private List<MusicModelRow> getSortedListByCategoryAscending() {
        return Arrays.stream(tableDataService.getTableRows()).sorted(Comparator.comparing(MusicModelRow::getCategory)).collect(Collectors.toList());
    }

    private List<MusicModelRow> getSortedListByCategoryDescending() {
        return getSortedListByCategoryAscending().stream().sorted(Collections.reverseOrder(Comparator.comparing(MusicModelRow::getCategory))).collect(Collectors.toList());
    }

    private List<MusicModelRow> getSortedListByNameAscending() {
        return Arrays.stream(tableDataService.getTableRows()).sorted(Comparator.comparing(MusicModelRow::getName)).collect(Collectors.toList());
    }

    private List<MusicModelRow> getSortedListByNameDescending() {
        return getSortedListByNameAscending().stream().sorted(Collections.reverseOrder(Comparator.comparing(MusicModelRow::getName))).collect(Collectors.toList());
    }

    private List<MusicModelRow> getSortedListByArtistAscending() {
        return Arrays.stream(tableDataService.getTableRows()).sorted(Comparator.comparing(MusicModelRow::getArtist)).collect(Collectors.toList());
    }

    private List<MusicModelRow> getSortedListByArtistDescending() {
        return getSortedListByArtistAscending().stream().sorted(Collections.reverseOrder(Comparator.comparing(MusicModelRow::getArtist))).collect(Collectors.toList());
    }

    private String stringTransformerTableRows(List<MusicModelRow> tableRows) {
        String tableRowsString = "";
        for (int i = 0; i < tableRows.size(); i++) {
            if (i < 9) {
                tableRowsString += tableRows.get(i).toString() + '\n';
            }
            if (i == 9) {
                tableRowsString += tableRows.get(i).toString().trim();
            }
        }
        return tableRowsString;
    }

    public String getSortedListByCategoryAscendingString() {
        return stringTransformerTableRows(getSortedListByCategoryAscending());
    }

    public String getSortedListByCategoryDescendingString() {
        return stringTransformerTableRows(getSortedListByCategoryDescending());
    }

    public String getSortedByNameAscendingTabelRowsString() {
        return stringTransformerTableRows(getSortedListByNameAscending());
    }

    public String getSortedListByNameDescendingTableRowsString() {
        return stringTransformerTableRows(getSortedListByNameDescending());
    }

    public String getSortedByArtistAscendingString() {
        return stringTransformerTableRows(getSortedListByArtistAscending());
    }

    public String getSortedByArtistDescendingString() {
        return stringTransformerTableRows(getSortedListByArtistDescending());
    }

    @Override
    public String toString() {
        return tableDataService.toString();
    }
}