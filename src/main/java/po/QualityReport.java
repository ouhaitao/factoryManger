package po;

/**
 * 质检报告
 */
public class QualityReport {
    private Integer id;//质检单号
    private Integer oid;//订单id
    private String submit;//提交部门
    private String date;//时间
    private Integer sample;//抽样数量
    private Integer state;//质检状态
    private Integer result;//质检结果
    private Integer scrap;//不合格数量
    private String info;

    public QualityReport(Integer id, Integer oid, String submit, String date, Integer sample, Integer state, Integer result, Integer scrap,String info) {
        this.id = id;
        this.oid = oid;
        this.submit = submit;
        this.date = date;
        this.sample = sample;
        this.state = state;
        this.result = result;
        this.scrap = scrap;
        this.info=info;
    }

    public QualityReport() {
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getSample() {
        return sample;
    }

    public void setSample(Integer sample) {
        this.sample = sample;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Integer getScrap() {
        return scrap;
    }

    public void setScrap(Integer scrap) {
        this.scrap = scrap;
    }

    public String getinfo() {
        return info;
    }

    public void setinfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "QualityReport{" +
                "id=" + id +
                ", oid=" + oid +
                ", submit='" + submit + '\'' +
                ", date='" + date + '\'' +
                ", sample=" + sample +
                ", state=" + state +
                ", result=" + result +
                ", scrap=" + scrap +
                ", info='" + info + '\'' +
                '}';
    }
}
