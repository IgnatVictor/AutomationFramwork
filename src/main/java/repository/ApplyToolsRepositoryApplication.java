package repository;

import common.StringBuilderFromList;
import repository.applyTools.MusicModelRow;
import repository.applyTools.TableDataService;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ApplyToolsRepositoryApplication {

    private final TableDataService tableDataService;

    private final StringBuilderFromList stringBuilderFromList;

    public ApplyToolsRepositoryApplication() {
        tableDataService = new TableDataService();
        stringBuilderFromList = new StringBuilderFromList();
    }

    private List<MusicModelRow> getSortedListByArtistAscending() {
        return Arrays.stream(tableDataService.getTableRows()).sorted(Comparator.comparing(MusicModelRow::getArtist)).collect(Collectors.toList());
    }

    private List<MusicModelRow> getSortedListByArtistDescending() {
        return getSortedListByArtistAscending().stream().sorted(Collections.reverseOrder(Comparator.comparing(MusicModelRow::getArtist))).collect(Collectors.toList());
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

    public String getSortedByArtistAscendingString() {
        return stringBuilderFromList.stringTransformerTableRows(getSortedListByArtistAscending());
    }

    public String getSortedByArtistDescendingString() {
        return stringBuilderFromList.stringTransformerTableRows(getSortedListByArtistDescending());
    }

    public String getSortedListByCategoryAscendingString() {
        return stringBuilderFromList.stringTransformerTableRows(getSortedListByCategoryAscending());
    }

    public String getSortedListByCategoryDescendingString() {
        return stringBuilderFromList.stringTransformerTableRows(getSortedListByCategoryDescending());
    }

    public String getSortedByNameAscendingTabelRowsString() {
        return stringBuilderFromList.stringTransformerTableRows(getSortedListByNameAscending());
    }

    public String getSortedListByNameDescendingTableRowsString() {
        return stringBuilderFromList.stringTransformerTableRows(getSortedListByNameDescending());
    }

    @Override
    public String toString() {
        return tableDataService.toString();
    }
}