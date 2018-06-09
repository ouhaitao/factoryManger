package po;

public class Rate {
    private Integer id;//订单id
    private Integer process;//流程
    private String date;//日期
    private Integer produce;//生产数量

   public Rate(){

   }

    public Rate(Integer id, Integer process, String date, Integer produce) {
        this.id = id;
        this.process = process;
        this.date = date;
        this.produce = produce;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProcess() {
        return process;
    }

    public void setProcess(Integer process) {
        this.process = process;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getProduce() {
        return produce;
    }

    public void setProduce(Integer produce) {
        this.produce = produce;
    }

    @Override
    public String toString() {
        return "Rate{" +
                "id=" + id +
                ", process=" + process +
                ", date='" + date + '\'' +
                ", produce=" + produce +
                '}';
    }
}
