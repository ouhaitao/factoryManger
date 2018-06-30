package po;


public class ProduceLog {
    private int id;//
    private int oid;//
    private int process;//
    private int uid;//
    private String date;//

    private int type;//
    private String information;//
    private String result;//


    public ProduceLog() {

    }

    public ProduceLog( int oid,int process,int uid, String date, int type, String information, String result) {
        this.oid = oid;
        this.process=process;
        this.uid = uid;
        this.date = date;
        this.type = type;
        this.information = information;
        this.result = result;
    }

    public int getProcess() {
        return process;
    }

    public void setProcess(int process) {
        this.process = process;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getoId() {
        return oid;
    }

    public void setoId(int oid) {
        this.oid = oid;
    }

    public int getuId() {
        return uid;
    }

    public void setuId(int uid) {
        this.uid = uid;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ProduceLog{" +
                "id='" + id + '\'' +
                ", oid='" + oid + '\'' +
                ", process=" + process +
                ", uid='" + uid + '\'' +
                ", date='" + date + '\'' +
                ", type='" + type + '\'' +
                ", information='" + information + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
