package laboratoryWork.lab27;

public class Library {
    public String getIssueWithCountPagesMoreN(Issue[] catalog, int barrierCountPages) {
        StringBuilder result = new StringBuilder();
        for (Issue aCatalog : catalog) {
            if (aCatalog.getCountPages() > barrierCountPages) {
                result.append(aCatalog.toPrint());
            }
        }
        return result.toString();
    }
}
