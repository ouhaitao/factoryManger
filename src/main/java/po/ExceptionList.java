package po;

/**
 * 异常报告单
 */
public class ExceptionList {
    private Integer id;//报告单id
    private Integer oid;//订单id
    private String submit;//申报部门
    private Integer uid;//管理员id
    private String phone;//联系方式
    private String empname;//员工姓名
    private Integer empid;//员工id
    private String date;//时间
    private Integer type;//类型
    private Integer pause;//是否导致订单停工
    private String summary;//简介
    private String info;//描述
    private String handle;//处理部门
    private String result;//处理结果

    public ExceptionList(Integer id, Integer oid, String submit, Integer uid, String phone, String empname, Integer empid, String date, Integer type, Integer pause, String summary, String info, String handle, String result) {
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getsubmit() {
        return submit;
    }

    public void setsubmit(String submit) {
        this.submit = submit;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
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

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getpause() {
        return pause;
    }

    public void setpause(Integer pause) {
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

    @Override
    public String toString() {
        return "ExceptionList{" +
                "id=" + id +
                ", oid=" + oid +
                ", submit='" + submit + '\'' +
                ", uid=" + uid +
                ", phone='" + phone + '\'' +
                ", empname='" + empname + '\'' +
                ", empid=" + empid +
                ", date='" + date + '\'' +
                ", type=" + type +
                ", pause=" + pause +
                ", summary='" + summary + '\'' +
                ", info='" + info + '\'' +
                ", handle='" + handle + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
