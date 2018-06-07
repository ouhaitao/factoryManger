package po;

/**
 *������¼���������е���־��Ϣ,�������еı�����Ϣ����Ա�����������˻����ʼ챨�����Ϣ
 */
public class ProduceLog {
    private int id;//��־id
    private int oId;//����id
    private int process;//��������
    private int uId;//����Աid
    private String date;//�ύʱ��

    private int type;//��־����
    private String information;//��־����
    private String result;//������


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
