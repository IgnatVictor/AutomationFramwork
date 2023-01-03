package repository;

import repository.applyTools.MusicModelRow;
import repository.applyTools.TableDataService;
import java.util.List;


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