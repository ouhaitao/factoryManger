package po;

/**
 * �쳣���浥
 */
public class ExceptionList {
    private int id;//���浥id
    private int oid;//����id
    private String submit;//�걨����
    private int uid;//����Աid
    private String phone;//��ϵ��ʽ
    private String empname;//Ա������
    private int empid;//Ա��id
    private String date;//ʱ��
    private int type;//����
    private int pause;//�Ƿ��¶���ͣ��
    private String summary;//���
    private String info;//����
    private String handle;//������
    private String result;//������

    public ExceptionList(int id, int oid, String submit, int uid, String phone, String empname, int empid, String date, int type, int pause, String summary, String info, String handle, String result) {
        this.id = id;
        this.oid = oid;
        this.submit = submit;
        this.uid = uid;
        this.phone = phone;
        this.empname = empname;
        this.empid = empid;
        this.date = date;
        this.type = type;
        this.pause = pause;
        this.summary = summary;
        this.info = info;
        this.handle = handle;
        this.result = result;
    }

    public ExceptionList() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
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

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
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

    public int getpause() {
        return pause;
    }

    public void setpause(int pause) {
        this.pause = pause;
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
}
