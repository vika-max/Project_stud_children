
public class Rating {
    String workname;
    int rating;
    Rating(String workname1, int rating1) {
        workname = workname1;
        rating = rating1;
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rating other = (Rating) obj;
        if (!workname.equals(other.workname)) {
            return false;
        }
        if (!(rating==other.rating)) {
            return false;
        }
        return true;}
}
