package anotherExperiments.myBatis.dal;

public class Payment {
    private Long id;
    private Integer summa;
    private Integer discount;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getSumma() {
        return discount;
    }
    public void getSumma(Integer summa) {
        this.summa = summa;
    }
}
