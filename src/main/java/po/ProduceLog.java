package po;

/**
 *用来记录生产过程中的日志信息,如生产中的保修信息，人员调动，补货退货，质检报告等信息
 */
public class ProduceLog {
    private String id;//日志id
    private String oId;//订单id
    private String uId;//管理员id
    private String date;//申报时间

    private String type;//日志类型
    private String information;//日志内容
    private String result;//处理结果


    public ProduceLog() {

    }

    public ProduceLog(String id, String oId, String uId, String date, String type, String information, String result) {
        this.id = id;
        this.oId = oId;
        this.uId = uId;
        this.date = date;
        this.type = type;
        this.information = information;
        this.result = result;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
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
}
