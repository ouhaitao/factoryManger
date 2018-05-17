package po;

/**
 * 异常报告单
 */
public class ExceptionList {
    private int id;//报告单id
    private int oid;//订单id
    private String declare;//申报部门
    private int uid;//管理员id
    private String phone;//联系方式
    private String empname;//员工姓名
    private int empid;//员工id
    private String date;//时间
    private int type;//类型
    private int stop;//是否导致订单停工
    private String summary;//简介
    private String info;//描述
    private String handle;//处理部门
    private String result;//处理结果

    public ExceptionList(int id, int oid, String declare, int uid, String phone, String empname, int empid, String date, int type, int stop, String summary, String info, String handle, String result) {
        this.id = id;
        this.oid = oid;
        this.declare = declare;
        this.uid = uid;
        this.phone = phone;
        this.empname = empname;
        this.empid = empid;
        this.date = date;
        this.type = type;
        this.stop = stop;
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

    public String getDeclare() {
        return declare;
    }

    public void setDeclare(String declare) {
        this.declare = declare;
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

    public int getStop() {
        return stop;
    }

    public void setStop(int stop) {
        this.stop = stop;
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
