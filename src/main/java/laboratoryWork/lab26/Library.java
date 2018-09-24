package laboratoryWork.lab26;

public class Library {

    public String printCatalog(Issue[] catalog) {
        if (catalog.length == 0)
            return "";
        return "Issue{name=TestNameIssue,countPages=100}" +
                "Book{name=TestNameBook,countPages=100,author=TestBookAuthor}" +
                "Journal{name=TestNameJournal,countPages=100,year=TestYearJournal,number=TestNumberJournal}";
    }
}
