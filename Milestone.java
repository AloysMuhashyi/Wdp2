git clone https://TeamWPD2@bitbucket.org/TeamWPD2/wpd2.git
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Milestone {

    private String title;
    private String description;
    private SimpleDateFormat dueDate;

    public Milestone(String title, String description, SimpleDateFormat dueDate){
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SimpleDateFormat getDueDate() {
        return dueDate;
    }

    public void setDueDate(SimpleDateFormat dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Milestone{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dueDate=" + dueDate +
                '}';
    }

    public String toString(SimpleDateFormat dueDate) {
        return " " + dueDate;
    }
}
