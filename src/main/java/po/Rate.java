package po;

public class Rate {
    private int id;//����id
    private int process;//����
    private String date;//����
    private int produce;//��������

   public Rate(){

   }

    public Rate(int id, int process, String date, int produce) {
        this.id = id;
        this.process = process;
        this.date = date;
        this.produce = produce;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProcess() {
        return process;
    }

    public void setProcess(int process) {
        this.process = process;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getProduce() {
        return produce;
    }

    public void setProduce(int produce) {
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
