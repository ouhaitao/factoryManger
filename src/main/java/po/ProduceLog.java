package po;

/**
 *用来记录生产过程中的日志信息,如生产中的保修信息，人员调动，补货退货，质检报告等信息
 */
public class ProduceLog {
    private int id;//日志id
    private int oId;//订单id
    private int process;//订单流程
    private int uId;//管理员id
    private String date;//提交时间

    private int type;//日志类型
    private String information;//日志内容
    private String result;//处理结果


    public ProduceLog() {

    }

    public ProduceLog( int oId,int process,int uId, String date, int type, String information, String result) {
        this.oId = oId;
        this.process=process;
        this.uId = uId;
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
        return oId;
    }

    public void setoId(int oId) {
        this.oId = oId;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
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
                ", oId='" + oId + '\'' +
                ", process=" + process +
                ", uId='" + uId + '\'' +
                ", date='" + date + '\'' +
                ", type='" + type + '\'' +
                ", information='" + information + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
