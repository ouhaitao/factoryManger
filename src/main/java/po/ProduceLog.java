package po;

/**
 *������¼���������е���־��Ϣ,�������еı�����Ϣ����Ա�����������˻����ʼ챨�����Ϣ
 */
public class ProduceLog {
    private String id;//��־id
    private String oId;//����id
    private String uId;//����Աid
    private String date;//�걨ʱ��

    private String type;//��־����
    private String information;//��־����
    private String result;//������


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
