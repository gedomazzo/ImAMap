import java.util.UUID;

public abstract class LibrrayItem {
    private final UUID itemid;
    private String title;
    private String year;
    private boolean is_borrowed;

    LibrrayItem(String title, String year, boolean is_borrowed) {
        itemid = UUID.randomUUID();
        this.title = title;
        this.year = year;
        this.is_borrowed = is_borrowed;
    }

    public abstract double calculateLateFee(int daysPastDue);

    public void borrow(){
        this.is_borrowed = true;
    }

    public void return_item(){
        this.is_borrowed = false;
    }



    public UUID getItemid() {
        return itemid;
    }
    public String getTitle() {
        return title;
    }
    public String getYear() {
        return year;
    }

    public boolean isBorrowed() {
        return is_borrowed;
    }


    @Override
    public String toString(){
        return  "id: " + itemid + " \n, " +
                "title: " + title + ",\n" +
                " year: " + year;
    }

}
