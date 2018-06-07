package po;

/**
 * ���޵�
 */
public class RepairList {
    private int id;//���޵�id
    private String submit;//�걨����
    private int uid;//����Աid
    private String phone;//��ϵ��ʽ
    private String date;//�걨ʱ��
    private int type;//��������
    private String summary;//���ϼ��
    private String info;//��������
    private String mark;//��ע
    private String handle;//������
    private String result;//������

    public RepairList(int id, String submit, int uid, String phone, String date, int type, String summary, String info, String mark, String handle, String result) {
        this.id = id;
        this.submit = submit;
        this.uid = uid;
        this.phone = phone;
        this.date = date;
        this.type = type;
        this.summary = summary;
        this.info = info;
        this.mark= mark;
        this.handle = handle;
        this.result = result;
    }

    public RepairList() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getsubmit() {
        return submit;
    }

    public void setsubmit(String submit) {
        this.submit = submit;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getmark() {
        return mark;
    }

    public void setmark(String mark) {
        this.mark= mark;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "RepairList{" +
                "id=" + id +
                ", submit='" + submit + '\'' +
                ", uid=" + uid +
                ", phone='" + phone + '\'' +
                ", date='" + date + '\'' +
                ", type=" + type +
                ", summary='" + summary + '\'' +
                ", info='" + info + '\'' +
                ", mark='" + mark + '\'' +
                ", handle='" + handle + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
