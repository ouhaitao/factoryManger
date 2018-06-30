package po;

//报修单
public class RepairList {
    private Integer id;//?????id
    private String submit;//??????
    private Integer uid;//?????id
    private String phone;//??????
    private String date;//?????
    private String type;//????????
    private String summary;//??????
    private String info;//????????
    private String mark;//???
    private String handle;//??????
    private String result;//??????

    public RepairList(Integer id, String submit, Integer uid, String phone, String date, String name, String summary, String info, String mark, String handle, String result) {
        this.id = id;
        this.submit = submit;
        this.uid = uid;
        this.phone = phone;
        this.date = date;
        this.type = name;
        this.summary = summary;
        this.info = info;
        this.mark= mark;
        this.handle = handle;
        this.result = result;
    }

    public RepairList() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
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
