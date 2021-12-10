package gmibank.pojos;

public class US_23_RegistrantPojo {

    private int id;
    private String ssn;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "US_23_Registrant{" +
                "id=" + id +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
