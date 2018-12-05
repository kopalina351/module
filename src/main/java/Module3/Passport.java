package Module3;

import java.util.Objects;

public class Passport {
    private String series;
    private int number;

    Passport(String series, int number){
        this.series=series;
        this.number=number;
    }

    private String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number == passport.number &&
                Objects.equals(getSeries(), passport.getSeries());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSeries(), number);
    }


}
