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

    public List<MusicModelRow> getTableRows() {
        return tableDataService.getTableRows();
    }

    @Override
    public String toString() {
        return tableDataService.toString();
    }
}