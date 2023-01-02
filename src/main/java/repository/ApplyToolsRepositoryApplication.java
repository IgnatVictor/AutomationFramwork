package repository;

import repository.applyTools.MusicModelRow;
import repository.applyTools.TableDataService;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ApplyToolsRepositoryApplication {

    private final TableDataService tableDataService;

    public ApplyToolsRepositoryApplication() {
        tableDataService = new TableDataService();
    }

    public List<MusicModelRow> sortListByArtistAscending() {
        return tableDataService.getTableRows().stream().sorted(Comparator.comparing(MusicModelRow::getArtist)).collect(Collectors.toList());
    }

    public List<MusicModelRow> sortListByArtistDescending() {
        return sortListByArtistAscending().stream().sorted(Collections.reverseOrder(Comparator.comparing(MusicModelRow::getArtist))).collect(Collectors.toList());
    }

    public List<MusicModelRow> sortListByCategoryAscending() {
        return tableDataService.getTableRows().stream().sorted(Comparator.comparing(MusicModelRow::getCategory)).collect(Collectors.toList());
    }

    public List<MusicModelRow> sortListByCategoryDescending() {
        return sortListByCategoryAscending().stream().sorted(Collections.reverseOrder(Comparator.comparing(MusicModelRow::getCategory))).collect(Collectors.toList());
    }

    public List<MusicModelRow> sortListByNameAscending() {
        return tableDataService.getTableRows().stream().sorted(Comparator.comparing(MusicModelRow::getName)).collect(Collectors.toList());
    }

    public List<MusicModelRow> sortListByNameDescending() {
        return sortListByNameAscending().stream().sorted(Collections.reverseOrder(Comparator.comparing(MusicModelRow::getName))).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return tableDataService.toString();
    }
}