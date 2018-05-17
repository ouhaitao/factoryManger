package po;

/**
 * 报修单
 */
public class RepairList {
    private int id;//报修单id
    private String declare;//申报部门
    private int uid;//管理员id
    private String phone;//联系方式
    private String date;//申报时间
    private int type;//故障类型
    private String summary;//故障简介
    private String info;//故障类容
    private String comment;//备注
    private String handle;//处理部门
    private String result;//处理结果

    public RepairList(int id, String declare, int uid, String phone, String date, int type, String summary, String info, String comment, String handle, String result) {
        this.id = id;
        this.declare = declare;
        this.uid = uid;
        this.phone = phone;
        this.date = date;
        this.type = type;
        this.summary = summary;
        this.info = info;
        this.comment = comment;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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
